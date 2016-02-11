class Machine{
	
	public void start(){
		System.out.println("Vrrrrrooooom");
	}
}


interface Plant{
	public void grow();
}



public class App {

	public static void main(String[] args) {
		
		
		//An anonymous class instanceiates  the object but also includes an overiding method when created
		Machine mach1 = new Machine(){
			@Override public void start(){
				
				System.out.println("Click...click...click");
				
			}
		};
		
		Machine mach2 = new Machine();
				
				
		//Uses the Anonymous Class
		mach1.start();
		//Uses the Machine Class
		mach2.start();
		
		//Uses the Interface to create a plant object with the required grow()method in the anyonmys class
		Plant plant1 = new Plant(){
			public void grow(){
				System.out.println("Growwwwwing");
			}
		};
		
		
		plant1.grow();
		

	}

}
