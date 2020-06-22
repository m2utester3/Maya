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

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/120.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Enter your 6-digit PIN'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Maybank2u'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 6-Digit PIN'), 0)

enterOTP = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Enter your 6-digit PIN'), 
    0)

Mobile.verifyEqual(enterOTP, 'Enter your 6-digit PIN')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/121.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/122.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Account'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/123.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - PENDING'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Id like to'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - SendMoney'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RequestMoney'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RequestMoney'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (2)'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/124.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (2)'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.EditText0'), 'fadhli', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/125.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

var = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 01 contacts selected.'), 
    0)

Mobile.verifyEqual(var, '0/1 contacts selected.')

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Fadhli  Maybank'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 6012 7845 015'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.view.ViewGroup0 (1)'), 0)

var1 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 11 contacts selected.'), 
    0)

Mobile.verifyEqual(var1, '1/1 contacts selected.')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/126.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Add'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (1)'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/127.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 60127845015'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Fadhli  Maybank (1)'), 
    0)

var2 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Enter amount'), 
    0)

Mobile.verifyEqual(var2, 'Enter amount')

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.EditText0 - 0.00'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Enter amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.EditText0 - 0.10'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/128.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (3)'), 0)

var4 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Confirmation'), 
    0)

Mobile.verifyEqual(var4, 'Confirmation')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/129.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (5)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Account (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Savings Account (1)'), 
    0)

var5 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Available Balance'), 
    0)

Mobile.verifyEqual(var5, 'Available Balance')

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RM 15983.81'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (3)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (4)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - PENDING (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Id like to (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RequestMoney (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RequestMoney (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (5)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (6)'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.EditText0 (1)'), 'fadhli', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 01 contacts selected. (1)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Fadhli  Maybank (2)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 6012 7845 015 (1)'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/130.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Fadhli  Maybank (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 6012 7845 015 (1)'), 0)

var6 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 11 contacts selected. (1)'), 
    0)

Mobile.verifyEqual(var6, '1/1 contacts selected.')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/131.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Add (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Add (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (4)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Enter amount (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 1 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 0 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/132.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (7)'), 0)

var7 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Confirmation'), 
    0)

Mobile.verifyEqual(var7, 'Confirmation')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/133.png', FailureHandling.CONTINUE_ON_FAILURE)

var8 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Youve requestedmoney from'), 
    0)

Mobile.verifyEqual(var8, 'You\'ve requested\nmoney from')

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Fadhli Maybank'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 60127845015 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RM 0.10'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RM 0.10'), 0)

var9 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Transfer'), 0)

Mobile.verifyEqual(var9, 'Transfer')

var10 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Enter amount (1)'), 
    0)

Mobile.verifyEqual(var10, 'Enter amount')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/134.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.EditText0 - 0.10 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 1 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 0 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 2'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/135.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (7)'), 0)

var11 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Confirmation'), 
    0)

Mobile.verifyEqual(var11, 'Confirmation')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/136.png', FailureHandling.CONTINUE_ON_FAILURE)

var12 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Youve requestedmoney from'), 
    0)

Mobile.verifyEqual(var12, 'You\'ve requested\nmoney from')

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RM 1.02'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Notes'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.EditText0 - Optional'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.EditText0 - Optional'), 'chg amt', 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send Request'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send Request'), 0)

var13 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Request  successful'), 
    0)

Mobile.verifyEqual(var13, 'Request  successful')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/137.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Date  Time'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 03 May 2020 1247 am'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Name'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Fadhli  Maybank (3)'), 
    0)

var14 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Contact'), 0)

Mobile.verifyEqual(var14, 'Contact')

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 6012 7845 015 (2)'), 
    0)

var15 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Amount'), 0)

Mobile.verifyEqual(var15, 'Amount')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/138.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RM 1.02 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (3)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (3)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (4)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - PENDING (1)'), 0)

var16 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Requests'), 0)

Mobile.verifyEqual(var16, 'Requests')

var17 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Outgoing'), 0)

Mobile.verifyEqual(var17, 'Outgoing')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/139.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Youve requested RM 1.02 from erwrwer.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Created 3 May 2020 1249 AM'), 
    0)

var18 = Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Outgoing'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (4)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Youve requestedmoney from'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - erwrwer'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 60127845015 (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RM 1.02 (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Outgoing (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Notes (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - chg amt'), 0)

var19 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Reference ID'), 
    0)

Mobile.verifyEqual(var19, 'Reference ID')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/140.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RM7180059758'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Date  Time (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 3 May 2020 1249 AM'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (8)'), 0)

var20 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Cancel Request'), 
    0)

Mobile.verifyEqual(var20, 'Cancel Request')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/141.png', FailureHandling.CONTINUE_ON_FAILURE)

var21 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Mark as Paid'), 
    0)

Mobile.verifyEqual(var21, 'Mark as Paid')

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (9)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send reminder'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send reminder'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/142.png', FailureHandling.CONTINUE_ON_FAILURE)

var22 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Reminder sent failed.'), 
    0)

Mobile.verifyEqual(var22, 'Reminder sent failed.')

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (4)'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (8)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Cancel Request'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Mark as Paid'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Mark as Paid'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/143.png', FailureHandling.CONTINUE_ON_FAILURE)

var23 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - We are facing some issue Please try again.'), 
    0)

Mobile.verifyEqual(var23, 'We are facing some issue, Please try again.')

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (10)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Requests'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Outgoing'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Youve requested RM 1.02 from erwrwer.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Created 3 May 2020 1249 AM'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - PAST'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - PAST'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - PAST (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Id like to (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Requests'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Requests'), 0)

var24 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Completed'), 
    0)

Mobile.verifyEqual(var24, 'Completed')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/144.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Youve sent RM 1.25 to erwrwer.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Created 2 May 2020 0746 AM'), 
    0)

var25 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Completed'), 
    0)

Mobile.verifyEqual(var25, 'Completed')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/145.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Completed'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (4)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Youve sentmoney to'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - erwrwer'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 60125484848'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - RM 1.25'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Completed (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Notes (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - ANY amt'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - SM17180052861'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Date  Time (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - 2 May 2020 0747 AM'), 
    0)

var26 = Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Remove From List'), 
    0)

Mobile.verifyEqual(var26, 'Remove From List')

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Remove From List'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Youve deleted  the request'), 
    0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/146.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Send  Request (4)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Requests'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/147.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (10)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Account (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/sendRequestMoney/148.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.ImageView0 (10)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SendRequestMoney-Validations/android.widget.TextView0 - Maybank2u (2)'), 0)

not_run: Mobile.closeApplication()

