package ThreadPrograms;

import java.text.*;
public class TimeThread implements Runnable{
	private int min,hrs,sec;
	private int time=0;
	




	public int getSec() {
		return sec;
	}



	public void setSec(int sec) {
		this.sec = sec;
	}



	public int getMin() {
		return min;
	}



	public void setMin(int min) {
		this.min = min;
	}



	public int getHrs() {
		return hrs;
	}



	public void setHrs(int hrs) {
		this.hrs = hrs;
	}



	public int getTime() {
		return time;
	}



	public void setTime(int time) {
		this.time = time;
	}

	public void run() {
		try {
			while(true) {
			Thread.sleep(1000);time++;
			System.out.println(time%60 +" ");
			System.out.println((time - (time/3600)*3600)/60 +"");
			System.out.println(time/3600 + " ");
			}
		}
		catch(InterruptedException e) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeThread th = new TimeThread();
		Thread mytime  = new Thread(th);
		mytime.start();
		

	}
}
