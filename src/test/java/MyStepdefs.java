import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.l8.*;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @Given("Пользователь зашел на сайт")
    public void пользовательЗашелНаСайт() {
        open("https://www.med-konfitur.ru/");
    }

    @When("Пользователь логинится")
    public void пользовательЛогинится() {
        new MainPage().clickInButton();
        new LoginPage().login("oev90468@cdfaq.com", "q4Ye4A");
    }

    @And("Вводим поисковый запрос")
    public void вводимПоисковыйЗапрос() {
        new MainMenuBlock().clickSearch();
    }

    @And("Выбираем товар из найденного списка")
    public void выбираемТоварИзНайденногоСписка() {
        new SearchPage().selectProduct();
    }

    @And("Нажимаем добавить товар в корзину")
    public void нажимаемДобавитьТоварВКорзину() {
        new TeaPage().clickAddToBasket();
    }

    @Then("Проверяем соответствие добавленного с искомым")
    public void проверяемСоответствиеДобавленногоСИскомым() {
        new SuccessAdd().checkResult();
    }


}
