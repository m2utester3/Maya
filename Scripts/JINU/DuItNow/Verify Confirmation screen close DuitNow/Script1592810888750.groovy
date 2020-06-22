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

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/duitNowFav/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - DUITNOW'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party Fav/Image Search'), 0)

Mobile.checkElement(findTestObject('Maya/Third Party Fav/android.widget.EditText0 - Type name Fav'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(461, 1861)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(288, 1731)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(400, 1727)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

not_run: Mobile.swipe(520, 900, 520, 400)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - FERZANA'), 0)

Mobile.tap(findTestObject('Maya/duitnow conf/back button'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - FERZANA'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)

not_run: Mobile.tap(findTestObject('Maya/duitnow conf/back refer screen'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 'Test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/duitnow conf/back button'), 0)
driver.pressKeyCode(AndroidKeyCode.ENTER)
Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 'te', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitnow conf/back button'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 'testestestestestestestestestestestestestest', 
    0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/duitnow conf/tap amt'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.ImageView0-close button -conf screen'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Back to initial Transfer.png', FailureHandling.STOP_ON_FAILURE)

