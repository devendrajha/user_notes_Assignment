package com.getPrint.notes.restWebResourse;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.getPrint.notes.beans.Notes;
import com.getPrint.notes.dao.NotesDAO;
import com.getPrint.notes.exception.AppException;
import com.getPrint.notes.util.HibernateTemplate;
import com.getPrint.notes.util.NotesVO;

@Path("/notes")
public class NotesResource {

	@Autowired
	public NotesDAO notesDAO;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response addNotes(@PathParam("notes") NotesVO notes, @PathParam("userId") int userId) throws AppException {

		notesDAO.addNotes(notes, userId);

		return Response.ok(notes).build();
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateNotes(@PathParam("notes") NotesVO notes, @PathParam("userId") int userId)
			throws AppException {
		notesDAO.updateNotes(notes);

		return Response.ok(notes).build();
	}

	@GET
	@Path("id/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getNotes(@PathParam("cls") Class cls, @PathParam("userId") int userId) throws AppException {
		List<Object> notesList = null;
		try {
			notesList = (List<Object>) notesDAO.getNode(cls, userId);
			throw new AppException();
		} catch (AppException e) {

			e.getMessage();
		}
		if (notesList == null || notesList.isEmpty()) {
			throw new AppException();

		}

		return Response.ok(notesList).build();

	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("deleteRecord/{noteId}")
	public Response deleteNotes(@PathParam("noteId") int noteId) throws AppException {
		notesDAO.deleteNotes(noteId);
		return Response.ok("true").build();

	}

}
