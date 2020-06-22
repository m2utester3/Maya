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

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - More'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/71.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - More'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Wallet'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Wallet'), 0)

enterOTP = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Enter your 6-digit PIN'), 0)

Mobile.verifyEqual(enterOTP, 'Enter your 6-digit PIN')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/72.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/73.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Wallet (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (1)'), 0)

msg = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - PENDING'), 0)

Mobile.verifyEqual(msg, 'PENDING')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/74.png', FailureHandling.CONTINUE_ON_FAILURE)

msg1 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - PAST'), 0)

Mobile.verifyEqual(msg1, 'PAST')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Id like to'), 0)

msg2 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - SendMoney'), 0)

Mobile.verifyEqual(msg2, 'Send\nMoney')

msg3 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RequestMoney'), 0)

Mobile.verifyEqual(msg3, 'Request\nMoney')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Requests'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Need to ask for money'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Get your dues paid but ina less awkward wayTrack and send reminders all here.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - SendMoney'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - SendMoney'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (3)'), 0)

msg4 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 01 contacts selected.'), 0)

Mobile.verifyEqual(msg4, '0/1 contacts selected.')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/75.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - sel contact opt 2'), 0)

msg5 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.verifyEqual(msg5, '1/1 contacts selected.')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/76.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - refresh button opt 2'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (3)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - search icon'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('MAYA drop 2 SPY/send money - refresh button SET TEXT'), 'sahfuan', 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/77.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - sel contact opt 2'), 0)

Mobile.tapAtPosition(width * 0.51574, height * 0.31145)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/78.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Add'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Add'), 0)

msg6 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Account Not Linked'), 0)

Mobile.verifyEqual(msg6, 'Account Not Linked')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/79.png', FailureHandling.CONTINUE_ON_FAILURE)

msg7 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Sorry your contact hasnt set up their Wallet on the app yet. Send money via DuitNow instead'), 
    0)

Mobile.verifyEqual(msg7, 'Sorry, your contact hasn\'t set up their Wallet on the app yet. Send money via DuitNow instead?')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/80.png', FailureHandling.CONTINUE_ON_FAILURE)

msg8 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - No'), 0)

Mobile.verifyEqual(msg8, 'No')

msg9 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Yes'), 0)

Mobile.verifyEqual(msg9, 'Yes')

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Yes'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Account Not Linked (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/81.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Sorry the contact youve selected is not on MAE or DuitNow. Would you like to invite them to MAE'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Invite Now'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Invite Now'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/82.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (3)'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - search cross button'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (3)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - search icon'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('MAYA drop 2 SPY/send money - refresh button SET TEXT'), 'fadhli', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/83.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.hideKeyboard()

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/84.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - sel contact opt 2'), 0)

Mobile.tapAtPosition(width * 0.51574, height * 0.31145)

msg10 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/85.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(msg10, '1/1 contacts selected.')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Add'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (4)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/86.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 60127845015'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Fadhli  Maybank'), 0)

msg11 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Enter amount'), 0)

Mobile.verifyEqual(msg11, 'Enter amount')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - 0.00'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 9 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/87.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.ImageView0 (4)'), 0)

