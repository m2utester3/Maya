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

Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\app-uat-universal-release.apk', true)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 5)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

'Launch the App'
Mobile.tap(findTestObject('Maya/Login/android.widget.Button0-Maybank2u'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Login to Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/login again/android.widget.EditText0'), 'ic_rpp025', 0)

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

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Personal Current Account'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\OneTap\\Screen12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Done setup'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - CARDS (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Outstanding Balance (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Outstanding Balance (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 1765.05'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 1765.05'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (4)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (4)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938 (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938 (2)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 1765.05 (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 1765.05 (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (8)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - View Transactions (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - View Transactions (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - View Transactions (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (9)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Total Credit Limit (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Total Credit Limit (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Outstanding Balance (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Outstanding Balance (3)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Statement Balance (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Statement Balance (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Statement Date (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Statement Date (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Payment Due Date (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Payment Due Date (1)'), 0)

Mobile.swipe(540, 1540, 540, 400)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Minimum Payment Amount (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Minimum Payment Amount (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Last Payment Amount (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Last Payment Amount (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Last Payment Date (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Last Payment Date (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Cards (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - How much would you like to pay (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - How much would you like to pay (1)'), 
    0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Outstandingamount (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Outstandingamount (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Minimumamount (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Minimumamount (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Statementamount (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Statementamount (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 1765.05 (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 1765.05 (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 0.00 (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (10)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Please input valid amount. (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Please input valid amount. (1)'), 
    0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (5)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (5)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938 (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938 (3)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 2 (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 0 (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (10)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Confirmation (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Confirmation (2)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (6)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (6)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938 (4)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938 (4)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Date (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Date (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Today (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Done (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay from (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay from (3)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Note (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Note (1)'), 0)

Mobile.swipe(415, 1598, 50, 1300)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(400, 1572)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Now (2)'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Payment successful (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Payment successful (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Reference ID (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Reference ID (2)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Date  Time (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Date  Time (2)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 180093572M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 180093572M'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 20 Jul 2020 405 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 20 Jul 2020 405 PM'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Share Receipt (2)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Share Receipt (3)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Share Receipt (3)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (11)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.Button0 - Cancel (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (12)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Done (3)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - View Transactions (3)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (9)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Cards (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 0.00 (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (10)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Please input valid amount. (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Please input valid amount. (1)'), 
    0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (5)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (5)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938 (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938 (3)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 0 (3)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (14)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (10)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Confirmation (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Confirmation (2)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (6)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (6)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938 (4)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938 (4)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Date (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Date (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Today (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Done (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay from (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay from (3)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Note (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Note (1)'), 0)

Mobile.swipe(415, 1598, 50, 1300)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(415, 1598, 50, 1300)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen30.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(400, 1572)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Now (2)'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Payment failed'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Payment failed'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Account not authorised  Amount exceeded outstanding balance'), 
    0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Account not authorised  Amount exceeded outstanding balance'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen31.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Reference ID (4)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Reference ID (4)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Date  Time (4)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 180190256M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 180190256M'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 22 Jul 2020 846 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 22 Jul 2020 846 PM'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Done (4)'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen32.png', FailureHandling.CONTINUE_ON_FAILURE)

