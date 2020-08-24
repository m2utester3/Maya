
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

'Launch App'
Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\app-uat-universal-release.apk', false)


Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - CARDS'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 1795.85'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Outstanding Balance'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 -    2938'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 1795.85 (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - View Transactions'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Transactions'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Total Credit Limit'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Outstanding Balance (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Statement Balance'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Statement Date'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Payment Due Date'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Minimum Payment Amount'), 0)

Mobile.swipe(594, 1428, 400, 400)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Last Payment Amount'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Last Payment Date'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Cards'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Bills'), 0)



Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Bills (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - JOMPAY'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - JomPAY (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Biller Code'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Reference 1'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Reference 2 (Optional)'), 0)

Mobile.setText(findTestObject('Maya/Banking Cards/android.widget.EditText0 (1)'), '9639', 0)

Mobile.setText(findTestObject('Maya/Banking Cards/android.widget.EditText0 (2)'), '0816101607', 0)

Mobile.setText(findTestObject('Maya/Banking Cards/android.widget.EditText0 (3)'), 'Check', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 9639'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Enter amount'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Please input valid amount.'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Date (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 16 Jul 2020'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Confirmation (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay from (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Now (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - JomPAY reference'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Reference ID (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Date  Time (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Payment successful (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.view.View0 - JomPAY reference number'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.view.View0 - Biller account holder name'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.view.View0 - Reference ID (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.Button0 - Cancel'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Bills (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Bills (2)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (7)'), 0)

Mobile.setText(findTestObject('Maya/Banking Cards/android.widget.EditText0 (4)'), 'Maxis', 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maxis Mobile Sdn Bhd'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Account Number'), 0)

Mobile.setText(findTestObject('Maya/Banking Cards/android.widget.EditText0 (1)'), '1544054651', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Confirmation (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maxis Mobile Sdn Bhd (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 2.50'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - RM 2.50'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay from (2)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Maybank Visa Card (3)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Now (1)'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - One-Tap Authorisation'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Transaction Type'), 0)

Mobile.getText(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Pay Bills (3)'), 0)

Mobile.tap(findTestObject('Maya/Banking Cards/android.widget.TextView0 - Approve'), 0)





