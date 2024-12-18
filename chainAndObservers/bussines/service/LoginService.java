package br.ufes.bussines.service;

import br.ufes.bussines.validation.LoginValidation;
import br.ufes.bussines.validation.TamanhoMinimoSenha;

public class LoginService {
    private final TamanhoMinimoSenha tamanhoMinimoSenha;

    public LoginService(TamanhoMinimoSenha tamanhoMinimoSenha) {
        this.tamanhoMinimoSenha = tamanhoMinimoSenha;
    }

    public String execute(String username, String password) {
        LoginValidation loginValidation = tamanhoMinimoSenha.validar(username, password);


        return "TOKEN: 35147d4asd";
    }

}
