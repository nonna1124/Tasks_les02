package by.htp.les01.main;

public class task06 {
	public static void main(String[] args) {
	
		int ug1=(int)(Math.random()*180);
		System.out.println("���� 1= "+ug1);
		int ug2=(int)(Math.random()*180);
		System.out.println("���� 2= "+ug2);
		int ug3=180-ug1-ug2;
		
		if(ug3>0) {
			System.out.println("����������� � ������ ������ ���������� ");
		if (ug1==45&& ug2==45) {
			System.out.println("����������� �������������");
		}
		 
		}
		else {
			System.out.println("����������� � ������ ������ �� ���������� ");
		}
	}

}
