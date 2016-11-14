import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.pluralsite.service.CustomerService;
import com.pluralsite.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsite"})
@PropertySource("app.properties")//com.pluralsite.model.app.properties
public class AppConfig {

	/*@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		customerService.setCustomerRepository(getCustomerRepository());
		
		return customerService;
	}*/
	
	/*@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		
		return customerService;
	}*/
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name="customerService")
	@Scope("singleton")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		
		return customerService;
	}
	
	/*@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/
}
