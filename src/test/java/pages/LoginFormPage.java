package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//A class LoginFormPage é uma extenção da class BasePage, assim terá o atributo WebDriver navegador.
public class LoginFormPage extends BasePage{

    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }


    /*
    //Atributo navegador, receberá o navegador do método construtor
    private WebDriver navegador;

    //Método construtor, recebe a istância do navegador da classe anterior.
    public LoginFormPage(WebDriver navegador){
        this.navegador = navegador;
    }*/

    /*                    //MODELO ESTRUTURA
    //Vantagens: Caso eu preciso confirmar a execução do metodo procurando aogum elemento depois na execução.
    //Desvantagens: Caso tenha alguma mudança teria que mudar que mudar em todos os metodos.

    //Método procrura o elemento login na LoginFormPage
    //Pripemiro porcura Elepemnto o Id do elemento pai, e depois o elemento login pelo name.
    public LoginFormPage typeLogin(String login){
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);
        return this;
    }
    //Método procrura o elemento password na LoginFormPage
    //Pripemiro porcura Elepemnto o Id do elemento pai, e depois o elemento password pelo name.
    public LoginFormPage typePassword(String password){
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);
        return this;
    }
    //Método que encaminha para a Page secreta, com ação de clicar no SIGN IN
    public SecretaPage ClicarSignIn(){
        navegador.findElement(By.linkText("SIGN IN")).click();
        return new SecretaPage(navegador);
    }


                        //MODELO FUNCIONAL
    //Vantagens: Caso tenha alguma mudança mudaria em um único metodos.
    //Desvantagens: Não conseguiria confirmar a execução do metodo procurando aogum elemento depois na execução.

    //Método que encaminha para a Page secreta, com ação de clicar no SIGN IN
    public SecretaPage FazerLogin(String login, String password){
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);
        navegador.findElement(By.linkText("SIGN IN")).click();
        return new SecretaPage(navegador);
    }
    */

                // MODELO HÍBRIDO, ESTRUTURAL E FUNCIONAL
    //Método procrura o elemento login na LoginFormPage
    //Pripemiro porcura Elepemnto o Id do elemento pai, e depois o elemento login pelo name.
    public LoginFormPage typeLogin(String login){
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);
        return this;
    }
    //Método procrura o elemento password na LoginFormPage
    //Pripemiro porcura Elepemnto o Id do elemento pai, e depois o elemento password pelo name.
    public LoginFormPage typePassword(String password){
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);
        return this;
    }
    //Método que encaminha para a Page secreta, com ação de clicar no SIGN IN
    public SecretaPage ClicarSignIn(){
        navegador.findElement(By.linkText("SIGN IN")).click();
        return new SecretaPage(navegador);
    }

    //Método que encaminha para a Page secreta, com ação de clicar no SIGN IN
    public SecretaPage FazerLogin(String login, String password){
        typeLogin(login);
        typePassword(password);
        ClicarSignIn();
        return new SecretaPage(navegador);
    }
}
