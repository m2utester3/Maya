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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (3).apk', true)

Mobile.tap(findTestObject('Maya/Login/android.view.ViewGroup0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Login/android.view.ViewGroup0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Next (1)'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Login/Next-1'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/Login/Next-1'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Login to Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.EditText0 (2)'), 0)

Mobile.tapAndHold(findTestObject('Maya/Login/android.widget.EditText0 (2)'), 0, 0)

Mobile.setText(findTestObject('Maya/Login/android.widget.EditText0 (2)'), 'pentestu102', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Yes Its Mine'), 0)

Mobile.tapAndHold(findTestObject('Maya/Login/android.view.ViewGroup0 (3)'), 0, 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.EditText0 (3)'), 0)

Mobile.setText(findTestObject('Maya/Login/android.widget.EditText0 (3)'), 'pass1234', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 3'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Login/android.widget.ImageView0-Click enter'), 0)

//Mobile.tapAndHold(findTestObject('Maya/Login/android.widget.ImageView0-Enter OTP'), 2, 8)
Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - 3'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Login/android.widget.ImageView0-Click enter'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Yes Proceeedotp'), 0)

Mobile.closeApplication()

