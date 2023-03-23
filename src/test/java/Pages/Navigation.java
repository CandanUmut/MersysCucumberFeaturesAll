package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethods {
    public Navigation() {
        PageFactory.initElements(DriverClass.getDriver(),this);

    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupBtn;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterBtn;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesBtn;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement dashboard;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement name;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement code;

//    <button _ngcontent-duc-c272="" mat-button="" mat-raised-button="" color="accent" mattooltipposition="above" class="mat-focus-indicator mat-tooltip-trigger mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted"><span class="mat-button-wrapper"><!----><fa-icon _ngcontent-duc-c272="" class="ng-fa-icon ng-star-inserted" style="font-size: 16px; padding-right: 6px;"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fal" data-icon="floppy-disk" class="svg-inline--fa fa-floppy-disk" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path fill="currentColor" d="M350.1 55.44C334.9 40.33 314.9 32 293.5 32H80C35.88 32 0 67.89 0 112v288C0 444.1 35.88 480 80 480h288c44.13 0 80-35.89 80-80V186.5c0-21.38-8.312-41.47-23.44-56.58L350.1 55.44zM96 64h192v96H96V64zM416 400c0 26.47-21.53 48-48 48h-288C53.53 448 32 426.5 32 400v-288c0-20.83 13.42-38.43 32-45.05V160c0 17.67 14.33 32 32 32h192c17.67 0 32-14.33 32-32V72.02c2.664 1.758 5.166 3.771 7.438 6.043l74.5 74.5C411 161.6 416 173.7 416 186.5V400zM224 240c-44.13 0-80 35.89-80 80s35.88 80 80 80s80-35.89 80-80S268.1 240 224 240zM224 368c-26.47 0-48-21.53-48-48S197.5 272 224 272s48 21.53 48 48S250.5 368 224 368z"></path></svg></fa-icon><!----><span _ngcontent-duc-c272="" style="visibility: visible;">Save</span></span><span matripple="" class="mat-ripple mat-button-ripple"></span><span class="mat-button-focus-overlay"></span></button>
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")
    private WebElement saveButton;

    @FindBy(xpath = "//a[@href='/citizenships/list']")
    private WebElement citizenshipButton;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement feesButton;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsInnerButton;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsButton;


    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement secondSetupButton;

    @FindBy(xpath = "//mat-select[@formcontrolname='academicPeriod']")
    private WebElement academicPeriodSelect;

    public WebElement getAcademicPeriodSelect() {
        return academicPeriodSelect;
    }

    public WebElement getEntranceExamsInnerButton() {
        return entranceExamsInnerButton;
    }

    public WebElement getEntranceExamsButton() {
        return entranceExamsButton;
    }

    public WebElement getSecondSetupButton() {
        return secondSetupButton;
    }

    public WebElement getFeesButton() {
        return feesButton;
    }



    public WebElement getCitizenshipButton() {
        return citizenshipButton;
    }

    public WebElement getCitizenshipShortname() {
        return citizenshipShortname;
    }

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;


    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    private WebElement citizenshipShortname;

    public WebElement getSetupBtn() {
        return setupBtn;
    }

    public WebElement getParameterBtn() {
        return parameterBtn;
    }

    public WebElement getCountriesBtn() {
        return countriesBtn;
    }

    public WebElement getDashboard() {
        return dashboard;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getCode() {
        return code;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }
}
