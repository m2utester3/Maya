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

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitnow/Click duit now first'), 0)

Mobile.tap(findTestObject('Maya/duitnow/duitnow symbol'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/arrow duitnow'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.swipe(592, 1887, 550, 1754)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/NRICduitnow/done NRIC'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0 - Enter NRIC number'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 - Enter NRIC number (1)'), '890707105799', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)
Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)
Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Amount needs to be at least RM 0.01 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 'Test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Continue'), 0)


not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - RM 2.00 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Today (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Test'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\2.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Transfer Now (1)'), 0)

Mobile.tap(findTestObject('Maya/NRICduitnow/android.widget.TextView0 - Reject'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Transfer_Failed', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - 179857250M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - 16 Apr 2020 0546 pm'), 0)

