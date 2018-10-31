
package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Actor extends DomainEntity {

	private String						name;
	private String						middeName;
	private String						surname;
	private String						photo;
	private String						email;
	private String						phoneNumber;
	private String						address;
	private Collection<SocialProfile>	socialProfiles;
	private Collection<Box>				boxes;
	private Collection<Message>			messagesReceived;
	private Collection<Message>			messagesSended;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getMiddeName() {
		return this.middeName;
	}

	public void setMiddeName(final String middeName) {
		this.middeName = middeName;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	@NotBlank
	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	@Pattern(regexp = "+CC(AC)PN")
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public Collection<SocialProfile> getSocialProfiles() {
		return this.socialProfiles;
	}

	public void setSocialProfiles(final Collection<SocialProfile> socialProfiles) {
		this.socialProfiles = socialProfiles;
	}
	@Min(4)
	public Collection<Box> getBoxes() {
		return this.boxes;
	}

	public void setBoxes(final Collection<Box> boxes) {
		this.boxes = boxes;
	}

	public Collection<Message> getMessagesReceived() {
		return this.messagesReceived;
	}

	public void setMessagesReceived(final Collection<Message> messagesReceived) {
		this.messagesReceived = messagesReceived;
	}

	public Collection<Message> getMessagesSended() {
		return this.messagesSended;
	}

	public void setMessagesSended(final Collection<Message> messagesSended) {
		this.messagesSended = messagesSended;
	}

}
