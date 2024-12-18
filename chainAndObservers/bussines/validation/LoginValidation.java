package br.ufes.bussines.validation;

public abstract class LoginValidation {
    protected LoginValidation loginValidation;


    public LoginValidation validar(String username, String password) {

        return loginValidation.validar(username, password);
    }

    public void next(LoginValidation loginValidation) {
        this.loginValidation = loginValidation;
    }

}
