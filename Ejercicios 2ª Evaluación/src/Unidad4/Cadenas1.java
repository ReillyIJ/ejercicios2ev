package Unidad4;
import java.util.Scanner;
public class Cadenas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st;
		System.out.println("Escribe una cadena: ");
		st=sc.nextLine();
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		for(int s=0;s<st.length();s++) {
			if(st.charAt(s)=='a') {
				a=a++;
			}
			else if(st.charAt(s)=='e') {
				e=e++;
			}
			else if(st.charAt(s)=='i') {
				i=i++;
			}
			else if(st.charAt(s)=='o') {
				o=o++;
			}
			else if(st.charAt(s)=='u') {
				u=u++;
			}
		}
		System.out.println("Número de veces que aparece la a: "+a);
		System.out.println("Número de veces que aparece la e: "+e);
		System.out.println("Número de veces que aparece la i: "+i);
		System.out.println("Número de veces que aparece la o: "+o);
		System.out.println("Número de veces que aparece la u: "+u);
	}

}
