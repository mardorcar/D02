
package domain;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class Support extends DomainEntity {

	private String		banner;
	private String		targetpage;
	private CreditCard	creditcard;
	private Tutorial	tutorial;
	private Sponsor		sponsor;


	@NotBlank
	@URL
	public String getBanner() {
		return this.banner;
	}

	public void setBanner(final String banner) {
		this.banner = banner;
	}
	@NotBlank
	@URL
	public String getTargetpage() {
		return this.targetpage;
	}

	public void setTargetpage(final String targetpage) {
		this.targetpage = targetpage;
	}
	@NotNull
	@Valid
	public CreditCard getCriditcard() {
		return this.creditcard;
	}

	public void setCriditcard(final CreditCard creditcard) {
		this.creditcard = creditcard;
	}
	@NotBlank
	public Tutorial getTuturial() {
		return this.tutorial;
	}

	public void setTutorial(final Tutorial tutorial) {
		this.tutorial = tutorial;
	}
	@NotBlank
	public Sponsor getSponsor() {
		return this.sponsor;
	}

	public void setSponsor(final Sponsor sponsor) {
		this.sponsor = sponsor;
	}

}
