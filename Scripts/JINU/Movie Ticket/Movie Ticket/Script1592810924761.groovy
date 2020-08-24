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

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.TextView0 - 3'), 0)

not_run: Mobile.tap(findTestObject('Maya/DuitnowRegT/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0)

String trx6 = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0).substring(
    3)

String trx61 = trx6.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx61)

int trx611 = ((trx61) as Integer)

System.out.println(trx611)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - More'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Movie Tickets'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - Movies'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket2.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - ANGEL HAS FALLEN'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - 10Jun'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket3.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 (2)'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/spy/android.view.View0 - KECIL0155AM1200PMSTANDARD0200AM0200AM0205AM0210AM0220AM0225AM0230AM0230AM1155AM1155AM1200PM1205PM1215PM1220PM1225PM1225PM'), 
    0)

Mobile.tapAtPosition(546, 1544)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - -'), 0)

if (Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - -'), 0)) {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAtPosition(71, 1247)
}

if (Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - -'), 0)) {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0-Seat 1'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - -'), 0)) {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0-Seat 3'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - -'), 0)) {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0-Seat 5'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - -'), 0)) {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0-Seat 2'), 0)
}

//Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 (3)'), 0)
Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - C15'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket12.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 (4)'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.Button0 - CONTINUE (1)'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Promo Code  Voucher'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Promo Code  Voucher'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Movie Tickets (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Movie Tickets (1)'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Seat Type'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Seat Type'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Subtotal'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Subtotal'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Booking Fees'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Booking Fees'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Discount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Discount'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Total'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket14.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Total'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.Button0 - CONFIRM (0959)'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Time Remaining  892 seconds'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Time Remaining  892 seconds'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket4.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - PAY NOW'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - PAY NOW'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - PAY NOW'), 0)

Mobile.setText(findTestObject('Maya/Movie Ticket/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Confirmation'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket18.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - RM 17.50'), 0)

String trx5 = Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - RM 17.50'), 0).substring(3)

String trx51 = trx5.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx51)

int trx511 = ((trx51) as Integer)

System.out.println(trx511)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Pay Now'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket5.png', FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Maya/spy/android.widget.TextView0 - Your TAC no. is 822872v3'), 3)) {
    def otpM = Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Your TAC no. is 822872v3'), 0)

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

    Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - WeTix'), 0)

    Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - MBXXXXXXXXXXXXXXXXXX'), 0)

    Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket9.png', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Approve'), 0)
}

// if (Mobile.getText(findTestObject('Maya/KLIA/android.widge t.TextView0 - Activate Now'), 0)) {
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Payment successful'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Payment successful'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket19.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Date  time'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Date  time'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket6.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Share Receipt'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket7.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.Button0 - Cancel'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Movie Tickets'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Share Receipt'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Successful'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Successful'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - 30 Jul 2020 355 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - 30 Jul 2020 355 PM'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - 17180450574M'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/Movie Ticket/android.view.View0 - 17180450574M'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - WeTix'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Order number (1)'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - 172463933L'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - 172463933L'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - RM 17.50'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/Movie Ticket/android.view.View0 - RM 17.50'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Note This receipt is computer generated and no signature is required.'), 
    0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Malayan Banking Berhad (Co. Reg.  196001000142)'), 
    0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Maybank Islamic Berhad (Co. Reg.  200701029411)'), 
    0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Reference ID'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Amount'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Corporate name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Corporate name'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket8.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Order number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Order number'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Done'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Date'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Date'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Time'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Time'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - Hall'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.view.View0 - Hall'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket9.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - e-Combo'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - Transaction History'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket10.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Wallet'), 0)

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

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Today'), 0)

Mobile.verifyElementExist(findTestObject('Maya/KLIA/android.widget.TextView0 - Today'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket13.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - More (1)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Notifications'), 0)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Got It'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Maybank2u Payments'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Today (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket53.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - Successful payment of RM 182.25 to KLIA. REF180446966M'), 
    0)

Mobile.verifyElementVisible(findTestObject('Maya/KLIA/android.widget.TextView0 - Successful payment of RM 182.25 to KLIA. REF180446966M - Copy'), 
    0)

Mobile.verifyElementVisible(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Successful payment of RM 182.25 to KLIA. REF180446966M - Copy (1) - Copy'), 
    0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

if (Mobile.verifyElementExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Movie Tickets (2)'), 0)) {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\KLIATicket\\Ticket9.png', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Movie Tickets (2)'), 0)
} else if (Mobile.verifyElementNotExist(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Movie Tickets (2)'), 
    0)) {
    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Manage'), 0)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (10)'), 0)

    Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - Movie Tickets'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.swipe(895, 1046, 800, 50)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.ImageView0 (11)'), 0)

    Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Save Changes'), 0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket11.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.widget.TextView0 - Movie Tickets (2)'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - Profile'), 0)

Mobile.tap(findTestObject('Maya/Movie Ticket/android.view.View0 - My Tickets'), 0)

Mobile.getText(findTestObject('Maya/Movie Ticket/android.view.View0 - My Tickets (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\NovieTicket\\Ticket20.png', FailureHandling.STOP_ON_FAILURE)

