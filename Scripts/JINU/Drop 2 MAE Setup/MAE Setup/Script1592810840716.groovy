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

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/MAE/android.widget.TextView0 - Address line 1'), 0)

Mobile.clearText(findTestObject('Maya/MAE/android.widget.EditText0 - NO14 JALAN ST 22 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.EditText0 - Enter your address'), 0)

Mobile.setText(findTestObject('Maya/MAE/android.widget.EditText0 - Enter your address'), '32 KL City Centre Behind Menara Tower 1234567889999', 
    0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.clearText(findTestObject('Maya/MAE/android.widget.EditText0 - TAMAN SEBERANG TEMERLOH (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.EditText0 - Enter your address (1)'), 0)

Mobile.setText(findTestObject('Maya/MAE/android.widget.EditText0 - Enter your address (1)'), '243 Main Road City Gate, Royal Town ABC Gardens 123456', 
    0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.clearText(findTestObject('Maya/MAE/android.widget.EditText0 - 28000 TEMERLOH (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.EditText0 - Enter your city'), 0)

Mobile.setText(findTestObject('Maya/MAE/android.widget.EditText0 - Enter your city'), '123Kuala Lumpur, Petaling Jaya 1234, Ampang Road', 
    0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Done'), 0)

Mobile.clearText(findTestObject('Maya/MAE/android.widget.EditText0 - 28000 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.EditText0 - Enter your postcode'), 0)

Mobile.setText(findTestObject('Maya/MAE/android.widget.EditText0 - Enter your postcode'), '1234567890', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0 (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(577, 1838, 785, 1679)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0 (3)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(563, 1835, 540, 1420)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0 (5)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(568, 1868, 568, 1712)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0 (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1878, 540, 1670)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Done (1)'), 0)

Mobile.clearText(findTestObject('Maya/MAE/android.widget.EditText0 - abu and partners (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.EditText0 - Enter your employer name'), 0)

Mobile.setText(findTestObject('Maya/MAE/android.widget.EditText0 - Enter your employer name'), 'abc Company Service Enterprise Limited 123456', 
    0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0 (6)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1853, 540, 1750)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0 (7)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1876, 570, 656)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0 (8)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1845, 600, 1240)

Mobile.tapAndHold(findTestObject('Maya/MAE/android.widget.TextView0 - Done (1)'), 0, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(540, 1000, 540, 299)

Mobile.tap(findTestObject('Maya/MAE/android.widget.ImageView0 (9)'), 0)

Mobile.tap(findTestObject('Maya/MAE/android.widget.TextView0 - Continue (1)'), 0)

not_run: Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release.apk', true)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Change Wallet Account'), 0)

Mobile.getText(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Check MAE out to keep you ontrack with your daily finances.'), 
    0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Activate Now'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Next'), 0)

Mobile.setText(findTestObject('Maya/MAE Premier/android.widget.EditText0 - Enter email address'), 'th@gmail.com', 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.view.ViewGroup0 (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.view.ViewGroup0 (2)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Continue'), 0)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release.apk', true)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Next (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Next (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Next (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Maybank2u'), 0)

Mobile.getText(findTestObject('Maya/MAE Premier/android.widget.TextView0 - No account Get started with MAE'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - No account Get started with MAE'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Next (2)'), 0)

Mobile.setText(findTestObject('Maya/MAE Premier/android.widget.EditText0 - Enter your full name'), 'Jinu Thomas', 0)

Mobile.setText(findTestObject('Maya/MAE Premier/android.widget.EditText0'), '1164377717', 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.view.ViewGroup0 (3)'), 0)

Mobile.getText(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Passport'), 0)

Mobile.setText(findTestObject('Maya/MAE Premier/android.widget.EditText0 - Enter passport number'), 'T5808376', 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Enter date of birth'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Continue (1)'), 0)

Mobile.setText(findTestObject('Maya/MAE Premier/android.widget.EditText0 - Enter your address'), 'DFGGGGGGGGGGGGGGGGGGGGG', 
    0)

Mobile.setText(findTestObject('Maya/MAE Premier/android.widget.EditText0 - Enter your address (1)'), 'WERQWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW', 
    0)

Mobile.setText(findTestObject('Maya/MAE Premier/android.widget.EditText0 - Enter your city'), 'HHJKKKKKKKKKK', 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.EditText0 - Enter your postcode'), 0)

Mobile.setText(findTestObject('Maya/MAE Premier/android.widget.EditText0 - Enter your postcode (1)'), '675777777', 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Continue (1)'), 0)

Mobile.setText(findTestObject('Maya/MAE Premier/android.widget.EditText0 - Enter email address (1)'), 'TH@gmail.com', 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Continue (2)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.ImageView0 (6)'), 0)

Mobile.tap(findTestObject('Maya/MAE Premier/android.widget.TextView0 - Continue (2)'), 0)

Mobile.closeApplication()

