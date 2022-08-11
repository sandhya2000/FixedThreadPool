package myFirstPro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool implements Runnable {
	public static void main(String[] args) {
		
	ExecutorService obj=Executors.newFixedThreadPool(5);//Fixed Thread pool of size 5
	
	Runnable t1=new FixedThreadPool();
	obj.execute(t1);//
	
	Runnable t2=new FixedThreadPool();
	obj.execute(t2);
	
	Runnable t3=new FixedThreadPool();
	obj.execute(t3);
	
	Runnable t4=new FixedThreadPool();
	obj.execute(t4);
	
	Runnable t5=new FixedThreadPool();
	obj.execute(t5);
	obj.shutdown();
	
	}
	@Override 
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
        {
        System.out.println(i);
           }
		
	}


}