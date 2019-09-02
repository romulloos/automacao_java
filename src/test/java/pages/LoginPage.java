package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//A class LoginPage é uma extenção da class BasePage, assim terá o atributo WebDriver navegador.
public class LoginPage extends BasePage{

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    /*
    private WebDriver navegador;

    //Método construtor, recebe a istancia do navegador da classe anterior.
    public LoginPage(WebDriver navegador){
        this.navegador = navegador;
    }
     */

    //Método
    public LoginFormPage ClicarSignIn(){
        navegador.findElement(By.linkText("Sign in")).click();

        return new LoginFormPage(navegador);
    }
}
