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

'Launch App'
Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\app-uat-universal-release.apk', true)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 10)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

'Launch the App'
Mobile.tap(findTestObject('Maya/Login/android.widget.Button0-Maybank2u'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Login to Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/login again/android.widget.EditText0'), 'nurulhidayu01', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Yes Its Mine'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.EditText0 (1)'), 0)

Mobile.setText(findTestObject('Maya/login again/android.widget.EditText0 (1)'), 'pass1234', 0)

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

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Current Account-i'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Done setup'), 0)

Mobile.verifyElementText(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - Test'), 'Test', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - More (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Settings (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Maybank2u (1)'), 0)

'Enter One Tap Setting'
Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - One-Tap Authorisation (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Approve transactions safely and quickly with a single tap on the app. Skip SMS TAC and get things done faster.'), 
    0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Activate Now (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - One Time Password (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Not Mine'), 0)

not_run: Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Confirm (1)'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 0)

/*Mobile.getText(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Resend OTP in'), 0)

Mobile.getText(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Enter OTP sent to 6011  2717'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Test2/android.widget.ImageView0'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - OTP cant be less than 6 digits.'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Maya/Test2/android.widget.ImageView0'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Wrong OTP entered - Copy'), 0, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.delay(100, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Resend OTP'), 0)*/
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

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Enter your ID number (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (5)'), 0)

not_run: Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Activate Now (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Confirm (1)'), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your ID number (1)'), '1234', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Please enter a valid ID number to continue.'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - 1234'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

'ID enter'
Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - ID number is required'), 0)

Mobile.verifyElementExist(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - ID number is required'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your ID number (2)'), '850102036544', 
    0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Device Name'), 0)

not_run: Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Device Name'), 0)

not_run: Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

not_run: Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Your device name must be alphanumeric characters with no symbols and spaces'), 
    0)

not_run: Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Enter your device name'), 
    0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Activate Now (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (6)'), 0)

not_run: Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Yes'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Activate Now (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Yes'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Confirm (1)'), 0)

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

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your ID number (1)'), '##   @@', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - ID number is invalid'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - ID number is invalid'), 
    0)

Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 -    '), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your ID number (2)'), '850102036544', 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Redmi'), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your device name'), '@@ !!tre', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Device name must be alphanumeric characters with no symbols and spaces.'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Device name must be alphanumeric characters with no symbols and spaces.'), 
    0)

Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 -  tre'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

not_run: Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - ID number is required'), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your device name'), 'testtesttesttesttesttesttesttest', 
    0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - testtesttesttes'), 0)

'Device Name'
Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your device name'), 'test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - One-Tap Authorisation enabled'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - You may now authorise your transactions securely via the app.'), 
    0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

'One Tap Enabled'
Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - One-Tap Authorisation (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (7)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (2)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Cancel'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (2)'), 0)

'One Tap Disabled'
Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Confirm (2)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen6.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

