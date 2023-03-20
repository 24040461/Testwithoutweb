package steps;

import elementsFactory.mainNotepadElements;
import elementsFactory.printElements;
import elementsFactory.saveElements;
import driverFactory.driverFactory;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
    WindowsDriver driver;
    driverFactory browsers;

    private mainNotepadElements main = new mainNotepadElements(driverFactory.getdriver());
    private saveElements save = new saveElements(driverFactory.getdriver());

    private printElements printPage = new printElements(driverFactory.getdriver());
    @Given("notepad is open")
    public void notepad_is_open() {
        main.title.isDisplayed();
    }
    @When("user clicks file")
    public void user_clicks_file() {
        main.file.click();
        main.file.enter();
    }
    @And("user click edit")
    public void user_click_edit() {
        main.edit.click();
        main.edit.enter();
    }
    @And("user click format")
    public void user_click_format() {
        main.format.click();
        main.format.enter();
    }
    @And("user click view")
    public void user_click_view() {
        main.view.click();
        main.view.enter();
    }
    @Then("user click help")
    public void user_click_help() {
        main.help.click();
        main.help.enter();
    }

    @When("user clicks on the text section")
    public void user_clicks_on_the_text_section() {
        main.title.click();
    }
    @And("user types a line of text {string}")
    public void user_types_a_line_of_text(String text) {
        main.title.type(text);
        main.title.enter();
    }
    @Then("text appears on the notepad")
    public void text_appears_on_the_notepad() {
        main.file.click();
        main.exit.click();
        save.saveBtn.click();
        save.saveLabelExp.isDisplayed();
    }
}
