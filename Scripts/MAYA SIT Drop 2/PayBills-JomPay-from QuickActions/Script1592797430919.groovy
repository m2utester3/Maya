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

var1 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills'), 0)

Mobile.verifyEqual(var1, 'Pay Bills')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.EditText0'), 'pass1234', 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.EditText0'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

var2 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills (1)'), 0)

Mobile.verifyEqual(var2, 'Pay Bills')

var3 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - BILLERS'), 0)

Mobile.verifyEqual(var3, 'BILLERS')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/3.png', FailureHandling.CONTINUE_ON_FAILURE)

var4 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - JOMPAY'), 0)

Mobile.verifyEqual(var4, 'JOMPAY')

var5 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - New Payment'), 0)

Mobile.verifyEqual(var5, 'New Payment')

var6 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills (2)'), 0)

Mobile.verifyEqual(var6, 'Pay Bills')

var7 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Jom PAY'), 0)

Mobile.verifyEqual(var7, 'JomPAY')

var8 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Favourites'), 0)

Mobile.verifyEqual(var8, 'Favourites')

var9 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - No Favourites Yet'), 0)

Mobile.verifyEqual(var9, 'No Favourites Yet')

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - JOMPAY'), 0)

var10 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - New Payment'), 0)

Mobile.verifyEqual(var10, 'New Payment')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/4.png', FailureHandling.CONTINUE_ON_FAILURE)

var11 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills (2)'), 0)

Mobile.verifyEqual(var11, 'Pay Bills')

var12 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Jom PAY'), 0)

Mobile.verifyEqual(var12, 'JomPAY')

var13 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Favourites'), 0)

Mobile.verifyEqual(var13, 'Favourites')

var14 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - No Favourites Yet'), 0)

Mobile.verifyEqual(var14, 'No Favourites Yet')

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Jom PAY'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills (1)'), 0)

var15 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - JomPAY (1)'), 0)

Mobile.verifyEqual(var15, 'JomPAY')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/5.png', FailureHandling.CONTINUE_ON_FAILURE)

var16 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Biller Code'), 0)

Mobile.verifyEqual(var16, 'Biller Code')

Mobile.setText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.EditText0 (1)'), '8888', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/6.png', FailureHandling.CONTINUE_ON_FAILURE)

var17 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Reference 1'), 0)

Mobile.verifyEqual(var17, 'Reference 1')

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - ref1 SET TEXT'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA drop 2 SPY/jompay - ref1 SET TEXT'), '1028385670', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/7.png', FailureHandling.CONTINUE_ON_FAILURE)

var18 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Reference 2'), 0)

Mobile.verifyEqual(var18, 'Reference 2')

var19 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Continue'), 0)

Mobile.verifyEqual(var19, 'Continue')

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Continue'), 0)

var20 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills (2)'), 0)

Mobile.verifyEqual(var20, 'Pay Bills')

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 8888'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 1028385670 (1)'), 0)

var21 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Enter amount'), 0)

Mobile.verifyEqual(var21, 'Enter amount')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.EditText0 - 0.00'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - kp OK'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/9.png', FailureHandling.CONTINUE_ON_FAILURE)

var22 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - amount needs to be at least RM 0.01'), 
    0)

Mobile.verifyEqual(var22, 'Please input valid amount.')

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 9'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 9'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 9'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 9'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 9'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 9'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 9'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 9'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - kp OK'), 0)

var23 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Invalid Amount. Please enter a lower Amount.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(var23, 'Invalid Amount. Please enter a lower Amount.')

WebUI.delay(4)

Mobile.tapAtPosition(width * 0.16666, height * 0.95468)

Mobile.tapAtPosition(width * 0.16666, height * 0.95468)

Mobile.tapAtPosition(width * 0.16666, height * 0.95468)

Mobile.tapAtPosition(width * 0.16666, height * 0.95468)

Mobile.tapAtPosition(width * 0.16666, height * 0.95468)

Mobile.tapAtPosition(width * 0.16666, height * 0.95468)

Mobile.tapAtPosition(width * 0.16666, height * 0.95468)

Mobile.tapAtPosition(width * 0.16666, height * 0.95468)

Mobile.tapAtPosition(width * 0.16666, height * 0.95468)

