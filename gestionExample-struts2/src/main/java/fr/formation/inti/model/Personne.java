package fr.formation.inti.model;

import java.util.Date;
import java.util.List;

public class Personne {
	private String firstName;
	private String lastName;
	private String title;
	private Integer age;
	private Date startDate;
	private String email;
	private String genre;
	private String dept;
	private List<String> options;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String mail) {
		this.email = mail;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "Personne [firstName=" + firstName + ", lastName=" + lastName + ", title=" + title + ", age=" + age
				+ ", startDate=" + startDate + ", email=" + email + ", genre=" + genre + ", dept=" + dept + ", options="
				+ options + "]";
	}
	
	
}
