
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.joda.time.LocalDate;

@Entity
public class ProfessionalRecord extends DomainEntity {

	private String				companyName;
	private LocalDate			startWorking;
	private LocalDate			endWorking;
	private String				role;
	private Collection<String>	attachments;
	private Collection<String>	comments;


	@NotBlank
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}
	@Past
	@NotNull
	public LocalDate getStartWorking() {
		return this.startWorking;
	}

	public void setStartWorking(final LocalDate startWorking) {
		this.startWorking = startWorking;
	}
	@NotNull
	public LocalDate getEndWorking() {
		return this.endWorking;
	}

	public void setEndWorking(final LocalDate endWorking) {
		this.endWorking = endWorking;
	}
	@NotNull
	public String getRole() {
		return this.role;
	}

	public void setRole(final String role) {
		this.role = role;
	}
	@URL
	public Collection<String> getAttachments() {
		return this.attachments;
	}

	public void setAttachments(final Collection<String> attachments) {
		this.attachments = attachments;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}
}
