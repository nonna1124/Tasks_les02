package by.htp.les01.main;

public class task07 {
	public static void main(String[] args) {
		
		int a=(int)(-20+Math.random()*40);
		System.out.println("a= "+a);
		int b=(int)(-20+Math.random()*40);
		System.out.println("b= "+b);
		int c=(int)(-20+Math.random()*40);
		System.out.println("c= "+c);
		
		int i=0;
		if (a<0) {
			i++;
		}
		if (b<0) {
			i+=1;
		}
		if (c<0) {
			i++;
		}
		System.out.println("Количество отрицательных чисел= "+i);
		}
	}


