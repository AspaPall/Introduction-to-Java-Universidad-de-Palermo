
public class HeavyWork {
	
	public void doSomeWork(Person p) {
		String work = "Work done: ";
		try {
		System.out.println(work+liftbox(p));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Work not done");
		} finally { // finally box is not mandatory
			System.out.println("Report to manager");			
		}
	}
	
	public String liftbox(Person p) throws Exception{
		if (p.getAge()<18) {
			throw new Exception("People under 18 are not allowed");
		}
		
		return p.getName()+" is lifting the boxes";

}
}
