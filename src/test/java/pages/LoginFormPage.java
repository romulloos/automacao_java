package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage {
    private WebDriver navegador;

    //Método construtor, recebe a istancia do navegador da classe anterior.
    public LoginFormPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public LoginFormPage typeLogin(String login){
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);
        return this;
    }

    public LoginFormPage typePassword(String password){
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public SecretaPage ClicarSignIn(){
        navegador.findElement(By.linkText("SIGN IN")).click();
        return new SecretaPage(navegador);
    }
}
