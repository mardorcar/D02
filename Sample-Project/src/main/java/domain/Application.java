
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.scheduling.config.Task;

@Entity
public class Application extends DomainEntity {

	private LocalDate			datetime;
	private String				status;
	private Double				maximumPrice;
	private String				creditCard;
	private Collection<String>	comments;
	private Collection<Task>	tasks;


	@Past
	public LocalDate getDatetime() {
		return this.datetime;
	}

	public void setDatetime(final LocalDate datetime) {
		this.datetime = datetime;
	}
	@NotBlank
	@Pattern(regexp = "accepted-rejected-pending")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}
	@NotNull
	@Min(0)
	@Digits(integer = 4, fraction = 2)
	public Double getMaximumPrice() {
		return this.maximumPrice;
	}

	public void setMaximumPrice(final Double maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	public String getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final String creditCard) {
		this.creditCard = creditCard;
	}
	@NotBlank
	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}
	@NotEmpty
	public Collection<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(final Collection<Task> tasks) {
		this.tasks = tasks;
	}

}
