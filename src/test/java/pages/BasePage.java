package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//A class BasePage é a class pai para as ontras class que utilizção o atributo WebDriver navegador e o metodo construtor.
public class BasePage {
    protected WebDriver navegador;

    public BasePage(WebDriver navegador){
        this.navegador = navegador;
    }

    public String capturaTextoToast(){
        return navegador.findElement(By.id("toast-container")).getText();
    }

}
