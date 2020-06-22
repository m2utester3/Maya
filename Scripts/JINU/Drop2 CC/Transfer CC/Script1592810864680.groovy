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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-dev-universal-release.apk', true)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Login to Maybank2u'), 0)

Mobile.setText(findTestObject('Maya/Transfer CC/android.widget.EditText0'), 'uiux_03', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Yes Its Mine'), 0)

Mobile.setText(findTestObject('Maya/Transfer CC/android.widget.EditText0 (1)'), 'pass1234', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Yes Proceeed'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - Your OTP no. is 040910'), 0)

def otpMessage = Mobile.getText(findTestObject('Maya/Test Scroll/android.widget.TextView0 - Your OTP no. is 040910'), 0)

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

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.ImageView0 (1)'), 0)

Mobile.setText(findTestObject('Maya/Transfer CC/android.widget.EditText0 - Enter your name'), 'Test', 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Done'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Login.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Transfer'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(352, 1680, 540, 450)

Mobile.getText(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Amex 2 Platinum Credit Card'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\TransferCC.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Transfer CC/android.widget.TextView0 -    243'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Amex 2 Platinum Credit Card'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Transfer CC/android.widget.TextView0 - Pay Card'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Pay.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.closeApplication()

