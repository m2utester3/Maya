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

not_run: Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (6).apk', false)

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

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Transfer'), 0)

//Mobile.tap(findTestObject('Maya/Third Party CA account/android.view.ViewGroup0'), 0)
Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - TO OTHERS'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Instant'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - MAYBANK'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/Third Party CA account/android.widget.EditText0'), '114011792952', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/login again/Spy- 2'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

Mobile.tap(findTestObject('Maya/login again/Spy-0'), 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/eNTER-AMOUNT'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.ImageView0 (1)'), 0)

/*not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.ImageView0 (2)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.ImageView0 (3)'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party CA account/Arrow-Secure2u'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party CA account/Confirm Secure2u'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/android.widget.TextView0 - Yes Its Mine'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party CA account/Enter ID'), 0)

Mobile.setText(findTestObject('Maya/Third Party CA account/Enter ID'), 'E5688501ASGP', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Third Party CA account/Device-Name-Redmi'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/successful-Secure-2u-done'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/Tranfer-Now-Button'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/Approve-Transfer-now'), 0)

Mobile.tap(findTestObject('Maya/Third Party CA account/Done-Transfer-Successful'), 0)*/
Mobile.tap(findTestObject('Maya/duitnow Army/enter ref'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Please enter a recipient reference.'), 
    0)

Mobile.setText(findTestObject('Maya/duitnow Army/enter ref'), 'Test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 19'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 0)

Mobile.verifyElementText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 'Test')

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 19 Apr 2020'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - RM 2.00'), 0)

not_run: Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0109030162'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer Now'), 0)

not_run: Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer scheduled'), 0)

not_run: Mobile.tap(findTestObject('Maya/Third Party CA account/Approve-Transfer-now'), 0)

not_run: Mobile.verifyElementAttributeValue(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - 17 Apr 2020 0539 PM'), 
    '', '', 0)

Mobile.verifyElementExist(findTestObject('Maya/Third Party Fav/android.widget.TextView0 - Transfer failed'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav/Failed Snap', FailureHandling.STOP_ON_FAILURE)

