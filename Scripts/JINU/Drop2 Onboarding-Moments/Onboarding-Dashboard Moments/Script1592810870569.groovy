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

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(598, 502, 40, 200)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Hello Test your Wallet  Y'), 
    0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(598, 502, 40, 200)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen4.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Scan  Pay (QRPay)  Not setup'), 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(598, 502, 40, 200)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen6.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - User has MAE account  Y'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(598, 502, 40, 200)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(598, 502, 40, 200)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Test'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Test'), 0)

not_run: Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Wallet'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Wallet'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 9 (1)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 8 (1)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 3 (1)'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Wallet (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Wallet (1)'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - View Transactions'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - View Transactions'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - View Transactions'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0 (2)'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Pay Bills'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Pay Bills'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Reload'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Reload'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Pay Cards'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Pay Cards'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Split Bill'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Split Bill'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Send  Request'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Scan  Pay'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Scan  Pay'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Pay Bills'), 0)

Mobile.setText(findTestObject('Maya/Onboarding Moments/android.widget.EditText0 (1)'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Pay Bills (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen45.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Pay Bills (1)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Reload'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Reload (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Reload (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Split Bill'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Split Bill (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Split Bill (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - SendMoney'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - SendMoney'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - RequestMoney'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - RequestMoney'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Scan  Pay (1)'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Scan  Pay (2)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Scan  Pay (2)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Wallet (2)'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Transfer'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Transfer'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Maybank2u'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - ACCOUNTS'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - ACCOUNTS'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - CARDS'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - CARDS'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - CARDS'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - FIXED DEPOSITS'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - FIXED DEPOSITS'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - FIXED DEPOSITS'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - LOANS'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - LOANS'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - INVESTMENTS'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - INVESTMENTS'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen25.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Total Investments'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Total Investments'), 0)

not_run: Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Expenses (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Expenses'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Expenses'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen27.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Add Now'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Set Category'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Entertainment'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Art  craft store'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - -RM  0.00'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 2 (2)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - 3 (2)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0 (7)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Add Expense'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Latest'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Latest'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen28.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Categories'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Categories'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Merchants'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Merchants'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Yes'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - More'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Loyalty'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Loyalty (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Loyalty (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen30.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(97, 175, 1)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Food'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen31.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - DISCOVER'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - DISCOVER'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(97, 175, 1)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Promotions'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen32.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Promotions (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Promotions (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(97, 175, 1)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Wallet (3)'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Wallet (4)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(97, 175, 1)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Tabung'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen34.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - TABUNG (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - TABUNG (1)'), 0)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - BOOSTERS'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - BOOSTERS'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(97, 175, 1)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Movie Tickets'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen35.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Movie Tickets (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Movie Tickets (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(97, 175, 1)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Flight Tickets'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen37.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Flight Tickets (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Flight Tickets (1)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.ImageView0 (14)'), 0)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Bus Tickets'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen39.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Bus Tickets (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Bus Tickets (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(97, 175, 1)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - ERL Tickets'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen40.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(97, 175, 1)

Mobile.tap(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Home'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(833, 1354, 100, 700)

Mobile.swipe(833, 1354, 100, 700)

Mobile.swipe(833, 1354, 100, 700)

Mobile.swipe(833, 1354, 100, 700)

Mobile.getText(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Top Reads'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Onboarding Moments/android.widget.TextView0 - Top Reads'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Onboarding\\Screen44.png', FailureHandling.CONTINUE_ON_FAILURE)

