import java.util.*;

public class CorridaSapo extends Thread{
	  int d = 0;
	  int dt = 1000;
	  int p = 0;
	  int qp = 0;
	  Thread thrd;
	  static int c;

	  public CorridaSapo(String nome){
	  	thrd = new Thread(this, nome);
	  }

	  public void colocacao(){
	  	c++;
	  	System.out.println(thrd.getName() + " ficou em " + c + " lugar!");
	  }

	  public synchronized void pular(){
	  		p = (int) (Math.random() * 100);
	  		d = d + p;
	 		if(d > dt){
	 			d = dt;
	 		}
	  }

	  public synchronized void acao(){
	  		System.out.println("Nome: " + thrd.getName() + " pulou " + p + " percorreu " + d);
	 		//System.out.println("Pulo: " + p);
	 		//System.out.println("Distacia Percorrida: " + d);
	 		notify();
	  }

	  public void run(){
	  	while (d < dt){
			pular();
			acao();
	 		yield();
	  	}
	  	colocacao();	
	  }
}