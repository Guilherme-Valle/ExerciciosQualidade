package br.ufba.srp;

public class CriadorConta { 
    public static void criarId(Pessoa usuario){
        System.out.println("Seu id de usuário é " + 
        usuario.getPrimeiroNome().substring(0, 1) + usuario.getUltimoNome());
    }
}