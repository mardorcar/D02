
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.LocalDate;

@Entity
public class Complaint extends DomainEntity {

	private String				ticket;
	private LocalDate			moment;
	private String				description;
	private Integer				attachments;

	private Collection<Report>	reports;


	@NotBlank
	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(final String ticket) {
		this.ticket = ticket;
	}
	@NotNull
	@Past
	public LocalDate getMoment() {
		return this.moment;
	}

	public void setMoment(final LocalDate moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
	@NotBlank
	public Integer getAttachments() {
		return this.attachments;
	}

	public void setAttachments(final Integer attachments) {
		this.attachments = attachments;
	}

	public Collection<Report> getReports() {
		return this.reports;
	}

	public void setReports(final Collection<Report> reports) {
		this.reports = reports;
	}

}
