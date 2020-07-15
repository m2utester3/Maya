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

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Katalon'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Transfer'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/0.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Transfer'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Enter your password'), 0)

WebUI.delay(3)

Mobile.pressBack()

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Forgot Password'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Forgot Password'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Forgot Password'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Forgot Password (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Transfer'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Transfer'), 0)

WebUI.delay(3)

Mobile.pressBack()

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Forgot Password'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Forgot Password'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Forgot Password'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Forgot Password (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Resetting your password is easy. Just enter your info below for validation.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Username'), 0)

varr = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Enter your username'), 0)

Mobile.verifyEqual(varr, 'Enter your username')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Enter your username'), 'pentestu102', 
    0)

varq = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - CardAccess Number'), 0)

Mobile.verifyEqual(varq, 'Card/Access Number')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/3.png', FailureHandling.CONTINUE_ON_FAILURE)

varp = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Enter your card No.'), 0)

Mobile.verifyEqual(varp, 'Enter your card No.')

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Enter your card No.'), '7887889000315720', 
    0)

varo = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - ID Number'), 0)

Mobile.verifyEqual(varo, 'ID Number')

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Continue'), 0)

varn = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Enter ID number'), 0)

Mobile.verifyEqual(varn, 'Enter ID number')

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Enter ID number'), 'P2389982', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/spy/Fortgot Login - OTP header msg'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/spy/Fortgot Login - OTP header msg - CONFIRM'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/spy/Fortgot Login - OTP header msg - CONFIRM'), 0)

def otpMessage = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/spy/Fortgot Login - OTP number'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - One Time Password'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Enter OTP sent to '), 0)

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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/spy/Fortgot Login - OTP OK btn'), 0)

varm = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Account login'), 0)

Mobile.verifyEqual(varm, 'Account login')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/7.png', FailureHandling.CONTINUE_ON_FAILURE)

varl = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Create password'), 0)

Mobile.verifyEqual(varl, 'Create password')

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Enter new password'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Confirm new password'), 0)

vark = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Show password'), 0)

Mobile.verifyEqual(vark, 'Show password')

varj = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Between 8-12 characters.'), 
    0)

Mobile.verifyEqual(varj, 'Between 8-12 characters.')

vari = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Must include at least 1 uppercase 1 lowercase 1 number and 1 special character.'), 
    0)

Mobile.verifyEqual(vari, 'Must include at least 1 uppercase, 1 lowercase, 1 number and 1 special character.')

varh = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Must not include 3 consecutive characters. (e.g. 123 abc)'), 
    0)

Mobile.verifyEqual(varh, 'Must not include 3 consecutive characters. (e.g. 123, abc)')

Mobile.swipe(500, 1500, 500, 1100)

varg = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Must not be similar to your Maybank2u user ID.'), 
    0)

Mobile.verifyEqual(varg, 'Must not be similar to your Maybank2u user ID.')

varf = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Match Confirm Password.'), 
    0)

Mobile.verifyEqual(varf, 'Match Confirm Password.')

vare = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Note Your new password must not be the same as your security phrase and last seven passwords.'), 
    0)

Mobile.verifyEqual(vare, 'Note: Your new password must not be the same as your security phrase and last seven passwords.')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Enter new password (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.view.ViewGroup0'), 0)

vard = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Enter new password (2)'), 
    0)

Mobile.verifyEqual(vard, 'Enter new password')

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Enter new password (2)'), 'pass123', 
    0)

varc = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Confirm new password (1)'), 
    0)

Mobile.verifyEqual(varc, 'Confirm new password')

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Confirm new password (1)'), 'pass123', 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - pass123'), 'Pass123', 0)

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - pass123 (1)'), 'Pass123', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Pass123 (2)'), 'Pass1245', 0)

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Pass123 (3)'), 'Pass1245', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Continue'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Pass1245'), 'Pass@1246', 0)

Mobile.setText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.EditText0 - Pass1245 (1)'), 'Pass@1246', 0)

varb = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Continue'), 0)

Mobile.verifyEqual(varb, 'Continue')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/Forgot M2U Login/android.widget.TextView0 - Continue'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/forgotM2ULogin/13.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: vara = Mobile.getText(findTestObject('MAYA Drop 2/Forgot M2U Login/GET TEXT reset pwd msg - FAIL'), 0)

not_run: Mobile.verifyEqual(vara, 'The provided new password was already contained in the password history')

not_run: Mobile.closeApplication()