Mobile.tapAtPosition(width * 0.16666, height * 0.95468)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 7'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - kp OK'), 0)

WebUI.delay(3)

var24 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyEqual(var24, 'Confirmation')

var25 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 8888 - TM-Unifi'), 0)

Mobile.verifyEqual(var25, '8888 - TM-Unifi')

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 1028385670 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - RM 2.58'), 0)

var26 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Date'), 0)

Mobile.verifyEqual(var26, 'Date')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 30 Apr 2020'), 0)

var27 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Reference 2 (1)'), 0)

Mobile.verifyEqual(var27, 'Reference 2')

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.EditText0 - auto'), 0)

Mobile.hideKeyboard()

WebUI.delay(2)

Mobile.swipe(490, 1600, 490, 1100)

var28 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Declaration'), 0)

Mobile.verifyEqual(var28, 'Declaration')

var29 = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - declaration text'), 0)

Mobile.verifyEqual(var29, 'I hereby declare that I have read and understand the terms and conditions set forth below and agree to comply with and be bound by the provision of the said terms and conditions and any amendment to the same which the bank may subsequently introduce. ')

var30 = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - pay From'), 0)

Mobile.verifyEqual(var30, 'Pay from')

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(2)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(1)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay spy - select account SAi'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload Pay Now'), 0)

WebUI.delay(1)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/15.png', FailureHandling.CONTINUE_ON_FAILURE)

def otpJompay = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - get TAC'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - TAC text'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - TAC text2'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - TAC text3'), 0)

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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay spy TAC OK button'), 0)

WebUI.delay(2)

var31 = Mobile.getText(findTestObject('MAYA drop 2 SPY/android.widget.TextView0 - Payment success'), 0)

Mobile.verifyEqual(var31, 'Payment successful')

var32 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyEqual(var32, 'Reference ID')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 179940314M'), 0)

var33 = Mobile.getText(findTestObject('MAYA drop 2 SPY/android.widget.TextView0 - Date  time'), 0)

Mobile.verifyEqual(var33, 'Date & Time')

var34 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

Mobile.verifyEqual(var34, 'Share Receipt')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (1)'), 0)

WebUI.delay(5)

var35 = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav'), 0)

Mobile.verifyEqual(var35, 'Add to Favourites')

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - add to fav'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav1'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav2'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav3'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav4'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav5'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav6'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - add to fav7'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - add to fav - backButton'), 0)

WebUI.delay(2)

var36 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

Mobile.verifyEqual(var36, 'Done')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(10)

'Wrong TAC scenario starts here'
var37 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills'), 0)

Mobile.verifyEqual(var37, 'Pay Bills')

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Pay Bills (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - JOMPAY'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Jom PAY'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.EditText0 (1)'), '8888', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - ref1 SET TEXT'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA drop 2 SPY/jompay - ref1 SET TEXT'), '1028385670', 0)

Mobile.hideKeyboard()

var38 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Continue'), 0)

Mobile.verifyEqual(var38, 'Continue')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Continue'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 7'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - kp OK'), 0)

WebUI.delay(3)

var39 = Mobile.getText(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyEqual(var39, 'Confirmation')

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(490, 1600, 490, 1100)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - pay From'), 0)

WebUI.delay(2)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(2)

Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(1)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay spy - select account SAi'), 0)

WebUI.delay(1)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload Pay Now'), 0)

WebUI.delay(1)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/25.png', FailureHandling.CONTINUE_ON_FAILURE)

def otpJom = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - get TAC'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)

Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 2'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/26.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay spy TAC OK button'), 0)

WebUI.delay(2)

var40 = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay spy trx failed'), 0)

Mobile.verifyEqual(var40, 'Payment failed')

var41 = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay spy wrong tac msg'), 0)

Mobile.verifyEqual(var41, 'Wrong TAC entered.')

var42 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 179940314M'), 0)

var43 = Mobile.getText(findTestObject('MAYA drop 2 SPY/android.widget.TextView0 - Date  time'), 0)

Mobile.verifyEqual(var43, 'Date & Time')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/jomPay/27.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay spy DONE after wrong TAC'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay spy DONE after wrong TAC'), 0)

