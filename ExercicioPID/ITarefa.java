package br.ufba.idp;

public interface ITarefa {
    public void realizarTrabalho(double horas);
    public void completarTarefa();
	public String getNome();
	public void setNome(String nome);
	public Funcionario getResponsavel();
	public void setResponsavel(Funcionario responsavel);
	public double getHorasTrabalhadas();
	public boolean isCompleta();
}