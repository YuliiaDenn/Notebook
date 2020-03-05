package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Note;

public class NoteDbDaoImpl extends Dao implements NoteDao {

	@Override
	public void add(Note entity) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "INSERT INTO note(name, patronymic, surname, phone_number) VALUES('" + entity.getName() + "', '"
				+ entity.getPatronymic() + "', '" + entity.getSurname() + "', '" + entity.getPhoneNumber() + "')";

		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "DELETE FROM note WHERE id = '" + id + "'";

		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Note entity) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "UPDATE note SET name = '" + entity.getName() + "', patronymic = '" + entity.getPatronymic() + "',"
				+ " surname = '" + entity.getSurname() + "', phone_number ='" + entity.getPhoneNumber() + "' "
				+ " WHERE id = '" + entity.getId() + "' ";

		try {
			st = conn.createStatement();
			st.executeUpdate(sql);
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Note getById(int id) {

		Connection conn = getConnection();
		Statement st = null;
		Note note = new Note();
		String sql = "SELECT * FROM note WHERE id = '" + id + "'";

		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			note.setId(rs.getInt(1));
			note.setName(rs.getString(2));
			note.setPatronymic(rs.getString(3));
			note.setSurname(rs.getString(4));
			note.setPhoneNumber(rs.getString(5));
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return note;
	}

	@Override
	public List<Note> getByName(String data) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "SELECT * FROM note WHERE name = '" + data + "'";
		Note note = null;
		List<Note> notes = new ArrayList<>();

		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				note = new Note();
				note.setId(rs.getInt(1));
				note.setName(rs.getString(2));
				note.setPatronymic(rs.getString(3));
				note.setSurname(rs.getString(4));
				note.setPhoneNumber(rs.getString(5));
				notes.add(note);
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notes;
	}

	@Override
	public List<Note> getByLastName(String data) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "SELECT * FROM note WHERE patronymic = '" + data + "'";
		Note note = null;
		List<Note> notes = new ArrayList<>();

		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				note = new Note();
				note.setId(rs.getInt(1));
				note.setName(rs.getString(2));
				note.setPatronymic(rs.getString(3));
				note.setSurname(rs.getString(4));
				note.setPhoneNumber(rs.getString(5));
				notes.add(note);
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notes;
	}

	@Override
	public List<Note> getBySurname(String data) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "SELECT * FROM note WHERE surname = '" + data + "'";
		Note note = null;
		List<Note> notes = new ArrayList<>();

		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				note = new Note();
				note.setId(rs.getInt(1));
				note.setName(rs.getString(2));
				note.setPatronymic(rs.getString(3));
				note.setSurname(rs.getString(4));
				note.setPhoneNumber(rs.getString(5));
				notes.add(note);
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notes;
	}

	@Override
	public List<Note> getByPhoneNumber(String data) {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "SELECT * FROM note WHERE phone_number = '" + data + "'";
		Note note = null;
		List<Note> notes = new ArrayList<>();

		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				note = new Note();
				note.setId(rs.getInt(1));
				note.setName(rs.getString(2));
				note.setPatronymic(rs.getString(3));
				note.setSurname(rs.getString(4));
				note.setPhoneNumber(rs.getString(5));
				notes.add(note);
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notes;
	}

	@Override
	public List<Note> getAll() {

		Connection conn = getConnection();
		Statement st = null;
		String sql = "SELECT * FROM note";
		Note note = null;
		List<Note> notes = new ArrayList<>();

		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				note = new Note();
				note.setId(rs.getInt(1));
				note.setName(rs.getString(2));
				note.setPatronymic(rs.getString(3));
				note.setSurname(rs.getString(4));
				note.setPhoneNumber(rs.getString(5));
				notes.add(note);
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notes;
	}
  }