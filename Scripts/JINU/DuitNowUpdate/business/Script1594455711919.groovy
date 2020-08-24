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

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Maybank2u (1)'), 7)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 3'), 0)

not_run: Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0)

String trx6 = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 1171.85-Current balance'), 0).substring(
    3)

String trx61 = trx6.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx61)

int trx611 = ((trx61) as Integer)

System.out.println(trx611)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer'), 0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 (1)'), 'pass1234', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen2.png', FailureHandling.CONTINUE_ON_FAILURE)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(451, 727, 2)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - DuitNow (2)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - ID type'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(592, 1887, 629, 1390)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Business Registration Number'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Business Registration Number'), 
    0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - Enter business reg. no.'), 'abc', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Please input valid transfer details.'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Please input valid transfer details.'), 
    0)

Mobile.clearText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - abc'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (1)'), 0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - Enter business reg. no.'), '803168W', 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - The DuitNow ID entered is inactive.'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - The DuitNow ID entered is inactive.'), 
    0)

Mobile.clearText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - 803168W'), 0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 - Enter business reg. no.'), '820787M', 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 820787M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 820787M'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Business Registration Number (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Business Registration Number (1)'), 
    0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - KONTRON ASIA PACIFIC DESIGN SDN BHD'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - KONTRON ASIA PACIFIC DESIGN SDN BHD'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter amount'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Amount needs to be at least RM 0.01.'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Amount needs to be at least RM 0.01.'), 
    0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 820787M (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 820787M (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - KONTRON ASIA PACIFIC DESIGN SDN BHD (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - KONTRON ASIA PACIFIC DESIGN SDN BHD (1)'), 
    0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Business Registration Number (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Business Registration Number (2)'), 
    0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen9.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.hideKeyboard()

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 (2)'), 'TEST', 0)

Mobile.setText(findTestObject('Maya/RegisterDuitNow/android.widget.EditText0 (2)'), 'TESTESTESTESTESTESTESTESTESETSSSSSSSST', 
    0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (2)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 820787M (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 820787M (2)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Date'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Date'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer type'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer type'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - One-Off Transfer'), 0)

WebUI.delay(5)

Mobile.swipe(592, 1887, 550, 1754)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Start date'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Start date'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - End date'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - End date'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 12 Jul 2020'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 29'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (2)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 28 Aug 2020'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 30'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (2)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Business RegistrationNumber'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Business RegistrationNumber'), 
    0)

String trx5 = Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - RM 2.00-transfer amt'), 0).substring(
    3)

String trx51 = trx5.replaceAll('[^a-zA-Z0-9]+', '')

System.out.println(trx51)

int trx511 = ((trx51) as Integer)

System.out.println(trx511)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - RM 2.00'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter amount'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Recipient reference'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - TESTESTESTESTE'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Continue (2)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(520, 900, 520, 300)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Note'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Note'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Declaration'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Declaration'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Terms  Conditions'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (4)'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer from'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer from'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer Now'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen14.png', FailureHandling.CONTINUE_ON_FAILURE)

def otpM = Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Your TAC no. is 582206'), 0)

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

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer scheduled'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer scheduled'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Date  time'), 0)

not_run: Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - MC11111117180038208M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - MC11111117180038208M'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 11 Jul 2020 0441 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - 11 Jul 2020 0441 PM'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Share Receipt'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Share Receipt'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitnow BusinessReg/android.view.View0 - DuitNow'), 0)

Mobile.getText(findTestObject('Maya/duitnow BusinessReg/android.view.View0 - Pending'), 0)

Mobile.getText(findTestObject('Maya/duitnow BusinessReg/android.view.View0 - Transfer scheduled for'), 0)

Mobile.getText(findTestObject('Maya/duitnow BusinessReg/android.view.View0 - 17 Aug 2020 1117 AM'), 0)

Mobile.getText(findTestObject('Maya/duitnow BusinessReg/android.view.View0 - KONTRON ASIA PACIFIC DESIGN SDN BHD'), 0)

Mobile.getText(findTestObject('Maya/duitnow BusinessReg/android.view.View0 - DuitNow ID type'), 0)

Mobile.getText(findTestObject('Maya/duitnow BusinessReg/android.view.View0 - Business Registration Number'), 0)

Mobile.getText(findTestObject('Maya/duitnow BusinessReg/android.view.View0 - DuitNow ID number'), 0)

Mobile.getText(findTestObject('Maya/duitnow BusinessReg/android.view.View0 - 820787M'), 0)

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

not_run: Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.getText(findTestObject('Maya/NRICduitnow/android.view.View0 - Beneficiary name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - RM 2.00'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Recipient reference'), 0)

not_run: Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

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

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Proxy ID'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Add to Favourites (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot23', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - SANDY LAM HUI MING Successfully added to Favourites'), 
    0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - SANDY LAM HUI MING Successfully added to Favourites'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Done (3)'), 0)

Mobile.tap(findTestObject('Maya/RegisterDuitNow/android.widget.TextView0 - Transfer'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(831, 1382, 800, 100)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNowProxy\\Screen19.png', FailureHandling.CONTINUE_ON_FAILURE)

