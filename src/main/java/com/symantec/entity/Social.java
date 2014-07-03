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
@Table(name = "social", catalog = "hackathon")
public class Social {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userid", nullable = false)
	private UserDetail userid;
	@Column(name = "description", nullable = false, length = 200)
	private String description;
	@Column(name = "availFrom", nullable = false, length = 100)
	private String availFrom;
	@Column(name = "availTo", nullable = false, length = 100)
	private String availTo;
	@Column(name = "user_type", nullable = false, length = 20)
	private String user_type;
	
	
	
	/**
	 * @param userid
	 * @param description
	 * @param availFrom
	 * @param availTo
	 * @param user_type
	 */
	public Social(UserDetail userid, String description, String availFrom,
			String availTo, String user_type) {
		super();
		this.userid = userid;
		this.description = description;
		this.availFrom = availFrom;
		this.availTo = availTo;
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
	 * @return the availFrom
	 */
	public String getAvailFrom() {
		return availFrom;
	}
	/**
	 * @param availFrom the availFrom to set
	 */
	public void setAvailFrom(String availFrom) {
		this.availFrom = availFrom;
	}
	/**
	 * @return the availTo
	 */
	public String getAvailTo() {
		return availTo;
	}
	/**
	 * @param availTo the availTo to set
	 */
	public void setAvailTo(String availTo) {
		this.availTo = availTo;
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
