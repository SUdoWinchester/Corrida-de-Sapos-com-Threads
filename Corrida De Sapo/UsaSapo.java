public class UsaSapo{
	public static void main(String[] args){
		CorridaSapo s1 = new CorridaSapo("Sapo1");
		Thread t1 = new Thread(s1);
		CorridaSapo s2 = new CorridaSapo("Sapo2");
		Thread t2 = new Thread(s2);
		CorridaSapo s3 = new CorridaSapo("Sapo3");
		Thread t3 = new Thread(s3);
		CorridaSapo s4 = new CorridaSapo("Sapo4");
		Thread t4 = new Thread(s4);
		t1.start();
		t2.start();	
		t3.start();
		t4.start();

		try{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}
		catch(InterruptedException exc){
			System.out.println("Thread Interrupto");
		}
	}
}