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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release.apk', false)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - More'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Movie Tickets'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - Movies'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket2.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - ANGEL HAS FALLEN'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - 10Jun'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket3.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0'), 0)

not_run: Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.Button0 - CONTINUE'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Movie Tickets (1)'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Seat Type'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket4.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - e-Combo Selection'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.Button0 - CONFIRM'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 (1)'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Transaction Detail'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Confirm'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - PAY NOW'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - PAY NOW'), 0)

Mobile.setText(findTestObject('Maya/Movie Ticket/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Pay Now'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket5.png', FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Secure2u is down Please use TAC.'), 
    0) == true) {
    not_run: Mobile.verifyElementExist(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Secure2u is down Please use TAC.'), 
        0)

    Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Pay Now'), 0)

    Mobile.delay(5)

    Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Your TAC no. is 016942'), 0)

    def otpMessage = Mobile.getText(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Your TAC no. is 016942'), 
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

    Mobile.tap(findTestObject('Maya/Bus Ticket/enter child'), 0)
} else if (Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Activate Now'), 0) == true) {
    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Activate Now'), 0)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Confirm'), 0)

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

    Mobile.setText(findTestObject('Maya/KLIA/android.widget.EditText0 - Your ID number'), '730903095005', 0)

    driver.pressKeyCode(AndroidKeyCode.ENTER)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Continue (3)'), 0)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Continue (1)'), 0)

    Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - One-Tap Authorisation'), 0)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Approve'), 0)
}

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Payment successful'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Date  time'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket6.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Share Receipt'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket7.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.Button0 - Cancel'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Amount'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Corporate name'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket8.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Order number'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Date'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Time'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Hall'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket9.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - e-Combo'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - Transaction History'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket10.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Wallet'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - View Transactions'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Today'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket11.png', FailureHandling.STOP_ON_FAILURE)

