package util;

import controller.LoginUI;
import controller.member.addMemberUI;
import controller.member.memberDeleteU2;
import controller.member.memberManager;
import controller.member.memberSelectU1;
import controller.member.memberUpdate;

public class buttonUI {
	
	//回註冊頁
	public static void  add ()
	   {
		   addMemberUI add=new addMemberUI();
			add.setVisible(true);
			//dispose();
	   }

	   
	   //回登入頁
	   
	   public static void login() {
		   LoginUI login=new LoginUI ();
			login.setVisible(true);
			//dispose();
	   }
		
	//回會員管理頁

		public static void memberManager() {
	        memberManager m = new memberManager();
	        m.setVisible(true);
	}

	//回會員修改管理頁

		public static void backtoUpdateManager(){
			memberUpdate backtoUpdateManager= new memberUpdate();
			backtoUpdateManager.setVisible(true);
			//dispose();
			}
		
		//回會員刪除管理頁面
		
		public static void backtoDeleteManager() {
			memberDeleteU2 backtoDeleteManager= new memberDeleteU2();
			backtoDeleteManager.setVisible(true);
			//dispose();
			
		}

	//回會員查詢管理頁面
		
		public static void backtoSelectManager() {
			memberSelectU1 backtoSelectManager= new memberSelectU1();
			backtoSelectManager.setVisible(true);
			//dispose();
		}
	


}
