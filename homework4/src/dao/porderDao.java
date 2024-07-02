package dao;

import java.util.List;

import model.porder;

public interface porderDao {
	// create
	void add(porder p);

	// read

	List<porder> queryAll();
	// select * from porder

	List<porder> queryName(String name);
	// select * from poder where name=?

	porder queryId(int id);

	// update
	void update(porder p);
	// delete

	void delete(int id);

}
