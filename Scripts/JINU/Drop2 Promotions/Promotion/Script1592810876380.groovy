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

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - More (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot1', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - More (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot2', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Promotions (1)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Featured'), 0)

Mobile.verifyElementExist(findTestObject('Maya/Promotions/android.widget.TextView0 - Featured'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot3', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (8)'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Maya/Promotions/android.widget.EditText0 - Type to search (1)'), 'Test', 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot4', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (9)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Sort  Filter'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Sort by (1)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Popularity (1)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Latest (1)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Oldest (1)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Filter by'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot5', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Categories'), 0)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (10)'), 0)

not_run: Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.swipe(592, 1887, 550, 1754)

not_run: Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (11)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Apply Filter (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot6', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (9)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (10)'), 0)

WebUI.delay(5)

Mobile.swipe(592, 1887, 550, 1754)

WebUI.delay(5)

Mobile.swipe(592, 1887, 550, 1754)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Apply Filter (1)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (9)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Clear (1)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (9)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot8', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (12)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (20)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - View More'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(74, 150, 1)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(975, 177, 1)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Not Interested in This (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(975, 177, 1)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Share (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.Button0 - Cancel (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(88, 172, 1)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot13', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(88, 172, 1)

Mobile.tap(findTestObject('Maya/KLIA/android.widget.TextView0 - Home'), 0)

Mobile.swipe(833, 1354, 100, 700)

Mobile.swipe(833, 1354, 100, 700)

Mobile.swipe(833, 1354, 100, 700)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Deals For You'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - View All'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - View All'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Latest (2)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(833, 1354, 100, 700)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (21)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Promo ends in (1)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Redeem now (1)'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(592, 1887, 550, 500)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Terms  Conditions'), 0)

Mobile.tapAndHoldAtPosition(975, 177, 1)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Share'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot9', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.Button0 - Cancel'), 0)

Mobile.tapAndHoldAtPosition(975, 177, 1)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Not Interested in This'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot19', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

Mobile.swipe(592, 1887, 550, 500)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Terms  Conditions'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot11', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (15)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Redeem now (1)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Scan  Pay'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot12', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (18)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Save and Use Later'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Saved'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Saved (1)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Save and Use Later (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Promotions\\Screenshot13', FailureHandling.STOP_ON_FAILURE)

