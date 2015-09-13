package com.getPrint.notes.dao;

import java.io.Serializable;
import java.util.List;

import com.getPrint.notes.util.NotesVO;

public interface NotesDAO {

	public int addNotes(NotesVO noteVO,int userId);
	public void updateNotes(NotesVO noteVO);
	public void deleteNotes(int noteId);
	public  List<Object> getNode(Class cls,Serializable i)
	;
}
