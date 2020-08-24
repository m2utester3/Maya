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

Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\app-uat-universal-release.apk', false)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

/*Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 30)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.Button0-Maybank2u'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Login to Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/login again/android.widget.EditText0'), 'pport_rpp010', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen2.png', FailureHandling.CONTINUE_ON_FAILURE)

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

not_run: Mobile.tap(findTestObject('Maya/Login/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (8)'), 0)

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

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0-2 acct'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Done setup'), 0)

Mobile.verifyElementText(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - Test'), 'Test', FailureHandling.CONTINUE_ON_FAILURE)
*/
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - More'), 5)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Settings'), 5)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank2u'), 0)

not_run: Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0'), 'pass1234', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Link your Maybank account to an ID for DuitNow'), 
    0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Link your Maybank account to an ID for DuitNow'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 5THA'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 5THA'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 5THA (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Status'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Status'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ACTIVE'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ACTIVE'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Receiving bank'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Receiving bank'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Receiving Account'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Receiving Account'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 4039'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 4039'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Switch account'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 4039'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Switch account'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Link Maybank account to DuitNow'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Link Maybank account to DuitNow'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(540, 773, 1)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Please confirm your DuitNow details'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Please confirm your DuitNow details'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen11.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (2)'), 0)

not_run: Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (2)'), 
    0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Agree and Confirm'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Confirm'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen12.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Youve successfully linked your account to DuitNow'), 
    0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Youve successfully linked your account to DuitNow'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Your Account'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Your Account'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (3)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (1)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (4)'), 0)

Mobile.getText(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - ACTIVE'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (3)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - ACTIVE'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Disable Temporarily'), 0)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Confirm (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Confirm'), 0)

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

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow successfully disabled.'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - DuitNow'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number'), 0)

not_run: Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - 4178'), 0)

Mobile.getText(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - INACTIVE'), 0)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Deregister DuitNow'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Confirm (1)'), 0)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Confirm'), 0)

def otpM = Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 
    0)

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    if ((otpM[i]) == '0') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)
    }
    
    if ((otpM[i]) == '1') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)
    }
    
    if ((otpM[i]) == '2') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)
    }
    
    if ((otpM[i]) == '3') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

        Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)
    }
    
    if ((otpM[i]) == '4') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)
    }
    
    if ((otpM[i]) == '5') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 5'), 0)
    }
    
    if ((otpM[i]) == '6') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)
    }
    
    if ((otpM[i]) == '7') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)
    }
    
    if ((otpM[i]) == '8') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 8'), 0)
    }
    
    if ((otpM[i]) == '9') {
        Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 9'), 0)
    }
}

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (7)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow successfully deregistered.'), 
    0)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - DuitNow'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number'), 0)

not_run: Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - 4178'), 0)

Mobile.tapAndHoldAtPosition(540, 773, 1)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Continue'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Agree and Confirm'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Youve successfully linked your account to DuitNow'), 
    0)

Mobile.verifyElementExist(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Youve successfully linked your account to DuitNow'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - DuitNow'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 5THA'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 5THA'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 5THA (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Status'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Status'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ACTIVE'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ACTIVE'), 0)

Mobile.getText(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - ACTIVE'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - ACTIVE'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(116, 167, 1)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(116, 167, 1)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - More (1)'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Notifications'), 0)

//Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Got It'), 0)
Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Today'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Notifications (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Notifications (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Notifications (1)'), 0)

Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Maybank2u DuitNow ID Deregistration'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Maybank2u DuitNow ID Deregistration'), 
    0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (Passport Number) ending 5THA has just been deregistered.'), 
    0)

Mobile.verifyElementVisible(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (Passport Number) ending 5THA has just been deregistered.'), 
    0)

Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1151 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1151 PM'), 0)

Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Maybank2u DuitNow ID Registration'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Maybank2u DuitNow ID Registration'), 
    0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (Passport Number) ending 5THA has just been registered.'), 
    0)

Mobile.verifyElementVisible(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (Passport Number) ending 5THA has just been registered.'), 
    0)

Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1152 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1152 PM'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (Passport Number) ending 5THA has just been disabled.'), 
    0)

Mobile.verifyElementVisible(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (Passport Number) ending 5THA has just been disabled.'), 
    0)

not_run: Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (NRIC Number) ending 5263 has just been disabled.'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (NRIC Number) ending 5263 has just been disabled.'), 
    0)

not_run: Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1153 PM'), 0)

not_run: Mobile.verifyElementExist(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1153 PM'), 0)

//Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Maybank2u DuitNow ID Proxy enabled'), 0)
//Mobile.verifyElementVisible(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Maybank2u DuitNow ID Proxy enabled'), 
//0)
not_run: Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (Passport Number) ending 5THA has just been updated. (1)'), 
    0)

not_run: Mobile.verifyElementVisible(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (Passport Number) ending 5THA has just been updated. (1)'), 
    0)

Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1154 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1154 PM'), 0)

Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Maybank2u DuitNow ID Proxy Update'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Maybank2u DuitNow ID Proxy Update'), 
    0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (Passport Number) ending 5THA has just been updated.'), 
    0)

Mobile.verifyElementExist(findTestObject('Maya/spy/android.widget.TextView0 - Duitnow Proxy (Passport Number) ending 5THA has just been updated.'), 
    0)

Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1155 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1155 PM'), 0)

