
public class Ex4 {

	public static void main(String[] args) {
	
		//Programa que calcula o somat�rio dos erros num�ricos cometidos durante
		//a atribui��o de um vector de n�meros reais a um vector de inteiros
		
		double desvio = 0;
		
		double [] d = {5.78, 7, 6.54, 3.345, 10, 10.9};
		
		int [] i = new int[d.length];
		
		for (int j = 0; j < d.length; j++){
			
			try {
				
				i[j] = (int)d[j];
				
				if(i[j] != d[j]);
					
					throw new Exception(); //interrompe o for para tratar da execp��o
			
			}//try
			
			catch(Exception e)
			{
				System.out.println(String.format("%4.3f foi truncado para %d\n", d[j], i[j]));
				
				desvio += d[j] - i[j]; 
				
			}//catch
			
		}//for
		
		System.out.println(String.format("Somat�rio dos erros %4.3f\n", desvio));
	}//main
}//class

//READPATAR ESTES EXERC�CIO USANDO ARRAYLISTS E CONVERS�O DE SA�DA COMO DADA ANTERIORMENTE
