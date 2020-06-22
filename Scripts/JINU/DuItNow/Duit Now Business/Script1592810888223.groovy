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

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.tap(findTestObject('Maya/NRICduitnow/DUITNOW'), 0)

Mobile.tap(findTestObject('Maya/NRICduitnow/duitnow pic'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/arrow duitnow'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(592, 1887, 629, 1390)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow BusinessReg/done business reg'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow BusinessReg/Tap Business Reg'), 0)

Mobile.setText(findTestObject('Maya/duitnow BusinessReg/Enter business reg'), '123456789012', 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\NRIC.png', FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow BusinessReg/Account Verification'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0 (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\NRICAmount.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow BusinessReg/Account Verification'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 'Test', 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Enter ref.png', FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Continue'), 0)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (5)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (6)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Yes Its Mine'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (7)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0 - Enter your ID Number'), 0)

not_run: Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 - Enter your ID Number'), '730903095005', 
    0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(30, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - RM 2.00 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Today (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow BusinessReg/Account Verification'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Test'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\ConfDuitNow.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Transfer Now (1)'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/Approve-Transfer-now'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\TransferSuccess.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - Transfer successful'), 'Transfer successful')

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - 179857250M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - 16 Apr 2020 0546 pm'), 0)

Mobile.tap(findTestObject('Maya/NRICduitnow/android.widget.TextView0 - Add to Favourites'), 0)

not_run: Mobile.tap(findTestObject('Maya/NRICduitnow/android.widget.EditText0 - XXXXX XXXXX'), 0)

not_run: Mobile.clearText(findTestObject('Maya/NRICduitnow/android.widget.EditText0 - XXXXX XXXXX'), 0)

not_run: Mobile.setText(findTestObject('Maya/NRICduitnow/Enter Fav Name'), 'NRC 3', 0)

Mobile.tap(findTestObject('Maya/NRICduitnow/second click add to fav'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Add Fav.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.closeApplication()

