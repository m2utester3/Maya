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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (7).apk', false)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.ImageView0'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Transfer'), 0)

//Mobile.tap(findTestObject('Maya/Third Party CA account/android.view.ViewGroup0'), 0)
Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - TO OTHERS'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.ImageView0 (2)'), 0)

Mobile.setText(findTestObject('Maya/duitNowFav/android.widget.EditText0 (1)'), 'Lily', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - Lily'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - Lily'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.ImageView0 (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - Please enter a recipient reference.'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0 (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0 (1)'), 0)

Mobile.setText(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0 (1)'), 'Fav First', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

not_run: Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.ImageView0'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Fav_Tac Msg.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0 (1)'), 0)

not_run: Mobile.setText(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0 (1)'), 'TRS', 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - RM 3.00'), 0)

not_run: Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/Enter button'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Fav_First Time.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - Transfer Now'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - Transfer successful'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/transfer done'), 0)

