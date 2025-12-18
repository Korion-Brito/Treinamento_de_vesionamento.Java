package entidades;

public class PesssoaFisica extends Contribuicao{

	
	private double rendaAnual;
	private double gastosSaude;
	
	public PesssoaFisica() {
		super();
	}

	public PesssoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome);
		this.rendaAnual = rendaAnual;
		this.gastosSaude = gastosSaude;
	}



	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	
	@Override
	public double contribuicao() {
		
		if(rendaAnual < 20000.00) {
			return (rendaAnual*0.15) - (gastosSaude*0.50);
		}else {
			return (rendaAnual*0.25) - (gastosSaude*0.50);
		}
		
		
		
	}

}
