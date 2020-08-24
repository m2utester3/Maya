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

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Transfer (1)'), 5)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot1', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot2', FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(451, 727, 2)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (2)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot3', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (2)'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(592, 1887, 607, 1657)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/NRIC Passport/Pssport-Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type (3)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (5)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (6)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot4', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Issuing Country'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Select Country'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.EditText0 - Enter passport number'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.verifyElementExist(findTestObject('Maya/NRICduitnow/android.widget.TextView0 - Please enter valid transfer details.'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot6', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.EditText0 - Enter passport number'), 0)

Mobile.setText(findTestObject('Maya/NRIC Passport/android.widget.EditText0 - Enter passport number'), 'ABCDEFG', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Continue'), 0)

Mobile.verifyElementExist(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Please select a country'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot7', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (7)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (6)'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Continue'), 0)

Mobile.verifyElementExist(findTestObject('Maya/NRICduitnow/android.widget.TextView0 - The DuitNow ID entered is not valid.'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot8', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Please select a country'), 0)

Mobile.tap(findTestObject('Maya/NRICduitnow/nric back'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(451, 727, 2)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (2)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot9', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (2)'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(592, 1887, 607, 1657)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/NRIC Passport/Pssport-Done'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type (3)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (5)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (5)'), 0)

not_run: Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Passport Number (6)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Issuing Country'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Issuing Country'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Select Country'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Select Country'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (7)'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1470)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1470)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1470)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1470)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1644)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1644)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1644)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1750)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1750)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1750)

/*Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(556, 1886, 751, 1644)

*/
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/NRIC Passport/Country Done'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.EditText0 - Enter passport number'), 0)

Mobile.setText(findTestObject('Maya/NRIC Passport/android.widget.EditText0 - Enter passport number'), 'B66732113BRA', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Passport.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - B66732113BRA'), 0)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\PassAmount.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (3)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - B66732113BRA'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 'Check', 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Enter ref.png', FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - RM 2.00 (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - B66732113BRA'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Today (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Test'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\ConfDuitNow.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Transfer Now (1)'), 0)

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

    Mobile.tap(findTestObject('Maya/Third Party CA account/Approve-Transfer-now'), 0, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\TransferSuccess.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - Transfer successful'), 'Transfer successful')

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Reference ID'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot17', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Date  time'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Date  time'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - MC11111117180038208M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - MC11111117180038208M'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 11 Jul 2020 0441 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 11 Jul 2020 0441 PM'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Share Receipt'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (4)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot16', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.view.View0 - DuitNow'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.view.View0 - Successful'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.view.View0 - Beneficiary name'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.view.View0 - DEADPOOL'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.view.View0 - DuitNow ID type'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.view.View0 - Passport Number'), 0)

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

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Add to Favourites'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Registered name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Registered name'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Proxy type'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Proxy type'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Proxy ID'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Proxy ID'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Add to Favourites (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot23', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - SANDY LAM HUI MING Successfully added to Favourites'), 
    0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot11', FailureHandling.STOP_ON_FAILURE)

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

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Wallet'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - View Transactions'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow\\Screen29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - More (1)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Notifications'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Maybank2u Transfer'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - DuitNow of RM 2.00 to DEADPOOL. Passport Number  ABRA. REF 17180689639M'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow\\Screen39.png', FailureHandling.CONTINUE_ON_FAILURE)

