package service;

import java.util.List;

import dao.NoteArrayDaoImpl;
import dao.NoteDao;
import dao.NoteDbDaoImpl;
import entity.Note;

public class Notebook {

	NoteDao note = new NoteArrayDaoImpl();

	public void addNote(Note entity) {
		note.add(entity);
	}

	public void updateNote(Note entity) {
		note.update(entity);
	}

	public void deleteNote(int id) {
		note.delete(id);
	}

	public Note getNoteById(int id) {
		return note.getById(id);
	}

	public List<Note> getAllNotes() {
		return note.getAll();
	}

	public List<Note> getNoteByName(String name) {
		return note.getByName(name);
	}

	public List<Note> getNoteByLastName(String lastName) {
		return note.getByLastName(lastName);
	}

	public List<Note> getNoteBySurname(String surname) {
		return note.getBySurname(surname);
	}

	public List<Note> getNoteByPhoneNumber(String phoneNumber) {
		return note.getByPhoneNumber(phoneNumber);
	}

}
