import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class CollectionTest {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee e = new Employee();
		e.setName("Aspa");
		
		Employee e2 = new Employee();
		e2.setName("Alex");
		
		list.add(e);
		list.add(e2);
		list.add(e);
		
		for(Iterator<Employee> i = list.iterator();i.hasNext();) {
			Employee next = i.next();
			System.out.println(next.getName());
		}
		
		for(Employee someone:list) {
			System.out.println(someone.getName());
		}
		
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(e);
		set.add(e2);
		set.add(e);
		
		for(Employee someone:set) {
			System.out.println(someone.getName());
		}
		
		HashMap<String,Employee> company = new HashMap<String, Employee>();
		company.put("Owner", e);
		company.put("Investor", e2);
		
		Set<String> positions = company.keySet();
		
		for(String key:positions) {
			Employee emp = company.get(key);
			System.out.println("key: "+key+", employee:"+emp);
		}
		
		// There are also collections, to go through them only with iterator
		
	}

}
