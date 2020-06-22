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

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Savings Account'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 1140 1382 3409'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 16034.12'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - MAE'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 5147 1200 1309'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 1022.77'), 0)

Mobile.swipe(490, 1440, 490, 770)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Savings Account-i'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - 1640 1781 0625'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 1744294.77'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Contact Bank'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (1)'), 0)

Mobile.swipe(490, 770, 490, 1440)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Savings Account'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Transfer'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Pay Bills'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Reload'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Pay Cards'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Split Bill'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Send  Request'), 
    0)

Mobile.swipe(490, 1440, 490, 770)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 16034.12 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 0.00'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 0.00 (1)'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - RM 0.00 (2)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - View Transactions'), 
    0)

'X'
Mobile.tap(findTestObject('MAYA SIT Regression SPY/FD cross button from history'), 0)

'back'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/3 dots on account page'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Copy Account Number'), 
    0)

'X'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (1)'), 0)

'back'
Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (6)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.ImageView0 (7)'), 0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/3 dots on account page'), 0)

Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Set as Wallet'), 
    0)

Mobile.tap(findTestObject('MAYA SIT v127 - trans own acct/Banking - CASA/android.widget.TextView0 - Set as Wallet'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/FD back button after wallet change'), 0)

not_run: Mobile.closeApplication()

