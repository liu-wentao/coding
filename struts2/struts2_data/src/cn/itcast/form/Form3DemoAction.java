package cn.itcast.form;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.tribes.util.Arrays;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 使用接口注入方式
 * @author asus
 *
 */
public class Form3DemoAction extends ActionSupport implements ServletRequestAware {

	private HttpServletRequest request ;
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public String execute() throws Exception {
		request.getParameter("");
		
		return NONE;
	}


}
