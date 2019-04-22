package cn.itcast.action;

import com.opensymphony.xwork2.Action;

/**
 * 实现接口
 * @author asus
 *
 */
public class UserAction implements Action{

	@Override
	public String execute() throws Exception {
//		return "success";
		return SUCCESS;
	}

}
