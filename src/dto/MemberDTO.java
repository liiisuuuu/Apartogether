package dto;

public class MemberDTO {
	private String id; 		/* ��� ���̵� */
	private String mtype; 	/* admin / user / biz | 3���� */
	private String name; 	/* �̸� */
	private String password;/* �н����� */
	private String phone; 	/* �޴�����ȣ(String����) */
	private String birth; 	/* ��¥������ ���󰩴ϴ�. */
	private String gender; 	/* male / female | ���� */
	private String nickname;/* �г��� */
	private String address; /* �ּ� */
	private String profile; /* ������ �̹��� */
	private String passwordanswer;
	private String passwordquest;
	
	public MemberDTO() {
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getPasswordanswer() {
		return passwordanswer;
	}
	public void setPasswordanswer(String passwordanswer) {
		this.passwordanswer = passwordanswer;
	}
	public String getPasswordquest() {
		return passwordquest;
	}
	public void setPasswordquest(String passwordquest) {
		this.passwordquest = passwordquest;
	}
}