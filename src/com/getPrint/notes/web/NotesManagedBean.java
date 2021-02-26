package com.getPrint.notes.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import ManagedBean;
import ObjectMapper;
import RequestScoped;
import Response;

@ManagedBean(name = "notesManagedBean")
@RequestScoped
public class NotesManagedBean {

	public int noteId;
	private String title;
	private String notes;
	private Date createTime;
	private Date lastUpdateTime;

	@PostConstruct
	public void init() {

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

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public void addnotes() {
		final StringBuilder url;

		final Client client = ClientBuilder.newClient();
		final WebTarget target = client.target(url);
		final Response response = target.request().header("JSESSIONID", accessToken).accept(Constants.CONTENT_TYPE)
				.get();

		response.bufferEntity();
		client.close();

		return (response);

	}

}
