package dao;

import java.util.Arrays;
import java.util.List;

import entity.Note;

public class NoteArrayDaoImpl implements NoteDao {

	public static int ID;
	private Note[] notes = new Note[10];
	private int currentIndex = 0;

	@Override
	public void add(Note entity) {

		if (isFull()) {
			recreate();
		}

		entity.setId(ID++);
		notes[currentIndex] = entity;
		currentIndex++;
	}

	private boolean isFull() {
		if (currentIndex == notes.length) {
			return true;
		}
		return false;
	}

	private void recreate() {
		int length = notes.length * 2;
		notes = Arrays.copyOf(notes, length);
	}

	@Override
	public void delete(int id) {

		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getId() == id) {
				currentIndex--;
				notes[i] = notes[currentIndex];
				notes[i].setId(id);
			}
		}

	}

	@Override
	public void update(Note entity) {

		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getId() == entity.getId()) {
				notes[i] = entity;
			}
		}

	}

	@Override
	public Note getById(int id) {
		Note result = new Note();

		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getId() == id) {
				result = notes[i];
			}
		}
		return result;
	}

	@Override
	public List<Note> getByName(String data) {

		Note[] result = new Note[currentIndex];
		int index = 0;
		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getName().equals(data)) {
				result[index] = notes[i];
				index++;
			}
		}
		result = Arrays.copyOf(result, index);
		return Arrays.asList(result);
	}

	@Override
	public List<Note> getByLastName(String data) {
		Note[] result = new Note[currentIndex];
		int index = 0;
		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getPatronymic().equals(data)) {
				result[index] = notes[i];
				index++;
			}
		}
		result = Arrays.copyOf(result, index);
		return Arrays.asList(result);
	}

	@Override
	public List<Note> getBySurname(String data) {
		Note[] result = new Note[currentIndex];
		int index = 0;
		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getSurname().equals(data)) {
				result[index] = notes[i];
				index++;
			}
		}
		result = Arrays.copyOf(result, index);
		return Arrays.asList(result);
	}

	@Override
	public List<Note> getByPhoneNumber(String data) {
		Note[] result = new Note[currentIndex];
		int index = 0;
		for (int i = 0; i < currentIndex; i++) {
			if (notes[i].getPhoneNumber().equals(data)) {
				result[index] = notes[i];
				index++;
			}
		}
		result = Arrays.copyOf(result, index);
		return Arrays.asList(result);
	}

	@Override
	public List<Note> getAll() {

		Note[] result = new Note[currentIndex];
		int index = 0;
		for (int i = 0; i < currentIndex; i++) {
			if (notes[i] != null) {
				result[index] = notes[i];
				index++;
			}
		}
		return Arrays.asList(result);
	}

}
