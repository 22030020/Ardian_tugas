package gabisa;
import java.util.Scanner;
public class Kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double number1 = 0, number2 = 0,answer = 0;
		System.out.println("Program kalkulator");
		System.out.println("Number1= Penjumlahan");
		System.out.println("Number2= pengurangan");
		System.out.println("Number3= Perkalian");
		System.out.println("Number4= Pembagian");
		
		
		System.out.println("Masukan Nilai 1 = ");
		System.out.println("Masukan Nilai 2 = ");
		System.out.println("Masukan Operator = ");
		
		System.out.print("Pilih Operator:");
		String line = scan.next();
		
		
		int operator = line.charAt(0);
		
		
		switch(operator){
		case'+':
		answer=number1+number2;
		break;
		case'-':
		answer=number1-number2;
		break;
		case'*':
		answer=number1*number2;
		break;
		case'/':
		answer=number1/number2;
		break;
		}
		
		System.out.println("Jawaban:"+answer);
		
	
		
	
	

	}

}
