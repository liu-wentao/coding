package cn.itcast.service;

import java.util.List;

import cn.itcast.dao.CustomerDao;
import cn.itcast.dao.CustomerDaoImpl;
import cn.itcast.entity.Customer;

public class CustomerService {

	public List<Customer> findAll() {
		CustomerDao dao = new CustomerDaoImpl();
		return dao.findAll();
	}

}
