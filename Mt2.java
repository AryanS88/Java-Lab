class hello extends Thread{
public void run (){
	int i;
    for(i=0;i<5;i++){
	Thread t1=Thread.currentThread();
System.out.println(t1.getName());

System.out.println("Hello");
if(i==4)
	stop();
try{Thread.sleep(500);}catch(Exception e){};
	
}
}
}
class hi extends Thread{
	
	public void run(){
		int i;
		for(i=0;i<5;i++)
		{
			Thread t2 =Thread.currentThread();
			System.out.println(t2.getName());
			System.out.println("hi");
			try {Thread.sleep(500);} catch(Exception e) {};
		}
	}
}

class Mt2 {
	
	 public static void main(String args[]){
		 hi obj=new hi();
		 hello obj2=new hello();
		 
		 obj.start();
		 obj2.start();
		 
	 } 
}
/*
output 
Thread-0
hi
Thread-1
Hello
Thread-1
Hello
Thread-0
hi
Thread-1
Hello
Thread-0
hi
Thread-1
Hello
Thread-0
hi
Thread-1
Hello
Thread-0
hi

*/
