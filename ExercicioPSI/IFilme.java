package br.ufba.isp;

public interface IFilme extends IItemBiblioteca {
    public int getDuracaoEmMinutos();
	public void setDuracaoEmMinutos(int duracaoEmMinutos);
	public List<String> getAtores();
	public void setAtores(List<String> atores);
    
}