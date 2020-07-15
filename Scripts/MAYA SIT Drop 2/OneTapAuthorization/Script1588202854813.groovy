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

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Hello'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - More'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Login'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Enter your password'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('MAYA SIT Regression SPY/onboarding pwd SET TEXT'), 'pass1234', 0)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - One-Tap Authorisation'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - One-Tap Authorisation'), 0)

if (Mobile.verifyElementExist(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 1'), 0)) {
    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 2'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/51.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - activate'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - OTP 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - OTP 2'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/52.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - Confirm'), 0)

    WebUI.delay(2)

    def otpMessage = Mobile.getText(findTestObject('MAYA SIT Regression SPY/onboarding OTP MSG'), 0)

    not_run: def OTAJompay = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - OTA - OTP'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/53.png', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2)

    for (def i = 16; i <= 21; i++) {
        if ((OTAJompay[i]) == '0') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
        }
        
        if ((OTAJompay[i]) == '1') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
        }
        
        if ((OTAJompay[i]) == '2') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
        }
        
        if ((OTAJompay[i]) == '3') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
        }
        
        if ((OTAJompay[i]) == '4') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
        }
        
        if ((OTAJompay[i]) == '5') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
        }
        
        if ((OTAJompay[i]) == '6') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
        }
        
        if ((OTAJompay[i]) == '7') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
        }
        
        if ((OTAJompay[i]) == '8') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
        }
        
        if ((OTAJompay[i]) == '9') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
        }
    }
    
    WebUI.delay(2)

    Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - paybills - OTP OK button 2'), 0)

    not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload OTP ok button'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - enter ID'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - enter ID 2'), 0)

    Mobile.setText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - enter ID 3 SET TEXT'), 'P2389982', 
        0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/54.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - device'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - device 2'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/55.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - paybills - device name SET TEXT'), 0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - ENABLED'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - ENABLED msg'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/56.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - DONE - CONTINUE'), 0)
}

not_run: Mobile.closeApplication()

