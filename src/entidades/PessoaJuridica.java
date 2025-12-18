package entidades;

public class PessoaJuridica extends Contribuicao {

	
	private double rendaAnual;
	private int quantidadeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, double rendaAnual, int quantidadeFuncionarios) {
		super(nome);
		this.rendaAnual = rendaAnual;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}



	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}



	@Override
	public double contribuicao() {
		
		if(quantidadeFuncionarios <= 10) {
			return rendaAnual*0.16;
		}else {
			return rendaAnual*0.14;
		}
	}

}
