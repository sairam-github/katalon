import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.ptc.com/')

WebUI.maximizeWindow()

String title = WebUI.getWindowTitle()

// WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Ptc_home/Page_Digital Transformation Solutions to Unlock the Value of IIoT  PTC/a_Contact Us'), 
    5)

WebUI.click(findTestObject('Object Repository/Ptc_home/Page_Digital Transformation Solutions to Unlock the Value of IIoT  PTC/a_Contact Us'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Ptc_home/Page_Contact PTC Sales  PTC/img_Blogs_logo'), 5)

WebUI.click(findTestObject('Object Repository/Ptc_home/Page_Contact PTC Sales  PTC/img_Blogs_logo'))

String expectedTitle = WebUI.getWindowTitle()

assert expectedTitle == title

WebUI.closeBrowser()

