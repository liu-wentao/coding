package cn.itcast.form;

import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.tribes.util.Arrays;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Form2DemoAction extends ActionSupport {

	public String execute() throws Exception {
		//第一种方式 使用ServletActionContext类获取
		//1 使用ServletActionContext获取request对象
//		HttpServletRequest request = ServletActionContext.getRequest();
//		//2 调用request里面的方法得到结果
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		String address = request.getParameter("address");
//		
//		System.out.println(username+":"+password+":"+address);
//		
		//操作三个域对象
		//1 request域
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("req", "reqValue");
		
		//2 session域
		HttpSession session = request.getSession();
		session.setAttribute("sess", "sessValue");
		
		//3 ServletContext域
		ServletContext context = ServletActionContext.getServletContext();
		context.setAttribute("contextname", "contextValue");
		
		return NONE;
	}
}




