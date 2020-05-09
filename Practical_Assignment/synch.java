package Practical_Assignment;

class printer{
    synchronized public void print(String message){
		System.out.print("[");
		System.out.print(message);
		System.out.println("]");
	}
}

class userthread extends Thread{
	
	String msg;
	printer p;
	userthread(String m1, printer p1){
		this.msg = m1;
		this.p=p1;
	}
	public void run(){
		p.print(msg);
	}
}


public class synch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printer p1 = new printer();
		
		userthread t1 = new userthread("Good Morning",p1);
		userthread t2 = new userthread("MultiTasking",p1);
		userthread t3 = new userthread("CoviD19",p1);
		userthread t4 = new userthread("Synchronization",p1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}