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

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - Settings'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - Security'), 0)

Mobile.setText(findTestObject('Maya/Change Pin/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - Change PIN'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Change_Pin.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Change Pin/android.widget.TextView0 - Enter your current PIN'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - Change PIN'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 3'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Change Pin/android.widget.TextView0 - Create your new 6-digit PIN'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Create Pin.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - Change PIN'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.ImageView0 (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Change Pin/android.widget.TextView0 - PIN must consist of at least 6 digits.'), 
    0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 1'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Change Pin/android.widget.TextView0 - Incorrect PIN entered'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Fail_Pin.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 3'), 0)

Mobile.getText(findTestObject('Maya/Change Pin/android.widget.TextView0 - Create your new 6-digit PIN'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (8)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Change Pin/android.widget.TextView0 - PIN must consist of at least 6 digits.'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 1 (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (8)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Change Pin/android.widget.TextView0 - Confirm your new 6-digit PIN'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/Change Pin/android.widget.TextView0 - 1 (1)'), 0)

Mobile.tap(findTestObject('Maya/One Tap Authorisation/android.widget.ImageView0 (8)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Pinupdated.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Change Pin/android.widget.TextView0 - PIN successfully updated.'), 0)

not_run: Mobile.tap(findTestObject('Maya/Change Pin/android.widget.ImageView0 (5)'), 0)

Mobile.closeApplication()

