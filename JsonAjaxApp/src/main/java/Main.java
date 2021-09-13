import org.json.JSONObject;

import com.hsbc.web.entity.Emp;

public class Main {

	public static void main(String[] args) {
		Emp emp= new Emp(100, "Shantanu", "Hyderabad", 89000);
	JSONObject obj=new JSONObject(emp);
	System.out.println(obj.toString());

	}

}
