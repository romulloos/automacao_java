package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver navegador;

    //Método construtor, recebe a istancia do navegador da classe anterior.
    public LoginPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public LoginFormPage ClicarSignIn(){
        navegador.findElement(By.linkText("Sign in")).click();

        return new LoginFormPage(navegador);
    }
}
