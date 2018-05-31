package com.prathamesh.hibernate.secondlevelcaching;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_info")
public class Student {

@Id
private int studRollNo;
private String studName;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int studRollNo, String studName) {
	super();
	this.studRollNo = studRollNo;
	this.studName = studName;
}
@Override
public String toString() {
	return "Student [studRollNo=" + studRollNo + ", studName=" + studName + "]";
}
public int getStudRollNo() {
	return studRollNo;
}
public void setStudRollNo(int studRollNo) {
	this.studRollNo = studRollNo;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}

}
