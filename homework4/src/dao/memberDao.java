package dao;

import java.util.List;

import model.member;

public interface memberDao {
	
	//create
	void add(member m);
	
	
	//read
	member queyMember(String username,String password);
	boolean queryUsername(String username);
	List<member> queryAll();
	member queryUser(String username);//避免與上方的username重複所以改成queryUser//帳號
   List<member> queryID(int startId, int endId);
   List<member> queryAddress(String address);
	    
	    
	//update
   void update(member m);
	//delete
	void delete(int id);
}
