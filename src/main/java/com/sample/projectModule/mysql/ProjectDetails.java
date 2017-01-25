package com.sample.projectModule.mysql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="ProjectDetails")
public class ProjectDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@Column(nullable = false, name = "projectName")
	private String projectName;
	
	@Column(nullable = false, name = "projectId")
	private String projectID;
	
	@Column(nullable = false, name = "IBUName")
	private String IBUName;
	
	@Column(nullable = false, name = "accountName")
	private String accountName;

	@Column(nullable = false, name = "projectDesc")
	private String projectDesc;
	
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectId() {
		return projectID;
	}
	public void setProjectId(String projectId) {
		this.projectID = projectId;
	}
	public String getIBUName() {
		return IBUName;
	}
	public void setIBUName(String iBUName) {
		IBUName = iBUName;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	
	
	
	public ProjectDetails(String projectName,String projectId,String IBUName,
			String accountName,String projectDesc ){
		this.accountName=accountName;
		this.projectDesc=projectDesc;
		this.projectID=projectId;
		this.projectName=projectName;
		this.IBUName =IBUName;
	}
	
	
	protected ProjectDetails(){}
	
}
