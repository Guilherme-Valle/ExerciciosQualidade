package br.ufba.srp;

public class CapturadorDadosPessoa {
    public static Pessoa obterDados(){
        Pessoa usuario = new Pessoa();
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		GerenciadorMensagens.mensagemSolicitacaoDado("primeiro nome");
		usuario.setPrimeiroNome(teclado.readLine());
		
		GerenciadorMensagens.mensagemSolicitacaoDado("último nome");
		usuario.setUltimoNome(teclado.readLine());

        return usuario;
    }

}