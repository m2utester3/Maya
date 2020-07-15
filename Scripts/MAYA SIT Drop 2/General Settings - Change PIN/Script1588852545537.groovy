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

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Quick Actions'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - More'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Hello'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Login'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 (1)'), 'pass1234', 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - '), 0)

WebUI.delay(1)

Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Maybank2u'), 0)

WebUI.delay(2)

Mobile.swipe(500, 1600, 500, 1300)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Unlink Maybank2u Account'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Unlink Maybank2u Account'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Unlink Maybank2u Account (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Are you sure you want to unlink your Maybank2u account from the MAE app'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Cancel (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Confirm (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

WebUI.delay(2)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Security'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Security'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Security (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Change PIN'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Change PIN'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Enter your current PIN'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Create your new 6-digit PIN'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - This 6-digit PIN will be used each time you access your Wallet or as backup to your biometric login.'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - Change PIN - create OK btn'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Confirm your new 6-digit PIN'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/5.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - Change PIN - create OK btn'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - PIN must consist of at least 6 digits.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/6.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - Change PIN - create OK btn'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - PIN must match the 6-digit PIN created.'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/7.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - Change PIN - create OK btn'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - PIN successfully updated.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/8.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Security (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Change PIN'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Change PIN'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Enter your current PIN'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Create your new 6-digit PIN'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - This 6-digit PIN will be used each time you access your Wallet or as backup to your biometric login.'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - Change PIN - create OK btn'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Confirm your new 6-digit PIN'), 
    0)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - Change PIN - create OK btn'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - PIN successfully updated.'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/9.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0 (5)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Hello'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Logout'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Logout'), 0)

WebUI.delay(7)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - More'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Hello'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Login'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Login'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Enter your 6-digit PIN'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 2 (1)'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/10.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 5 (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/11.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Hello'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Logout'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Security (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Security (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Enter your password'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 (1)'), 'pass1234', 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Security (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Manage Devices'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Manage Devices'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Manage Devices (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - You can only have a maximum of 3 registered devices'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Samsung Galaxy S7'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Registered on 04 May 2020'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Current'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - SM-G930F'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Registered on 16 Apr 2020'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Remove Device'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Are you sure want to remove SM-G930F'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Cancel (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Proceed'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0 (7)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Manage Devices (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - You can only have a maximum of 3 registered devices'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Samsung Galaxy S7'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Registered on 04 May 2020'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Current'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - SM-G930F'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Registered on 16 Apr 2020'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0 (8)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Remove Device'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Are you sure want to remove SM-G930F'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Cancel (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Proceed'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Cancel (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Cancel (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Manage Devices (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - You can only have a maximum of 3 registered devices'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0 (9)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Security (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Security (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Notifications'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Manage notifications'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Notifications'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Notifications'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - Notification - msg'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - Notification - promotions - msg'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - Notification - TOGGLE btn'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - Notification - toggle ON msg'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/14.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - Notification - TOGGLE btn'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/UAT - Notification - toggle OFF msg'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/15.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - Notification - BACK btn'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Support'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Feedback  FAQ'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Support'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Support'), 0)

WebUI.delay(2)

Mobile.swipe(500, 1600, 500, 1400)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - FAQ'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - FAQ'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - FAQ (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0 (10)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Helpline'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Helpline'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Helpline (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - For any enquiries regarding your account please call the respective hotline below.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Customer Care Hotline (Malaysia)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 1-300-88-6688'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 1-300-88-6688'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 1-300-88-6688 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.Button0 - CALL'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.Button0 - CANCEL'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.Button0 - CANCEL'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Helpline (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Customer Care Hotline (Overseas)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 603 7844 3696'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Customer Care Hotline (Overseas)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 603 7844 3696 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.Button0 - CALL'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.Button0 - CANCEL'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.Button0 - CANCEL'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Email'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - mgccmaybank.com.my'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Email'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Compose'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - From'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - ferzanakamal786gmail.com'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - To'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.MultiAutoCompleteTextView0 - mgccmaybank.com.my'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - Subject'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - Compose email'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/20.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.pressBack()

WebUI.delay(2)

Mobile.pressBack()

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Fraud Hotline'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 603 5891 4744'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Fraud Hotline'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - 603 5891 4744 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.Button0 - CANCEL'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.Button0 - CALL'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.Button0 - CALL'), 0)

WebUI.delay(3)

Mobile.pressBack()

WebUI.delay(3)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Helpline (1)'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/UAT - Notification - BACK btn'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Support (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0 (5)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Hello'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Logout'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Logout'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/SettingsChangePIN/22.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

