package br.ufba.isp;

public interface IRevista extends IItemBiblioteca {

	public int getNumeroPaginas();
	public void setNumeroPaginas(int numeroPaginas);   

	public String getEditora();
	public void setEditora(String editora);   

}