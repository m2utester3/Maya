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

Mobile.startApplication('/Users/mosaj/Desktop/apk/app-sit-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

WebUI.delay(10)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/Reload button'), 0)

Mobile.setText(findTestObject('MAYA SIT v118/buy reload/android.widget.EditText0'), 'pass1234', 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/android.widget.EditText0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/android.widget.TextView0 - Maxis Hotlink'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload - back at maxis'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/android.widget.TextView0 - Celcom Xpax'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload - back at maxis'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/android.widget.TextView0 - Digi'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload - back at maxis'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/android.widget.TextView0 - UMobile'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload - back at maxis'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload - back at maxis'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Savings Account'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/Reload button'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload search box'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload search SET TEXT'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.setText(findTestObject('MAYA SIT Regression SPY/reload search SET TEXT'), 'umobile', 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/telco.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload select first telco'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload select first telco image'), 0)

WebUI.delay(2)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp - reload 5'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp - reload 5'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp reload tick'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/android.widget.TextView0 - Please enter a valid mobile number.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/10.png', FailureHandling.CONTINUE_ON_FAILURE)

def invalidMobileNumber = Mobile.getText(findTestObject('MAYA SIT v118/buy reload/android.widget.TextView0 - Please enter a valid mobile number.'), 
    0)

Mobile.verifyEqual(invalidMobileNumber, 'Please enter a valid mobile number.')

Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp reload back button'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 1'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 1'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 7'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 7'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 9'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 5'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp reload tick'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload - back at maxis'), 0)

'phone book'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload - phonebook'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA SIT v118/buy reload/android.widget.EditText0 -   Search'), 'ferzana malaysia new', 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload select contact'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp reload tick'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/14.png', FailureHandling.CONTINUE_ON_FAILURE)

'select amount'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload select amount'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/15.png', FailureHandling.CONTINUE_ON_FAILURE)

'continue'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload continue after amount'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/16.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

not_run: if (Mobile.verifyElementExist(findTestObject('MAYA SIT Regression SPY/s2u registration 1'), 0)) {
    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 1'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/17.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 2'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/18.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MAYA SIT Regression SPY/s2u registration 3 - its mine'), 0)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 3 - its mine'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/19.png', FailureHandling.CONTINUE_ON_FAILURE)

    def otpMessageR = Mobile.getText(findTestObject('MAYA SIT v118/android.widget.TextView0 - Your OTP no. is 190081'), 
        0)

    WebUI.delay(2)

    for (def i = 16; i <= 21; i++) {
        if ((otpMessageR[i]) == '0') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
        }
        
        if ((otpMessageR[i]) == '1') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
        }
        
        if ((otpMessageR[i]) == '2') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
        }
        
        if ((otpMessageR[i]) == '3') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
        }
        
        if ((otpMessageR[i]) == '4') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
        }
        
        if ((otpMessageR[i]) == '5') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
        }
        
        if ((otpMessageR[i]) == '6') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
        }
        
        if ((otpMessageR[i]) == '7') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
        }
        
        if ((otpMessageR[i]) == '8') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
        }
        
        if ((otpMessageR[i]) == '9') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
        }
    }
    
    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/20.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload OTP ok button'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/21.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.setText(findTestObject('MAYA SIT Regression SPY/s2u registration 4 - id number'), 'P2389982', 0)

    WebUI.delay(2)

    Mobile.hideKeyboard()

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/22.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 5 device name'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/23.png', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/24.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 5 device name'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/25.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 6 done'), 0)
}

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

    def OTAJompay = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - OTA - OTP'), 0)

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

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/26.png', FailureHandling.CONTINUE_ON_FAILURE)

def confirmpage = Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload get confirmation page'), 0)

Mobile.verifyEqual(confirmpage, 'Confirmation')

def telco = Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload get telco name'), 0)

Mobile.verifyEqual(telco, 'UMobile')

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload get mobile number'), 0)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(2)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/spy/android.widget.TextView0 - Savings Account-i'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/27.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload Pay Now'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/28.png', FailureHandling.CONTINUE_ON_FAILURE)

