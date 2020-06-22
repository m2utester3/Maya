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
Mobile.startApplication('/Users/mosaj/Desktop/apk/app-sit-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

'quick actions- Transfer'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Transfer'), 0)

not_run: Mobile.hideKeyboard()

'enter password'
Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0'), 'pass1234', 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - '), 0)

Mobile.tapAtPosition(970, 1830)

WebUI.delay(20)

'select SA acct'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Savings Account'), 0)

'keypad - ok'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.ImageView0'), 0)

'min amount validation'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer'), 
    0)

def AmtValidation = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer'), 
    0)

Mobile.verifyEqual(AmtValidation, 'Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer')

'enter RM 0.02'
Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 5'), 0)

'keypad - ok'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.ImageView0'), 0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 (1)'), 'katalon tran own acc', 0)

'enable device keypad'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - katalon tran own acc'), 0)

Mobile.tapAtPosition(970, 1830)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Today'), 0)

def TodayTrans = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Today'), 0)

Mobile.verifyEqual(TodayTrans, 'Today')

'clcik on Done for DATE'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Done'), 0)

'verify Bank Name'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Maybank'), 0)

def BankName = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Maybank'), 0)

Mobile.verifyEqual(BankName, 'Maybank')

'verify recipient reference'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - katalon tran own acc'), 0)

def RefNum = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - katalon tran own acc'), 
    0)

Mobile.verifyEqual(RefNum, 'katalon tran own acc')

'enable device keypad'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - katalon tran own acc (1)'), 0)

Mobile.tapAtPosition(970, 1830)

'pay details'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - Optional'), 0)

'enter pay details'
Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - Optional (1)'), 'pay dtl', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer Now'), 
    0)

'verify confirmation text'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Confirmation'), 0)

def ConfirmText = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Confirmation'), 
    0)

Mobile.verifyEqual(ConfirmText, 'Confirmation')

'verify savings account text'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - SAVINGS ACCOUNT (1)'), 0)

def SAacctText = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - SAVINGS ACCOUNT (1)'), 
    0)

Mobile.verifyEqual(SAacctText, 'SAVINGS ACCOUNT')

Mobile.scrollToText('Transfer from', FailureHandling.CONTINUE_ON_FAILURE)

'horizontal swipe'
Mobile.swipe(890, 1375, 150, 1400)

'select account to transfer'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 1140 1382 3409'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0 (1)'), 0)

'post transfer - result page'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Transfer failed'), 0)

def status = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Transfer failed'), 
    0)

Mobile.verifyEqual(status, 'Transfer Successful')

'verify reference id'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 179814252M'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 179814252M'), 0)

'verify date'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 14 Apr 2020 1105 pm'), 0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 14 Apr 2020 1105 pm'), 
    0)

'done'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0 (2)'), 0)

'maybank2u button'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Savings Account (2)'), 0)

'click View Transactions'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - View Transactions'), 0)

'get first row in trasaction history'
not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Katalon - MOHAMED SYAHID  - Test'), 
    0)

'drop down to select M2U history'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.ImageView0 (1)'), 0)

Mobile.scrollToText('M2U History', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Done (1)'), 0)

'first row of M2U History'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Funds Transfer Own Account'), 0)

'cross button'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.ImageView0 (2)'), 0)

'back button'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.ImageView0 (3)'), 0)

not_run: Mobile.closeApplication()

