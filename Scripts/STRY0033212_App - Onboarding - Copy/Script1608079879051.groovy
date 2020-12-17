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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.companyname.karan.app')

Mobile.verifyElementExist(findTestObject('android.widget.ImageView0'), 0)

Mobile.verifyElementExist(findTestObject('Quien es KARAN'), 0)

Mobile.getText(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementText(findTestObject('android.widget.Button0 - Siguiente'), 'Siguiente')

Mobile.takeScreenshot('C:\\Users\\Handcloud\\Katalon Studio\\APP-KARAN\\Screenshoot\\Onboarding_1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.ImageView0'), 0)

Mobile.verifyElementExist(findTestObject('Servicios'), 0)

Mobile.getText(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.takeScreenshot('C:\\Users\\Handcloud\\Katalon Studio\\APP-KARAN\\Screenshoot\\Onboarding_2.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('android.widget.Button0 - Siguiente'), 'Siguiente')

Mobile.tap(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.ImageView0'), 0)

Mobile.verifyElementExist(findTestObject('Nuestra Empresa'), 0)

Mobile.getText(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementText(findTestObject('android.widget.Button0 - Siguiente'), 'Siguiente')

Mobile.takeScreenshot('C:\\Users\\Handcloud\\Katalon Studio\\APP-KARAN\\Screenshoot\\Onboarding_3.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.ImageView0'), 0)

Mobile.verifyElementExist(findTestObject('Proceso'), 0)

Mobile.getText(findTestObject('android.widget.Button0 - Entendido'), 0)

Mobile.verifyElementText(findTestObject('android.widget.Button0 - Entendido'), 'Entendido')

Mobile.takeScreenshot('C:\\Users\\Handcloud\\Katalon Studio\\APP-KARAN\\Screenshoot\\Onboarding_4.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - Entendido'), 0)

Mobile.closeApplication()

