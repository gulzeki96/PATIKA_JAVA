package patikaThread;

//import java.util.Arrays;
import java.util.ArrayList;
//import java.util.stream.IntStream;
//import java.util.stream.Collectors;
//import java.util.Collections;
public class odevThread {
	
	//List<Integer> ret = IntStream.rangeClosed(1, 10000).boxed().collect(Collectors.toList());
	//public ArrayList<Integer> sayilar = new ArrayList<>();
	public static ArrayList<Integer> tek = new ArrayList<>();
	public static ArrayList<Integer> cift = new ArrayList<>();

	public static void main(String[] args) {
		Thread t1 = new Thread(new odevThread().new simpleThread(1));
		Thread t2 = new Thread(new odevThread().new simpleThread(2));
		Thread t3 = new Thread(new odevThread().new simpleThread(3));
		Thread t4 = new Thread(new odevThread().new simpleThread(4));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tek.toString());
		System.out.println(cift.toString());

	}
	
	private class simpleThread implements Runnable{
		private int id;
		simpleThread(int id){
			this.id = id;
			System.out.println("Thread " + id + " olusturuldu.");
		}
		@Override
		public synchronized void run() {
			try {
				Thread.sleep(50);
			} catch(InterruptedException e) {
		         System.out.println("Thread " +  id + " kesildi.");
		      }
			
			int i;
			for(i = (id-1)*2500; i< id*2500-1; i++) {
				if(i%2 == 0) {
					cift.add(i);
					System.out.println(id + ".Thread " +  i + " sayisini cift kumesine ekledi.");
					}
				else {
					tek.add(i);
					System.out.println(id + ".Thread " +  i + " sayisini tek kumesine ekledi.");
					}
			}
		}
	
	
	}

}
