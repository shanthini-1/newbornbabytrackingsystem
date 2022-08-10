package com.chainsys.newbornbabyhealthtrackingsystem.commonutils;

import java.util.Date;


public class ChildA {
private String childName;
private Date childDob;

public ChildA() {
this.childName ="murali";
this.childDob=new Date(2022,02,20);
}
public String getChildName() {
	return childName;
}
public void setChildName(String childName) {
	this.childName = childName;
}
public Date getChildDob() {
	return childDob;
}
public void setChildDob(Date childDob) {
	this.childDob = childDob;
}
@Override
public String toString() {
	return String.format("%s, %s",childName,childDob);
}
}
