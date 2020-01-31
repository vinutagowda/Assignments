
interface Remote{
	void doSomething();
}
	class MyWork{
		public static void main(String args[]){
			Remote ref=new Remote() {
				
			
			public void doSomething() {
				System.out.println("inside dosomething.......");
			
				
			}
		};
		
	ref.doSomething();
		}
	}
