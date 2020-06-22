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

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Quick Actions'), 0)

WebUI.delay(2)

'vertical swipe'
Mobile.swipe(512, 1500, 512, 378)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Tabung'), 0)

if (Mobile.verifyElementExist(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Create Tabung'), 
    0)) {
    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Saving for a getaway or rainy dayWhatever it is start your Tabung now.'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Create Tabung'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Tabung (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Pick a category to start saving.'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Travel'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - For travel deals and cashback.'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Shopping'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - For whatever you desire.'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Rainy Day'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - For times of need.'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Coin Jar'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Grow your spare change.'), 0)

    WebUI.delay(2)

    'vertical swipe'
    Mobile.swipe(512, 1500, 512, 1200)

    WebUI.delay(2)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Others'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Save for your future needs.'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Travel (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Travel (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Travel (3)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - What are you saving for (1)'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Enter Tabung name (1)'), 0)

    Mobile.setText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Enter Tabung name (1)'), 'automation', 
        0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - tabung (2)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - How much are you planning to save (1)'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - RM (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - 0.00 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.ImageView0 (2)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Please enter a minimum goal value of RM 10.00. (1)'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 2 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 0 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 8 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 9 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.ImageView0 (2)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - tabung (2)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - When would you like to start your Tabung (1)'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Select Start Date'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Tap to select start date (1)'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - MAY (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 2020 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 24 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 24 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Cancel (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Done (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Done (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - 24 May 2020 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - When would you like to complete this Tabung (1)'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Tap to select end date (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - JUN (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 2020 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 28 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 28 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Done (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Done (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - When would you like to complete this Tabung (1)'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - 28 Jun 2020 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Enter your 6-digit PIN (1)'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Name (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Name (5)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Tabung (5)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Tabung (5)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - What are you saving for (5)'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Tabung (3)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Tabung (3)'), 0)

    Mobile.setText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Tabung (4)'), 'TABUNG KATALON', 
        0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

    WebUI.delay(2)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Target amount (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - RM 20.89 (2)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - RM 20.89 (2)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - RM (5)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - 2089 (2)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.ImageView0 (9)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.ImageView0 (9)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 2 (3)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 2 (3)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.ImageView0 (10)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Start date (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 24 May 2020 (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - End date (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 28 Jun 2020 (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Whos saving (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Link this goal to your account'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Just so we know where to transfer your funds to for when your goal is closed or completed.'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - who is saving PLUS SIGN'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group msg'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group GOT IT'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group GOT IT'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group 04 frineds'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group frnd 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group 14 frineds'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group frnd 2'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group 24 frineds'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group 04 frineds ADD'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group 04 frineds ADD'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT VALUE'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT YOU'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT YOU VALUE'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT frnd 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT frnd 1 value'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT frnd 2'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT frnd 2 value'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT CONTINUE'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT CONTINUE'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE link aact text'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE select aact'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE select aact'), 0)

    WebUI.delay(5)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE select acct SA'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE select acct DONE'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE select acct DONE'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 2'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 3'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 4'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 5'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 6'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 7'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 8'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 9'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 10'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 11'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 12'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 13'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 14'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 15'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 16'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 17'), 0)

    not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 19'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 18'), 0)

    WebUI.delay(5)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 20'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 20'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 21'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 21'), 0)

    WebUI.delay(5)

    Mobile.swipe(500, 1500, 500, 700)

    WebUI.delay(5)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 22'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 23'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 23'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 24'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 25'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 25'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 26'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 27'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 28'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 29'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 18'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 30'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 31'), 0)

    def otpTabungCreate = Mobile.getText(findTestObject('MAYA SIT v118/android.widget.TextView0 - Your OTP no. is 190081'), 
        0)

    WebUI.delay(2)

    for (def i = 16; i <= 21; i++) {
        if ((otpTabungCreate[i]) == '0') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
        }
        
        if ((otpTabungCreate[i]) == '1') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
        }
        
        if ((otpTabungCreate[i]) == '2') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
        }
        
        if ((otpTabungCreate[i]) == '3') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
        }
        
        if ((otpTabungCreate[i]) == '4') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
        }
        
        if ((otpTabungCreate[i]) == '5') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
        }
        
        if ((otpTabungCreate[i]) == '6') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
        }
        
        if ((otpTabungCreate[i]) == '7') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
        }
        
        if ((otpTabungCreate[i]) == '8') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
        }
        
        if ((otpTabungCreate[i]) == '9') {
            Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
        }
    }
    
    WebUI.delay(2)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 32 TICK'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 33'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 34'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 35'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 36'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 37'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 38'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 39'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 40'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 3'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 4 Tabung Name'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 5 Saved so far'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 6'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 7'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 7'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 8'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 9'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 10'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 11'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 12'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 13'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 14'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 15'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 16'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 16'), 
        0)

    WebUI.delay(2)

    Mobile.swipe(500, 1750, 500, 500)

    WebUI.delay(2)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 17'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 18'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 19'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 20'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 21'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 22'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 23'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 24'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 25'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 26'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 27'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 28'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 29'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 30'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 31'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 32'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 33'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 34 3 DOTS'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 35'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 36'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 37'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 38'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 39'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 37'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 40'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 41'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 42'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 43'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 43'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 45'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 46'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 47'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 48'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 49'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 50'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 51'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 51'), 
        0)

    if (Mobile.verifyElementExist(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 1'), 0)) {
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
    
    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 51'), 
        0)

    s2u = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Secure2u authorisation'), 
        0)

    Mobile.verifyEqual(s2u, 'One-Tap Authorisation')

    approve = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)

    Mobile.verifyEqual(approve, 'Approve')

    Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)
}

