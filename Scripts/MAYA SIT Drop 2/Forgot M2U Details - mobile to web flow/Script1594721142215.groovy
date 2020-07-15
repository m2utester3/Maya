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

'app launch'
Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Skip'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Skip'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Hello'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Hello'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Lets Get Started'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Log in to enjoy the app to its fullest.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Login to Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Login to Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Login to Maybank2u (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Please enter your username'), 0)

vari = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Forgot Login Details'), 
    0)

Mobile.verifyEqual(vari, 'Forgot Login Details')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - Forgot Login Details'), 0)

varh = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - M2U Web'), 0)

Mobile.verifyEqual(varh, 'M2U Web')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.view.View0 - Humanising Banking'), 0)

varg = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - FORGOT LOGIN DETAILS (1)'), 
    0)

Mobile.verifyEqual(varg, 'FORGOT LOGIN DETAILS')

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - FORGOT LOGIN DETAILS (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.widget.TextView0 - M2U Web'), 0)

varf = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.view.View0 - Cant Remember Your Login Details Dont Worry Let Us Help You'), 
    0)

Mobile.verifyEqual(varf, 'Can’t Remember Your Login Details? Don’t Worry, Let Us Help You!')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/19.png', FailureHandling.CONTINUE_ON_FAILURE)

vare = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.view.View0 - Verify your access number and pin number'), 
    0)

Mobile.verifyEqual(vare, 'Verify your access number and pin number')

vard = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.view.View0 - Card  Access Number'), 0)

Mobile.verifyEqual(vard, 'Card / Access Number')

varc = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.view.View0 - PIN'), 0)

Mobile.verifyEqual(varc, 'PIN')

Mobile.swipe(500, 1500, 500, 1100)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.49074, height * 0.91666)

varb = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.view.View0 - Invalid Card Access Number'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(varb, 'Invalid Card Access Number')

vara = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Details/android.view.View0 - Card  Access Number could be your Maybank ATM  Credit Card or Access Number'), 
    0)

Mobile.verifyEqual(vara, 'Card / Access Number could be your Maybank ATM / Credit Card or Access Number')

not_run: Mobile.closeApplication()

