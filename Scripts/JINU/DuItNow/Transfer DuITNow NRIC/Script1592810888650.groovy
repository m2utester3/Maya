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

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer (1)'), 5)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot1', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 (3)'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot2', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(451, 727, 2)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (2)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot3', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (2)'), 0)

WebUI.delay(5)

Mobile.swipe(592, 1887, 550, 1754)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot4', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (1)'), 0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - Enter NRIC number'), '@#$%%%', 0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - Enter NRIC number'), 'adsgsjd', 0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - Enter NRIC number'), '123456', 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Please input valid transfer details. (1)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot5', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Please input valid transfer details. (1)'), 
    0)

Mobile.clearText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - 123456'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot6', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - NRIC Number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - NRIC Number'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (3)'), 0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - Enter NRIC number'), '940812115156', 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - The DuitNow ID entered is inactive.'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot7', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - The DuitNow ID entered is inactive.'), 
    0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - 940812 11 5156'), 0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - Enter NRIC number'), '910224010663', 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 910224 01 0663'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot8', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 910224 01 0663'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - NRIC Number (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - NRIC Number (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (5)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Amount needs to be at least RM 0.01. (1)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot9', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Amount needs to be at least RM 0.01. (1)'), 
    0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 2 (2)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 0 (2)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 0 (2)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 0 (2)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 0 (2)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 0 (2)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 0 (2)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (5)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 910224 01 0663 (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot10', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 910224 01 0663 (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - NRIC Number (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - NRIC Number (2)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - XXXXX XXXX XXXXXXX XX'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - XXXXX XXXX XXXXXXX XX'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot11', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - XXXXX XXXX XXXXXXX XX (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - XXXXX XXXX XXXXXXX XX (1)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (5)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter recipient reference (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter recipient reference (1)'), 
    0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot12', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 (4)'), 'chk', 0)

Mobile.hideKeyboard()

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (4)'), 0)

not_run: Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (3)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (4)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Date (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Date (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer type (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer type (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type (2)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - NRIC Number (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - NRIC Number (3)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Recipient reference (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Recipient reference (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot13', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer Now (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot19', FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Maya/spy/android.widget.TextView0 - Your TAC no. is 822872v3'), 3)) {
    def otpM = Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Your TAC no. is 822872v3'), 0)

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
}

if (Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Approve'), 0)) {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Approve'), 0)
}

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer failed'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot15', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer failed'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - You have insufficient balance in your account.'), 
    0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - You have insufficient balance in your account.'), 
    0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Reference ID (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Reference ID (1)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (5)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot2', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(451, 727, 2)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (2)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot3', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (2)'), 0)

WebUI.delay(5)

Mobile.swipe(592, 1887, 550, 1754)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot4', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - NRIC Number (4)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - NRIC Number (4)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot16', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - Enter NRIC number'), '940224010663', 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - The DuitNow ID entered is not valid.'), 
    0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - 940224 01 0663'), 0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - Enter NRIC number'), '910224010663', 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (5)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot18', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter recipient reference (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter recipient reference (1)'), 
    0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 'Test', 0)

Mobile.hideKeyboard()

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - RM 2.00 (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/NRICduitnow/Verify DuitNow NRIC Number'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Today (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Test'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - Test'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\ConfDuitNow.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Transfer Now (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot19', FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Maya/spy/android.widget.TextView0 - Your TAC no. is 822872v3'), 3)) {
    def otpM = Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Your TAC no. is 822872v3'), 0)

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
}

if (Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Approve'), 0)) {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Approve'), 0)
}

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - Transfer successful'), 'Transfer successful')

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\TransferSuccess.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - 179857250M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - 16 Apr 2020 0546 pm'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (9)'), 0)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.Button0 - Cancel (1)'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (10)'), 0)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - 17180008563M'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot24', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - 17180008563M'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Beneficiary name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Beneficiary name'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Amount'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Recipient reference'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.getText(findTestObject('Maya/NRICduitnow/android.view.View0 - Beneficiary name'), 0)

Mobile.getText(findTestObject('Maya/NRICduitnow/android.view.View0 - BIMBB TEST DUITNOW ID'), 0)

Mobile.getText(findTestObject('Maya/NRICduitnow/android.view.View0 - DuitNow ID type'), 0)

Mobile.getText(findTestObject('Maya/NRICduitnow/android.view.View0 - NRIC Number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - RM 2.00'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.swipe(831, 1382, 800, 100)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - RM 2.00'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - RM 2.00'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Beneficiary name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Beneficiary name'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Note This receipt is computer generated and no signature is required.'), 
    0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Malayan Banking Berhad (Co. Reg.  196001000142)'), 
    0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Maybank Islamic Berhad (Co. Reg.  200701029411)'), 
    0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (10)'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Done (1)'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot26', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (11)'), 0)

'Transaction history'
Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Wallet'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - View Transactions'), 0)

not_run: Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(592, 1887, 629, 1390)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Today'), 0)

not_run: Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - DuitNow Open - BIMBB TEST DUITNOW ID'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - -RM 2.00'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot20', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - More (1)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Notifications'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Maybank2u Transfer'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - DuitNow of RM 2.00 to DEADPOOL. Passport Number  ABRA. REF 17180689639M'), 
    0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - DuitNow of RM 2.00 to BIMBB TEST DUITNOW ID. NRIC Number  0663. REF 17180690432M'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow\\Screen39.png', FailureHandling.CONTINUE_ON_FAILURE)

