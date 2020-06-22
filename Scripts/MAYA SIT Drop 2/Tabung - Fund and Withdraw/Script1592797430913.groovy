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

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - More'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Settings'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Tabung- MORE'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/General Settings/android.widget.TextView0 - Tabung- MORE'), 0)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/android.widget.TextView0 - Tabung'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Active Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Saved so far'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 24.00 of RM 25.85'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 2 weeks from now'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0 active booster(s)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Overview'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Activity'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Saved so far (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 24.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Boosters'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 0.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Goal amount'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 25.85'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Remaining'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 1.85'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - View More Details'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - View More Details'), 
    0)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 1000)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Goal duration'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 1 months'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Start date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 24 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - End date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 28 Jun 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Auto Deduction'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Set up an automated contribution to ensure you reach your goals on time.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 4.31 weekly'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Next deduction will be on 24 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Boosters (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 1'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Spare Change'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 0.00 (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.Switch0 - ON'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.Switch0 - ON'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Tabung (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Edit Photo'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Remove Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Rename Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (2)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - How much would you like to fund to your Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.EditText0 - 0.00'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Please enter how much youd like to fund.'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 5'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/PayBills-Jompay/android.widget.TextView0 - 5 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Confirmation'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (3)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 5000.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 07 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Transfer from'), 
    0)

WebUI.delay(5)

Mobile.swipe(950, 1360, 150, 1360)

WebUI.delay(5)

Mobile.swipe(950, 1360, 150, 1360)

WebUI.delay(5)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Savings Account-i'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 1640 1781 0625'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 1744084.28'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Savings Account-i'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Savings Account-i'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung (1)'), 
    0)

def otpTaFund = Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw - TAC GET TEXT'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw TAC 1'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw TAC 2'), 
    0)

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
    if ((otpTaFund[i]) == '0') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
    }
    
    if ((otpTaFund[i]) == '1') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
    }
    
    if ((otpTaFund[i]) == '2') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
    }
    
    if ((otpTaFund[i]) == '3') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
    }
    
    if ((otpTaFund[i]) == '4') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
    }
    
    if ((otpTaFund[i]) == '5') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
    }
    
    if ((otpTaFund[i]) == '6') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
    }
    
    if ((otpTaFund[i]) == '7') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
    }
    
    if ((otpTaFund[i]) == '8') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
    }
    
    if ((otpTaFund[i]) == '9') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
    }
}

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw - OTP kp TICK 1'), 
    0)

WebUI.delay(2)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - One-Tap Authorisation'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM  5000'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Approve'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Approve'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Topup Successful'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Reference ID'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 100478048'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Date  time'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 7 May 2020 0845 AM'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Done'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Done'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Tabung (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (4)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Saved so far (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 24.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Boosters'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 0.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Goal amount'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 25.85'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Remaining'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 1.85'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - View More Details'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - View More Details'), 
    0)

WebUI.delay(2)

Mobile.swipe(500, 1700, 500, 1000)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Goal duration'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 1 months'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Start date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 24 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - End date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 28 Jun 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Auto Deduction'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Set up an automated contribution to ensure you reach your goals on time.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 4.31 weekly'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Next deduction will be on 24 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Boosters (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 1'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Spare Change'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 0.00 (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.Switch0 - ON'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Tabung (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Edit Photo'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Fund Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Remove Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Rename Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Remove Tabung'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (2)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - How much would you like to withdraw'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Saved so far RM 5024.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.EditText0 - 0.00 (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Please enter how much youd like to fund. (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 2'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 5'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 0'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Your withdrawal amount should be less than your contributed amount.'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (2)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.ImageView0 (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Confirmation'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Test (3)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM 2500.00'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Date'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - 07 May 2020'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Transfer from'), 
    0)

WebUI.delay(5)

Mobile.swipe(950, 1360, 150, 1360)

WebUI.delay(5)

Mobile.swipe(950, 1360, 150, 1360)

WebUI.delay(5)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Savings Account-i (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Savings Account-i (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds (1)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Withdraw Funds (1)'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - One-Tap Authorisation'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - RM  5000'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Approve'), 
    0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/android.widget.TextView0 - Approve'), 
    0)

def otpTaWithdraw = Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw - TAC GET TEXT'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw TAC 1'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw TAC 2'), 
    0)

WebUI.delay(2)

for (def i = 16; i <= 21; i++) {
    if ((otpTaWithdraw[i]) == '0') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 0'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '1') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 1'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '2') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 2'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '3') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 3'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '4') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 4'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '5') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 5'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '6') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 6'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '7') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 7'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '8') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 8'), 0)
    }
    
    if ((otpTaWithdraw[i]) == '9') {
        Mobile.tap(findTestObject('MAYA SIT Regression SPY/kp onboard 9'), 0)
    }
}

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw - OTP kp TICK 1'), 
    0)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw 1'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw 2'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw 3'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw 4'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/Tabung-create new/Tabung - createnew - New Tabung/tabung - create new - withdraw 5'), 
    0)

not_run: Mobile.closeApplication()

