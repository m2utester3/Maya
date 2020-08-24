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

Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\app-uat-universal-release.apk', false)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - More'), 7)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Loyalty'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Loyalty (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket2.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Add Cards'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Add Loyalty Card'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Add Cards'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Card name'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket3.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Card name'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Card number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Card number'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Expiry date'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Expiry date'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Card colour'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Card colour'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Description'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Description'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Card photo'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Card photo'), 0)

Mobile.setText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - Enter card name'), 'ab', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.setText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - 0000000000000'), 'wer', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.setText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - MMYY'), '01/03', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.view.ViewGroup0 (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket4.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Done'), 0)

Mobile.setText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - Optional'), 'test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket5.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Front'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Front'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket6.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Back'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Back'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Front'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.ImageView0 (5)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Back (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.ImageView0 (5)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Done (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Loyalty card name must be more than 3 characters'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket7.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Loyalty card name must be more than 3 characters'), 
    0)

Mobile.clearText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - ab'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - Enter card name'), 'Check', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

not_run: Mobile.setText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - Chk'), 'Check', 0)

not_run: driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket8.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Loyalty card number must be more than 3 characters'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket9.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Loyalty card number must be more than 3 characters'), 
    0)

Mobile.clearText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - wer'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - 0000000000000'), 'number', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Invalid expiry date'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket10.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Invalid expiry date'), 0)

Mobile.clearText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - 0103'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - MMYY'), '12/26', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket11.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Continue'), 0)

Mobile.tapAtPosition(93, 184)

Mobile.clearText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - number'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - 0000000000000'), '123456', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket13.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Continue'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket14.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Confirm'), 0)

Mobile.delay(120, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Check'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket12.png', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - View Card Photo'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - View Card Photo'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - test'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - test'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Check'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Check'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Expiry Date 1226'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Expiry Date 1226'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - 123456'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket15.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - 123456'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - 123456 (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - 123456 (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Check'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(975, 177, 1)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Edit Card'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket16.png', FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - 1226'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Loyalty Cards/android.widget.EditText0 - MMYY'), '12/29', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Confirm'), 0)

Mobile.delay(120, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Loyalty Cards/android.view.ViewGroup0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Check'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Expiry Date 1229'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Expiry Date 1229'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket17.png', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Check'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(975, 177, 1)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Remove Card'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket18.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Cancel'), 0)

not_run: Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Check'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(975, 177, 1)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Remove Card'), 0)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Confirm (1)'), 0)

Mobile.getText(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Youve successfully removed your loyalty card.'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket19.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Youve successfully removed your loyalty card.'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Loyalty\\Ticket20.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(119, 187, 1)

Mobile.tap(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Loyalty'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - More (1)'), 0)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Notifications'), 0)

not_run: Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Got It'), 0)

Mobile.getText(findTestObject('Maya/KLIA/android.widget.TextView0 - Today (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Maya/Loyalty Cards/android.widget.TextView0 - Youve transfered RM 2.00 to heys MAYBANK account ending 8863. REF 17180685548M'), 
    0)

