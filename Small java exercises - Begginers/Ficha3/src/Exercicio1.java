import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int num;
		Scanner input=new Scanner(System.in);
		System.out.print("Insira um numero");
		num=input.nextInt();
		input.close();
		switch(num){
		case 0:
			System.out.print("O numero � o zero");
			break;
		case 1:
			System.out.print("O numero � o um");
			break;
		case 2:
			System.out.print("O numero � o dois");break;
		case 3:
			System.out.print("O numero � o tres");break;
		case 4:
			System.out.print("O numero � o quatro");break;
		case 5:
			System.out.print("O numero � o cinco");break;
		case 6:
			System.out.print("O numero � o seis");break;
		case 7:
			System.out.print("O numero � o sete");break;
		case 8:
			System.out.print("O numero � o oito");break;
		case 9:
			System.out.print("O numero � o nove");break;
		case 10:
			System.out.print("O numero � o dez");break;
		default:
			System.out.print("Insira um numero entre 0 e 10");
		}
	}

}
