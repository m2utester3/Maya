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

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Settings'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Manage account details'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\UpdateProfile\\Settings.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Profile'), 0)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Last successful login'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\UpdateProfile\\Profile.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Update Profile'), 0)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Name'), 0)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Mobile number'), 0)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Email address'), 0)

Mobile.setText(findTestObject('Maya/update Profile/android.widget.EditText0 - check'), 'ch', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Save Changes'), 0)

Mobile.verifyElementExist(findTestObject('Maya/update Profile/android.widget.TextView0 - Name must contain at least 3 alphabetical characters and space(s) only.'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/update Profile/android.widget.EditText0 - ch'), 'Test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 6019  028'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Please enter a valid mobile number in order to continue.'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\UpdateProfile\\Mobile.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.EditText0 - Test'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 6019  028'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 6019  028'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 1'), 0)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Whats your mobile number'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 0)

def otpMessage = Mobile.getText(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Your OTP no. is 460943'), 
    0)

not_run: Mobile.verifyEqual(otpMessage[20], 'Y')

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

not_run: Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\UpdateProfile\\MobileUpdate.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/update Profile/android.widget.EditText0 - thgmail.com'), 0)

Mobile.setText(findTestObject('Maya/update Profile/android.widget.EditText0 - thgmail.com (1)'), 'th', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Save Changes'), 0)

Mobile.verifyElementExist(findTestObject('Maya/update Profile/android.widget.TextView0 - Please enter a valid email address.'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\UpdateProfile\\Mobile.png', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Maya/update Profile/android.widget.EditText0 - th'), 'th@gmail.com', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\UpdateProfile\\Email_update.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Take a photo'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Take a photo'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Cancel'), 0)

not_run: Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

not_run: Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Choose from library'), 0)

not_run: Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (6)'), 0)

not_run: Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Save Changes'), 0)

Mobile.verifyElementExist(findTestObject('Maya/update Profile/android.widget.TextView0 - Profile successfully updated.'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\UpdateProfile\\Profile_update.png', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

not_run: Mobile.closeApplication()

