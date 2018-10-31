
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;

@Entity
public class Message extends DomainEntity {

	private String				track;
	private String				recipient;
	private LocalDate			datetime;
	private String				subject;
	private String				body;
	private String				priority;
	private Collection<String>	tags;

	private Actor				receiver;
	private Actor				sender;


	@NotBlank
	public String getTrack() {
		return this.track;
	}

	public void setTrack(final String track) {
		this.track = track;
	}

	@NotBlank
	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(final String recipient) {
		this.recipient = recipient;
	}
	@Past
	public LocalDate getDatetime() {
		return this.datetime;
	}

	public void setDatetime(final LocalDate datetime) {
		this.datetime = datetime;
	}
	@NotBlank
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}
	@NotBlank
	public String getBody() {
		return this.body;
	}

	public void setBody(final String body) {
		this.body = body;
	}
	@NotBlank
	public String getPriority() {
		return this.priority;
	}

	public void setPriority(final String priority) {
		this.priority = priority;
	}

	public Collection<String> getTags() {
		return this.tags;
	}

	public void setTags(final Collection<String> tags) {
		this.tags = tags;
	}
	@NotEmpty
	public Actor getReceiver() {
		return this.receiver;
	}

	public void setReceiver(final Actor receiver) {
		this.receiver = receiver;
	}
	@NotEmpty
	public Actor getSender() {
		return this.sender;
	}

	public void setSender(final Actor sender) {
		this.sender = sender;
	}

}
