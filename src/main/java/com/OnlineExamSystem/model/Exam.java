package com.OnlineExamSystem.model;



	import org.springframework.boot.autoconfigure.SpringBootApplication;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;

	@Entity
	@SpringBootApplication
	public class Exam {
		
		//@Table(name="Exam")
		
				//@Column(name = "name", length = 512)
				@Column
				private String name;
				
				@Id
				@Column(name = "emailID", length = 512)
				private String emailID;
				@Column(name = "password", length = 512)
				private String password;
				@Column(name = "gender", length = 512)
				private String gender;
				@Column(name = "country", length = 512)
				private String country;
				@Column(name = "contact", length = 512)
				private String contact;
				public Exam(String name, String emailID, String password, String gender, String country,
						String contact) {
					super();
					this.name = name;
					this.emailID = emailID;
					this.password = password;
					this.gender = gender;
					this.country = country;
					this.contact = contact;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public String getEmailID() {
					return emailID;
				}
				public void setEmailID(String emailID) {
					this.emailID = emailID;
				}
				public String getPassword() {
					return password;
				}
				public void setPassword(String password) {
					this.password = password;
				}
				public String getGender() {
					return gender;
				}
				public void setGender(String gender) {
					this.gender = gender;
				}
				public String getCountry() {
					return country;
				}
				public void setCountry(String country) {
					this.country = country;
				}
				public String getContact() {
					return contact;
				}
				public void setContact(String contact) {
					this.contact = contact;
				}
				public Exam() {
					super();
					// TODO Auto-generated constructor stub
				}
				@Override
				public String toString() {
					return "Exam [name=" + name + ", emailID=" + emailID + ", password=" + password + ", gender="
							+ gender + ", country=" + country + ", contact=" + contact + "]";
				}
				
	}			

				