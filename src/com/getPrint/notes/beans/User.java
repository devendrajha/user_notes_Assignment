package com.getPrint.notes.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "useId", unique = true, nullable = false)
	public int userId;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(unique = true, nullable = false)
	private String password;
	@Column
	private Date createTime;
	@Column
	private Date lastUpdateTime;
	@OneToMany
	@JoinTable(name = "notes", joinColumns = @JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "noteId"))
	private List<Notes> notes;

	public User() {
	}
	

	

	public User( String email, String password, Date createTime,
			Date lastUpdateTime) {
		super();
		 
		this.email = email;
		this.password = password;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
		
	}




	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Notes> getNotes() {
		return notes;
	}

	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}

}
