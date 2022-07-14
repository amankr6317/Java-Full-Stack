interface Result {
	public String show(int marks);
}
public class LamdaDemo {
	public static void main(String[] args) {
		Result result = (marks) -> {
			if (marks>=60) {
				return "PASS";
			} else {
				return "FAIL";
			}
			
		};
		System.out.println(result.show(50));
	}
}
