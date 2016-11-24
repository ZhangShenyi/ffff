package dao;

import java.util.List;

import model.advertisement;

public interface AppDao {
	public List<advertisement> checkAdbynum(int i);
	public int getTotalrecordnum();

}
