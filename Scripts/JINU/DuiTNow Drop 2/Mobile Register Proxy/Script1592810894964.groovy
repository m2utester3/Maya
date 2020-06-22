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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (16).apk', false)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Settings'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Settings.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/Mobile proxy/android.widget.EditText0'), 'pass', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Please enter valid Maybank2u password.'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/clse button'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/Mobile proxy/android.widget.EditText0'), 'pass1234', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - DuitNow'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\DuiTNow.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Select account'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 112361135090'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.ImageView0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.ImageView0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Select account'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 112361135090'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Agree and Confirm'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Agree.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Done'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Done.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - DuitNow'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1028'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - INACTIVE - Copy'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Disable Temporarily'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Disable.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Disable Temporarily'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Not Mine'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Confirm (1)'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - DuitNow'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - 1028'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Enable'), 0)

Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - INACTIVE'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Inactive.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Enable'), 0)

not_run: Mobile.tap(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - Confirm (1)'), 0)

not_run: Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Confirm.png', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

