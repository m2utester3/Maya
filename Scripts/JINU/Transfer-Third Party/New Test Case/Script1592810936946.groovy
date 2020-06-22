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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (5).apk', false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Maybank2u'), 0)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/login again/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/- Current Account-i'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Transfer'), 0)

Mobile.tap(findTestObject('Maya/Third Party Fav/Enter password'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Third Party Fav/Enter password'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.view.ViewGroup0'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - TO OTHERS'), 0)

Mobile.tap(findTestObject('Maya/Third Party Fav/Tap search'), 0)

def Fav = Mobile.setText(findTestObject('Maya/Third Party Fav/android.widget.EditText0 - Type name Fav'), 'My Love', 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.verifyElementText(findTestObject('Maya/Third Party Fav/FAV name'), Fav, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party Fav/FAV name'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/eNTER-AMOUNT'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party Fav/Enter recepient reference name'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Third Party Fav/Enter recepient reference name'), 'Test', 0)

def acct_ref = Mobile.getText(findTestObject('Maya/Third Party Fav/account number on recepient screen'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

acct_acct = Mobile.getText(findTestObject('Maya/Third Party Fav/account number on confirmation screen'), 0)

Mobile.verifyMatch(acct_ref, acct_acct, true, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('Maya/Third Party Fav/Enter amount screen'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party Fav/today date'), 0)

Mobile.tap(findTestObject('Maya/Third Party Fav/17 date'), 0)

Mobile.tap(findTestObject('Maya/Third Party Fav/done select date'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Third Party CA account/recepient reference-text'), 0)

Mobile.tapAndHold(findTestObject('Maya/Third Party Fav/Transfer now'), 2, 5)

