
public class RegularClassDemo {
	 private int var;
	 static void met() {
		 RegularClassDemo.Inner in=new RegularClassDemo().new Inner();
		 in.work();
	 }
	 class Inner{
		 int var;
		 void work() {
			 int var=79;
			 System.out.println("inside inner class....,var="+var);
			 System.out.println("outer class var="+RegularClassDemo.this.var);
			 
		 }
	 }
public static void main(String args[]) {
	new RegularClassDemo().met();
}
}
