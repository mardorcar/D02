
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class HandyWorker extends Actor {

	private String		make;
	private Finder		finder;
	private Application	application;
	private Note		notes;


	@NotBlank
	public String getMake() {
		return this.make;
	}

	public void setMake(final String make) {
		this.make = make;
	}
	@NotEmpty
	public Finder getFinder() {
		return this.finder;
	}

	public void setFinder(final Finder finder) {
		this.finder = finder;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(final Application application) {
		this.application = application;
	}

	public Note getNotes() {
		return this.notes;
	}

	public void setNotes(final Note notes) {
		this.notes = notes;
	}

}
