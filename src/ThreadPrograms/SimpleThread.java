package ThreadPrograms;

public class SimpleThread extends Thread{
	private String name;
	
	public SimpleThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void run() {
		int i= 0;
		while(i<=10 ) {
			System.out.println( i +" "+ name);
		try {
			sleep((long)(Math.random()*1000));
			
		}catch(InterruptedException e) {
			
		}
		System.out.println(i);
		i++;
		}
		System.out.println("Done!"+getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleThread("First Thread").run();
		new SimpleThread("Second Thread").run();

	}

}
