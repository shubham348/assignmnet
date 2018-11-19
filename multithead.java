package aasignmen2;

public class multithead extends Thread{
  int i=1;
	public synchronized void run() {
	  while(i<=500) {
		 System.out.println(i);
		 i++;
	  }
	  try {
		  Thread.sleep(100);
	  }catch(InterruptedException e) {
		  e.printStackTrace();
	  }

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     multithead task1=new multithead();
      Thread t1=new Thread(task1);
	   t1.start();
       Task2 task2=new Task2();
	   Thread t2=new Thread(task2);
       t1.join();
	   t2.start();
	   t2.join();

	}

}
class Task2 implements Runnable{
	int i=501;
	public synchronized void run() {
	while(i<=1000) {
			System.out.println(i);
			i++;
		}
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

