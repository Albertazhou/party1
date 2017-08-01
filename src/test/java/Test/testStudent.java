package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.party.entity.Students;

public class testStudent {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	@Before
	public void init() {
		//创建配置对象
		Configuration config=new Configuration().configure();
		//创建服务注册对象
		ServiceRegistry serviceR=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//创建会话工厂对象
		sessionFactory=config.buildSessionFactory(serviceR);
		//会话对象
		session=sessionFactory.openSession();
		//开启事务
		transaction=session.beginTransaction();
				
	}
	@Test
	public void teststu() {
		Students stu=new Students("1234","1234","1234","1234","1234","1234");
		session.save(stu);
	}
	@After
	public void destroy(){
		transaction.commit();//提交事务
		session.close();     //关闭会话
		sessionFactory.close(); //关闭工厂
	}

}
