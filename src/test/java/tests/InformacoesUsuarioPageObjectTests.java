package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

public class InformacoesUsuarioPageObjectTests {

    //Atributo navegador que irá receber a instância do navegador criado.
    private WebDriver navegador;

    //Ações antes de executar testes, pré-requisitos (@Befores)
    //Cria uma instância navegador.
    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    // Execução dos testes
    //Chama os métodos das classes criadas de cada Page, passando os parâmetros.
    @Test
    public void testAdcionarUmaInformacaoAdicionalDoUsuario(){
        new LoginPage(navegador)
                .ClicarSignIn()
                .FazerLogin("Julio0001","123456")
                .ClicarMe()
                .clicarAbaMoreDataAboutYou()
                .clicarBotaoAddMoreDataAboutYou();
    }
    //Ações depois de executar testes, pós-requisitos(After)
    //Fechamento do navegagor.
    @After
    public void tearDown(){
        //navegador.quit();
    }
}