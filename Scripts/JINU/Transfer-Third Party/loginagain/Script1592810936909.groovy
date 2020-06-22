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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (5).apk', true)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.Button0-Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Login to Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/login again/android.widget.EditText0'), 'rizaidi', 0)

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

not_run: Mobile.tap(findTestObject('Maya/Login/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.ImageView0-Enter OTP'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.ImageView0-Enter OTP'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - Yes Proceeed'), 0)

Mobile.delay(20, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/login again/otp try'), 0)

not_run: def otpMessage = Mobile.getText(findTestObject('Maya/login again/otp try'), 0)

//Mobile.verifyEqual(otpMessage[20], 'Y')
not_run: WebUI.delay(20)

not_run: for (def i = 16; i <= 21; i++) {
    not_run: if ((otpMessage[i]) == '0') {
        Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)
    }
    
    not_run: if ((otpMessage[i]) == '1') {
        Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)
    }
    
    not_run: if ((otpMessage[i]) == '2') {
        Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)
    }
    
    not_run: if ((otpMessage[i]) == '3') {
        Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)
    }
    
    not_run: if ((otpMessage[i]) == '4') {
        Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)
    }
    
    not_run: if ((otpMessage[i]) == '5') {
        Mobile.tap(findTestObject('Maya/login again/Spy- 5'), 0)
    }
    
    not_run: if ((otpMessage[i]) == '6') {
        Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)
    }
    
    not_run: if ((otpMessage[i]) == '7') {
        Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)
    }
    
    not_run: if ((otpMessage[i]) == '8') {
        Mobile.tap(findTestObject('Maya/login again/Spy - 8'), 0)
    }
    
    not_run: if ((otpMessage[i]) == '9') {
        Mobile.tap(findTestObject('Maya/login again/Spy- 9'), 0)
    }
}

not_run: WebUI.delay(15)

not_run: Mobile.tap(findTestObject('Maya/login again/Spy-Enter'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.EditText0 - Enter your name'), 0)

Mobile.setText(findTestObject('Maya/Login/android.widget.EditText0 - Enter your name'), 'Test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Login/android.view.ViewGroup0-SA pick'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Done setup'), 0)

Mobile.verifyElementText(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - Test'), 'Test', FailureHandling.CONTINUE_ON_FAILURE)

