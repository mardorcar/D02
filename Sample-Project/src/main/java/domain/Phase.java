
package domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.LocalDate;

@Entity
public class Phase extends DomainEntity {

	private String		title;
	private String		description;
	private LocalDate	startMoment;
	private LocalDate	endMoment;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
	@NotNull
	public LocalDate getStartMoment() {
		return this.startMoment;
	}

	public void setStartMoment(final LocalDate startMoment) {
		this.startMoment = startMoment;
	}
	@NotNull
	public LocalDate getEndMoment() {
		return this.endMoment;
	}

	public void setEndMoment(final LocalDate endMoment) {
		this.endMoment = endMoment;
	}
}
