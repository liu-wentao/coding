package cn.itcast.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import cn.itcast.entity.User;
import cn.itcast.utils.HibernateUtils;

public class HibernateDemo {
	
	@Test
	public void testSaveOrUpdate() {
		//1 调用工具类得到sessionFactory
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		//2 获取session
		Session session = sessionFactory.openSession();
		//3 开启事务
		Transaction tx = session.beginTransaction();
		
//		User user = new User();
//		user.setUid(1);
//		user.setUsername("mary");
//		user.setPassword("250");
//		user.setAddress("越南");
//		
//		session.save(user);
		
		//把uid=1的记录username修改
//		User user = new User();
//		user.setUid(1);
//		user.setUsername("tom");
//		
//		session.update(user);
		
		//1 添加操作
//		User user = new User();
//		user.setUsername("jack");
//		user.setPassword("520");
//		user.setAddress("朝鲜");
		
//		User user = new User();
//		user.setUid(6);
//		user.setUsername("rose");
//		user.setPassword("1314");
//		user.setAddress("阿尔巴尼亚");
		
		User user = session.get(User.class, 7);
		user.setUsername("lilei");
		
		//实体类对象状态是持久态，做修改
		session.saveOrUpdate(user);
		
		//5 提交事务
		tx.commit();
		//6 关闭
		session.close();
		sessionFactory.close();	
	}
	
	@Test
	public void testDelete() {
		//1 调用工具类得到sessionFactory
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		//2 获取session
		Session session = sessionFactory.openSession();
		//3 开启事务
		Transaction tx = session.beginTransaction();
		
		//4 删除操作
		//第一种 根据id查询对象
		User user = session.get(User.class, 2);
		session.delete(user);
		
		//第二种 
//		User user = new User();
//		user.setUid(3);
		
//		session.delete(user);
		
		//5 提交事务
		tx.commit();
		//6 关闭
		session.close();
		sessionFactory.close();	
	}
	
	@Test
	public void testUpdate() {
		//1 调用工具类得到sessionFactory
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		//2 获取session
		Session session = sessionFactory.openSession();
		//3 开启事务
		Transaction tx = session.beginTransaction();
		
		//4 修改操作
		// 修改uid=2记录username值
		//4.1 根据id查询
		User user = session.get(User.class, 2);
		//4.2 向返回的user对象里面设置修改之后的值
		user.setUsername("岳不群");
		//4.3 调用session的方法update修改
		//执行过程：到user对象里面找到uid值，根据uid进行修改
		session.update(user);
		
		//5 提交事务
		tx.commit();
		//6 关闭
		session.close();
		sessionFactory.close();	
	}

	@Test
	public void testGet() {
		//1 调用工具类得到sessionFactory
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		//2 获取session
		Session session = sessionFactory.openSession();
		//3 开启事务
		Transaction tx = session.beginTransaction();
		
//		User u = new User();
//		u.setUsername("jack");
//		u.setPassword("124");
//		u.setAddress("china");
//		
//		session.save(u);
		
		//4 根据id查询
		//调用session里面的get方法
		//第一个参数：实体类的class
		//第二个参数：id值
		User user = session.get(User.class, 1);
		
		System.out.println(user);
		//5 提交事务
		tx.commit();
		//6 关闭
		session.close();
		sessionFactory.close();	
	}
}
