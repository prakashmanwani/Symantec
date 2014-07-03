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
@Table(name = "health", catalog = "hackathon")
public class Health {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userid", nullable = false)
	private UserDetail userid;
	@Column(name = "blood_group", nullable = false, length = 20)
	private String blood_group;
	@Column(name = "description", nullable = false, length = 200)
	private String description;
	@Column(name = "user_type", nullable = false, length = 20)
	private String user_type;
	
	
	/**
	 * @param userid
	 * @param blood_group
	 * @param description
	 * @param user_type
	 */
	public Health(UserDetail userid, String blood_group,
			String description, String user_type) {
		super();
		this.userid = userid;
		this.blood_group = blood_group;
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
	 * @return the blood_group
	 */
	public String getBlood_group() {
		return blood_group;
	}
	/**
	 * @param blood_group the blood_group to set
	 */
	public void setBlood_group(String blood_group) {
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
