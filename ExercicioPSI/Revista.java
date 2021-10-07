package br.ufba.isp;

public class Revista implements IRevistaEmprestavel {
    public String idItemBiblioteca;
    public String titulo;
    public String editora;
    public int numeroPaginas;
    public int duracaoEmprestimoEmDias = 21;
    public String usuarioEmprestimo;
    public LocalDateTime dataEmprestimo;

    public void emprestar(String usuarioEmprestimo) {
        this.usuarioEmprestimo = usuarioEmprestimo;
        this.dataEmprestimo = LocalDateTime.now();
    }

    public void devolver() {
        this.usuarioEmprestimo = "";
    }

    public LocalDateTime getDataDevolver() {
        return dataEmprestimo.plusDays(duracaoEmprestimoEmDias);
    }

	public String getIdItemBiblioteca() {
		return idItemBiblioteca;
	}

	public void setIdItemBiblioteca(String idItemBiblioteca) {
		this.idItemBiblioteca = idItemBiblioteca;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public int getDuracaoEmprestimoEmDias() {
		return duracaoEmprestimoEmDias;
	}

	public void setDuracaoEmprestimoEmDias(int duracaoEmprestimoEmDias) {
		this.duracaoEmprestimoEmDias = duracaoEmprestimoEmDias;
	}

	public String getUsuarioEmprestimo() {
		return usuarioEmprestimo;
	}

	public void setUsuarioEmprestimo(String usuarioEmprestimo) {
		this.usuarioEmprestimo = usuarioEmprestimo;
	}

	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

}