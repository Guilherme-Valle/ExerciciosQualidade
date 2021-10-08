package br.ufba.idp;

public class Fabrica {
    public static IFuncionario criarFuncionario(){
        return new Funcionario();
    }

    public static ITarefa criarTarefa(){
        return new Tarefa();
    }

    public static IMecanismoLog criarMecanismoLog(){
        return new MecanismoLog();
    }
}