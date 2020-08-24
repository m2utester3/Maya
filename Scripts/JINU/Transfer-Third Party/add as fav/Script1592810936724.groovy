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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (6).apk', false)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - Transfer'), 0)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/Third Party Add Fav/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - TO OTHERS'), 0)

Mobile.tap(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - Instant'), 0)

Mobile.setText(findTestObject('Maya/Third Party CA account/android.widget.EditText0'), '50101133348', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/eNTER-AMOUNT'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Third Party Add Fav/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer'), 
    0)

Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/eNTER-AMOUNT'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/recepient reference-text'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Third Party CA account/recepient reference-text'), 'TEST1', 0, FailureHandling.CONTINUE_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.ImageView0 (2)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.ImageView0 (3)'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party CA account/Arrow-Secure2u'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party CA account/Confirm Secure2u'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Yes Its Mine'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party CA account/Enter ID'), 0)

Mobile.setText(findTestObject('Maya/Third Party CA account/Enter ID'), '850102036544', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/Device-Name-Redmi'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/successful-Secure-2u-done'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/Tranfer-Now-Button'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/Approve-Transfer-now'), 0)

Mobile.takeScreenshot('c/user/abc/1.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/Done-Transfer-Successful'), 0)

