package com.symantec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clothes", catalog = "hackathon")
public class Clothes {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userid", nullable = false)
	private UserDetail userid;
	@Column(name = "quantity")
	private Integer quantity;
	@Column(name = "drop_service", nullable = false, length = 20)
	private String drop_service;
	@Column(name = "description", nullable = false, length = 200)
	private String description;
	@Column(name = "user_type", nullable = false, length = 20)
	private String user_type;
	
	
	/**
	 * @param userid
	 * @param quantity
	 * @param drop_service
	 * @param description
	 * @param user_type
	 */
	public Clothes(UserDetail userid, Integer quantity,
			String drop_service, String description, String user_type) {
		super();
		this.userid = userid;
		this.quantity = quantity;
		this.drop_service = drop_service;
		this.description = description;
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
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the drop_service
	 */
	public String getDrop_service() {
		return drop_service;
	}
	/**
	 * @param drop_service the drop_service to set
	 */
	public void setDrop_service(String drop_service) {
		this.drop_service = drop_service;
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