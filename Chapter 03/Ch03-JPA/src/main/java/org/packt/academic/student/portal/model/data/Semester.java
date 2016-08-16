package org.packt.academic.student.portal.model.data;
// Generated 03 14, 16 11:36:05 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Semester generated by hbm2java
 */
@Entity
@Table(name = "semester", catalog = "smp")
public class Semester implements java.io.Serializable {

	private int semester;
	private String label;
	private Set<Tblstudents> tblstudentses = new HashSet<Tblstudents>(0);

	public Semester() {
	}

	public Semester(int semester, String label) {
		this.semester = semester;
		this.label = label;
	}

	public Semester(int semester, String label, Set<Tblstudents> tblstudentses) {
		this.semester = semester;
		this.label = label;
		this.tblstudentses = tblstudentses;
	}

	@Id
	@Column(name = "semester", unique = true, nullable = false)
	public int getSemester() {
		return this.semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Column(name = "label", nullable = false, length = 50)
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "semester")
	public Set<Tblstudents> getTblstudentses() {
		return this.tblstudentses;
	}

	public void setTblstudentses(Set<Tblstudents> tblstudentses) {
		this.tblstudentses = tblstudentses;
	}

}