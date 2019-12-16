import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Thread5 {
	
	public static void DosyaOkumaWithScanner(){
	    File file = new File("okumalik.txt");
	    int sayi;
	    int bolenSayisi=0;
	    try {

	        Scanner scanner = new Scanner(file);
	        while(scanner.hasNext()){ // kelime kelime okur. boþluklar silinir.
	        	sayi=scanner.nextInt();
	        	bolenSayisi=scanner.nextInt();
	        	System.out.print(sayi);
	        	System.out.print(bolenSayisi);
	        }
	        scanner.close();
	    	} catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        System.out.println("Dosya Bulunamadý..");
	    }

	}
	
	public static void checkFiles() {
		boolean check;
		if(exists()) {
			check=true;
		}
		else
			check=false;
		
	}
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(10000);
		
		MyNewThread1 mnt1=new MyNewThread1();
		mnt1.setName("1");
		mnt1.start();
		
		MyNewThread2 mnt2=new MyNewThread2();
		mnt2.setName("2");
		mnt2.start();
	
		MyNewThread3 mnt3=new MyNewThread3();
		mnt3.setName("3");
		mnt3.start();
	
		MyNewThread4 mnt4=new MyNewThread4();
		mnt4.setName("4");
		mnt4.start();
	}
}
	
	class MyNewThread1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int bolenSayisi=0;
		int maxBolenSayisi = 0;
		int maxIndex=0;
		long startTime=System.nanoTime();
		for(int i=1;i<=25000;i++)
		{
			bolenSayisi=0;
			for(int j=1;j<=i;j++)
			 {                
				 if(i%j == 0)
				 {
					 bolenSayisi++;  
	             }
			 }
			if(bolenSayisi>maxBolenSayisi)
			{
				maxBolenSayisi=bolenSayisi;
				maxIndex=i;
			 
			}
			
		}
		
		try { 
		      FileWriter myWriter1 = new FileWriter(this.getName()+" .txt");
		      myWriter1.write("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		      myWriter1.close();
		      System.out.println("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		      long endTime=System.nanoTime();
		      double duration=(endTime- startTime)/100000.0;
		      System.out.println("1-25000 arasý Geçen süre: "+duration);
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      //e.printStackTrace();
		    }
		
		
		
	}
		
	}
	
	
class MyNewThread2 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int bolenSayisi=0;
		int maxBolenSayisi = 0;
		int maxIndex=0;
		long startTime=System.nanoTime();
		for(int i=25000;i<=50000;i++)
		{
			bolenSayisi=0;
			for(int j=1;j<=i;j++)
			 {                
				 if(i%j == 0)
				 {
					 bolenSayisi++;  
	             }
			 }
			if(bolenSayisi>maxBolenSayisi)
			{
				maxBolenSayisi=bolenSayisi;
				maxIndex=i;
			 
			}
			
		}
		try { 
		      FileWriter myWriter2 = new FileWriter(this.getName()+".txt");
		      myWriter2.write("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		      myWriter2.close();
		      System.out.println("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		      long endTime=System.nanoTime();
		      double duration=(endTime- startTime)/100000.0;
		      System.out.println("25000-50000 arasý Geçen süre: "+duration);
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      //e.printStackTrace();
		    }
		/*
		System.out.println("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		
		long endTime=System.nanoTime();
		double duration=(endTime- startTime)/100000.0;
		System.out.println("25000-50000 arasý Geçen süre: "+duration);*/
	}
		
}	
	
	
class MyNewThread3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int bolenSayisi=0;
		int maxBolenSayisi = 0;
		int maxIndex=0;
		long startTime=System.nanoTime();
		for(int i=50000;i<=75000;i++)
		{
			bolenSayisi=0;
			for(int j=1;j<=i;j++)
			 {                
				 if(i%j == 0)
				 {
					 bolenSayisi++;  
	             }
			 }
			if(bolenSayisi>maxBolenSayisi)
			{
				maxBolenSayisi=bolenSayisi;
				maxIndex=i;
			 
			}
			
		}
		try { 
		      FileWriter myWriter3 = new FileWriter(this.getName()+" .txt");
		      myWriter3.write("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		      myWriter3.close();
		      System.out.println("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		      long endTime=System.nanoTime();
		      double duration=(endTime- startTime)/100000.0;
		      System.out.println("50000-75000 arasý Geçen süre: "+duration);
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      //e.printStackTrace();
		    }
		/*
		System.out.println("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		
		long endTime=System.nanoTime();
		double duration=(endTime- startTime)/100000.0;
		System.out.println("50000-75000 arasý Geçen süre: "+duration);*/
	}
}
	
class MyNewThread4 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int bolenSayisi=0;
		int maxBolenSayisi = 0;
		int maxIndex=0;
		long startTime=System.nanoTime();
		for(int i=75000;i<=100000;i++)
		{
			bolenSayisi=0;
			for(int j=1;j<=i;j++)
			 {                
				 if(i%j == 0)
				 {
					 bolenSayisi++;  
	             }
			 }
			if(bolenSayisi>maxBolenSayisi)
			{
				maxBolenSayisi=bolenSayisi;
				maxIndex=i;
			 
			}
			
		}
		try { 
		      FileWriter myWriter4 = new FileWriter(this.getName()+".txt");
		      myWriter4.write("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		      myWriter4.close();
		      System.out.println("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		      long endTime=System.nanoTime();
		      double duration=(endTime- startTime)/100000.0;
		      System.out.println("75000-100000 arasý Geçen süre: "+duration);
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      //e.printStackTrace();
		    }
		/*
		System.out.println("\nSayý: "+maxIndex+" En büyük bölen sayisi: "+maxBolenSayisi);
		
		long endTime=System.nanoTime();
		double duration=(endTime- startTime)/100000.0;
		System.out.println("75000-100000 arasý Geçen süre: "+duration);*/
		
	}



}
	
