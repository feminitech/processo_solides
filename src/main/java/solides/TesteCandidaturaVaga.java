package solides;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCandidaturaVaga {

	private static CandidaturaVaga solides;
	private static WebDriver driver;

	@Before
	public void preCondicao() {

		System.setProperty("webdriver.chrome.driver", "C://Drivers Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jobs.solides.com/jack5");
		driver.manage().window().maximize();

		solides = new CandidaturaVaga(driver);

	}

	@Test
	public void inscricaoVaga() {

		solides.clicaCandidatura();
		solides.canditatarseAEstaVaga();
		solides.login("testenay23@teste.com.br", "123@123");
		solides.seuCadastro("analista de testes", "teste 123", "22/10/1989", "008.599.500-26", "(31) 99301-8999", "F",
				"31540-270"); // sempre preencher sexo co F ou M
		solides.testeProfiler();
		solides.questionarioParte1();
		solides.questionarioParte2();
		solides.validacao("Currículo atualizado com sucesso!");
	}

/*	@After
	public void posCondicao() {

		driver.quit();
	}*/

}