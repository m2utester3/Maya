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

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Hello'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - More'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Login'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Tabung- MORE'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Profile'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Manage account details'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Maybank2u'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Manage Maybank2u settings'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Security'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Manage security settings'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Notifications (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Manage notifications'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Support'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Feedback  FAQ'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - About MAE'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - About'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.swipe(500, 1600, 500, 400)

not_run: WebUI.delay(2)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - About Us'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Terms  Conditions'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Privacy Policy'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Security Policy'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Client Charter'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - About Us'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - About Us (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Version 0.4.0.158.4000'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Terms  Conditions'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Terms  Conditions'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Terms  Conditions (1)'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Privacy Policy'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Privacy Policy'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Privacy Policy (1)'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Security Policy'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Security Policy'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Security Policy (1)'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Client Charter'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Client Charter'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Client Charter (1)'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0 (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Hello (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Login'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Profile'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Manage account details'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Profile'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 6-Digit PIN'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Enter your 6-digit PIN'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Forgot PIN'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0 (2)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Profile'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Profile'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Enter your 6-digit PIN'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0 (3)'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('MAYA SIT v118/android.widget.TextView0 - 5'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT v118/android.widget.TextView0 - 5'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT v118/android.widget.TextView0 - 5'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT v118/android.widget.TextView0 - 5'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT v118/android.widget.TextView0 - 5'), 0)

not_run: Mobile.tap(findTestObject('MAYA SIT v118/android.widget.TextView0 - 5'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Update Profile'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Last successful login'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 7 May 2020 0435 AM'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Name'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.EditText0 - katalon'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.EditText0 - katalon'), 0)

not_run: Mobile.setText(findTestObject('MAYA Drop 2/General Settings/android.widget.EditText0 - katalon (1)'), 'KATALON MOSAJ', 
    0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Mobile number'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 6012  848'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 6012  848'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 6012  848'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Whats your mobile number'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Take note that this number will not replace your current mobile number used for Maybank2u transactions.'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 601'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 1'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 2'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 6'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 3'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 1'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 1'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0 (4)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Please enter a valid mobile number in order to continue.'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0 (5)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Email address'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.EditText0 - Optional'), 0)

not_run: Mobile.setText(findTestObject('MAYA Drop 2/General Settings/android.widget.EditText0 - Optional (1)'), 'mosajgohar@gmail.com', 
    0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Save Changes'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Save Changes'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Update Profile'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Profile'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Profile'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Update Profile'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0 (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Hello (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - katalon'), 0)

not_run: Mobile.verifyElementText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - katalon'), 'KATALON MOSAJ')

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Logout'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Logout'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/General Settings - back to Dashboard MSG'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/General Settings - back to Dashboard - logout time'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/General Settings - back to Dashboard'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Hello'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - katalon (1)'), 0)

not_run: Mobile.verifyElementText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - katalon (1)'), 
    'KATALON MOSAJ')

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - More'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - More'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Hello (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - katalon'), 0)

not_run: Mobile.verifyElementText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - katalon'), 'KATALON MOSAJ')

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Profile'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Profile'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Enter your 6-digit PIN'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 5'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 5'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 5'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 5'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 5'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - 5'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Update Profile'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Name'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.EditText0 - katalon'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Enter your password'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/General Settings/android.widget.EditText0 (1)'), 'pass1234', 0)

WebUI.delay(2)

Mobile.tapAtPosition(width * 0.90740, height * 0.94375)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Scan  Pay'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - One-Tap Authorisation'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - DuitNow'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Change Password'), 0)

Mobile.swipe(500, 1700, 500, 1500)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Unlink Maybank2u Account'), 0)

