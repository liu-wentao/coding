package cn.itcast.form;

import java.util.Map;
import java.util.Set;

import org.apache.catalina.tribes.util.Arrays;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Form1DemoAction extends ActionSupport {

	public String execute() throws Exception {
		//第一种方式 使用ActionContext类获取
		//1 获取ActionContext对象
		ActionContext context = ActionContext.getContext();
		//2 调用方法得到表单数据
		// key是表单输入项name属性值，value是输入的值
		Map<String, Object> map = context.getParameters();
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			//根据key得到value
			//数组形式：因为输入项里面可能有复选框情况
			Object[] obj = (Object[]) map.get(key);
			System.out.println(Arrays.toString(obj));
		}
		
		return NONE;
	}
}
