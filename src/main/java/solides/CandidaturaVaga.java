package solides;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidaturaVaga {

	WebDriver driver;

	public CandidaturaVaga(WebDriver driver) {
		this.driver = driver;
	}

	public CandidaturaVaga clicaCandidatura() {
		WebElement candidatese = driver
				.findElement(By.xpath("/html/body/section[2]/div/div/div/div[1]/div/h4/div/div/a[2]"));
		candidatese.click();
		return this;
	}

	public CandidaturaVaga canditatarseAEstaVaga() {
		WebElement canditatarseAEstaVaga = driver
				.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[2]/a[1]"));
		canditatarseAEstaVaga.click();
		return this;
	}

	public CandidaturaVaga login(String email, String senha) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-email")));
		WebElement campoEmail = driver.findElement(By.id("user-email"));
		campoEmail.sendKeys(email);
		WebElement campoSenha = driver.findElement(By.id("senha"));
		campoSenha.sendKeys(senha);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		return this;
	}

	public CandidaturaVaga seuCadastro(String profissao, String sobreMim, String dataNacimento, String cpf,
			String celular, String sexo, String cep) {
		WebElement campoProfissao = driver.findElement(By.id("headline"));
		campoProfissao.sendKeys(profissao);
		WebElement campoSobreMim = driver.findElement(By.id("sobre_mim"));
		campoSobreMim.sendKeys(sobreMim);
		WebElement campoDataNascimento = driver.findElement(By.id("data_nascimento"));
		campoDataNascimento.sendKeys(dataNacimento);
		WebElement campoCpf = driver.findElement(By.id("CPF"));
		campoCpf.sendKeys(cpf);
		WebElement campoCelular = driver.findElement(By.id("celular"));
		campoCelular.sendKeys(celular);
		WebElement comboGenero = driver.findElement(By.id("sexo"));
		Select select = new Select(comboGenero);
		select.selectByValue(sexo); // sempre digitar F ou M
		WebElement campoCep = driver.findElement(By.id("cep"));
		campoCep.sendKeys(cep);
		WebElement botaoSalvareAvancar = driver.findElement(By.id("envia_dados"));
		botaoSalvareAvancar.click();
		WebElement botaoOk = driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div/button"));
		botaoOk.click();
		botaoSalvareAvancar.click();
		return this;
	}

	public CandidaturaVaga testeProfiler() {
		WebElement botaoFeminino = driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div/form/div[1]/div[8]/div/label[2]"));
		botaoFeminino.click();
		WebElement botaoIniciarTeste = driver.findElement(By.id("iniciar-teste"));
		botaoIniciarTeste.click();
		return this;
	}

	public CandidaturaVaga questionarioParte1() {

		WebElement minucioso = driver.findElement(By.xpath("//*[@id=\"questionario_1\"]/div[2]/div/div[2]/label"));
		minucioso.click();

		WebElement audacioso = driver.findElement(By.xpath("//*[@id=\"questionario_1\"]/div[1]/div/div[2]/label"));
		audacioso.click();

		WebElement indeciso = driver.findElement(By.xpath("//*[@id=\"questionario_1\"]/div[1]/div/div[3]/label"));
		indeciso.click();

		WebElement equilibrado = driver.findElement(By.xpath("//*[@id=\"questionario_1\"]/div[1]/div/div[4]/label"));
		equilibrado.click();

		WebElement discreto = driver.findElement(By.xpath("//*[@id=\"questionario_1\"]/div[2]/div/div[3]/label"));
		discreto.click();

		WebElement desconfiado = driver.findElement(By.xpath("//*[@id=\"questionario_1\"]/div[2]/div/div[4]/label"));
		desconfiado.click();

		WebElement modesto = driver.findElement(By.xpath("//*[@id=\"questionario_1\"]/div[3]/div/div[2]/label"));
		modesto.click();

		WebElement alegre = driver.findElement(By.xpath("//*[@id=\"questionario_1\"]/div[3]/div/div[3]/label"));
		alegre.click();

		WebElement racional = driver.findElement(By.xpath("//*[@id=\"questionario_1\"]/div[3]/div/div[4]/label"));
		racional.click();

		WebElement botaoIrParaSegundaParte = driver.findElement(By.id("parte-2"));
		botaoIrParaSegundaParte.click();
		return this;
	}

	public CandidaturaVaga questionarioParte2() {

		WebElement audacioso = driver.findElement(By.xpath("//*[@id=\"questionario_2\"]/div[2]/div/div[2]/label"));
		audacioso.click();

		WebElement indeciso = driver.findElement(By.xpath("//*[@id=\"questionario_2\"]/div[1]/div/div[2]/label"));
		indeciso.click();

		WebElement equilibrado = driver.findElement(By.xpath("//*[@id=\"questionario_2\"]/div[1]/div/div[3]/label"));
		equilibrado.click();

		WebElement minucioso = driver.findElement(By.xpath("//*[@id=\"questionario_2\"]/div[1]/div/div[4]/label"));
		minucioso.click();

		WebElement discreto = driver.findElement(By.xpath("//*[@id=\"questionario_2\"]/div[2]/div/div[3]/label"));
		discreto.click();

		WebElement desconfiado = driver.findElement(By.xpath("//*[@id=\"questionario_2\"]/div[2]/div/div[4]/label"));
		desconfiado.click();

		WebElement modesto = driver.findElement(By.xpath("//*[@id=\"questionario_2\"]/div[3]/div/div[2]/label"));
		modesto.click();

		WebElement alegre = driver.findElement(By.xpath("//*[@id=\"questionario_2\"]/div[3]/div/div[3]/label"));
		alegre.click();

		WebElement racional = driver.findElement(By.xpath("//*[@id=\"questionario_2\"]/div[3]/div/div[4]/label"));
		racional.click();

		WebElement botaoFinalizar = driver.findElement(By.xpath("//*[@id=\"questionario_2\"]/center/button"));
		botaoFinalizar.click();
		return this;
	}

	public CandidaturaVaga validacao(String textoEsperado) {

		String textoElement = driver.findElement(By.xpath("//*[@id=\"edita-section\"]/div/div/h3")).getText();
		System.out.println(textoElement);
		assertEquals(textoEsperado, textoElement);

		return this;
	}
}