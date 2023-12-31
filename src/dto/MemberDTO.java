package dto;

public class MemberDTO {
	private String id; 		/* 멤버 아이디 */
	private String mtype; 	/* admin / user / biz | 3종류 */
	private String name; 	/* 이름 */
	private String password;/* 패스워드 */
	private String phone; 	/* 휴대폰번호(String형식) */
	private String birth; 	/* 날짜형식을 따라갑니다. */
	private String gender; 	/* male / female | 성별 */
	private String nickname;/* 닉네임 */
	private String address; /* 주소 */
	private String profile; /* 프로필 이미지 */
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

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", mtype=" + mtype + ", name=" + name + ", password=" + password + ", phone="
				+ phone + ", birth=" + birth + ", gender=" + gender + ", nickname=" + nickname + ", address=" + address
				+ ", profile=" + profile + ", passwordanswer=" + passwordanswer + ", passwordquest=" + passwordquest
				+ "]";
	}
	
}