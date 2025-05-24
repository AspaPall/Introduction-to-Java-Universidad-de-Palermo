
public class ArraysTest {
	public static void main(String[] args) {
		int[] integers = new int[5];
		integers[4] = 3;
		System.out.println(integers[4]);
		for(int i=0;i<integers.length;i++) {
			System.out.println(integers[i]);
		}
		
		Employee[] company = new Employee[3];
		Employee Alex = new Employee(); //first I need an employee to put in company
		Alex.setName("Alex");
		company[0] = Alex;
		
		for(Employee emp:company) {
			if(emp != null) {
				System.out.println(emp.getName());
			}
		}
		
		for(int i=0;i<company.length;i++) {
			if(company[i] != null) {
				System.out.println(company[i].getName());
				}
			}
		}
	}

