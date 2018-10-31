
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.LocalDate;

@Entity
public class Note extends DomainEntity {

	private LocalDate			moment;
	private String				creatorComment;
	private Collection<String>	refereeComments;
	private Collection<String>	customerComments;
	private Collection<String>	handyComments;


	@Past
	@NotNull
	public LocalDate getMoment() {
		return this.moment;
	}

	public void setMoment(final LocalDate moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getCreatorComment() {
		return this.creatorComment;
	}

	public void setCreatorComment(final String creatorComment) {
		this.creatorComment = creatorComment;
	}

	public Collection<String> getRefereeComments() {
		return this.refereeComments;
	}

	public void setRefereeComments(final Collection<String> refereeComments) {
		this.refereeComments = refereeComments;
	}

	public Collection<String> getCustomerComments() {
		return this.customerComments;
	}

	public void setCustomerComments(final Collection<String> customerComments) {
		this.customerComments = customerComments;
	}

	public Collection<String> getHandyComments() {
		return this.handyComments;
	}

	public void setHandyComments(final Collection<String> handyComments) {
		this.handyComments = handyComments;
	}

}
