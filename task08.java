package by.htp.les01.main;

public class task08 {
	

	public static void main(String[] args) {

        int a=24;
        int b=20;
        int x=18;
        int y=20;
        int z=28;
        if (x<=a && y<=b) {
        	System.out.println("Кирпич проходит в отверстие");
        	}
        else if (y<=b&& z<=a) {
        	System.out.println("Кирпич проходит в отверстие");
    	}
        else if (z<=a && y<=b) {
        	System.out.println("Кирпич проходит в отверстие");
    	}
        else if (z<=b && x<=a) {
        	System.out.println("Кирпич проходит в отверстие");
    	}
        else {
        	System.out.println("Кирпич не проходит в отверстие");
	}
	}
}
