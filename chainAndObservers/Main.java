package br.ufes;

import br.ufes.bussines.domain.Cliente;
import br.ufes.bussines.domain.NewsLetter;
import br.ufes.bussines.service.LoginService;
import br.ufes.bussines.service.NewsLetterService;
import br.ufes.bussines.validation.TamanhoMinimoSenha;

public class Main {
    public static void main(String[] args) {
        TamanhoMinimoSenha tamanhoMinimoSenha = new TamanhoMinimoSenha();
        LoginService loginService = new LoginService(tamanhoMinimoSenha);


        System.out.println(loginService.execute("pedro", "123456789"));


        NewsLetter newsLetter = new NewsLetter();
        Cliente cliente = new Cliente("Pedro");

        NewsLetterService newsLetterService = new NewsLetterService(newsLetter);

        newsLetterService.inscrever(cliente);
        newsLetterService.addMessage("Fala jogador");
    }
}