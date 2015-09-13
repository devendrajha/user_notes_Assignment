package com.getPrint.notes.dao;

import java.io.Serializable;
import java.util.List;

import com.getPrint.notes.beans.Notes;
import com.getPrint.notes.beans.User;
import com.getPrint.notes.util.HibernateTemplate;
import com.getPrint.notes.util.NotesVO;

public class  NotesDAOImplementaion implements NotesDAO {
	@Autowired
	UserDAOImplementaion userDAOImplementaion;
	
	@Override
	public int addNotes(NotesVO noteVO,int userId) {
		User user=(User)userDAOImplementaion.getUser(User.class, userId);
		Notes note=new Notes(noteVO.getTitle(),noteVO.getNotes(),noteVO.getCreateTime(),noteVO.getLastUpdateTime(),user );
		Integer in=(Integer) HibernateTemplate.add(note);
		
		
		return in.intValue();
	}

	

	@Override
	public void updateNotes(NotesVO noteVO) {
		
		Notes note=new Notes(noteVO.getTitle(),noteVO.getNotes(),noteVO.getCreateTime(),noteVO.getLastUpdateTime());
		HibernateTemplate.update(note);
	
	}

	@Override
	public void deleteNotes(int noteId) {
		HibernateTemplate.delete(noteId);		
		
	}



	@Override
	public List<Object> getNode(Class cls, Serializable i) {

		return (List<Object>)HibernateTemplate.get(cls, i);
	}



	
	
	
}
