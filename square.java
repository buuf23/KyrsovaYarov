import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ss s1=new ss();
    Scanner scan = new Scanner (System.in);
    System.out.println ("������ ������� �������");
    int a = scan.nextInt();
    System.out.println ("������ ������");
    int h = scan.nextInt();
    s1.a=a;
    s1.h=h;
    
    double Yourss = s1.calcsquare();
         System.out.println("���� ����� ���������� " + Yourss);
	}

}
