package cn.itcast.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.itcast.entity.User;
import cn.itcast.utils.HibernateUtils;

public class HibernateSelect {
	
	//事务规范代码
	@Test
	public void testTx() {
		Session session = null;
		Transaction tx = null;
		try {
			//与本地线程绑定的session
			session = HibernateUtils.getSessionobject();
			//开启事务
			tx = session.beginTransaction();
			
			//添加
			User user = new User();
			user.setUsername("小马1");
			user.setPassword("250");
			user.setAddress("美国");
			
			session.save(user);
			
//			int i = 10/0;
			//提交事务
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			//回滚事务
			tx.rollback();
		}finally {
			//关闭操作
//			session.close();
//			sessionFactory.close();
		}
	}
	
	//一级缓存特性
	@Test
	public void testDemo() {
		//1 调用工具类得到sessionFactory
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		//2 获取session
		Session session = sessionFactory.openSession();
		//3 开启事务
		Transaction tx = session.beginTransaction();
		
		//1 根据id查询
		User user = session.get(User.class, 7);
		
		//2 设置返回对象值
		user.setUsername("hanmeimei");
		
		//3 调用方法实现
//		session.update(user);
		
		//5 提交事务
		tx.commit();
		//6 关闭
		session.close();
		sessionFactory.close();	
	}
	
	
	//验证一级缓存存在
	@Test
	public void testCasch() {
		//1 调用工具类得到sessionFactory
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		//2 获取session
		Session session = sessionFactory.openSession();
		//3 开启事务
		Transaction tx = session.beginTransaction();
		
		//1 根据uid=6查询
		// 执行第一个get方法是否查询数据库，是否发送sql语句
		User user1 = session.get(User.class, 6);
		System.out.println(user1);
		
		//出现异常
		int i = 10/0;
		
		//2 在 根据uid=6查询
		// 执行第二个get方法是否查询数据库，是否发送sql语句
		User user2 = session.get(User.class, 6);
		System.out.println(user2);
		
		//5 提交事务
		tx.commit();
		//6 关闭
		session.close();
		sessionFactory.close();	
	}
	

}
