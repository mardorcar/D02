
package domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class SocialProfile extends DomainEntity {

	private String	nick;
	private String	socialNetwork;
	private String	link;
	private Actor	actor;


	@NotBlank
	public Actor getActor() {
		return this.actor;
	}
	@NotBlank
	public String getNick() {
		return this.nick;
	}
	@NotBlank
	public void setActor(final Actor actor) {
		this.actor = actor;
	}
	@NotBlank
	public void setNick(final String nick) {
		this.nick = nick;
	}
	@NotBlank
	public String getSocialNetwork() {
		return this.socialNetwork;
	}

	public void setSocialNetwork(final String socialNetwork) {
		this.socialNetwork = socialNetwork;
	}
	@URL
	@NotBlank
	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}

}
