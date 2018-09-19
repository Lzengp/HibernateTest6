package cn.hnust.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.hnust.domain.Customer;
import cn.hnust.util.HibernateUtil;

/**
 * 注解和hibernate配合使用（去掉实体类的配置文件）
 * @author 龙伟
 * 2018年9月18日
 */
public class HibernateJPADemo {
	/*
	 * 保存操作
	 */
	@Test
	public void test1() {
		Session session = HibernateUtil.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Customer csut = new Customer();
		csut.setCustName("JPA和hibernate配置使用");
		session.save(csut);
		tx.commit();
	}

}
