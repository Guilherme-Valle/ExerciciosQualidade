package br.ufba.srp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa {

	public static void main(String[] args) throws IOException {
		GerenciadorMensagens.mensagemBoasVindas();
		
		Pessoa usuario = GerenciadorMensagens.obterDados();

		if (ValidadorDadosPessoa.validar(usuario) == false){
			GerenciadorMensagens.mensagemFimPrograma();
			return;
		}

		CriadorConta.criarId(usuario);

		GerenciadorMensagens.mensagemFimPrograma();
		
	}

}