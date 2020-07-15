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

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Maybank2u'), 0)

def enterOTP = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Enter your 6-digit PIN'), 
    0)

Mobile.verifyEqual(enterOTP, 'Enter your 6-digit PIN')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - MAE'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - MAE'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Account'), 0)

MAEacct = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - MAE (1)'), 0)

Mobile.verifyEqual(MAEacct, 'MAE')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - 5147 1200 1309'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Available Balance'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - RM 1021.70'), 0)

Mobile.swipe(900, 1600, 200, 1600)

WebUI.delay(5)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - PENDING'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - SendMoney'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - SendMoney'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendMoney/spy UAT/UAT - Send Money SET PWD'), 'pass1234', 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/spy UAT/UAT - Send Money SET PWD'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 01 contacts selected.'), 0)

not_run: Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - sel contact opt 2'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/5.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - refresh button opt 2'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (3)'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - search icon'), 0)

not_run: WebUI.delay(2)

WebUI.delay(10)

not_run: Mobile.setText(findTestObject('MAYA Drop 2/SendMoney/spy UAT/UAT - Send Money Search SET TEXT'), 'fadhli', 0)

WebUI.delay(2)

Mobile.hideKeyboard()

WebUI.delay(2)

not_run: Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - sel contact opt 2'), 0)

Mobile.tapAtPosition(width * 0.51574, height * 0.31145)

Mobile.tapAtPosition(width * 0.51574, height * 0.31145)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 11 contacts selected.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Add'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send  Request (4)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 60127845015'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Fadhli  Maybank'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Enter amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.EditText0 - 0.00'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.ImageView0 (3)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer'), 
    0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - kp 1'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - kp 2'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - kp 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/spy UAT/UAT - Send Money OK btn'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

msg17 = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Confirmation'), 0)

Mobile.verifyEqual(msg17, 'Confirmation')

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Fadhli Maybank'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 60127845015 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM 1.47'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Date'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Notes'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - ANY amt set text'), 0)

Mobile.setText(findTestObject('MAYA drop 2 SPY/send money - ANY amt set text'), 'ANY amt', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Note'), 0)

WebUI.delay(2)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 1000)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send from'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Savings Account'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM 0.00'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send Now'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Send Now'), 0)

WebUI.delay(3)

not_run: Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - s2u approval msg'), 0)

not_run: Mobile.getText(findTestObject('MAYA drop 2 SPY/send money - s2u APPROVE'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - s2u APPROVE'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/send money - s2u approve - Trx Success'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 180052472M'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Date  Time'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 2 May 2020 0140 AM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Name'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Fadhli  Maybank (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Contact'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - 6012 7845 015 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - Amount'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SendMoney/android.widget.TextView0 - RM 1.47 (1)'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/send money - s2u approve - SHARE RECEIPT'), 0)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - s2u approve - SHARE RECEIPT'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/11.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - s2u approve - back after share Rec'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/send money - s2u approve - DONE'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/send money - s2u approve - DONE'), 0)

not_run: Mobile.closeApplication()

