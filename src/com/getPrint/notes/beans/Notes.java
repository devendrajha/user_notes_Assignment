package com.getPrint.notes.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "notes")
public class Notes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column( name = "noteId",unique = true, nullable = false)
	
	
	public int noteId;
	
	@ManyToOne
	@JoinColumn(name="userId")
	public User user;

	@Column
	private String title;
	@Column
	private String notes;
	@Column
	private Date createTime;
	@Column
	private Date lastUpdateTime;
	

	public Notes() {

	}

	public Notes(String title, String notes, Date createTime,
			Date lastUpdateTime) {
		super();
		this.title = title;
		this.notes = notes;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
		
	}

	public Notes(String title, String notes, Date createTime,
			Date lastUpdateTime,User user) {
		super();
		this.title = title;
		this.notes = notes;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
		this.user=user;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

}
