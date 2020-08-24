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

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Maybank2u'), 10)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot1', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - MAE'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot2', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - CARDS'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - MAE Debit Card'), 0)

not_run: Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 4283 3230 0010 8544'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - MAE Debit Card'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 4283 3230 0010 8544 (1)'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 1025'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Card Management'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Show CVV'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Change Card PIN'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot3', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Apply for Physical MAE Card'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Show CVV'), 0)

Mobile.setText(findTestObject('Maya/login again/android.widget.EditText0 (1)'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

//Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (7)'), 0)
not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 0)

def otpMessage = Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Your Otp no. is 247036'), 
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

Mobile.tapAtPosition(826, 2048)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Your CVV is 163'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot4', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Date  Time'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 10 Aug 2020 1714 PM'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Change Card PIN'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Change Card PIN (1)'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Enter your 6-digit PIN'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - This PIN will be used for ATM withdrawals and purchases.'), 
    0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot5', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.ImageView0 (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Nric Proxy Army/android.widget.TextView0 - Confirm (2)'), 0)

def otpM = Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Your Otp no. is 247036'), 0)

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

Mobile.tapAtPosition(826, 2048)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Card PIN successfully changed.'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot6', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 17180714347M'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Date  Time (1)'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 10 Aug 2020 1717 PM'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Apply for Physical MAE Card'), 0)

not_run: Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Card Management'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Get a MAE card delivered straight to your home.'), 
    0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot10', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Note RM 8.00 fee will be charged for card application.'), 
    0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot7', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Benefits'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Free unlimited withdrawals at Maybank ATMs.'), 
    0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Attractive currency exchange rates for all your overseas spending.'), 
    0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Insufficient Balance'), 0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Looks like you dont have enough balance to apply for a MAE card. RM8 is required for MAE card application. Please top up your MAE account to proceed.'), 
    0)

Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Top Up Now'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot18', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Top Up Now'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot9', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Enter amount'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Top Up Now'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

