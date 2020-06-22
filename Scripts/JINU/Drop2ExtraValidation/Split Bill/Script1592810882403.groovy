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

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - Split Bills'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - Split a Bill'), 0)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Split Bill\\Screen1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Split Bill/android.widget.EditText0 - Enter bill name'), 'Test', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Split Bill/Tap Evenly'), 0)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Split Bill\\Screen2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.ImageView0'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Split Bill\\Screen3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Maya/Split Bill/android.widget.ImageView0seatch'), 0, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Split Bill/android.widget.EditText0'), 'me', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - Me  Malaysia'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - Split Now'), 0)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Split Bill\\Screen4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - Test'), 0)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.ImageView0 (3)'), 0)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Split Bill\\Screen5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - Remove Bill'), 0)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Split Bill\\Screen6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Split Bill/android.widget.TextView0 - Confirm'), 0)