s2u = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Secure2u authorisation'), 0)

Mobile.verifyEqual(s2u, 'One-Tap Authorisation')

approve = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)

Mobile.verifyEqual(approve, 'Approve')

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 1'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 2'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 3'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 4'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 5'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 6'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 7'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 8'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 9'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/spy/share recepit'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/30.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/spy/back at telco reload page'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/31.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/spy/done'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/32.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/Reload button'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload search box'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('MAYA SIT Regression SPY/reload search SET TEXT'), 'umobile', 0)

WebUI.delay(2)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload select first telco'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload select first telco image'), 0)

WebUI.delay(2)

Mobile.hideKeyboard()

'phone book'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload - phonebook'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/33.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA SIT v118/buy reload/android.widget.EditText0 -   Search'), 'ferzana malaysia new', 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/34.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload select contact'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp reload tick'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/35.png', FailureHandling.CONTINUE_ON_FAILURE)

'select amount'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload select amount'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/36.png', FailureHandling.CONTINUE_ON_FAILURE)

'continue'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload continue after amount'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/37.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(2)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/spy/android.widget.TextView0 - Savings Account-i'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/38.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v118/buy reload/spy/pay'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/39.png', FailureHandling.CONTINUE_ON_FAILURE)

s2u = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Secure2u authorisation'), 0)

Mobile.verifyEqual(s2u, 'One-Tap Authorisation')

REJECT = Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA reject button'), 0)

Mobile.verifyEqual(REJECT, 'Reject')

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload OTA reject button'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/43.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 1'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 2'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 3'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 4'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 5'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 6'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 7'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 8'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload OTA Approve msg 9'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload s2u DONE ater Reject'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload s2u reject'), 0)

not_run: WebUI.delay(5)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/40.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u failed'), 0)

's2u expired'
not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail msg - s2u expire'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail msg'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail date'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail date value'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail telco'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail telco value'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail mobile'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail mobile value'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail amount'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail amount value'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT v118/buy reload/spy/share recepit'), 0)

not_run: WebUI.delay(5)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/41.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA SIT v118/buy reload/spy/back at telco reload page'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/42.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA SIT v118/android.widget.TextView0 - Your OTP no. is 190081'), 0)

not_run: def otpMessage = Mobile.getText(findTestObject('MAYA SIT v118/android.widget.TextView0 - Your OTP no. is 190081'), 
    0)

not_run: Mobile.verifyEqual(otpMessage[20], 'Y')

not_run: WebUI.delay(2)

not_run: for (def i = 16; i <= 21; i++) {
    if ((otpMessage[i]) == '0') {
        Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 0'), 0)
    }
    
    if ((otpMessage[i]) == '1') {
        Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 1'), 0)
    }
    
    if ((otpMessage[i]) == '2') {
        Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)
    }
    
    if ((otpMessage[i]) == '3') {
        Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)
    }
    
    if ((otpMessage[i]) == '4') {
        Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 4'), 0)
    }
    
    if ((otpMessage[i]) == '5') {
        Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 5'), 0)
    }
    
    if ((otpMessage[i]) == '6') {
        Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 6'), 0)
    }
    
    if ((otpMessage[i]) == '7') {
        Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 7'), 0)
    }
    
    if ((otpMessage[i]) == '8') {
        Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 8'), 0)
    }
    
    if ((otpMessage[i]) == '9') {
        Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 9'), 0)
    }
}

not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp reload tick'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT v118/buy reload/spy/ok'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 1'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 2'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/s2u registration 3 - its mine'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 3 - its mine'), 0)

not_run: Mobile.setText(findTestObject('MAYA SIT Regression SPY/s2u registration 4 - id number'), 'P2389982', 0)

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 5 device name'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 6 done'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload s2u approve'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u successfull'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail date'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail date value'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail telco'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail telco value'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail mobile'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail mobile value'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail amount'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT Regression SPY/reload s2u fail amount value'), 0)

not_run: Mobile.closeApplication()

