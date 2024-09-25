package package1;

public class User {
	private String name;
	private String id;
	private String pw;
	private String phone;
	private String address;
	private boolean login_state = false;
	
	public User(String pid,String ppw,String pname,String pphone,String paddress) {
		// TODO Auto-generated constructor stub
		this.id = pid;
		this.pw = ppw;
		this.name = pname;
		this.phone = pphone;
		this.address = paddress;
	}
	
	public boolean isLogin() {
		login_state = true;
		return login_state;
	}
	
	public void setLogin() {
		
	}
	
	public void logout() {
		login_state = false;
	}
	
	public String getPw() {
		return this.pw;
	}
	
	public void setPw(String ppw) {
		this.pw = ppw;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String pphone) {
		this.phone = pphone;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String pAddress) {
		this.address = pAddress;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
}
