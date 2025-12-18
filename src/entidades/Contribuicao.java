package entidades;

public abstract class Contribuicao {

	String nome;
	
	public Contribuicao() {
		
	}
	
	public Contribuicao(String nome) {
		super();
		this.nome = nome;
	}
		
    
			
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	public abstract double contribuicao();

}
