package assignment2;
abstract class Vehicle{
abstract void start();
abstract void stop();
void display(){
System.out.println("Vehicle");
}
}
class TwoWheeler extends Vehicle{  
    
    public void start() {  
        System.out.println("Two wheeler start logic");      
  }    
    public void stop() {  
        System.out.println("Two wheeler start logic");      
  }  
} 
public class abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler twoWheeler = new TwoWheeler();
		      
		        twoWheeler.start();  
		        twoWheeler.stop();  
		        twoWheeler.display();
	}

}
