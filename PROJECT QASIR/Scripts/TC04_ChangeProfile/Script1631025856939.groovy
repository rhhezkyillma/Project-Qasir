import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
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
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

WebUI.click(findTestObject('Page_Home/img_atau_img-circle avatar border-free'))

CustomKeywords.'id.project.qasir.PublicKeyword.MenuSideBar'('User Profile')

'The component Input file for upload image is hidden so that component cannot be proceed using WebUI.UploadFile method. So I used Robot Framework instead to select the image from user local drive to satisfy the \'edit profile\' process'
CustomKeywords.'id.project.qasir.PublicKeyword.uploadFile'(findTestObject('Page_Profile/span_Edit Photos'), image_profil)

WebUI.click(findTestObject('Page_Profile/button_Apply Photo'))

Thread.sleep(2000)

'Captured Screenshoot'
CustomKeywords.'id.project.qasir.PublicKeyword.TakeScreenshot'('Profil')

WebUI.setText(findTestObject('Page_Profile/input_First Name'), first_name)

WebUI.setText(findTestObject('Page_Profile/input_Last Name_mobile'), last_name)

WebUI.setText(findTestObject('Page_Profile/input_Email'), email)

WebUI.setText(findTestObject('Page_Profile/input_Phone Number'), phone_number)

WebUI.setText(findTestObject('Page_Profile/input_Referral Code'), referal_code)

'Captured Screenshoot'
CustomKeywords.'id.project.qasir.PublicKeyword.TakeScreenshot'('Profil')

WebUI.click(findTestObject('Page_Profile/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Home/img_atau_img-circle avatar border-free'))

CustomKeywords.'id.project.qasir.PublicKeyword.MenuSideBar'('Logout')

