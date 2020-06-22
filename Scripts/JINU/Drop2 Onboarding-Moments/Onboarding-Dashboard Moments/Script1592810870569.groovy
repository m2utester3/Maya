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
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen1.png', FailureHandling.CONTINUE_ON_FAILURE)
Mobile.swipe(598, 502, 40, 200)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Hello Test your Wallet  Y'), 0)
Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen2.png', FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - View Wallet'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 3'), 0)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen3.png', FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0'), 0)



Mobile.swipe(598, 502, 40, 200)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen4.png', FailureHandling.CONTINUE_ON_FAILURE)
Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Scan  Pay (QRPay)  Not setup'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(598, 502, 40, 200)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - M2U ID has at least 1 CC  N'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(598, 502, 40, 200)


Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - User has MAE account  Y'), 0)


Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(598, 502, 40, 200)


Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen7.png', FailureHandling.CONTINUE_ON_FAILURE)


Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - User has MAE account  Y (at GCIF level'),
	0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(598, 502, 40, 200)


Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Apply MAE Card'), 0)

Mobile.setText(findTestObject('Maya/Onboarding Moments/android.widget.EditText0'), 'pass1234', 0)
AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)
Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0 (1)'), 0)
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(598, 502, 40, 200)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)







Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - User has loyality card  N'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Add Loyalty Card'), 0)

Mobile.swipe(598, 502, 40, 200)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen10.png', FailureHandling.CONTINUE_ON_FAILURE)



Mobile.swipe(598, 502, 40, 200)
Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Your expenses categorisation of Others is at 0-25.'),
	0)
Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen11.png', FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Categorise Now'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0'), 0)







