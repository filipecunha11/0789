import java.util.Scanner; 

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mensagem = "Olá turma,";
		
		System.out.println(mensagem);
		
		int agua, luz, gas, fibra;
		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Insira o valor da agua: ");
		agua = reader.nextInt();
		
		System.out.println("Insira o valor da luz: ");
		luz = reader.nextInt();
		
		System.out.println("Insira o valor da gas: ");
		gas = reader.nextInt();
		
		System.out.println("Insira o valor da fibra: ");
		fibra = reader.nextInt();
		
		int despesas = agua + luz + gas + fibra;
		
		System.out.println("O total de despesas é " + despesas + "€");
	}
	
	/*public void Numeros(String variavel)
	{
		char[] valor = variavel.toCharArray();
		int i = variavel.length();
		
		for (int l = 0; l<=i; l++)
		{
			char[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8 , 9};
			for(int m = 0; m <= 10; m++)
			{
				if(valor[l] != m)
				{
					
				}
			}
		}
	}*/

}
