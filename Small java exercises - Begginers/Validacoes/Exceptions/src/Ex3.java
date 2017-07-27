import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		//programa que divide um n�mero inteiro por outro e d� as duas mensagens
		//quando o n�mero n�o for inteiro
		//divisor igual a zero
		
		int x, y;
		
		Scanner ler = new Scanner(System.in);
			
			
		try {
			
			System.out.println("Insira o dividendo: ");
			x = ler.nextInt();
				
				
			System.out.println("Insira o divisor: ");
			y = ler.nextInt();
			
			System.out.println(x/y);
		
		}
		
		catch (ArithmeticException e) {
			
			System.out.println("O divisor tem que ser diferente de zero");
				
		}
		
		catch (InputMismatchException e) {
				
			System.out.println("Os n�meros introduzidos dever�o ser inteiros");
				
		}

	}

}
