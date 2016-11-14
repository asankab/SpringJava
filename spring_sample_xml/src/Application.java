import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsite.service.CustomerService;

public class Application {

	private static ApplicationContext appContext;

	public static void main(String[] args) {
		//CustomerService service = new CustomerServiceImpl();
		
		appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService.finfAll().get(0).getFirstname());
	}

}
