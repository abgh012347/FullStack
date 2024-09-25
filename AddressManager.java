package package1;

import java.util.Scanner;

public class AddressManager {
	private User[] user = new User[3];
	private boolean isLogin = false;
	private boolean end_flag = false;
	public AddressManager() {
		user[0]=new User("aa","11","김범석","01011112222","서울");
		user[1]=new User("bb","22","김범돌","01055556666","경기");
		user[2]=new User("cc","33","김석돌","01088889999","부산");
		
		
	}
	public void run() {
		MenuManager m_manger = new MenuManager();
		m_manger.initMenu();
		int select_num = m_manger.selectInitMenu();
		if(select_num == 2) {
			return;
		}
		
	}
	
	public boolean loginProcess() {
		Scanner input = new Scanner(System.in);
		System.out.print("ID : ");
		String id = input.nextLine();
		System.out.print("PW : ");
		String pw = input.nextLine();
		
		
		for(int i=0;i<user.length;i++) {
			if(user[i].getId().equals(id) && user[i].getPw().equals(pw)) {
				isLogin = true;
				MenuManager m_manager = new MenuManager();
				m_manager.addressMenu();
				m_manager.selectAddressMenu();
			}
		}
		if(!isLogin) {
			System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
			loginProcess();
		}
		return isLogin;
	}
	
	public void addressProcess() {
		
	}
	
	public void addressSearch() {
		Scanner input = new Scanner(System.in);
		System.out.print("검색할 유저의 이름 : ");
		String name = input.nextLine();
		
		for(int i = 0;i<user.length;i++) {
			if(name.equals(user[i].getName())) {
				System.out.println(user[i].getName()+"님의 주소 : "+user[i].getAddress());
				System.out.println(user[i].getName()+"님의 전화번호 : "+user[i].getPhone());
				break;
			}
			if(i == user.length) {
				System.out.println("해당 유저가 존재하지 않습니다.");
				break;
			}
		}
		MenuManager m_manager = new MenuManager();
		m_manager.addressMenu();
		m_manager.selectAddressMenu();
	}
	
	public void allAddressSearch() {
		
		for(int i = 0;i<user.length;i++) {
			System.out.println(user[i].getName()+"님의 주소 : "+user[i].getAddress());
			System.out.println(user[i].getName()+"님의 전화번호 : "+user[i].getPhone());
		}
		MenuManager m_manager = new MenuManager();
		m_manager.addressMenu();
		m_manager.selectAddressMenu();
	}

	public void logout() {
		System.out.println("프로그램을 종료합니다.");
		MenuManager m_manager = new MenuManager();
		if(isLogin) {
			m_manager.initMenu();
		}
		else if(end_flag)
			
		return;
	}

}
