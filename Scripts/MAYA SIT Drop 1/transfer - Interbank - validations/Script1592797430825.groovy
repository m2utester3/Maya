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

Mobile.startApplication('/Users/mosaj/Desktop/apk/app-sit-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Transfer'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0'), 
    'pass1234', 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 - '), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - TO OTHERS'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Instant'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.view.ViewGroup0'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 (1)'), 
    'maybank', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - MAYBANK'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 (2)'), 
    '123412341234', 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 - 1234 1234 1234'), 
    0)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Account number entered is invalid.'), 
    0)

WebUI.delay(7)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 - 1234 1234 1234 (1)'), 
    0)

WebUI.delay(7)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Please input a valid account number.'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.ImageView0'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - MAYBANK'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 (2)'), 
    '514012029036', 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 - 5140 1202 9036'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Transfer (1)'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 5140 1202 9036'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - LIM SAN SAN'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - MAYBANK (1)'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Enter amount'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - RM'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 - 0.00'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.ImageView0 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Amount should be in between RM 0.01 to RM  999999.99 for Fund Transfer'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 9'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 9'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 9'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 9'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 9'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 9'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 9'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 9'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.ImageView0 (1)'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 (2)'), 
    'max amount', 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 - max amount'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - RM 999999.99'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Transfer Now'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Transfer failed'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Transaction limit exceeded.'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Done'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Transfer'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - TO OTHERS'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.view.ViewGroup0 (2)'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 1'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.ImageView0 (1)'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 (2)'), 
    'pay fav 2nd', 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.EditText0 - pay fav 2nd'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Transfer Now'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/android.widget.TextView0 - Done'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/transfer - instant other validations/spy/fav - trans success'), 
    0)

not_run: Mobile.closeApplication()

