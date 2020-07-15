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

'quick actions- Transfer'
Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Transfer'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/0.png', FailureHandling.CONTINUE_ON_FAILURE)

'quick actions- Transfer'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Transfer'), 0)

not_run: Mobile.hideKeyboard()

'enter password'
Mobile.setText(findTestObject('MAYA SIT Regression SPY/UAT - transfer SET PWD'), 'pass1234', 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

'select SA acct'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer Select own account - Name'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/2.png', FailureHandling.CONTINUE_ON_FAILURE)

'keypad - ok'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer Select own account - OK button'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/3.png', FailureHandling.CONTINUE_ON_FAILURE)

'horizontal swipe'
Mobile.swipe(500, 700, 500, 500)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/4.png', FailureHandling.CONTINUE_ON_FAILURE)

def AmtValidation = Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - transfer Select own account - error msg'), 
    0)

Mobile.verifyEqual(AmtValidation, 'Amount should be in between RM 0.01 to \nRM  999,999.99 for Fund Transfer.')

'enter RM 0.02'
Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 5'), 0)

'keypad - ok'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer Select own account - OK button'), 0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 (1)'), 'katalon tran', 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.pressBack()

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/UAT - transfer CONTINUE button'), 0)

WebUI.delay(2)

def TodayTrans = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Today'), 0)

Mobile.verifyEqual(TodayTrans, 'Today')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/7.png', FailureHandling.CONTINUE_ON_FAILURE)

def BankName = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Maybank'), 0)

Mobile.verifyEqual(BankName, 'Maybank')

'pay details'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - Optional'), 0)

'enter pay details'
Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - Optional (1)'), 'pay dtl', 0)

Mobile.hideKeyboard()

'verify confirmation text'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Confirmation'), 0)

def ConfirmText = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Confirmation'), 
    0)

Mobile.verifyEqual(ConfirmText, 'Confirmation')

WebUI.delay(3)

'horizontal swipe'
Mobile.swipe(500, 1600, 500, 1200)

WebUI.delay(3)

Mobile.scrollToText('Transfer from', FailureHandling.CONTINUE_ON_FAILURE)

'horizontal swipe'
Mobile.swipe(890, 1375, 150, 1400)

'select account to transfer'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 1140 1382 3409'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer Now'), 
    0)

'post transfer - result page'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Transfer failed'), 0)

def status = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Transfer failed'), 
    0)

Mobile.verifyEqual(status, 'Transfer successful')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/9.png', FailureHandling.CONTINUE_ON_FAILURE)

'verify reference id'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 179814252M'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 179814252M'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt BACK btn'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/11.png', FailureHandling.CONTINUE_ON_FAILURE)

'done'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0 (2)'), 0)

'maybank2u button'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Savings Account (2)'), 0)

'click View Transactions'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - View Transactions'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/13.png', FailureHandling.CONTINUE_ON_FAILURE)

'drop down to select M2U history'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.ImageView0 (1)'), 0)

Mobile.scrollToText('M2U History', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/14.png', FailureHandling.CONTINUE_ON_FAILURE)

'first row of M2U History'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Funds Transfer Own Account'), 
    0)

'get first row in trasaction history'
Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Katalon - MOHAMED SYAHID  - Test'), 
    0)

'cross button'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.ImageView0 (2)'), 0)

'back button'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.ImageView0 (3)'), 0)

not_run: Mobile.closeApplication()

