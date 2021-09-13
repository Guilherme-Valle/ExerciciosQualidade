package br.ufba.srp;

public class GerenciadorMensagens {
    public static void mensagemBoasVindas(){
		System.out.println("Seja bem-vinda ou bem-vindo.");
    }

    public static void mensagemFimPrograma() throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Obrigado, tecle enter para sair");
        teclado.readLine();

    }

    public static void mensagemErroValidacao(String campo){
        System.out.println("O " + campo + " não é válido.");
    }

    public static void mensagemSolicitacaoDado(String dado){
        System.out.println("Informe seu " + dado);
    }
}