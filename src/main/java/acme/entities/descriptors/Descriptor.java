
package acme.entities.descriptors;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Descriptor {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				description;

	//	@NotNull
	//	@Valid
	//	@OneToMany() //mappedBy = "descriptor")
	//	private Collection<Duty>	mandatoryDuties;

	//	@NotNull
	//  @Valid
	//	@OneToOne(optional = false, mappedBy = "descriptor")
	//	private Job					job;

}
