
public class Person {

		private String name;
		
	
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public void tellName() {
			String message = "I am " + name;
			System.out.println(message);
		}
		
}
