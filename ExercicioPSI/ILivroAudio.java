package br.ufba.isp;

public interface ILivroAudio extends IItemBiblioteca {
    public int getDuracaoEmMinutos();
    public void setDuracaoEmMinutos(int duracaoEmMinutos);
    
    public String getAutor();
    public void setAutor(String autor);

}