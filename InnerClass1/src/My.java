interface Employee{
	
void workForWages();

}

class Shruti{

	public void doSomething(Employee emp){
	
	emp.workForWages();
}
}

 class My {
	public static void main(String args[]) {

		
		Shruti s = new Shruti();

		
		s.doSomething(new Employee(){
				
	@Override
				
	public void workForWages(){
					
	System.out.println("Truly magical...");
				
	}
			
	});


	}
 }

