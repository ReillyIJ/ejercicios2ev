package Unidad4;
import java.util.Scanner;
public class Cadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Escribe una cadena: ");
		String st=sc.nextLine();
		String invSt="";
		for(int i=st.length()-1;i>=0;i--) {
			invSt=invSt+st.charAt(i);
		}
		System.out.println(invSt);
	}

}
