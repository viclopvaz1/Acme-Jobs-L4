
package acme.entities.duties;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

import acme.entities.descriptors.Descriptor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Duty {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;

	@NotBlank
	private String				description;

	@Range(min = 0, max = 1)
	private double				percentage;

	@ManyToOne(optional = false)
	private Descriptor			descriptor;

}
