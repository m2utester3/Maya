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
Mobile.startApplication('/Users/mosaj/Desktop/apk/app-sit-universal-release.apk', true)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.tap(findTestObject('MAYA SIT Regression SPY/onboarding - next button'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/0.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/onboarding - next button'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/onboarding - next button'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v118/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/android.view.ViewGroup0 (2)'), 0)

WebUI.delay(3)

'X'
not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/onboarding - crosss button'), 0)

Mobile.tapAtPosition(width * 0.91018, height * 0.09166)

Mobile.tap(findTestObject('MAYA SIT v118/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/android.view.ViewGroup0 (2)'), 0)

Mobile.setText(findTestObject('MAYA SIT v118/android.widget.EditText0'), 'pentestu102', 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.tap(findTestObject('MAYA SIT v118/android.view.ViewGroup0 (3)'), 0)

Mobile.setText(findTestObject('MAYA SIT Regression SPY/onboarding pwd SET TEXT'), 'pass1234', 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94895)

for (def i = 1; i <= 6; i++) {
    Mobile.tap(findTestObject('MAYA SIT v118/android.widget.TextView0 - 5'), 0)
}

Mobile.tap(findTestObject('MAYA SIT Regression SPY/onboarding PIN tick parent'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/4.png', FailureHandling.CONTINUE_ON_FAILURE)

for (def i = 1; i <= 6; i++) {
    Mobile.tap(findTestObject('MAYA SIT v118/android.widget.TextView0 - 5'), 0)
}

Mobile.tap(findTestObject('MAYA SIT Regression SPY/onboarding PIN tick parent'), 0)

'YES proceed'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/onboarding - Yes proceed'), 0)

def otpMessage = Mobile.getText(findTestObject('MAYA SIT Regression SPY/onboarding OTP MSG'), 0)

'enter OTP'
not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/onboarding OTP MSG'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/5.png', FailureHandling.CONTINUE_ON_FAILURE)

for (def i = 16; i <= 21; i++) {
    if ((otpMessage[i]) == '0') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
    }
    
    if ((otpMessage[i]) == '1') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
    }
    
    if ((otpMessage[i]) == '2') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
    }
    
    if ((otpMessage[i]) == '3') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
    }
    
    if ((otpMessage[i]) == '4') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
    }
    
    if ((otpMessage[i]) == '5') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
    }
    
    if ((otpMessage[i]) == '6') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
    }
    
    if ((otpMessage[i]) == '7') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
    }
    
    if ((otpMessage[i]) == '8') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
    }
    
    if ((otpMessage[i]) == '9') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
    }
}

'proceed'
not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard OK'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/onboarding OTP tick 1'), 0)

Mobile.setText(findTestObject('MAYA SIT v118/android.widget.EditText0 - Enter your name'), 'katalon', 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94531)

Mobile.tap(findTestObject('MAYA SIT v118/android.view.ViewGroup0 (5)'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/android.view.ViewGroup0 (6)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/onboarding - Done'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v118/android.view.ViewGroup0 (7)'), 0)

Mobile.getText(findTestObject('MAYA SIT v118/android.widget.TextView0 - Last successful login'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/8.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

