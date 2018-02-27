import java.util.Scanner;



public class JSONExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Employee name: ");
		String name = input.nextLine();
		System.out.print("Enter salry: ");
		int salary1 = input.nextInt();
		
		// Create new JSON object
		JSONObject root = new JSONObject();
		
		// put the name value pair
		root.put("name", name);
		
		// Create a new JSON object and array store class object
		JSONObject courseObject1 = new JSONObject();
		EmployeeObject1.put("salry", salary1);
            int course1 = 0;
            int employee1 = 0;
		EmployeeObject1.put("name", employee1);
		
		JSONArray courses = new JSONArray();
		courses.add(courseObject1);
            String employee = null;
		
		// add the array to the root object
		root.put("employee", employee);
		
		System.out.println(root.toJSONString());
		

	}

}
