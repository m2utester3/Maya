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


Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (18).apk', false)
Mobile.tap(findTestObject('Maya/Manage Device/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.TextView0 - Settings'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.TextView0 - Security'), 0)

Mobile.setText(findTestObject('Maya/Change Pin/android.widget.EditText0'), 'pass', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.verifyElementExist(findTestObject('Maya/Manage Device/android.widget.TextView0 - Please enter valid Maybank2u password.'), 
    0)

Mobile.setText(findTestObject('Maya/Change Pin/android.widget.EditText0'), 'pass1234', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.TextView0 - Manage Devices'), 0)
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Manage_Device.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Manage Device/android.widget.TextView0 - Manage Devices (1)'), 0)

Mobile.getText(findTestObject('Maya/Manage Device/android.widget.TextView0 - You can only have a maximum of 3 registered devices'), 
    0)
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Device Registered.png', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Maya/Manage Device/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.TextView0 - Manage Devices'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.TextView0 - Redmi'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.TextView0 - Cancel'), 0)
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\Device Deregistered.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.TextView0 - Proceed'), 0)

Mobile.tap(findTestObject('Maya/Manage Device/android.widget.TextView0 - Hello'), 0)
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\DuitNow-Drop2\\After_deregistration.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Manage Device/android.widget.TextView0 - Login to Maybank2u'), 0)

Mobile.getText(findTestObject('Maya/Manage Device/android.widget.TextView0 - Register for Maybank2u'), 0)

Mobile.closeApplication()

