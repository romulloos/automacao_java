package pages;

import org.openqa.selenium.WebDriver;

//A class AddContactPage é uma extenção da class BasePage, assim terá o atributo WebDriver navegador.
public class AddContactPage extends BasePage{
    public AddContactPage(WebDriver navegador) {
        super(navegador);
    }
}
