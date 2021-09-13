package br.ufba.srp;

public class ValidadorDadosPessoa { 
    public static boolean validar(Pessoa usuario){
        if (usuario.getPrimeiroNome().isEmpty()) {
			GerenciadorMensagens.mensagemErroValidacao("primeiro nome");

			return false;
		}
		
		if (usuario.getUltimoNome().isEmpty()) {
			GerenciadorMensagens.mensagemErroValidacao("último nome");

			return false;
		}

        return true;
    }
}