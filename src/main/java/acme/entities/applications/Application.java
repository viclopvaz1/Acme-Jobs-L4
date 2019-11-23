
package acme.entities.applications;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

import acme.entities.roles.Worker;
import acme.framework.entities.DomainEntity;

public class Application extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Column(unique = true)
	private String				referenceNumber;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Past
	private Date				moment;

	@NotBlank
	private String				status;

	@NotBlank
	private String				skills;

	@NotBlank
	private String				qualifications;

	//Relationships--------------------------------------------------------------

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	private Worker				worker;

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	private Job					job;

}
