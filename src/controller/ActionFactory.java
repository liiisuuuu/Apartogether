package controller;

import action.Action;
import action.HomeAction;
import action.LoginAction;
import action.MemberAction;

public class ActionFactory {
	private static ActionFactory factory;
	private ActionFactory() {}
	
	public synchronized static ActionFactory getFactory() {
		if (factory == null) {
			factory = new ActionFactory();
		}
		return factory;
	}
	
	public Action getAction(String cmd) {
		Action action = null; // 어떤 action으로 전송할지 모르니까 null
		
		if (cmd.equals("home")) {
			action = new HomeAction();
			
		} else if (cmd.equals("memberList")) {
			action = new MemberAction();
			
		} else if (cmd.equals("login")) {
			action = new LoginAction();
		}
		
		return action;
	}
}