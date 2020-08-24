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

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Maybank2u'), 0)
Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 3'), 0)
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot1', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - CARDS'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - MAE Visa Card'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 -    2071'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - MAE Visa Card'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 -    2071 (1)'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Card Management'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Freeze Card'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Temporarily deactivate your card'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Overseas Debit'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Enable your foreign currency spend and overseas ATM withdrawals'), 
    0)
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot2', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Change Card PIN'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Card Replacement'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Freeze Card'), 0)
Mobile.setText(findTestObject('Maya/login again/android.widget.EditText0 (1)'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

def otpMessage = Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Your Otp no. is 247036'),
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

Mobile.tapAtPosition(826, 2048)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Card freeze successful.'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Freezing your card means youll temporarily deactivate it preventing any unwanted card activity.'), 
    0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Reference ID'), 0)
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot3', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Date  Time'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - 17180722171M'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - 12 Aug 2020 641 PM'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Freeze Card'), 0)
def otp = Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Your Otp no. is 247036'),
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

Mobile.tapAtPosition(826, 2048)
Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Card unfreeze successful.'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - By unfreezing this card transaction will be made possible on this account.'), 
    0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Date  Time'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - 17180722177M'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - 12 Aug 2020 644 PM'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Overseas Debit'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Activate Overseas Debit'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Start Date'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - End Date'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Enter start date'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Enter end date'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 29'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Continue'), 0)
def otpM = Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Your Otp no. is 247036'),
	0)

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
Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Overseas debit successfully activated.'), 0)
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot4', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Reference ID (1)'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Date  Time (1)'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - MC11111117180722205M'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - 12 Aug 2020 1849 PM'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Overseas Debit'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Deactivate Overseas Debit'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Are you sure you want to deactivate Overseas Debit'), 
    0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Deactivate'), 0)
def otpMi = Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Your Otp no. is 247036'),
	0)

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

	if ((otpMi[i]) == '0') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)
	}
	
	if ((otpMi[i]) == '1') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)
	}
	
	if ((otpMi[i]) == '2') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)
	}
	
	if ((otpMi[i]) == '3') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		not_run: Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

		Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)
	}
	
	if ((otpMi[i]) == '4') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)
	}
	
	if ((otpMi[i]) == '5') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy- 5'), 0)
	}
	
	if ((otpMi[i]) == '6') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)
	}
	
	if ((otpMi[i]) == '7') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)
	}
	
	if ((otpMi[i]) == '8') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy - 8'), 0)
	}
	
	if ((otpMi[i]) == '9') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy- 9'), 0)
	}
}

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(826, 2048)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Overseas debit successfully deactivated.'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Reference ID (1)'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Date  Time (1)'), 0)
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot5', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - MC11111117180722222M'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - 12 Aug 2020 1850 PM'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Change Card PIN (1)'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)
Mobile.tap(findTestObject('Maya/Overseas/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - This PIN will be used for ATM withdrawals and purchases.'), 
    0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Re-enter your 6-digit PIN'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.ImageView0 (1)'), 0)

def otpMs = Mobile.getText(findTestObject('Maya/MAE Virtual Card/android.widget.TextView0 - Your Otp no. is 247036'),
	0)

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

	if ((otpMs[i]) == '0') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)
	}
	
	if ((otpMs[i]) == '1') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)
	}
	
	if ((otpMs[i]) == '2') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)
	}
	
	if ((otpMs[i]) == '3') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		not_run: Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 3'), 0)

		Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)
	}
	
	if ((otpMs[i]) == '4') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)
	}
	
	if ((otpMs[i]) == '5') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy- 5'), 0)
	}
	
	if ((otpMs[i]) == '6') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)
	}
	
	if ((otpMs[i]) == '7') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)
	}
	
	if ((otpMs[i]) == '8') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy - 8'), 0)
	}
	
	if ((otpMs[i]) == '9') {
		Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Maya/login again/Spy- 9'), 0)
	}
}

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(826, 2048)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Card PIN successfully changed.'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Reference ID (2)'), 0)
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Maybank2u\\Screenshot6', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Date  Time (2)'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - 17180722252M'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - 12 Aug 2020 1853 PM'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/Overseas/android.widget.TextView0 - Card Replacement (1)'), 0)

Mobile.getText(findTestObject('Maya/Overseas/android.widget.TextView0 - Your have already placed a request for card replacement'), 
    0)

