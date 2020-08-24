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

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer (1)'), 7)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Screen1.png', FailureHandling.CONTINUE_ON_FAILURE)

/*Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0'), 0)*/
'Transfer third party'
not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Transfer'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\FavTransfer.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Duitnow_Fav_Tran.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0-child'), 0)

'Type Fav Name '
not_run: Mobile.checkElement(findTestObject('Maya/Third Party Fav/android.widget.EditText0 - Type name Fav'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(1030, 1719)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(647, 1988)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(647, 1988)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

not_run: Mobile.swipe(520, 900, 520, 400)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Screen3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - FERZANA'), 0)
not_run: Mobile.tapAtPosition(318, 762)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Pbb'), 5)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/Verify Fav Contact'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Amt_Tran.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (9)'), 0)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/Verify Fav Contact'), 0)

not_run: Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Please enter a recipient reference.'), 
    0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 'Test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Continue (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Ref_Tran.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/Verify Fav Contact'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 30'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - You are required to authenticate in One-Tap Authorisation to complete your first-time favourite transfer.'), 
    0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 0)

Mobile.verifyElementText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 'Test')

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - RM 2.00'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0109030162'), 0)

Mobile.verifyElementText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0109030162'), '010 9030 162')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Duitnow_Fav_Tran_Conf.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer Now'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Your TAC no. is 831555lATEST'), 3)) {
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

if (Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Approve'), 0)) {
    Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Approve'), 0)
}

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Schedule.png', FailureHandling.STOP_ON_FAILURE)

'Schedule a transfer'
Mobile.verifyElementText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Transfer scheduled'), 'Transfer scheduled')

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 179860600M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 179860600M'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 16 Apr 2020 0819 PM'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 16 Apr 2020 0819 PM'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Fav Done.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt'), 0)

Mobile.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - 17180008563M'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot24', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - 17180008563M'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Beneficiary name'), 0)

Mobile.getText(findTestObject('Maya/spy/android.view.View0 - Beneficiary name'), 0)

Mobile.getText(findTestObject('Maya/spy/android.view.View0 - NURALILAH'), 0)

Mobile.getText(findTestObject('Maya/spy/android.view.View0 - DuitNow ID number'), 0)

Mobile.getText(findTestObject('Maya/spy/android.view.View0 - 010 9030 162'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Beneficiary name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Amount'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Recipient reference'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - RM 2.00'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - RM 2.00'), 0)

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

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done (1)'), 0)

//Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - View Transactions'), 0)
Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Fav transac', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - More (1)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Notifications'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Maybank2u Transfer'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - DuitNow of RM 2.00 to NURALILAH. Mobile Number  0162. REF 17180694077M (1)'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow\\Screen39.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

