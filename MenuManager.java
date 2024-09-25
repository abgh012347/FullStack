package package1;

import java.util.Scanner;

public class MenuManager {
	private int Login = 1;
	private int EXIT = 2;
	private int ADDRESS_SEARCH = 1;
	private int ALL_ADDRESS_SEARCH = 2;
	private int LOGOUT = 3;
	
	public MenuManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void initMenu() {
		System.out.println("<<주소록 관리>>");
		System.out.println("1. 로그인");
		System.out.println("2. 종료");
		
	}
	
	public void addressMenu() {
		System.out.println("<<주소록 관리>>");
		System.out.println("1. 주소록 검색");
		System.out.println("2. 전체 주소록 검색");
		System.out.println("3. 로그아웃");
	}
	
	public int selectInitMenu() {
		Scanner input = new Scanner(System.in);
		//boolean end_flag = false;
		AddressManager addr_manager = new AddressManager();
		int select_menu = input.nextInt();
		boolean login_yn = false;
		switch(select_menu) {
		case 1 : 
		addr_manager.loginProcess();
			break;
		case 2 :
			addr_manager.logout();
			//end_flag = true;
			break;
		}
		
		return select_menu;
	}
	
	public int selectAddressMenu() {
		Scanner input = new Scanner(System.in);
		AddressManager addr_manager = new AddressManager();
		int select_menu = input.nextInt();
		input.nextLine();
		
		switch(select_menu) {
		case 1 : 
			addr_manager.addressSearch();
			break;
		case 2 :
			addr_manager.allAddressSearch();
			break;
		case 3 :
			addr_manager.logout();
			break;
		default :
			System.out.println("존재하지 않는 기능 입니다.");
		}
		//addressMenu();
		return select_menu;
	}

}
