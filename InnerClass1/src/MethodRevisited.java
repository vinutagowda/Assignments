class Some{
	 void work(Short val) {
		 System.out.println("short.........");
		 
	 }
	 void work(Double val) {
		 System.out.println("integer.................");
	 }
}
public class MethodRevisited {
	public static void main(String args[]) {
		short var=9;
		new Some().work(var);
	}

}
