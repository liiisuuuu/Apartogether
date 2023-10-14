package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dto.MemberDTO;
import factory.FactoryService;

public class MemberDAO {
	private static MemberDAO memberDao;
	
	private MemberDAO() {}
	
	public synchronized static MemberDAO getDao() {
		if (memberDao == null) {
			memberDao = new MemberDAO();
		}
		return memberDao;
	}
	
	public List<MemberDTO> memberList() {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		List<MemberDTO> list = ss.selectList("member.allList");
		ss.close();
		return list;
	}
}