
package domain;

import java.util.Collection;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class MiscellaneousRecord extends DomainEntity {

	private String				title;
	private Collection<String>	attachment;
	private Collection<String>	comments;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	@URL
	public Collection<String> getAttachment() {
		return this.attachment;
	}

	public void setAttachment(final Collection<String> attachment) {
		this.attachment = attachment;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}
}
