package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

public class InformacoesUsuarioPageObjectTests {
    private WebDriver navegador;
    //Ações antes de executar testes, pré-requisitos (@Befores)
    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }
    // Execução dos testes
    @Test
    public void testAdcionarUmaInformacaoAdicionalDoUsuario(){
        new LoginPage(navegador)
                .ClicarSignIn()
                .typeLogin("Julio0001")
                .typePassword("123456")
                .ClicarSignIn();
    }

    //Ações depois de executar testes, pós-requisitos(After)
    @After
    public void tearDown(){
        //navegador.quit();
    }
}