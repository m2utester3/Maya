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

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay entry from m2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/40.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay entry from m2u'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/41.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay entry from m2u - 1'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay entry from m2u - 2'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.EditText0'), 'pass1234', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/42.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.EditText0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

var0 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills'), 0)

Mobile.verifyEqual(var0, 'Pay Bills')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/43.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/44.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - JOMPAY'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Jom PAY'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.EditText0 (1)'), '8888', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/45.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - ref1 SET TEXT'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA drop 2 SPY/jompay - ref1 SET TEXT'), '1028385670', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/46.png', FailureHandling.CONTINUE_ON_FAILURE)

var1 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Continue'), 0)

Mobile.verifyEqual(var1, 'Continue')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/47.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Continue'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/48.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 7'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/49.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - kp OK'), 0)

WebUI.delay(3)

var2 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyEqual(var2, 'Confirmation')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/50.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.swipe(490, 1600, 490, 1100)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - pay From'), 0)

WebUI.delay(2)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(2)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(1)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay spy - select account SAi'), 0)

WebUI.delay(1)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/51.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload Pay Now'), 0)

WebUI.delay(1)

def otpJompay = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - get TAC'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/52.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
    if ((otpJompay[i]) == '0') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
    }
    
    if ((otpJompay[i]) == '1') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
    }
    
    if ((otpJompay[i]) == '2') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
    }
    
    if ((otpJompay[i]) == '3') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
    }
    
    if ((otpJompay[i]) == '4') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
    }
    
    if ((otpJompay[i]) == '5') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
    }
    
    if ((otpJompay[i]) == '6') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
    }
    
    if ((otpJompay[i]) == '7') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
    }
    
    if ((otpJompay[i]) == '8') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
    }
    
    if ((otpJompay[i]) == '9') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
    }
}

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay spy TAC OK button'), 0)

WebUI.delay(2)

var3 = Mobile.getText(findTestObject('MAYA drop 2 SPY/android.widget.TextView0 - Payment success'), 0)

Mobile.verifyEqual(var3, 'Payment successful')

var4 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyEqual(var4, 'Reference ID')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 179940314M'), 0)

var5 = Mobile.getText(findTestObject('MAYA drop 2 SPY/android.widget.TextView0 - Date  time'), 0)

Mobile.verifyEqual(var5, 'Date & Time')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/53.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

var6 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.verifyEqual(var6, 'Share Receipt')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/54.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (1)'), 0)

WebUI.delay(2)

var7 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

Mobile.verifyEqual(var7, 'Done')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/55.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(5)

'PayBills without Biller Code'
Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay entry from m2u - 1'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay entry from m2u - 2'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills (3)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/56.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills (3)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - JOMPAY'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay -dashboard - jompay-paybills'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - paybills - search biller button'), 0)

WebUI.delay(1)

Mobile.setText(findTestObject('MAYA drop 2 SPY/jompay - paybills - biller SET TEXT'), 'maxis', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/57.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - paybills - select biller by name'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - paybills - select biller by TAP'), 0)

Mobile.hideKeyboard()

var8 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Bill Account'), 0)

Mobile.verifyEqual(var8, 'Account Number')

Mobile.setText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.EditText0 (4)'), '568964', 0)

Mobile.hideKeyboard()

var9 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Continue (1)'), 0)

Mobile.verifyEqual(var9, 'Continue')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/58.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Continue (1)'), 0)

var10 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills (4)'), 0)

Mobile.verifyEqual(var10, 'Pay Bills')

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Tenaga Nasional Berhad (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 1028385670 (2)'), 0)

var12 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.verifyEqual(var12, 'Enter amount')

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 9 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/59.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.ImageView0 (2)'), 0)

'for TNB'
not_run: var13 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Amount should be in between RM 5 to  RM 500 for Bill Payment'), 
    0)

not_run: Mobile.verifyEqual(var13, 'Amount should be in between RM 5 to \n RM 500 for Bill Payment')

not_run: WebUI.delay(3)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.ImageView0 (3)'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (2)'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 0'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 4'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.ImageView0 (2)'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/60.png', FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 1'), 0)) {
    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 2'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/61.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - activate'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - OTP 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - OTP 2'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/62.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - Confirm'), 0)

    WebUI.delay(2)

    def OTAJompay = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - OTA - OTP'), 0)

    WebUI.delay(2)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/63.png', FailureHandling.CONTINUE_ON_FAILURE)

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

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/64.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - paybills - OTP OK button 2'), 0)

    not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload OTP ok button'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - enter ID'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - enter ID 2'), 0)

    Mobile.setText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - enter ID 3 SET TEXT'), 'P2389982', 
        0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/65.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - device'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - device 2'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/66.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - paybills - device name SET TEXT'), 0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - ENABLED'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - ENABLED msg'), 0)

    Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/67.png', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - DONE - CONTINUE'), 0)
}

var14 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Confirmation (1)'), 0)

Mobile.verifyEqual(var14, 'Confirmation')

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Tenaga Nasional Berhad (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 1028385670 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - RM 5.04'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Date (1)'), 0)

var17 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Today'), 0)

Mobile.verifyEqual(var17, 'Today')

var18 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay from'), 0)

Mobile.verifyEqual(var18, 'Pay from')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/68.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(2)

Mobile.swipe(890, 1375, 150, 1400)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Savings Account-i'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Savings Account-i'), 0)

var19 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Now'), 0)

Mobile.verifyEqual(var19, 'Pay Now')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/69.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Now'), 0)

s2u = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Secure2u authorisation'), 0)

Mobile.verifyEqual(s2u, 'One-Tap Authorisation')

approve = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)

Mobile.verifyEqual(approve, 'Approve')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/70.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)

trx = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Transfer successful'), 0)

refid = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 180060320M'), 0)

datetime = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Date  Time'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/71.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 03 May 2020 0704 am'), 0)

var34 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

Mobile.verifyEqual(var34, 'Share Receipt')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt (1)'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/72.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (1)'), 0)

WebUI.delay(5)

var35 = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav'), 0)

Mobile.verifyEqual(var35, 'Add to Favourites')

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - add to fav'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav1'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav2'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/73.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav3'), 0)

not_run: Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav4'), 0)

not_run: Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav5'), 0)

not_run: Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav6'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav7'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - add to fav - backButton'), 0)

WebUI.delay(2)

var36 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

Mobile.verifyEqual(var36, 'Done')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/74.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(10)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/75.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

