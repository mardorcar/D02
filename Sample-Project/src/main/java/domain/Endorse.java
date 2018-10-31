
package domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Endorse extends DomainEntity {

	private Date		moment;
	private String		coments;
	private Customer	customer;
	private HandyWorker	handyworkerSender;
	private HandyWorker	handyworkerReceiver;


	@NotBlank
	public HandyWorker getHandyworkerSender() {
		return this.handyworkerSender;
	}

	public void setHandyworkerSender(final HandyWorker handyworkerSender) {
		this.handyworkerSender = handyworkerSender;
	}

	@NotBlank
	public HandyWorker getHandyworkerReceiver() {
		return this.handyworkerReceiver;
	}

	public void setHandyworkerReceiver(final HandyWorker handyworkerReceiver) {
		this.handyworkerReceiver = handyworkerReceiver;
	}

	@NotNull
	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@NotBlank
	@Size(min = 1)
	public String getComents() {
		return this.coments;
	}

	public void setComents(final String coments) {
		this.coments = coments;
	}
	@NotBlank
	public Customer getCustomer() {
		return this.customer;
	}
	@NotBlank
	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

}
