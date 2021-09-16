package modelo;

public class Candidato implements ICandidato {

	private String nome;
	private String sobrenome;
	
	public Candidato(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}	
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getSobrenome() {
		return sobrenome;
	}
	
    @Override
    public ICriadorContas obterCriadorContas(){
     return new CriadorContas();   
    }
}
