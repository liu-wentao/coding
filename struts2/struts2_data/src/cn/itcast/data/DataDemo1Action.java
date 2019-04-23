package cn.itcast.data;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 使用属性封装获取表单数据
 * @author asus
 *
 */
public class DataDemo1Action extends ActionSupport {

	//1 定义变量
	//变量的名称和表单输入项name属性值一样
	private String username;
	private String password;
	private String address;
	
	//2 生成变量的set和get方法
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
		System.out.println(username+":"+password+":"+address);
		return NONE;
	}


}
