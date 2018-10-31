
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Task extends DomainEntity {

	private String					ticket;
	private Date					moment;
	private String					description;
	private String					address;
	private Double					maximumPrice;
	private Date					starDate;
	private Date					endDate;
	private Category				category;
	private Warranty				warranty;
	private Collection<Application>	aplications;
	private Collection<Phase>		phases;
	private Customer				customer;
	private Collection<Complaint>	complaints;


	@NotBlank
	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(final String ticket) {
		this.ticket = ticket;
	}

	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
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
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}
	@Min(0)
	@Digits(integer = 4, fraction = 2)
	public Double getMaximumPrice() {
		return this.maximumPrice;
	}

	public void setMaximumPrice(final Double maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	public Date getStarDate() {
		return this.starDate;
	}

	public void setStarDate(final Date starDate) {
		this.starDate = starDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}
	@NotBlank
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(final Category category) {
		this.category = category;
	}
	@NotBlank
	public Warranty getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final Warranty warranty) {
		this.warranty = warranty;
	}
	@NotBlank
	public Collection<Application> getAplications() {
		return this.aplications;
	}

	public void setAplications(final Collection<Application> aplications) {
		this.aplications = aplications;
	}
	@NotBlank
	public Collection<Phase> getPhases() {
		return this.phases;
	}

	public void setPhases(final Collection<Phase> phases) {
		this.phases = phases;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	public Collection<Complaint> getComplaints() {
		return this.complaints;
	}

	public void setComplaints(final Collection<Complaint> complaints) {
		this.complaints = complaints;
	}

}
