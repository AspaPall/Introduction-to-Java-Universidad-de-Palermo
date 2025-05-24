
public class ExceptionTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Aspa");
		p.setAge(23);
		
		Person p2 = new Person();
		p2.setName("Vasso");
		p2.setAge(16);
		
		HeavyWork h = new HeavyWork();
		
		h.doSomeWork(p);
		
		h.doSomeWork(p2);
		
		
	}

}
