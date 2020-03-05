package dao;

import java.util.List;

import entity.Note;

public interface NoteDao {

	void add(Note entity);

	void delete(int id);

	void update(Note entity);

	Note getById(int id);

	List<Note> getByName(String data);

	List<Note> getByLastName(String data);

	List<Note> getBySurname(String data);

	List<Note> getByPhoneNumber(String data);

	List<Note> getAll();
}
