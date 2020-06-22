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

Mobile.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitnow/Click duit now first'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\DUITNow.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/duitnow symbol'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/Enter key'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.verifyElementExist(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - Mobile number cannot be less than 10'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow Mobile/Back enter'), 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/Back enter'), 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/Back enter'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitnow Mobile/Enter key'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - ID cannot be empty Please enter an ID'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 7'), 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/Enter key'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - The DuitNow ID entered is not valid.'), 
    0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/Contact Icon'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow Mobile/Home contact'), 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/Enter key'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - The DuitNow ID entered is not valid.'), 
    0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/Back screen for mobile'), 0)

Mobile.tap(findTestObject('Maya/duitnow/duitnow symbol'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 1'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy- 3'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy- 6'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy - 4'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy- 5'), 0)

Mobile.tap(findTestObject('Maya/duitnow BusinessReg/Enter-Mobile'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Mobile_number.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitnow Mobile/Mobile number verify'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\NRICAmount.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow Mobile/Mobile number verify'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 'NricMob', 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Enter ref.png', FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Today'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow Mobile/Mobile number verify'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 30-Date'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - RM 2.00'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Confirmation.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer Now'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/Approve-Transfer-now'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer scheduled'), 0)

Mobile.verifyElementText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer scheduled'), 'Transfer scheduled')

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 179860600M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 179860600M'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Mobile.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done (1)'), 0)
Mobile.closeApplication()
