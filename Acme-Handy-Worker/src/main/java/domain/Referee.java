
package domain;

import java.util.Collection;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Referee extends Actor {

	private Collection<Report>	reports;
	private Complaint			complaint;
	private Collection<Note>	notes;


	public Collection<Report> getReports() {
		return this.reports;
	}
	public void setReports(final Collection<Report> reports) {
		this.reports = reports;
	}
	@NotEmpty
	public Complaint getComplaint() {
		return this.complaint;
	}
	public void setComplaint(final Complaint complaint) {
		this.complaint = complaint;
	}
	public Collection<Note> getNotes() {
		return this.notes;
	}
	public void setNotes(final Collection<Note> notes) {
		this.notes = notes;
	}

}
