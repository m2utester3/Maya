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

'app launch'
Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - More'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/40.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - More'), 0)

wallet = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Wallet'), 0)

Mobile.verifyEqual(wallet, 'Wallet')

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Wallet'), 0)

otpPage = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Enter your 6-digit PIN'), 
    0)

Mobile.verifyEqual(otpPage, 'Enter your 6-digit PIN')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/41.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Wallet (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Savings Account'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/42.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request (1)'), 0)

sub1 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - PENDING'), 0)

Mobile.verifyEqual(sub1, 'PENDING')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/43.png', FailureHandling.CONTINUE_ON_FAILURE)

sub2 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - PAST'), 0)

Mobile.verifyEqual(sub2, 'PAST')

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Id like to'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - SendMoney'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RequestMoney'), 0)

req = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Requests'), 0)

Mobile.verifyEqual(req, 'Requests')

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Need to ask for money'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Get your dues paid but ina less awkward wayTrack and send reminders all here.'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RequestMoney'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RequestMoney'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/44.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

Mobile.hideKeyboard()

WebUI.delay(3)

Mobile.tapAtPosition(width * 0.51574, height * 0.31145)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6011 1286 7164'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6011 1286 7164'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6012 2916 821'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6012 2916 821'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6019 3576 638'), 0)

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/45.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Aaron  Maybank'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Aaron  Maybank'), 0)

cont = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.verifyEqual(cont, '1/1 contacts selected.')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/46.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Add'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 60193576638'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Aaron  Maybank (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Enter amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.EditText0 - 0.00'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/47.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.ImageView0'), 0)

not_run: cont1 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer'), 
    0)

not_run: Mobile.verifyEqual(cont1, 'Amount should be in between RM 0.01 to \nRM  999,999.99 for Fund Transfer')

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/48.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/49.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/spy UAT/UAT - Send Money OK btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.ImageView0'), 0)

cont2 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyEqual(cont2, 'Confirmation')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/50.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Youve requestedmoney from'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Aaron  Maybank (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 60193576638 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RM 999999.99'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Notes'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.EditText0 - Optional'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.EditText0 - Optional'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.EditText0 - Optional (1)'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.EditText0 - Optional (2)'), 'max limit', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/51.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send Request'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Request  successful'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/52.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Date  Time'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 01 May 2020 0914 pm'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Name'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Aaron  Maybank (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Contact'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6019 3576 638 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RM 999999.99 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Wallet (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/53.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - PAST'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - PAST'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RequestMoney'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/54.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RequestMoney'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 01 contacts selected.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/55.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6011 1286 7164'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6011 1286 7164'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6012 2916 821'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/56.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 01 contacts selected.'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6012 2916 821'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6012 2916 821'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/57.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Add'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.ImageView0 (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - PAST (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Id like to'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RequestMoney'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RequestMoney'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 01 contacts selected.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/58.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6010 4357 378'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6010 4357 378'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6011 1286 7164'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6011 1286 7164'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Add'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/59.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Enter amount'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Wallet (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Home'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Home'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Wallet (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/60.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Wallet (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Wallet (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/61.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - PENDING'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - PAST'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Id like to'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RequestMoney'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RequestMoney'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/62.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6011 1286 7164'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6011 1286 7164'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Add'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/63.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send  Request (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/64.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 60193576638'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Aaron  Maybank (1)'), 0)

cont4 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Enter amount'), 0)

Mobile.verifyEqual(cont4, 'Enter amount')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/65.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.EditText0 - 0.00'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 9'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/66.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.ImageView0'), 0)

cont5 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyEqual(cont5, 'Confirmation')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/67.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Youve requestedmoney from'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Aaron  Maybank (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 60193576638 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RM 999999.99'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Notes'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.EditText0 - Optional'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.EditText0 - Optional'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.EditText0 - Optional (1)'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.EditText0 - Optional (2)'), 'any amt', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/68.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send Request'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Send Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Request  successful'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/69.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Date  Time'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 01 May 2020 0914 pm'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Name'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Aaron  Maybank (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Contact'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - 6019 3576 638 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - RM 999999.99 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney/android.widget.TextView0 - Done'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/70.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

