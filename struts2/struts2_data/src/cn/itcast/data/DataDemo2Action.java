package cn.itcast.data;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.entity.User;
/**
 * 使用模型驱动获取表单数据
 * @author asus
 *
 */
public class DataDemo2Action extends ActionSupport implements ModelDriven<User>{

	//创建对象
	//前提要求： 表单输入项name属性值 和 实体类属性名称一样
	private User user = new User();
	public User getModel() {
		//返回创建user对象
		return user;
	}
	
	//属性封装
	private String username;
	private String password;
	private String address;

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String execute() throws Exception {
		
		System.out.println(user);
		return NONE;
	}




}
