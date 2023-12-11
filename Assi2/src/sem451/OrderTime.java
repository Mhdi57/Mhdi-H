package sem451;

import java.util.*;



public class OrderTime {
	Scanner input=new Scanner(System.in);
	private int Time;

	public int getTime() {
		return Time;
	}
	public void setTime(int Time) {
		this.Time = Time;
	}

	
	public void TIME() {
		
		Time=input.nextInt();
	    if(Time>=25) {
	    	System.out.println("Error,Wtite The Time From 1 To 24 ");
	    	Time=input.nextInt();  
		}
	}
}