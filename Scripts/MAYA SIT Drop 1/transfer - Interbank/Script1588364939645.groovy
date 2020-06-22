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

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer'), 0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0'), 'pass1234', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - '), 0)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - TO OTHERS'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Instant'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - MAYBANK'), 0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), '514012029036', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.84722, height * 0.75416)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.ImageView0'), 0)

WebUI.delay(4)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'kat3rdprty', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - katalon 3rd party'), 
    0)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - MAYBANK (1)'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - katalon 3rd party'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - Optional'), 
    'instant', 0)

'vertical swipe'
not_run: Mobile.swipe(width * 0.45370, height * 0.75, width * 0.45370, height * 0.40104)

'vertical swipe'
Mobile.swipe(490, 1440, 490, 770)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer Now'), 
    0)

WebUI.delay(10)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Approve'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer successful'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 179839600M'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 16 Apr 2020 0809 pm'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Share Receipt'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - TO OTHERS'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Instant'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - AFFIN BANK BERHAD'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), '105151000359', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - 1051 5100 0359'), 
    0)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.84722, height * 0.75416)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.ImageView0'), 0)

WebUI.delay(4)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'kat3rdprty', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - katalon 3rd party'), 
    0)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'inst', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.ImageView0 (2)'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Fund Transfer'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Instant Transfer'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Service Fee RM 0.00'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - AFFIN BANK BERHAD (1)'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - instant (1)'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - Optional (1)'), 
    'inst oth bnk', 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer Now'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Secure2u authorisation'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Approve'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer successful'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 179839688M'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 16 Apr 2020 0817 pm'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Share Receipt'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Done'), 0)

not_run: Mobile.closeApplication()

