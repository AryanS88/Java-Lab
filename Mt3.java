class hello implements Runnable{
public void run(){
		for(int i=0;i<5;i++){
		System.out.println("hello");
		try {Thread.sleep(500);} catch(Exception e){};
	     }
	}
}
class hi implements Runnable{
	public void run(){
		
		for(int i=0;i<5;i++)
		{
			System.out.println("hi");
			try {Thread.sleep(550);} catch(Exception e){};
		}
	}
	
}
class Mt3{
	public static void main(String args[]){
		hi obj1 =new hi();
		hello obj2 = new hello();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
		}
}
/*
ouptut :
hi
hello
hello
hi
hello
hi
hello
hi
hello
hi
*/
