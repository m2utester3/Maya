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

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Transfer'), 
    0)

'enter password'
Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0'), 'pass1234', 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - '), 0)

Mobile.tapAtPosition(970, 1830)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - TO OTHERS'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - New Transfer'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - New Transfer'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Instant'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - DuitNow'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Favourites'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.view.ViewGroup0'), 0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.view.ViewGroup0'), 
    'INTAN', 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - INTAN'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - DUITNOW (1)'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Instant'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - DuitNow'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Favourites'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Add Favourites to List'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/fav list disc'), 
    0)

'back button'
WebUI.delay(3)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/back button from duitnow'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/android.widget.TextView0 - Transfer'), 
    0)

WebUI.delay(30)

'select SA acct'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Savings Account'), 0)

'enter RM 0.02'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/key pad - 1 from own acc'), 
    0)

'enter RM 0.02'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/key pad - 0 from own acc'), 
    0)

'enter RM 0.02'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/key pad - 1 from own acc'), 
    0)

'keypad - ok'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/key pad -ok from own acct'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 (1)'), 'katalon tran own acc', 0)

'enable device keypad'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - katalon tran own acc'), 0)

Mobile.tapAtPosition(970, 1830)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/future date selection'), 
    0)

'clcik on Done for DATE'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Done'), 0)

'pay details'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - Optional'), 0)

'enter pay details'
Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.EditText0 - Optional (1)'), 'future', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('Transfer from', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(890, 1375, 150, 1400)

'select account to transfer'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 1140 1382 3409'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0 (1)'), 0)

'post transfer - result page'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/trans scheduled'), 
    0)

def status = Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/future date and other validations/spy - future dated and others/trans scheduled'), 
    0)

Mobile.verifyEqual(status, 'Transfer scheduled!')

'verify reference id'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 179814252M'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - 179814252M'), 0)

'share receipt'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0 (2)'), 0)

