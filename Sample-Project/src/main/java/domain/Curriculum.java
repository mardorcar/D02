
package domain;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Curriculum extends DomainEntity {

	private String				ticket;
	private MiscellaneousRecord	miscellaneousRecord;
	private PersonalRecord		personalRecord;
	private EducationRecord		educationRecord;
	private ProfessionalRecord	professionalRecord;
	private EndorseRecord		endoserRecord;
	private HandyWorker			handyWorker;


	@NotBlank
	@Pattern(regexp = "yymmdd-xxxxxx")
	public String getTicket() {
		return this.ticket;
	}
	@NotEmpty
	public void setTicket(final String ticket) {
		this.ticket = ticket;
	}
	@NotEmpty
	public MiscellaneousRecord getMiscellaneousRecord() {
		return this.miscellaneousRecord;
	}

	public void setMiscellaneousRecord(final MiscellaneousRecord miscellaneousRecord) {
		this.miscellaneousRecord = miscellaneousRecord;
	}
	@NotEmpty
	public PersonalRecord getPersonalRecord() {
		return this.personalRecord;
	}

	public void setPersonalRecord(final PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	}
	@NotEmpty
	public EducationRecord getEducationRecord() {
		return this.educationRecord;
	}

	public void setEducationRecord(final EducationRecord educationRecord) {
		this.educationRecord = educationRecord;
	}
	@NotEmpty
	public ProfessionalRecord getProfessionalRecord() {
		return this.professionalRecord;
	}

	public void setProfessionalRecord(final ProfessionalRecord professionalRecord) {
		this.professionalRecord = professionalRecord;
	}
	@NotEmpty
	public EndorseRecord getEndoserRecord() {
		return this.endoserRecord;
	}

	public void setEndoserRecord(final EndorseRecord endoserRecord) {
		this.endoserRecord = endoserRecord;
	}
	@NotEmpty
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}
}
