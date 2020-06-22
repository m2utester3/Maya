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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (1).apk', true)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.Button0-Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Login to Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/login again/android.widget.EditText0'), 'shazntb002', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Yes Its Mine'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.EditText0 (1)'), 0)

Mobile.setText(findTestObject('Maya/login again/android.widget.EditText0 (1)'), 'Maybank@111', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (8)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Login/android.widget.ImageView0-Enter OTP'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (8)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Login/android.widget.ImageView0-Enter OTP'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Yes Proceeed'), 0)

//otp
Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 0)

def otpMessage = Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 
    0)

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    if ((otpMessage[i]) == '0') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)
    }
    
    if ((otpMessage[i]) == '1') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)
    }
    
    if ((otpMessage[i]) == '2') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)
    }
    
    if ((otpMessage[i]) == '3') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

        Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)
    }
    
    if ((otpMessage[i]) == '4') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)
    }
    
    if ((otpMessage[i]) == '5') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 5'), 0)
    }
    
    if ((otpMessage[i]) == '6') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)
    }
    
    if ((otpMessage[i]) == '7') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)
    }
    
    if ((otpMessage[i]) == '8') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 8'), 0)
    }
    
    if ((otpMessage[i]) == '9') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 9'), 0)
    }
}

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (7)'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.EditText0 - Enter your name'), 0)

Mobile.setText(findTestObject('Maya/Login/android.widget.EditText0 - Enter your name'), 'Test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Savings Account'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Done setup'), 0)

Mobile.verifyElementText(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - Test'), 'Test', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - Maybank2u'), 0)

Mobile.getText(findTestObject('Maya/Wallet/android.widget.TextView0 - MAE'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - CARDS'), 0)

Mobile.getText(findTestObject('Maya/Wallet/android.widget.TextView0 - MAE Debit Card'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - MAE Debit Card'), 0)

Mobile.getText(findTestObject('Maya/Wallet/android.widget.TextView0 - Show CVV'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - Change Card PIN'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 3'), 0)

//Mobile.tap(findTestObject('Maya/Wallet/android.widget.ImageView0'), 0)
Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - 3'), 0)

//Mobile.tap(findTestObject('Maya/Wallet/android.widget.ImageView0'), 0)
Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (8)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - Your Otp no. is 799065'), 0)

def otp = Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 
    0)

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    if ((otp[i]) == '0') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)
    }
    
    if ((otp[i]) == '1') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)
    }
    
    if ((otp[i]) == '2') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)
    }
    
    if ((otp[i]) == '3') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

        Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)
    }
    
    if ((otp[i]) == '4') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)
    }
    
    if ((otp[i]) == '5') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 5'), 0)
    }
    
    if ((otp[i]) == '6') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)
    }
    
    if ((otp[i]) == '7') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)
    }
    
    if ((otp[i]) == '8') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 8'), 0)
    }
    
    if ((otp[i]) == '9') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 9'), 0)
    }
}

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (7)'), 0)
Mobile.getText(findTestObject('Maya/Wallet/android.widget.TextView0 - Card PIN successfully changed.'), 0)

Mobile.getText(findTestObject('Maya/Wallet/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/Wallet/android.widget.TextView0 - Date  Time'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/Wallet/android.widget.TextView0 - Show CVV'), 0)



def otpMess = Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 
    0)

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    if ((otpMess[i]) == '0') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)
    }
    
    if ((otpMess[i]) == '1') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)
    }
    
    if ((otpMess[i]) == '2') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)
    }
    
    if ((otpMess[i]) == '3') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

        Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)
    }
    
    if ((otpMess[i]) == '4') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)
    }
    
    if ((otpMess[i]) == '5') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 5'), 0)
    }
    
    if ((otpMess[i]) == '6') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)
    }
    
    if ((otpMess[i]) == '7') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)
    }
    
    if ((otpMess[i]) == '8') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 8'), 0)
    }
    
    if ((otpMess[i]) == '9') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 9'), 0)
    }
}

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (7)'), 0)



