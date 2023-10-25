package com.guntoseries.hibernate;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "STUDENT_CERTIFICATION")
public class StudentCertification {
	
	@Id
	@GeneratedValue
	@Column(name = "CERTIFICATION_ID")
	private int certification_id;
	
	private String certification_detail;
	
//	@ManyToMany(mappedBy = "studentCertification")
//	private Set<Student> students = new HashSet<Student>(0);
//	
//
//	
//	public Set<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(Set<Student> students) {
//		this.students = students;
//	}

	public int getCertification_id() {
		return certification_id;
	}

	public void setCertification_id(int certification_id) {
		this.certification_id = certification_id;
	}

	public String getCertification_detail() {
		return certification_detail;
	}

	public void setCertification_detail(String certification_detail) {
		this.certification_detail = certification_detail;
	}
	
	
	
	
}
