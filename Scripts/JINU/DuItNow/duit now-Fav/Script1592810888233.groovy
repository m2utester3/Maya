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

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/duitNowFav/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - DUITNOW'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Duitnow_Fav_Tran.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/Third Party Fav/Image Search'), 0)

Mobile.checkElement(findTestObject('Maya/Third Party Fav/android.widget.EditText0 - Type name Fav'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(461, 1861)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(288, 1731)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(400, 1727)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

driver.pressKeyCode(AndroidKeyCode.ENTER)

not_run: Mobile.swipe(520, 900, 520, 400)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - FERZANA'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/Verify Fav Contact'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 0)
Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Amt_Tran.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)


driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/Verify Fav Contact'), 0)

not_run: Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Please enter a recipient reference.'), 
    0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (1)'), 'Test', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Ref_Tran.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/Verify Fav Contact'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 30-Date'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 0)

Mobile.verifyElementText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 'Test')

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - RM 2.00'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0109030162'), 0)

Mobile.verifyElementText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0109030162'), '010 9030 162')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Duitnow_Fav_Tran_Conf.png', FailureHandling.CONTINUE_ON_FAILURE)


Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer Now'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer scheduled'), 0)

Mobile.verifyElementText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer scheduled'), 'Transfer scheduled')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)


Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 179860600M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 179860600M'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party Fav\\Duitnow_Fav.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/Tap on view Transaction'), 0)


Mobile.closeApplication()

