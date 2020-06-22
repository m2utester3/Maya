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

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Transfer'), 0)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - OTHERS'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Fav.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party Fav/Image Search'), 0)

Mobile.checkElement(findTestObject('Maya/Third Party Fav/android.widget.EditText0 - Type name Fav'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(648, 1871, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(277, 1728, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(597, 1735, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\SearchFav.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - 5140 1207 8863'), 0)

Mobile.tap(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - hey (2)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Enter Amt.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Third Party Fav/Verify accountTo others'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/duitnow Army/enter ref'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\EnterRecepient.png', FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.verifyElementExist(findTestObject('Maya/Third Party Fav/Verify accountTo others'), 0)

Mobile.setText(findTestObject('Maya/duitnow Army/enter ref'), 'Test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.verifyElementExist(findTestObject('Maya/Third Party Fav/Verify accountTo others'), 0)

Mobile.tap(findTestObject('Maya/Login/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 30-Date'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 0)

Mobile.verifyElementText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 'Test')

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - RM 2.00'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Third Party FavConf.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer Now'), 0)

not_run: Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer scheduled'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Schedule.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer scheduled'), 'Transfer scheduled')

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 179860600M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 179860600M'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 16 Apr 2020 0819 PM'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Fav Done.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done (1)'), 0)
