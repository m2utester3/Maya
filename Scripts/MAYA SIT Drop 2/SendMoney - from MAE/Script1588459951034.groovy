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

Mobile.startApplication('/Users/mosaj/Desktop/apk/app-sit-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Maybank2u'), 0)

def enterOTP = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Enter your 6-digit PIN'), 
    0)

Mobile.verifyEqual(enterOTP, 'Enter your 6-digit PIN')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - MAE'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - MAE'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Account'), 0)

MAEacct = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - MAE (1)'), 0)

Mobile.verifyEqual(MAEacct, 'MAE')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5147 1200 1309'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Available Balance'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - RM 1021.70'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.ImageView0'), 0)

SR = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Send  Request'), 0)

Mobile.verifyEqual(SR, 'Send & Request')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/4.png', FailureHandling.CONTINUE_ON_FAILURE)

ilike2 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Id like to'), 0)

Mobile.verifyEqual(ilike2, 'I\'d like to')

SM = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - SendMoney'), 0)

Mobile.verifyEqual(SM, 'Send\nMoney')

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - SendMoney'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Send  Request (1)'), 0)

contacts = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 01 contacts selected.'), 
    0)

Mobile.verifyEqual(contacts, '0/1 contacts selected.')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.ImageView0 (1)'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.EditText0'), 'fadhli', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Fadhli  Maybank'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.view.ViewGroup0'), 0)

contacts1 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 11 contacts selected.'), 
    0)

Mobile.verifyEqual(contacts1, '1/1 contacts selected.')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Add'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Send  Request (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 60127845015'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Fadhli  Maybank (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Enter amount'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.ImageView0 (2)'), 0)

amount0 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer'), 
    0)

Mobile.verifyEqual(amount0, 'Amount should be in between RM 0.01 to \nRM  999,999.99 for Fund Transfer')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 1'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.ImageView0 (2)'), 0)

if (Mobile.verifyElementExist(findTestObject('MAYA SIT Regression SPY/s2u registration 1'), 0)) {
    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 1'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/11.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 2'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/12.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MAYA SIT Regression SPY/s2u registration 3 - its mine'), 0)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 3 - its mine'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/13.png', FailureHandling.CONTINUE_ON_FAILURE)

    def otpSendMoneyMAE = Mobile.getText(findTestObject('MAYA SIT v118/android.widget.TextView0 - Your OTP no. is 190081'), 
        0)

    WebUI.delay(2)

    for (def i = 16; i <= 21; i++) {
        if ((otpSendMoneyMAE[i]) == '0') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
        }
        
        if ((otpSendMoneyMAE[i]) == '1') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
        }
        
        if ((otpSendMoneyMAE[i]) == '2') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
        }
        
        if ((otpSendMoneyMAE[i]) == '3') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
        }
        
        if ((otpSendMoneyMAE[i]) == '4') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
        }
        
        if ((otpSendMoneyMAE[i]) == '5') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
        }
        
        if ((otpSendMoneyMAE[i]) == '6') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
        }
        
        if ((otpSendMoneyMAE[i]) == '7') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
        }
        
        if ((otpSendMoneyMAE[i]) == '8') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
        }
        
        if ((otpSendMoneyMAE[i]) == '9') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
        }
    }
    
    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/14.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload OTP ok button'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/15.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.setText(findTestObject('MAYA SIT Regression SPY/s2u registration 4 - id number'), 'P2389982', 0)

    WebUI.delay(2)

    Mobile.hideKeyboard()

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/16.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 5 device name'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/17.png', FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/18.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 5 device name'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/19.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA SIT Regression SPY/s2u registration 6 done'), 0)
}

confirm = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyEqual(confirm, 'Confirmation')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Fadhli Maybank'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 60127845015 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - RM 0.01'), 0)

date = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Date'), 0)

Mobile.verifyEqual(date, 'Date')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Notes'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.EditText0 - Optional'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.EditText0 - Optional'), 'MAE send RM', 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Note'), 0)

WebUI.delay(2)

Mobile.swipe(500, 1500, 500, 700)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

SMfrom = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Send from'), 0)

Mobile.verifyEqual(SMfrom, 'Send from')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/21.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

'horizontal swipe'
Mobile.swipe(900, 1550, 500, 1550)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - MAE (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5147 1200 1309 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - RM 1021.70 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - MAE (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/23.png', FailureHandling.CONTINUE_ON_FAILURE)

SN = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Send Now'), 0)

Mobile.verifyEqual(SN, 'Send Now')

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Send Now'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Enter your password'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.EditText0 (1)'), 'pass1234', 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.EditText0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.90740, height * 0.94895)

s2u = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Secure2u authorisation'), 0)

Mobile.verifyEqual(s2u, 'Secure2u authorisation')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/25.png', FailureHandling.CONTINUE_ON_FAILURE)

approve = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)

Mobile.verifyEqual(approve, 'Approve')

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)

trx = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Transfer successful'), 0)

Mobile.verifyEqual(trx, 'Transfer successful')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/26.png', FailureHandling.CONTINUE_ON_FAILURE)

refid = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyEqual(refid, 'Reference ID')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 180060320M'), 0)

datetime = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Date  Time'), 0)

Mobile.verifyEqual(datetime, 'Date & Time')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 03 May 2020 0704 am'), 0)

name = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Name'), 0)

Mobile.verifyEqual(name, 'Name')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Fadhli  Maybank (2)'), 0)

contact1 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Contact'), 0)

Mobile.verifyEqual(contact1, 'Contact')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 6012 7845 015'), 0)

amt = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Amount'), 0)

Mobile.verifyEqual(amt, 'Amount')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - RM 0.01 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Share Receipt'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/27.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Done'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/28.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Account (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - MAE (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Available Balance (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - RM 1021.70 (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.ImageView0 (4)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Maybank2u (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - MAE (4)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/30.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - RM 1021.70 (3)'), 0)

not_run: Mobile.closeApplication()

