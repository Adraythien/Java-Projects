import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float preco;
		int codigo;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um pre�o");
		preco=input.nextFloat();
		System.out.println("Insira a maneira de pagamento:\n1-Pronto Pagamento\n2-2 Presta��es\n3-3 Presta��es\n4-Entre 4 e 6 presta��es");
		codigo=input.nextInt();
		input.close();
		switch(codigo){
		case 1:
			preco=preco-(preco*0.30f);
			System.out.println("Ir� pagar "+preco+"�");
			break;
		case 2:
			preco=preco-(preco*0.20f);
			System.out.println("Ir� pagar "+preco+"�");
			break;
		case 3:
			preco=preco-(preco*0.10f);
			System.out.println("Ir� pagar "+preco+"�");
			break;
		case 4:
			System.out.println("Ir� pagar "+preco+"�");
			break;
		default:
			System.out.println("Insira um c�digo entre 1-4");
		}
	}

}
