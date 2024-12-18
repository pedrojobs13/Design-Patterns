package br.ufes.bussines.validation;

public class TamanhoMinimoSenha extends LoginValidation {


    @Override
    public LoginValidation validar(String username, String password) {
        if (password.length() < 8) {
            throw new RuntimeException("A senha deve ter no mínimo 8 caracteres");
        } else {
            return null;
        }


    }

}
