package cn.itcast.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.entity.User;
/**
 * 使用ServletActionContext获取表单数据封装到实体类对象里面
 * @author asus
 *
 */
public class Form4DemoAction extends ActionSupport {

	public String execute() throws Exception {
		//1 获取表单数据
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		//2 封装到实体类对象里面
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setAddress(address);
		
		System.out.println(user);
		return NONE;
	}


}
