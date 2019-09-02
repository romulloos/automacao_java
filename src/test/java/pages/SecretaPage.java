package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//A class LoginPage é uma extenção da class BasePage, assim terá o atributo WebDriver navegador.
public class SecretaPage extends BasePage{

    public SecretaPage(WebDriver navegador) {
        super(navegador);
    }

    /*
    //Atributo navegador, receberá o navegador do método construtor
    private WebDriver navegador;

    //Método construtor, recebe a istancia do navegador da classe anterior.
    public SecretaPage(WebDriver navegador){
        this.navegador = navegador;
    }
     */

    public MePage ClicarMe(){
        navegador.findElement(By.className("me")).click();
        return new MePage(navegador);
    }

}
