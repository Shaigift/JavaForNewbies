class Task1 extends Thread {
	public void run() {
		System.out.print("\nTask1 Started");
		
		for(int i=101; i<=199; i++)
			System.out.println(i + " ");
	
		System.out.print("\nTask1 Done");
	}
}
	
class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("\nTask2 Started");
		
		for(int i=101; i<=199; i++)
			System.out.println(i + " ");
		
	
		System.out.print("\nTask1 Done");
		
	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.print("\nTask1 kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();
		
	
		System.out.print("\nTask2 Kicked Off");
		
		
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task1.setPriority(10);
		task2Thread.start();
		
		task1.join();
		task2Thread.join();
		
		
		System.out.print("\nTask3 kicked Off");
		
		for(int i=301; i<=399; i++)
			System.out.println(i + " ");	
		
		System.out.print("\nTask3 Done");
		
		System.out.print("\nMain Done");
		
	}

}
