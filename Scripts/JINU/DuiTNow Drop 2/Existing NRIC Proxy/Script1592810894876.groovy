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

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - Settings'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Settings.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - DuitNow'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Duitnow.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - NRIC Number'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Nric_Number.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - DuitNow'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - NRIC Number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Mobile proxy/android.widget.TextView0 - INACTIVE - Copy'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - Switch account'), 0)

/*Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - 3'), 0)*/
Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - Savings Account'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Switch.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - Terms  Conditions'), 0)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.ImageView0 (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Agree.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - Agree and Confirm'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - Confirm'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/DuitNow Drop 2-NRIC Proxy/android.widget.TextView0 - Done'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Done_Nric_Proxy.png', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

