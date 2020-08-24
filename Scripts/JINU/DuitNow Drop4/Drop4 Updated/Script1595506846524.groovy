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

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot1', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('duitnow/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)


Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(627, 376, 2)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHoldAtPosition(451, 727, 2)


Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Mobile Number'), 0)


Mobile.tap(findTestObject('duitnow/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer Off Us'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer on Us'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 3676FED98C'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Enter amount'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 3676FED98C'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 012 3743 890'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Mobile Number'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.setText(findTestObject('Maya/drop4 CR/android.widget.EditText0'), 'test', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue (1)'), 0)

Mobile.setText(findTestObject('Maya/drop4 CR/android.widget.EditText0 - Optional'), 'testestesetesetesetesetestset', 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - test'), 0)

Mobile.setText(findTestObject('Maya/drop4 CR/android.widget.EditText0 - test'), 'testestesetesetesetsetsetste', 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Transfer Now'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Date  time'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 17180225875M'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - 23 Jul 2020 850 PM'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - DuitNow'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - Successful'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - Reference ID'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - 17180225875M'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - 23 Jul 2020 850 PM'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - Beneficiary name'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - 3676FED98C'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - DuitNow ID type'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - 3676FED98C'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - DuitNow ID number'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - 012 3743 890'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - Recipient reference'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - testestesetese'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - Amount'), 0)

Mobile.getText(findTestObject('Maya/drop4 CR/android.view.View0 - RM 2.00'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.Button0 - Cancel'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/drop4 CR/android.widget.TextView0 - Done'), 0)


not_run: Mobile.closeApplication()

