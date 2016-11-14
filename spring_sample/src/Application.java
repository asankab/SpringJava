import com.pluralsite.service.CustomerService;
import com.pluralsite.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl(); 
		System.out.println(service.finfAll().get(0).getFirstname());
	}

}
