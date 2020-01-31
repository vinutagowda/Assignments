 interface Shop {
	void clothes();
	void gifts();

}
 class X implements Shop{
	 @Override
	 public void clothes() {
		 System.out.println("x is shoping clothes..........");
	 }
	 @Override
	 public void gifts() {
		 System.out.println("x is shopiing gifts...........");
	 }
	 
 }
 class Y implements Shop{
	 @Override
	 public void clothes() {
		 System.out.println("y is shopping clothes...............");
		 
		 }
	 @Override
	 public void gifts() {
		 System.out.println("y is shopping");
	 }
	 public void books() {
		 System.out.println("y is shooping books");
	 }
 }
public class RunTimePolymorphism {
	public static void main(String args[]) {
		 Shop[] shops=new Shop[2];
		 shops[0]=new X();
		 shops[1]=new Y();
		for(Shop value:shops) {
			value.clothes();
			value.gifts();
			if( value instanceof Y){
				((Y)value).books();
				
			}
		}
		 
	 }
	 
}