not_run: if (Mobile.verifyElementExist(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - Tap to view'), 
    0)) {
    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - Tap to view'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - Tap to view'), 
        0)

    WebUI.delay(2)

    Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

    WebUI.delay(10)

    Mobile.swipe(500, 1450, 500, 1300)

    WebUI.delay(2)

    Mobile.swipe(900, 900, 100, 900)

    WebUI.delay(2)

    Mobile.swipe(900, 900, 100, 900)

    WebUI.delay(2)

    Mobile.swipe(900, 900, 100, 900)

    WebUI.delay(2)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 1'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 2'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 2'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - What are you saving for (1)'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Enter Tabung name (1)'), 0)

    Mobile.setText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Enter Tabung name (1)'), 'automation', 
        0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - tabung (2)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - How much are you planning to save (1)'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - RM (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - 0.00 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.ImageView0 (2)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Please enter a minimum goal value of RM 10.00. (1)'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 2 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 0 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 8 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 9 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.ImageView0 (2)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - tabung (2)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - When would you like to start your Tabung (1)'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Select Start Date'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Tap to select start date (1)'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - MAY (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 2020 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 24 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 24 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Cancel (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Done (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Done (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - 24 May 2020 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - When would you like to complete this Tabung (1)'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Tap to select end date (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - JUN (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 2020 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 28 (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 28 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Done (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Done (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - When would you like to complete this Tabung (1)'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - 28 Jun 2020 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Next (1)'), 0)

    not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Enter your 6-digit PIN (1)'), 
        0)

    not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 5 (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Name (1)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Name (5)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Tabung (5)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Tabung (5)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - What are you saving for (5)'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Tabung (3)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Tabung (3)'), 0)

    Mobile.setText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - Tabung (4)'), 'TABUNG KATALON', 
        0)

    WebUI.delay(2)

    Mobile.tapAtPosition(width * 0.91203, height * 0.95156)

    WebUI.delay(2)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Target amount (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - RM 20.89 (2)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - RM 20.89 (2)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - RM (5)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.EditText0 - 2089 (2)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.ImageView0 (9)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.ImageView0 (9)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 2 (3)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 2 (3)'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.ImageView0 (10)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Start date (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 24 May 2020 (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - End date (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - 28 Jun 2020 (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Whos saving (4)'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Link this goal to your account'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Just so we know where to transfer your funds to for when your goal is closed or completed.'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - who is saving PLUS SIGN'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group msg'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group GOT IT'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group GOT IT'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group 04 frineds'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group frnd 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group 14 frineds'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group frnd 2'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group 24 frineds'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group 04 frineds ADD'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group 04 frineds ADD'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT VALUE'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT YOU'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT YOU VALUE'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT frnd 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT frnd 1 value'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT frnd 2'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT frnd 2 value'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT CONTINUE'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - Group AMOUNT CONTINUE'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE link aact text'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE select aact'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE select aact'), 0)

    WebUI.delay(5)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE select acct SA'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE select acct DONE'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE select acct DONE'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tanung - CONTINUE'), 0)

    WebUI.delay(30)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 1'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 2'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 3'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 4'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 5'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 6'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 7'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 8'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 9'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 10'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 11'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 12'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 13'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 14'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 15'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 16'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 17'), 0)

    not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 19'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 18'), 0)

    WebUI.delay(5)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 20'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 20'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 21'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 21'), 0)

    WebUI.delay(5)

    Mobile.swipe(500, 1500, 500, 700)

    WebUI.delay(2)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 22'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 23'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 23'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 24'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 25'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 25'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 26'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 27'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 28'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 29'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 18'), 0)

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

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 33'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 34'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 35'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 36'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 37'), 0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 38'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 39'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/tabung SPY/tabung - create new confirm 40'), 0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 3'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 4 Tabung Name'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 5 Saved so far'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 6'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 7'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 7'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 8'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 9'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 10'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 11'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 12'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 13'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 14'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 15'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 16'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 16'), 
        0)

    WebUI.delay(2)

    Mobile.swipe(500, 1750, 500, 500)

    WebUI.delay(2)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 17'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 18'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 19'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 20'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 21'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 22'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 23'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 24'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 25'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 26'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 27'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 28'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 29'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 30'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 31'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 32'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 33'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 34 3 DOTS'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 35'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 36'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 37'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 38'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 39'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 37'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 40'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 41'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 42'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 43'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 43'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 45'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 46'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 47'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 48'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 49'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 50'), 
        0)

    Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 51'), 
        0)

    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 51'), 
        0)

    if (Mobile.verifyElementExist(findTestObject('MAYA Drop 2/OnTAPauthorization/onTAPautorization 1'), 0)) {
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
    
    Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - TaptoView - NewTabung 51'), 
        0)

    s2u = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Secure2u authorisation'), 
        0)

    Mobile.verifyEqual(s2u, 'One-Tap Authorisation')

    approve = Mobile.getText(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)

    Mobile.verifyEqual(approve, 'Approve')

    Mobile.tap(findTestObject('MAYA Drop 2/SendMoney-MAE/android.widget.TextView0 - Approve'), 0)
}

not_run: Mobile.closeApplication()

