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

Mobile.getText(findTestObject('android.widget.TextView0 - Vulputate volutpat commodo viverra.'), 0)

Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Vulputate volutpat commodo viverra.'), 'Vulputate volutpat commodo viverra.')

Mobile.getText(findTestObject('android.widget.TextView0 - Lorem ipsum dolor sit amet consectetur adipiscing elit. Id cras nunc pretium pellentesque sapien aenean nunc et consequat. Nullam.'), 
    0)

Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Lorem ipsum dolor sit amet consectetur adipiscing elit. Id cras nunc pretium pellentesque sapien aenean nunc et consequat. Nullam.'), 
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Id cras nunc, pretium pellentesque sapien aenean nunc et consequat. Nullam.')

Mobile.getText(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementText(findTestObject('android.widget.Button0 - Siguiente'), 'Siguiente')

Mobile.takeScreenshot('C:\\Users\\Handcloud\\Katalon Studio\\APP-KARAN\\Screenshoot\\Onboarding_1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('android.widget.TextView0 - Cras id semper ac gravida sit nam.'), 0)

Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Cras id semper ac gravida sit nam.'), 'Cras id semper ac gravida sit nam.')

Mobile.getText(findTestObject('android.widget.TextView0 - Ligula massa sed pharetra suspendisse. Imperdiet neque molestie aliquam egestas eleifend pharetra vel. Lacus eget suscipit dolor sit.'), 
    0)

Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Ligula massa sed pharetra suspendisse. Imperdiet neque molestie aliquam egestas eleifend pharetra vel. Lacus eget suscipit dolor sit.'), 
    'Ligula massa sed pharetra suspendisse. Imperdiet neque, molestie aliquam egestas eleifend pharetra vel. Lacus eget suscipit dolor sit.')

Mobile.getText(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementText(findTestObject('android.widget.Button0 - Siguiente'), 'Siguiente')

Mobile.takeScreenshot('C:\\Users\\Handcloud\\Katalon Studio\\APP-KARAN\\Screenshoot\\Onboarding_2.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('android.widget.TextView0 - Felis amet urna viverra tortor non.'), 0)

Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Felis amet urna viverra tortor non.'), 'Felis amet urna viverra tortor non.')

Mobile.getText(findTestObject('android.widget.TextView0 - Magna amet eget cursus morbi donec justo tortor euismod. Eget urna ullamcorper tortor sit. Quis vitae in dolor magna sed. Viverra.'), 
    0)

Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Magna amet eget cursus morbi donec justo tortor euismod. Eget urna ullamcorper tortor sit. Quis vitae in dolor magna sed. Viverra.'), 
    'Magna amet eget cursus morbi donec justo tortor, euismod. Eget urna, ullamcorper tortor sit. Quis vitae in dolor magna sed. Viverra.')

Mobile.getText(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementText(findTestObject('android.widget.Button0 - Siguiente'), 'Siguiente')

Mobile.takeScreenshot('C:\\Users\\Handcloud\\Katalon Studio\\APP-KARAN\\Screenshoot\\Onboarding_3.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - Siguiente'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('android.widget.TextView0 - Blandit risus arcu non nunc facilisis.'), 0)

Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Blandit risus arcu non nunc facilisis.'), 'Blandit risus arcu non nunc facilisis.')

Mobile.getText(findTestObject('android.widget.TextView0 - Iaculis donec morbi cras ac convallis lectus fermentum venenatis. Sed pretium vitae viverra senectus sed urna. Egestas aenean duis tortor.'), 
    0)

Mobile.verifyElementText(findTestObject('android.widget.TextView0 - Iaculis donec morbi cras ac convallis lectus fermentum venenatis. Sed pretium vitae viverra senectus sed urna. Egestas aenean duis tortor.'), 
    'Iaculis donec morbi cras ac convallis lectus fermentum, venenatis. Sed pretium vitae viverra senectus sed urna. Egestas aenean duis tortor.')

Mobile.getText(findTestObject('android.widget.Button0 - Entendido'), 0)

Mobile.verifyElementText(findTestObject('android.widget.Button0 - Entendido'), 'Entendido')

Mobile.takeScreenshot('C:\\Users\\Handcloud\\Katalon Studio\\APP-KARAN\\Screenshoot\\Onboarding_4.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.Button0 - Entendido'), 0)

Mobile.closeApplication()

