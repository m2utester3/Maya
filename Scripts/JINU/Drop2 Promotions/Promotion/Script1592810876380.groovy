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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (17).apk', false)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Promotions'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Promotions'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (1)'), 0)

Mobile.setText(findTestObject('Maya/Promotions/android.widget.EditText0 - Type to search'), 'abc', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - New Search'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Cancel'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (2)'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Sort by'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Popularity'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Latest'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Oldest'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Clear'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (3)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Promotions/Tap categories'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Close'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Apply Filter'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - New Search'), 0)

Mobile.setText(findTestObject('Maya/Promotions/android.widget.EditText0 - Type to search'), 'Spencer', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Apply Filter'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Clear'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.view.ViewGroup0'), 0)

Mobile.getText(findTestObject('Maya/Promotions/android.widget.TextView0 - Promo ends in'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (6)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.ImageView0 (7)'), 0)

Mobile.tap(findTestObject('Maya/Promotions/android.widget.TextView0 - Redeem now'), 0)

not_run: Mobile.closeApplication()

