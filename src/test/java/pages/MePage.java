package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//A class MePage é uma extenção da class BasePage, assim terá o atributo WebDriver navegador.
public class MePage extends BasePage{

    public MePage(WebDriver navegador) {
        super(navegador);
    }

    public MePage clicarAbaMoreDataAboutYou(){
        navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
        return this;
    }

    public AddContactPage clicarBotaoAddMoreDataAboutYou(){
        navegador.findElement(By.xpath("//button[@data-target='addmoredata']")).click();
        return new AddContactPage(navegador);
    }
}
