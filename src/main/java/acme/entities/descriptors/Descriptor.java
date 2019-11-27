
package acme.entities.descriptors;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.jobs.Job;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Descriptor extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				description;

	//	@NotNull
	//	@Valid
	//	@OneToMany() //mappedBy = "descriptor")
	//	private Collection<Duty>	mandatoryDuties;

	@NotNull
	@Valid
	@OneToOne(optional = false)//, mappedBy = "descriptor")
	private Job					job;

}
