package com.symantec.entity;

// Generated Jul 2, 2014 3:23:16 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserDetail generated by hbm2java
 */
@Entity
@Table(name = "user_detail", catalog = "hackathon")
public class UserDetail implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String telephone;
	@Column(name = "govId")
	private String govId;
	@Column(name = "serviceType")
	private String serviceType;
	@Column(name = "govIdType")
	private String govIdType;
	@Column(name = "age")
	private String age;
	@Column(name = "userType")
	private String userType;
	
	/**
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param telephone
	 * @param govId
	 * @param serviceType
	 * @param govIdType
	 * @param age
	 * @param userType
	 */
	public UserDetail(String firstname, String lastname,
			String email, String telephone, String govId, String serviceType,
			String govIdType, String age, String userType) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.telephone = telephone;
		this.govId = govId;
		this.serviceType = serviceType;
		this.govIdType = govIdType;
		this.age = age;
		this.userType = userType;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the govId
	 */
	public String getGovId() {
		return govId;
	}
	/**
	 * @param govId the govId to set
	 */
	public void setGovId(String govId) {
		this.govId = govId;
	}
	/**
	 * @return the serviceType
	 */
	public String getServiceType() {
		return serviceType;
	}
	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	/**
	 * @return the govIdType
	 */
	public String getGovIdType() {
		return govIdType;
	}
	/**
	 * @param govIdType the govIdType to set
	 */
	public void setGovIdType(String govIdType) {
		this.govIdType = govIdType;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

}