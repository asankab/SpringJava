package conditioncheck;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {
	   public static void main(String[] argv) throws Exception {
		   List<History> h = new ArrayList<History>();
		   
		   History e = new History();
		   e.set_status(true);
		   e.set_env("Prod");
		   
		   History e1 = new History();
		   e1.set_status(true);
		   e1.set_env("PAF");
		   
		   
		   History e5 = new History();
		   e5.set_status(true);
		   e5.set_env("PAF");
		   
		   History e2 = new History();
		   e2.set_status(true);
		   e2.set_env("Prod");
		   
		   History e3 = new History();
		   e3.set_status(true);
		   e3.set_env("Stag");
		   
		   History e4 = new History();
		   e4.set_status(false);
		   e4.set_env("Stag");
		   
		   h.add(e);
		   h.add(e1);
		   h.add(e2);
		   h.add(e3);
		   h.add(e4);
		   h.add(e5);
		   
		List<History> lstHistory = h
				.stream()
				.filter(x -> (x.get_env().equalsIgnoreCase("PAF") || x
						.get_env().equalsIgnoreCase("Prod")) && x.get_status())
				.collect(Collectors.toList());
		   
		   for (History history : lstHistory) {
			  System.out.println(history.get_env() + ":" + history.get_status());
		   }		   
	   }
}

