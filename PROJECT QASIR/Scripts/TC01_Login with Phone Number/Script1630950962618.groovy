import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://web.qasir.id/sign-in')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Masuk/Nav_No. Handphone'))

'To click item phone number'
WebUI.click(findTestObject('Page_Masuk/select_AreaPhoneNumber'))

'To selected the spesific area phone number'
WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> elementOptions = driver.findElements(By.className('dialing-code-country-code'))

for (int i = 0; i < elementOptions.size; i++) {
    if (elementOptions.get(i).getText().equals(kode_negara)) {
        elementOptions.get(i).click()

        break
    }
}

'To input phone number'
WebUI.setText(findTestObject('Page_Masuk/input__phonenumber'), user_nohp)

'To input password'
WebUI.sendKeys(findTestObject('Page_Masuk/input_Password'), password)

'To see the hidden password'
WebUI.click(findTestObject('Page_Masuk/img_Eyeclose'))

'Captured Screenshoot'
CustomKeywords.'id.project.qasir.PublicKeyword.TakeScreenshot'('Login')

WebUI.click(findTestObject('Page_Masuk/btn_Sign'))

CustomKeywords.'id.project.qasir.PublicKeyword.TakeScreenshot'('Login')

//CustomKeywords.'id.project.qasir.PublicKeyword.MenuSideBar'('Outlet')
Thread.sleep(2000)

