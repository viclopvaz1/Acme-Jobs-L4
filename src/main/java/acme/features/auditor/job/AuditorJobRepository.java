
package acme.features.auditor.job;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.jobs.Job;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuditorJobRepository extends AbstractRepository {

	@Query("select j from Job j where j.id = ?1")
	Job findOneById(int id);

	//	@Query("select a from AuditRecord a where a.auditor.id = ?1")
	//	Collection<AuditRecord> findManyByAuditor(int auditorId);
	//
	//	@Query("select a from AuditRecord a where a.auditor.id != ?1")
	//	Collection<AuditRecord> findManyByNonAuditor(int auditorId);

	@Query("select j from Job j where j.auditor.id = ?1 and exists(select ar from AuditRecord ar where ar.job.id = j.id) and j.status=1")
	Collection<Job> findManyByAuditorId(int auditorId);

	@Query("select j from Job j where j.auditor.id != ?1 and exists(select ar from AuditRecord ar where ar.job.id = j.id) and j.status=1")
	Collection<Job> findManyByNonAuditorId(int auditorId);

}
