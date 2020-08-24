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

Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\app-uat-universal-release.apk', false)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Hello'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin3\\Screen1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Forgot PIN'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Hello'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Hello'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Forgot PIN'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin\\Screen1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Hello'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Forgot PIN'), 0)

Mobile.getText(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 6-digit PIN'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 6-digit PIN'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\UpdateProfile\\Profile_update.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin\\Screen2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - This 6-digit PIN will be used each time you access your Wallet or as backup to your biometric login.'), 
    0)

Mobile.verifyElementExist(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - This 6-digit PIN will be used each time you access your Wallet or as backup to your biometric login.'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin3\\Screen4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Create your PIN for the app'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (4)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - PIN must consist of at least 6 digits.'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin\\Screen3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Test'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Forgot PIN'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (4)'), 0)

Mobile.getText(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Confirm your new 6-digit PIN'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Confirm your new 6-digit PIN'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin\\Screen4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (4)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - PIN number entered is not same. Please enter again'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin\\Screen5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (4)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Confirm'), 0)

not_run: Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (5)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Not Mine'), 0)

Mobile.getText(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Contact Bank'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin3\\Screen6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - For any enquiries regarding your account please call the Customer Care Hotline at 1 300 88 6688.'), 
    0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (6)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Not Mine'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Call Now'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.Button0 - CANCEL'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Not Mine'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Call Now'), 0)

Mobile.getText(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 1300886688'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Forgot Pin/android.widget.Button0 - CALL'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.Button0 - CANCEL'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Resend OTP in'), 0)

Mobile.delay(120, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin3\\Screen20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - OTP timeout. Resend OTP'), 0)

def otpMessage = Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 
    0)

not_run: Mobile.verifyEqual(otpMessage[20], 'Y')

WebUI.delay(2)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin3\\Screen8.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin3\\Screen9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (7)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Forgot_Pin\\Confirm.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - Wallet'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 2 (2)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 3 (2)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.TextView0 - 3'), 0)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - View Transactions'), 0)

Mobile.closeApplication()

