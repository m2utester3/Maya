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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (5).apk', true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(60, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/- Current Account-i'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Transfer'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - TO OTHERS'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Instant'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - MAYBANK'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/Third Party CA account/android.widget.EditText0'), '114011792952', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/eNTER-AMOUNT'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/recepient reference-text'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Third Party CA account/recepient reference-text'), 'TEST1', 0, FailureHandling.CONTINUE_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)