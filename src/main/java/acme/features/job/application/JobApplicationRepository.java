
package acme.features.job.application;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.applications.Application;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface JobApplicationRepository extends AbstractRepository {

	@Query("select a from Application a where a.id = ?1")
	Application findOneById(int id);

	@Query("select a from Application a where a.job.id = ?1")
	Collection<Application> findManyByJobId(int jobId);
	//	Application findOneByJobId(int jobId);

}
