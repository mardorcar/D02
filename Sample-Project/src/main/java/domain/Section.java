
package domain;

import java.util.Collection;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class Section extends DomainEntity {

	private String				title;
	private String				text;
	private Collection<String>	pictures;


	@NotBlank
	public String getTitle() {
		return this.title;
	}
	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getText() {
		return this.text;
	}
	public void setText(final String text) {
		this.text = text;
	}

	@NotBlank
	@URL
	public Collection<String> getPictures() {
		return this.pictures;
	}
	public void setPictures(final Collection<String> pictures) {
		this.pictures = pictures;
	}

}
