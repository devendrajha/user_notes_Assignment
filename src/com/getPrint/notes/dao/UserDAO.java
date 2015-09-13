package com.getPrint.notes.dao;

import java.io.Serializable;

import com.getPrint.notes.beans.User;
import com.getPrint.notes.util.NotesVO;

public interface UserDAO {

	public  User getUser(Class cls,Serializable i);
}
