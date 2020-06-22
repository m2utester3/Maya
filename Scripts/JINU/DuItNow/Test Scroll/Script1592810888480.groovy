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

not_run: Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (8).apk', false)

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (18).apk', false)

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (19).apk', true)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - More (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Settings (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 (1)'), 'pass1234', 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - One-Tap Authorisation (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Approve transactions safely and quickly with a single tap on the app. Skip SMS TAC and get things done faster.'), 
    0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Activate Now (1)'), 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - One Time Password (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Not Mine'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Confirm (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (4)'), 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Enter your ID number (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Activate Now (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Confirm (1)'), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your ID number (1)'), '1234', 0)

Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - 1234'), 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - ID number is required'), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your ID number (2)'), '730903095005', 
    0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Device Name'), 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Your device name must be alphanumeric characters with no symbols and spaces'), 
    0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Enter your device name'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Activate Now (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (6)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Activate Now (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Confirm (1)'), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your ID number (1)'), '##   @@', 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - ID number is invalid'), 0)

Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 -    '), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your ID number (2)'), '730903095005', 
    0)

Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Redmi'), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your device name'), '@@ !!tre', 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Device name must be alphanumeric characters with no symbols and spaces.'), 
    0)

Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 -  tre'), 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - ID number is required'), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your device name'), 'testtesttesttesttesttesttesttest', 
    0)

Mobile.clearText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - testtesttesttes'), 0)

Mobile.setText(findTestObject('Maya/One Tap Authorisation/android.widget.EditText0 - Your device name'), 'test', 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - One-Tap Authorisation enabled'), 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - You may now authorise your transactions securely via the app.'), 
    0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('Maya/One Tap Authorisation/android.widget.TextView0 - One-Tap Authorisation (1)'), 0)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (18).apk', true)

Mobile.tap(findTestObject('Maya/Test2/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('Maya/Test2/android.widget.TextView0 - Settings'), 0)

Mobile.tap(findTestObject('Maya/Test2/android.widget.TextView0 - Profile'), 0)

Mobile.tap(findTestObject('Maya/Test2/android.widget.TextView0 - Mobile number'), 0)

Mobile.tap(findTestObject('Maya/Test2/android.widget.ImageView0'), 0)

Mobile.closeApplication()

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - Test'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - 6019  028'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('Maya/Test Scroll/android.widget.TextView0 - Your OTP no. is 040910'), 0)

def otpMessage = Mobile.getText(findTestObject('Maya/Test Scroll/android.widget.TextView0 - Your OTP no. is 040910'), 0)

not_run: Mobile.verifyEqual(otpMessage[20], 'Y')

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    if ((otpMessage[i]) == '0') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)
    }
    
    if ((otpMessage[i]) == '1') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)
    }
    
    if ((otpMessage[i]) == '2') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)
    }
    
    if ((otpMessage[i]) == '3') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

        Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)
    }
    
    if ((otpMessage[i]) == '4') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)
    }
    
    if ((otpMessage[i]) == '5') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 5'), 0)
    }
    
    if ((otpMessage[i]) == '6') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)
    }
    
    if ((otpMessage[i]) == '7') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)
    }
    
    if ((otpMessage[i]) == '8') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy - 8'), 0)
    }
    
    if ((otpMessage[i]) == '9') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Maya/login again/Spy- 9'), 0)
    }
}

WebUI.delay(15)

