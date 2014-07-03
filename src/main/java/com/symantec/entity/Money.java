package com.symantec.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "money", catalog = "hackathon")
public class Money {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userid", nullable = false)
	private UserDetail userid;
	@Column(name = "amount", nullable = false, precision = 20)
	private BigDecimal blood_group;
	@Column(name = "description", nullable = false, length = 200)
	private String description;
	@Column(name = "payment_gateway", nullable = false, length = 20)
	private String payment_gateway;
	@Column(name = "payment_status", nullable = false, length = 20)
	private String payment_status;
	@Column(name = "user_type", nullable = false, length = 20)
	private String user_type;
	
	
	/**
	 * @param userid
	 * @param blood_group
	 * @param description
	 * @param payment_gateway
	 * @param payment_status
	 * @param user_type
	 */
	public Money(UserDetail userid, BigDecimal blood_group,
			String description, String payment_gateway, String payment_status,
			String user_type) {
		super();
		this.userid = userid;
		this.blood_group = blood_group;
		this.description = description;
		this.payment_gateway = payment_gateway;
		this.payment_status = payment_status;
		this.user_type = user_type;
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
	 * @return the userid
	 */
	public UserDetail getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(UserDetail userid) {
		this.userid = userid;
	}
	/**
	 * @return the blood_group
	 */
	public BigDecimal getBlood_group() {
		return blood_group;
	}
	/**
	 * @param blood_group the blood_group to set
	 */
	public void setBlood_group(BigDecimal blood_group) {
		this.blood_group = blood_group;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the payment_gateway
	 */
	public String getPayment_gateway() {
		return payment_gateway;
	}
	/**
	 * @param payment_gateway the payment_gateway to set
	 */
	public void setPayment_gateway(String payment_gateway) {
		this.payment_gateway = payment_gateway;
	}
	/**
	 * @return the payment_status
	 */
	public String getPayment_status() {
		return payment_status;
	}
	/**
	 * @param payment_status the payment_status to set
	 */
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	/**
	 * @return the user_type
	 */
	public String getUser_type() {
		return user_type;
	}
	/**
	 * @param user_type the user_type to set
	 */
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	
	
}