if (Mobile.verifyElementExist(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Secure2u'), 0)) {
    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/88.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - S2U-GO RIGHT opt 2'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Secure Verification'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/89.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Perform a transaction onmobile or web andapprove it from yourmobile app securely viapush notification.'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Find Out More'), 0)

    not_run: Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.ImageView0 (6)'), 0)

    Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - S2U VER-TICK opt 2'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - One Time Password'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/90.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Yes Its Mine'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/91.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Yes Its Mine'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - One Time Password (1)'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/92.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Resend OTP in'), 0)

    def otpSendMoney = Mobile.getText(findTestObject('MAYA SIT v118/android.widget.TextView0 - Your OTP no. is 190081'), 
        0)

    WebUI.delay(2)

    for (def i = 16; i <= 21; i++) {
        if ((otpSendMoney[i]) == '0') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
        }
        
        if ((otpSendMoney[i]) == '1') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
        }
        
        if ((otpSendMoney[i]) == '2') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
        }
        
        if ((otpSendMoney[i]) == '3') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
        }
        
        if ((otpSendMoney[i]) == '4') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
        }
        
        if ((otpSendMoney[i]) == '5') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
        }
        
        if ((otpSendMoney[i]) == '6') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
        }
        
        if ((otpSendMoney[i]) == '7') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
        }
        
        if ((otpSendMoney[i]) == '8') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
        }
        
        if ((otpSendMoney[i]) == '9') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
        }
    }
    
    WebUI.delay(2)

    Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - OTP OK button'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - ID Number'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/93.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - What is your ID Number'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - What is your ID Number (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - Enter your ID Number'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - Enter your ID Number'), 0)

    Mobile.hideKeyboard()

    Mobile.setText(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - Enter your ID Number (1)'), 'P2389982', 
        0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/94.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.hideKeyboard()

    Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - ID num NEXT button 2'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Device Name'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - What is your Device Name'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/95.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - Samsung Galaxy'), 0)

    Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - ID num NEXT button 2'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - You have successfully'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/96.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - registered for Secure2u'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Secure Verification (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Now you can authorise your'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - transactions securely via push'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - notification.'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Done'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Done'), 0)
}

msg12 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyEqual(msg12, 'Confirmation')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/97.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Fadhli Maybank'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 60127845015 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM 1.47'), 0)

msg13 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Date'), 0)

Mobile.verifyEqual(msg13, 'Date')

msg14 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Today'), 0)

Mobile.verifyEqual(msg14, 'Today')

msg15 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Notes'), 0)

Mobile.verifyEqual(msg15, 'Notes')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - Optional'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - Optional'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - Optional (1)'), 'max limit', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Note'), 0)

WebUI.delay(2)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 1000)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/98.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send from'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Savings Account'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM 0.00'), 0)

msg16 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send Now'), 0)

Mobile.verifyEqual(msg16, 'Send Now')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/99.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send Now'), 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 (1)'), 'pass1234', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/100.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - '), 0)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA drop 2 SPY/send money - TRANSFER FAILED'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/101.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA drop 2 SPY/send money - transfer failed message'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 180052472M'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Date  Time'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 2 May 2020 0140 AM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Name'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Fadhli  Maybank (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Contact'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 6012 7845 015 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM 1.47 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Wallet (2)'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - HOME button'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - entry from WALLET on HOME screen'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Wallet (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/102.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - PENDING'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - SendMoney'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - SendMoney'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/103.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 01 contacts selected.'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - sel contact opt 2'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/104.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - refresh button opt 2'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (3)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - search icon'), 0)

WebUI.delay(2)

WebUI.delay(2)

Mobile.setText(findTestObject('MAYA drop 2 SPY/send money - refresh button SET TEXT'), 'fadhli', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/105.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.hideKeyboard()

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - sel contact opt 2'), 0)

Mobile.tapAtPosition(width * 0.51574, height * 0.31145)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/106.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Add'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (4)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 60127845015'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Fadhli  Maybank'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Enter amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - 0.00'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer'), 
    0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - kp 1'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - kp 2'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - kp 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/107.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.ImageView0 (4)'), 0)

WebUI.delay(3)

msg17 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyEqual(msg17, 'Confirmation')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/108.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Fadhli Maybank'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 60127845015 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM 1.47'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Date'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Notes'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - ANY amt set text'), 0)

Mobile.setText(findTestObject('MAYA drop 2 SPY/send money - ANY amt set text'), 'ANY amt', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Note'), 0)

WebUI.delay(2)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 1000)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/109.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send from'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Savings Account'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM 0.00'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send Now'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send Now'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - s2u approval msg'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/send money - s2u APPROVE'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/110.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - s2u APPROVE'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/send money - s2u approve - Trx Success'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/111.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 180052472M'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Date  Time'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 2 May 2020 0140 AM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Name'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Fadhli  Maybank (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Contact'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 6012 7845 015 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM 1.47 (1)'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/send money - s2u approve - SHARE RECEIPT'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - s2u approve - SHARE RECEIPT'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/112.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - s2u approve - back after share Rec'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/send money - s2u approve - DONE'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/113.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - s2u approve - DONE'), 0)

not_run: Mobile.closeApplication()

