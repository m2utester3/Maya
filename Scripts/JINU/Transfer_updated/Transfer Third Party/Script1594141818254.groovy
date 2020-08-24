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

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Maybank2u (1)'), 0)

'App Launch'
Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot1', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0)

String trx6 = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0).substring(
    3)

String trx61 = trx6.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx61)

int trx611 = ((trx61) as Integer)

System.out.println(trx611)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Transfer (1)'), 0)

Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 (1)'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Transfer Third Party'
Mobile.tapAndHoldAtPosition(344, 375, 1)

not_run: Mobile.swipe(725, 1151, 200, 119)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot2', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(199, 708, 1)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - MAYBANK (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot3', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - MAYBANK (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - MAYBANK (2)'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Please enter account number.'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Please enter account number.'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot4', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Account number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Account number'), 0)

Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 (2)'), '1234', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Continue'), 0)

'Account validation'
Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Please input a valid account number.'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot5', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Please input a valid account number.'), 
    0)

Mobile.clearText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - 1234'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - MAYBANK (1)'), 0)

Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 (3)'), '501600000048', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 5016 0000 0048'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot6', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 5016 0000 0048'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - TPOLCA'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - TPOLCA'), 0)

'Amount validation'
Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Enter amount'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot7', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Enter amount'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0-enter amt'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer.'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot8', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer.'), 
    0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (6)'), 0)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0-enter amt'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot9', FailureHandling.STOP_ON_FAILURE)

'Receipt Validation'
Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 5016 0000 0048 (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 5016 0000 0048 (1)'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - TPOLCA (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - TPOLCA (1)'), 0)

Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 (3)'), '@@@', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Please input a valid recipient reference.'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot10', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Please input a valid recipient reference.'), 
    0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.EditText0 - '), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - '), 'ab', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Continue'), 0)

not_run: Mobile.clearText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - ab'), 0)

Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 (2)'), 'Test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Continue'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot11', FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - One-Tap Authorisation'), 0)) {
    Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - One-Tap Authorisation'), 0)

    Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - One-Tap Authorisation'), 0)

    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Activate Now'), 0)

    not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Confirm'), 0)

    Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - One Time Password'), 0)

    Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot12', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Not Mine'), 0)

    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (7)'), 0)

    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Not Mine'), 0)

    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Call Now'), 0)

    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.Button0 - CANCEL'), 0)

    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Confirm (1)'), 0)

    Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 0)

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

    Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot13', FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - Your ID number'), '123', 0)

    driver.pressKeyCode(AndroidKeyCode.ENTER)

    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Continue (1)'), 0)

    Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot14', FailureHandling.STOP_ON_FAILURE)

    Mobile.clearText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - 123'), 0)

    Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - Your ID number'), '850102036544', 0)

    Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot15', FailureHandling.STOP_ON_FAILURE)

    driver.pressKeyCode(AndroidKeyCode.ENTER)

    Mobile.clearText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - Redmi'), 0)

    Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Device Name'), 0)

    Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Device Name'), 0)

    Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - Your device name'), '##', 0)

    driver.pressKeyCode(AndroidKeyCode.ENTER)

    Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Device name must be alphanumeric characters with no symbols and spaces.'), 
        0)

    Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot16', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Device name must be alphanumeric characters with no symbols and spaces.'), 
        0)

    not_run: Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 -  (1)'), 'Redmi', 0)

    Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - Your device name'), 'Redmi', 0)

    driver.pressKeyCode(AndroidKeyCode.ENTER)

    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Continue (1)'), 0)

    Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - One-Tap Authorisation enabled'), 0)

    Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot17', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - One-Tap Authorisation enabled'), 
        0)

    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Continue (2)'), 0)
}

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Confirmation'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot18', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Confirmation'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Date'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Date'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot19', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Recipient reference'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Bank name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Bank name'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - MAYBANK (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - MAYBANK (3)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Cancel'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - RM 2.00'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot20', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (8)'), 0)

'Confirmation'
Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Confirmation'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Test'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Enter recipient reference (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot21', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Enter recipient reference (1)'), 
    0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 2.00-transfer amt'), 0)

String trx5 = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 2.00-transfer amt'), 0).substring(
    3)

String trx51 = trx5.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx51)

int trx511 = ((trx51) as Integer)

System.out.println(trx511)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Transfer Now'), 0)

if (Mobile.verifyElementExist(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Your TAC no. is 016942'), 3)) {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    def otpM = Mobile.getText(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Your TAC no. is 016942'), 0)

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

    Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0-ch'), 0)
}

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Approve'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - To'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - From'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Transaction type'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Date (1)'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - TPOLCA5016 0000 0048'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Current Account-i5640 1703 5529'), 
    0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Transfer (1)'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - 03 Aug 2020 440 PM'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - One-Tap Authorisation'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Approve'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot22', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Transfer successful'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Transfer successful'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 17180008563M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 17180008563M'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Date  time'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Date  time'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 08 JUL 2020 1055 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 08 JUL 2020 1055 PM'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (9)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.Button0 - Cancel (1)'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (10)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Third Party Transfer'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Successful'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - 17180008563M'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot24', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - 17180008563M'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Beneficiary name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Beneficiary name'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Note This receipt is computer generated and no signature is required.'), 
    0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Malayan Banking Berhad (Co. Reg.  196001000142)'), 
    0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Maybank Islamic Berhad (Co. Reg.  200701029411)'), 
    0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - TPOLCA'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - TPOLCA'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Amount'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Recipient reference'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - RM 2.00'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - RM 2.00'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (10)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Add to Favourites'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Add as Favourites'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot25', FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - TPOLCA'), 0)

Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0 - Please Enter Name'), 'TPOLCA', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Add to Favourites (1)'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Record already exists.'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - SANDY LAM HUI MING Successfully added to Favourites'), 
    0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Done (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot26', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (11)'), 0)
Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

'Transaction history'
Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Wallet'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - RM 981.40'), 0)

String trx4 = Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - RM 981.40'), 0).substring(3)

String trx41 = trx4.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx41)

int trx411 = ((trx41) as Integer)

System.out.println(trx411)

int trx311 = trx611 - trx511

if (trx311 == trx411) {
    System.out.println('Balance match')
} else {
    System.out.println('Balance not match')
}

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - View Transactions'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot27', FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket13.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - More (1)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Notifications'), 0)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Got It'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Maybank2u Transfer'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Youve transferred RM 2.00 to TPOLCAs MAYBANK account ending 0048. REF 17180683341M'), 
    0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Today (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket53.png', FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (12)'), 0)
Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Transfer (3)'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(348, 380, 1)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot28', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.view.ViewGroup0 (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot30', FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(831, 1382, 800, 100)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot29', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.closeApplication()

