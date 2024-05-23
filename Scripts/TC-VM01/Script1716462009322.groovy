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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

println('Hi Vignesh')

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.takeScreenshotAsCheckpoint('abc1')
WebUI.takeScreenshotAsCheckpoint('abc2')

WebUI.takeScreenshotAsCheckpoint('abc3')

WebUI.takeScreenshotAsCheckpoint('abc4')

WebUI.takeScreenshotAsCheckpoint('abc5')

WebUI.takeScreenshotAsCheckpoint('abc6')

WebUI.takeScreenshotAsCheckpoint('abc7')

WebUI.takeScreenshotAsCheckpoint('abc8')

WebUI.takeScreenshotAsCheckpoint('abc9')

WebUI.takeScreenshotAsCheckpoint('abc10')

WebUI.closeBrowser()
print "Bye"

