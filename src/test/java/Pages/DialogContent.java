package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends MyMethods {
    public DialogContent() {
        PageFactory.initElements(BasicDriver.getDriver(),this);

    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//span[contains(text(),'LOGIN')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    private WebElement dashboard;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    private WebElement countryNameSearch;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[1]")
    private WebElement countryCodeSearch;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement countrySearchBtn;

    @FindBy(xpath = "(//button[@mattooltipposition='above'])[3]")
    private WebElement deleteCountry;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement confirmDeleteCountry;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement code;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    private WebElement Shortname;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[1]")
    private WebElement citizenshipShortNameSearch;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[2]")
    private WebElement priorityInput;

    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    private WebElement integrationCode;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[1]")
    private WebElement prioritySearchInput;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement name;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement entranceExamCreateName;



    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement entranceExamsCreateNameInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='academicPeriod']")
    private WebElement academicPeriodSelect;

    @FindBy(xpath = "//span[text()=' 2022-2023 Academic Period ']")
    private WebElement academicPeriodOption;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")
    private WebElement gradeLevelSelect;

    @FindBy(xpath = "(//span[@class='mat-option-text'])")
    private WebElement gradeLevelOption;

    @FindBy(xpath = "(//div[@role='tab'])[3]")
    private WebElement description;

    @FindBy(css = "body[id='tinymce']>p")
    private WebElement descriptionAndNoteInput;

    @FindBy(xpath = "(//div[@role='tab'])[4]")
    private WebElement note;

    @FindBy(css = "iframe[class='tox-edit-area__iframe']")
    private WebElement descriptionAndNoteIFrame;


    public WebElement getEntranceExamsCreateNameInput() {
        return entranceExamsCreateNameInput;
    }

    public WebElement getAcademicPeriodSelect() {
        return academicPeriodSelect;
    }

    public WebElement getAcademicPeriodOption() {
        return academicPeriodOption;
    }

    public WebElement getGradeLevelSelect() {
        return gradeLevelSelect;
    }

    public WebElement getGradeLevelOption() {
        return gradeLevelOption;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getDescriptionAndNoteInput() {
        return descriptionAndNoteInput;
    }

    public WebElement getNote() {
        return note;
    }

    public WebElement getDescriptionAndNoteIFrame() {
        return descriptionAndNoteIFrame;
    }

    public WebElement getEntranceExamCreateName() {
        return entranceExamCreateName;
    }


    public WebElement getName() {
        return name;
    }

    public WebElement getPrioritySearchInput() {
        return prioritySearchInput;
    }

    public WebElement getIntegrationCode() {
        return integrationCode;
    }

    public WebElement getPriorityInput() {
        return priorityInput;
    }

    public WebElement getCitizenshipShortNameSearch() {
        return citizenshipShortNameSearch;
    }

    public WebElement getShortname() {
        return Shortname;
    }

    public WebElement getCode() {
        return code;
    }

    public WebElement getDashboard() {
        return dashboard;
    }

    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCountryNameSearch() {
        return countryNameSearch;
    }

    public WebElement getCountryCodeSearch() {
        return countryCodeSearch;
    }

    public WebElement getCountrySearchBtn() {
        return countrySearchBtn;
    }

    public WebElement getDeleteCountry() {
        return deleteCountry;
    }

    public WebElement getConfirmDeleteCountry() {
        return confirmDeleteCountry;
    }
}
