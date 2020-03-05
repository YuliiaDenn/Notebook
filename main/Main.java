package main;

import dao.NoteArrayDaoImpl;
import dao.NoteDao;
import dao.NoteDbDaoImpl;
import entity.Note;
import service.Notebook;

public class Main {

	public static void main(String[] args) {

		
		Notebook notes = new Notebook();
		notes.addNote(new Note("Svitlana","Dmytrivna", "Sun", "23695"));
		notes.addNote(new Note("Tamara","Ivanivna", "Kopa", "52783"));
		
		System.out.println(notes.getAllNotes());
	}

}
