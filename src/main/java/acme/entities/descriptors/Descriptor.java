
package acme.entities.descriptors;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.entities.duties.Duty;
import acme.entities.jobs.Job;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Descriptor {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				description;

	@NotNull
	@OneToMany(mappedBy = "descriptor")
	private Collection<Duty>	mandatoryDuties;

	@NotNull
	@OneToOne(optional = false, mappedBy = "descriptor")
	private Job					job;

}
