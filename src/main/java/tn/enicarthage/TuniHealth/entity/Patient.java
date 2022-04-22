package tn.enicarthage.TuniHealth.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Patient {
		@Id
	    @Column(name = "Patient_username")
		 private String patName;

	    @Column(name = "Patient_firstName")
	    private String patFirstName;
	    
	    @Column(name = "Patient_Last_name")
	    private String patLastName;
	    
	    @Column(name = "Patient_user_Password")
	    private String patPassword;
	   

		@Column(name = "Patient_date_naiss")
		  private Date date_naiss;


		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Patient(String patName, String patFirstName, String patLastName, String patPassword, Date date_naiss) {
			super();
			this.patName = patName;
			this.patFirstName = patFirstName;
			this.patLastName = patLastName;
			this.patPassword = patPassword;
			this.date_naiss = date_naiss;
		}

		
}
