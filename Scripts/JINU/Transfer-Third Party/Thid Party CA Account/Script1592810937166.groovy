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

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.Button0-Maybank2u'), 0)

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

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Savings Account'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Done setup'), 0)

Mobile.verifyElementText(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - Test'), 'Test', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0)

String trx6 = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0).substring(
    3)

String trx61 = trx6.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx61)

int trx611 = ((trx61) as Integer)

System.out.println(trx611)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Transfer'), 0)

Mobile.setText(findTestObject('Maya/New_Transfer/android.widget.EditText0'), 'pass1234', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

WebUI.delay(4)

Mobile.tapAtPosition(348, 380)

WebUI.delay(4)

Mobile.tapAtPosition(199, 788)

Mobile.tap(findTestObject('Maya/New_Transfer/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - MAYBANK'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - MAYBANK'), 0)

Mobile.setText(findTestObject('Maya/Third Party CA account/android.widget.EditText0'), '501600000048', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Enter Account.png', FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.verifyElementExist(findTestObject('Maya/Third Party CA account/Verify acct Third party CA'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0-enter amt'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Amount Enter.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Third Party CA account/Verify acct Third party CA'), 0)

not_run: Mobile.tap(findTestObject('Maya/Forgot Pin/android.widget.ImageView0 (7)'), 0)

Mobile.tap(findTestObject('Maya/duitnow Army/enter ref'), 0)

not_run: Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Please enter a recipient reference.'), 
    0)

Mobile.setText(findTestObject('Maya/duitnow Army/enter ref'), 'Test', 0)

Mobile.verifyElementExist(findTestObject('Maya/Third Party CA account/Verify acct Third party CA'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Recepient.png', FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Activate Now'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Confirm'), 0)

//otp
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

Mobile.tap(findTestObject('Maya/Third Party CA account/Enter'), 0)

Mobile.setText(findTestObject('Maya/Third Party CA account/android.widget.EditText0 - Your ID number'), '850102036544', 
    0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Today'), 0)

not_run: Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 19'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 0)

Mobile.verifyElementText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 'Test')

Mobile.verifyElementExist(findTestObject('Maya/Third Party CA account/Verify acct Third party CA'), 0)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Continue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.ImageView0 (4)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\third party.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer Now'), 0)

not_run: Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer scheduled'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/Approve-Transfer-now'), 0)

Mobile.verifyElementText(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - Transfer successful'), 'Transfer successful')

//Mobile.tap(findTestObject('Maya/duitNowFav/Tap on arrow transaction'), 0)
//Mobile.selectListItemByLabel(findTestObject('Maya/duitNowFav/Tap on M2U History'), 'M2U History', 0)
//Mobile.tap(findTestObject('Maya/duitNowFav/Tap on done transaction'), 0)
Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\third party add fav.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - 179857250M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - 16 Apr 2020 0546 pm'), 0)

Mobile.tap(findTestObject('Maya/NRICduitnow/android.widget.TextView0 - Add to Favourites'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done'), 0)

not_run: Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Current Account-i'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Recipient reference (1)'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Test'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Amount'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - RM 2.00'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Note This receipt is computer generated and no signature is required.'), 
    0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Malayan Banking Berhad (Co. Reg.  196001000142)'), 
    0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Maybank Islamic Berhad (Co. Reg.  200701029411)'), 
    0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Got It'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Notifications'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Maybank2u Transfer'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Youve transferred RM 2.00 to TPOLCAs MAYBANK account ending 0048. REF 17180683341M'), 
    0)

Mobile.closeApplication()

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

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Third Party Transfer'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Successful'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - 17180683291M'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - 03 Aug 2020 442 PM'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Beneficiary name'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - TPOLCA'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Beneficiary account number'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - 5016 0000 0048'), 0)

Mobile.getText(findTestObject('Maya/Third Party CA account/android.view.View0 - Recipient reference'), 0)

Mobile.closeApplication()

Mobile.closeApplication()

not_run: Mobile.tap(findTestObject('Maya/NRICduitnow/android.widget.EditText0 - XXXXX XXXXX'), 0)

not_run: Mobile.clearText(findTestObject('Maya/NRICduitnow/android.widget.EditText0 - XXXXX XXXXX'), 0)

not_run: Mobile.setText(findTestObject('Maya/NRICduitnow/Enter Fav Name'), 'Third', 0)

Mobile.tap(findTestObject('Maya/NRICduitnow/second click add to fav'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Add Fav.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done (1)'), 0)

