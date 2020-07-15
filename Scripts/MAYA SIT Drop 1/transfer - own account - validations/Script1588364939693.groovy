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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Transfer'), 
    0)

'enter password'
Mobile.setText(findTestObject('MAYA SIT Regression SPY/UAT - transfer SET PWD'), 'pass1234', 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - TO OTHERS'), 
    0)

WebUI.delay(4)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/23.png', FailureHandling.CONTINUE_ON_FAILURE)

'horizontal swipe'
Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(4)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/24.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - New Transfer'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Instant'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - DuitNow'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Favourites'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.view.ViewGroup0'), 
    0)

not_run: Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.view.ViewGroup0'), 
    'INTAN', 0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - INTAN'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - DUITNOW (1)'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Instant'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - DuitNow'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Favourites'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Add Favourites to List'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/fav list disc'), 
    0)

'back button'
not_run: WebUI.delay(3)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/back button from duitnow'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Transfer'), 
    0)

not_run: WebUI.delay(30)

'select SA acct'
Mobile.tapAtPosition(900, 1700)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/25.png', FailureHandling.CONTINUE_ON_FAILURE)

'select SA acct'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Savings Account'), 0)

'enter RM 0.02'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/key pad - 1 from own acc'), 
    0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/26.png', FailureHandling.CONTINUE_ON_FAILURE)

'keypad - ok'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer Select own account - OK button'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/27.png', FailureHandling.CONTINUE_ON_FAILURE)

'enter RM 0.02'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/key pad - 0 from own acc'), 
    0)

'enter RM 0.02'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/key pad - 1 from own acc'), 
    0)

'keypad - ok'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/key pad -ok from own acct'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 (1)'), 'katalon tran own acc', 0)

'enable device keypad'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - katalon tran own acc'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/28.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.tapAtPosition(970, 1830)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/UAT - transfer CONTINUE button'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/30.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Today'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/31.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/future date selection'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/39.png', FailureHandling.CONTINUE_ON_FAILURE)

'clcik on Done for DATE'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Done'), 0)

'pay details'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - Optional'), 0)

'enter pay details'
Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - Optional (1)'), 'future', 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/32.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(500, 1500, 500, 1200)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/33.png', FailureHandling.CONTINUE_ON_FAILURE)

'select account to transfer'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 1140 1382 3409'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer Now'), 
    0)

not_run: s2u = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Secure2u authorisation'), 
    0)

not_run: Mobile.verifyEqual(s2u, 'One-Tap Authorisation')

not_run: Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/buyReload/34.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: approve = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)

not_run: Mobile.verifyEqual(approve, 'Approve')

not_run: Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)

not_run: WebUI.delay(5)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0 (1)'), 0)

'post transfer - result page'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/trans scheduled'), 
    0)

def status = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/trans scheduled'), 
    0)

Mobile.verifyEqual(status, 'Transfer scheduled')

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/35.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 179814252M'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/36.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt BACK btn'), 0)

WebUI.delay(5)

'done'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0 (2)'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferOwnacc/37.png', FailureHandling.CONTINUE_ON_FAILURE)

