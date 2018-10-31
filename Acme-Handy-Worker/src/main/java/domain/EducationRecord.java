
package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class EducationRecord extends DomainEntity {

	private String	diplomaTitle;
	private Date	startStudying;
	private Date	endStudying;
	private String	instution;
	private String	attachment;
	private String	comments;


	@NotBlank
	public String getDiplomaTitle() {
		return this.diplomaTitle;
	}

	public void setDiplomaTitle(final String diplomaTitle) {
		this.diplomaTitle = diplomaTitle;
	}
	@Past
	@NotNull
	public Date getStartStudying() {
		return this.startStudying;
	}

	public void setStartStudying(final Date startStudying) {
		this.startStudying = startStudying;
	}
	@NotNull
	public Date getEndStudying() {
		return this.endStudying;
	}

	public void setEndStudying(final Date endStudying) {
		this.endStudying = endStudying;
	}
	@NotBlank
	public String getInstution() {
		return this.instution;
	}

	public void setInstution(final String instution) {
		this.instution = instution;
	}
	@URL
	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(final String attachment) {
		this.attachment = attachment;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(final String comments) {
		this.comments = comments;
	}

}
