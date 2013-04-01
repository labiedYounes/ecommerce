package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

public class gennericDao <T> extends dao<T> {

	public gennericDao(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(T obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(T obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(T obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T find(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T find(String str) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<T> getList(String string) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public T getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
