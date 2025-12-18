package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuicao;
import entidades.PessoaJuridica;
import entidades.PesssoaFisica;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Contribuicao> lista = new ArrayList<>();
		
		System.out.print("Digite a quantidades de Contribuintes: ");
		int contribuintes = sc.nextInt();
				
		for(int i = 0; i < contribuintes; i++) {
		
			System.out.println("Contribuinte "+(i+1)+"º:");
			System.out.print("Pessoa Fisica digite (F) para Pessoa Juridica digite (J): ");
			char pessoa = sc.next().charAt(0);
			
			if(pessoa =='F' || pessoa ==  'f') {
			 
				System.out.println("Pessoa Fisica:");
				System.out.print("Digite o nome da Pessoa: ");
				String nome= sc.next();
				
				System.out.print("Digite a renda Anual: ");
				double rendaAnual = sc.nextDouble();
				
				System.out.print("DIgite o Gasto anual com saude");
				double gastosSaude = sc.nextDouble();
				
				lista.add(new PesssoaFisica(nome,rendaAnual,gastosSaude));
				
			}else {
				
				System.out.println("Pessoa Juridica:");
				System.out.print("Digite o nome da Empresa: ");
                String nome= sc.next();
				
				System.out.print("Digite a renda Anual: ");
				double rendaAnual = sc.nextDouble();
				
				System.out.print("DIgite a quantidade de Funcionarios");
				int quantidadeFuncionarios = sc.nextInt();
				
				lista.add(new PessoaJuridica(nome,rendaAnual,quantidadeFuncionarios));
				
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		double contribuicaoGeral = 0;
		
		sb.append("\n");
		sb.append("Contribuições Pagas: \n");
		for(Contribuicao c : lista) {
			sb.append(c.getNome()+"\n");
			sb.append("Valor pago R$:"+c.contribuicao()+"reais \n");
			sb.append("========================================== \n");
			contribuicaoGeral +=c.contribuicao();
		}
		sb.append("\n");    
		sb.append(String.format("Total de Impostos arrecadados R$:"+contribuicaoGeral+"reais"));
		    
		    System.out.println(sb.toString());
		    
		sc.close();
	}

}