Mobile.swipe(500, 1500, 500, 1700)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Scan  Pay'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Scan  Pay'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Scan  Pay (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Go cashless with Scan  Pay. Just scan QR codes at participating merchants in order to pay.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Get Started'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Get Started'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Setup Scan  Pay'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Daily Limit'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Drag the slider to adjust your daily limit.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - RM 350'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Cumulative Limit'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Scan  Pay'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - One-Tap Authorisation'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - One-Tap Authorisation'), 0)

not_run: if (Mobile.verifyElementExist(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 1'), 0)) {
    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 2'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - activate'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - OTP 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - OTP 2'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - Confirm'), 0)

    WebUI.delay(2)

    def OTAJompay = Mobile.getText(findTestObject('MAYA drop 2 SPY/jompay - OTA - OTP'), 0)

    WebUI.delay(2)

    for (def i = 16; i <= 21; i++) {
        if ((OTAJompay[i]) == '0') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
        }
        
        if ((OTAJompay[i]) == '1') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
        }
        
        if ((OTAJompay[i]) == '2') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
        }
        
        if ((OTAJompay[i]) == '3') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
        }
        
        if ((OTAJompay[i]) == '4') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
        }
        
        if ((OTAJompay[i]) == '5') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
        }
        
        if ((OTAJompay[i]) == '6') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
        }
        
        if ((OTAJompay[i]) == '7') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
        }
        
        if ((OTAJompay[i]) == '8') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
        }
        
        if ((OTAJompay[i]) == '9') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
        }
    }
    
    WebUI.delay(2)

    Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - paybills - OTP OK button 2'), 0)

    not_run: Mobile.tap(findTestObject('MAYA SIT Regression SPY/reload OTP ok button'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - enter ID'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - enter ID 2'), 0)

    Mobile.setText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - enter ID 3 SET TEXT'), 'P2389982', 
        0)

    Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - device'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - device 2'), 0)

    Mobile.tap(findTestObject('MAYA drop 2 SPY/jompay - paybills - device name SET TEXT'), 0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - ENABLED'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - ENABLED msg'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization - DONE - CONTINUE'), 0)
}

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Disable One-Tap Authorisation'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Are you sure want to disable One-Tap Authorisation'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Cancel'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - One-Tap Authorisation'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.view.ViewGroup0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Disable One-Tap Authorisation'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Are you sure want to disable One-Tap Authorisation'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Cancel'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Confirm'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Unsuccessful'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Change Password'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Change Password'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Update Profile'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.ImageView0 (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Settings'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Change Password'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Change Password'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Change Password'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Update Profile'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - Enter current password'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - Enter current password'), 'pass123', 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - Enter new password'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - Enter new password'), 'pass1234', 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - Confirm new password'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - Confirm new password'), 'pass1234', 
    0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Show password'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.view.ViewGroup0 (1)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/General Settings - show pwd Radio button'), 0)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Between 8-12 characters.'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Must include at least 1 uppercase 1 lowercase 1 number and 1 special character.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Must not include 3 consecutive characters. (e.g. 123 abc)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Must not be similar to your Maybank2u user ID.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - pass123'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - pass123'), 'Maybank@1', 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - pass1234'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - pass1234'), 'Maybank@2', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - pass1234 (1)'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - pass1234 (1)'), 'Maybank@3', 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - Maybank3'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.EditText0 - Maybank3'), 'Maybank@2', 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings 2/android.widget.TextView0 - One Time Password'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 30'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 31'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 31'), 0)

def otpTabungCreate2 = Mobile.getText(findTestObject('MAYA SIT v118/android.widget.TextView0 - Your OTP no. is 190081'), 
    0)

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
    if ((otpTabungCreate2[i]) == '0') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
    }
    
    if ((otpTabungCreate2[i]) == '1') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
    }
    
    if ((otpTabungCreate2[i]) == '2') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
    }
    
    if ((otpTabungCreate2[i]) == '3') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
    }
    
    if ((otpTabungCreate2[i]) == '4') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
    }
    
    if ((otpTabungCreate2[i]) == '5') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
    }
    
    if ((otpTabungCreate2[i]) == '6') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
    }
    
    if ((otpTabungCreate2[i]) == '7') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
    }
    
    if ((otpTabungCreate2[i]) == '8') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
    }
    
    if ((otpTabungCreate2[i]) == '9') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
    }
}

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 32 TICK'), 0)

Mobile.closeApplication()

