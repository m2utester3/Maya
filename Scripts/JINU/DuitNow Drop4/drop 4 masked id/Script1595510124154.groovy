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

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0)

String trx6 = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0).substring(
    3)

String trx61 = trx6.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx61)

int trx611 = ((trx61) as Integer)

System.out.println(trx611)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - Transfer'), 0)

Mobile.setText(findTestObject('Maya/DuitnowRegT/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

/*Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(451, 727, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot2', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Mobile Number'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - Mobile Number'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot3', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('duitnow/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer on Us'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot4', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue'), 0)

not_run: Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

not_run: Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot5', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

not_run: Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Mobile Number'), 0)

not_run: Mobile.tap(findTestObject('duitnow/android.widget.ImageView0'), 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer Off Us'), 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue'), 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0'), 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer on Us'), 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 3676FED98C'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot6', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 3676FED98C'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Enter amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Enter amount'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0 (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot7', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 3676FED98C'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 3676FED98C'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.setText(findTestObject('Maya/drop4 CR/android.widget.EditText0'), 'test', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot8', FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue (1)'), 0)

Mobile.setText(findTestObject('Maya/drop4 CR/android.widget.EditText0 - Optional'), 'testestesetesetesetesetestset', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - test'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue (1)'), 0)

not_run: Mobile.setText(findTestObject('Maya/drop4 CR/android.widget.EditText0 - test'), 'testestesetesetesetsetsetste', 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Confirmation'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot8', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0-close button'), 0)


*/
Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(451, 727, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot31', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Mobile Number'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - Mobile Number'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot4', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('duitnow/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer on Us'), 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Mobile Number'), 0)

not_run: Mobile.tap(findTestObject('duitnow/android.widget.ImageView0'), 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer Off Us'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue'), 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0'), 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer on Us'), 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - The name of the recipient is now masked as you have maximised the daily number of retry to perform this transaction.'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890 (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890 (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - XXXXXXXXXX'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - XXXXXXXXXX'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Enter amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Enter amount'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 0'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0 (1)'), 0)

Mobile.setText(findTestObject('Maya/drop4 CR/android.widget.EditText0'), 'testestesetesetesetsetsetste', 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue (1)'), 0)

Mobile.setText(findTestObject('Maya/drop4 CR/android.widget.EditText0 - Optional'), 'testestesetesetesetesetestset', 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen10.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - test'), 0)

not_run: Mobile.setText(findTestObject('Maya/drop4 CR/android.widget.EditText0'), 'testestesetesetesetsetsetste', 0)

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - XXXXXXXXXX'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - XXXXXXXXXX'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890 (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890 (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number (1)'), 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue (2)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - XXXXXXXXXX (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - XXXXXXXXXX (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot32', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890 (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890 (2)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Confirmation'), 0)

String trx5 = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 2.00-transfer amt'), 0).substring(
    3)

String trx51 = trx5.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx51)

int trx511 = ((trx51) as Integer)

System.out.println(trx511)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer Now (1)'), 0)

WebUI.delay(2)

if (Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Your TAC no. is 831555lATEST'), 0)) {
    def otpM = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Your TAC no. is 831555lATEST'), 0)

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

    Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0-ENTER cHILD'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Approve'), 4)) {
    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Approve'), 5)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\TransferSuccess.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - Transfer successful'), 'Transfer successful')

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Reference ID'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot33', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Date  time'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Date  time'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 17180225875M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 17180225875M'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 23 Jul 2020 850 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 23 Jul 2020 850 PM'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - DuitNow'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - DuitNow'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - Successful'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - Successful'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - Reference ID'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - 17180225875M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - 17180225875M'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - 23 Jul 2020 850 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - 23 Jul 2020 850 PM'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - Beneficiary name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - Beneficiary name'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot34', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - 3676FED98C'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - 3676FED98C'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - DuitNow ID type'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - DuitNow ID type'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - 3676FED98C'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - 3676FED98C'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - DuitNow ID number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - DuitNow ID number'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - 012 3743 890'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - 012 3743 890'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - Recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - Recipient reference'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - testestesetese'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - testestesetese'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - Amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - Amount'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(831, 1382, 800, 100)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - RM 2.00'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.view.View0 - RM 2.00'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.Button0 - Cancel'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Add to Favourites'), 0)

Mobile.clearText(findTestObject('Maya/drop4 CR/android.widget.EditText0 - 3676FED98C'), 0)

Mobile.setText(findTestObject('Maya/drop4 CR/android.widget.EditText0 - Please Enter Name'), 'cgkchkchkchkchkchkchkchkchk', 
    0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0 (4)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuiNow Drop4\\Screenshot36', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Add to Favourites'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Registered name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Registered name'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 3676FED98C (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 3676FED98C (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Proxy type'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Proxy type'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number (2)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Proxy ID'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Proxy ID'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 0123743890'), 0)

Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 0123743890'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Add to Favourites'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (3)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot12', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(831, 1382, 800, 100)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot15', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(97, 176, 1)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1169.85-Post transfer balance'), 0)

String trx4 = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1169.85-Post transfer balance'), 
    0).substring(3)

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

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow\\Screen29.png', FailureHandling.CONTINUE_ON_FAILURE)

