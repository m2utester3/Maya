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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/61.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer'), 0)

'enter password'
Mobile.setText(findTestObject('MAYA SIT Regression SPY/UAT - transfer SET PWD'), 'pass1234', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/62.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

WebUI.delay(10)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/63.png', FailureHandling.CONTINUE_ON_FAILURE)

'horizontal swipe'
Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/64.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.18055, height * 0.41666)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/65.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - MAYBANK'), 0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), '514012029036', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/66.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.84722, height * 0.75416)

WebUI.delay(2)

'enter RM 0.02'
Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 5'), 0)

'keypad - ok'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer Select own account - OK button'), 0)

WebUI.delay(4)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'kat3rdprty', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - katalon 3rd party'), 
    0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/67.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

Mobile.tap(findTestObject('MAYA drop 2 SPY/UAT - transfer CONTINUE button'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - MAYBANK (1)'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - katalon 3rd party'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/68.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - Optional'), 
    'instant', 0)

'vertical swipe'
Mobile.swipe(490, 1440, 490, 770)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/69.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer Now'), 
    0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/70.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Approve'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/71.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer successful'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 179839600M'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 16 Apr 2020 0809 pm'), 
    0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/72.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt BACK btn'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/73.png', FailureHandling.CONTINUE_ON_FAILURE)

'horizontal swipe'
Mobile.swipe(890, 1375, 150, 1400)

WebUI.delay(5)

Mobile.tapAtPosition(width * 0.18055, height * 0.41666)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - AFFIN BANK BERHAD'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), '105151000359', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - 1051 5100 0359'), 
    0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/74.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAtPosition(width * 0.84722, height * 0.75416)

WebUI.delay(2)

'enter RM 0.02'
Mobile.tap(findTestObject('MAYA SIT v118/spy/TAC - keypad 5'), 0)

'keypad - ok'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer Select own account - OK button'), 0)

WebUI.delay(4)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'kat3rdprty', 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - katalon 3rd party'), 
    0)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.89814, height * 0.95312)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 (1)'), 'inst', 
    0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/75.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Done (1)'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Continue'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE - DONE'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/76.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer INST TRNS'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer TRNS TYPE - DONE'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer INST TRNS - CONTINUE btn'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/77.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Fund Transfer'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Instant Transfer'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Service Fee RM 0.00'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - AFFIN BANK BERHAD (1)'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - instant (1)'), 
    0)

Mobile.setText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.EditText0 - Optional (1)'), 
    'inst oth bnk', 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer Now'), 
    0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer INST OTA TEXT'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/78.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Approve'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Transfer successful'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 179839688M'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - 16 Apr 2020 0817 pm'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/79.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.TextView0 - Share Receipt'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Transfer - Instant/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/transferInterbank/80.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - transfer own SHARE Receipt BACK btn'), 0)

WebUI.delay(5)

'done'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/android.view.ViewGroup0 (2)'), 0)

not_run: Mobile.closeApplication()

