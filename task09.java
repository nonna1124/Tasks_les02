package by.htp.les01.main;

public class task09 {
	
	public static void main(String[] args) {
		double x=(Math.random()*20);
		System.out.print("x=");		
		System.out.printf("%2.5f",x);
		System.out.println();
		double f;
		
		if (x<=3) {
			f=x*x-3*x+9;
			System.out.println("F(x)="+f);
		 	System.out.printf("%2.5f",f);
		}
		else  {
			f= 1/(x*x*x+6);
		
		System.out.print("F(x)=");
		System.out.printf("%2.5f",f);
		}
	}
	}

