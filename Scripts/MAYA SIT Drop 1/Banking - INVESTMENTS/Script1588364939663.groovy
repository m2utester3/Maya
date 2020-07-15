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

'app launch (peileng) (UAT_test06)'
Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

'quick actions- Transfer'
Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Transfer'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/0.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - Maybank2u'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - FIXED DEPOSITS'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - INVESTMENTS (1)'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/3.png', FailureHandling.CONTINUE_ON_FAILURE)

def bankname = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.verifyEqual(bankname, 'Maybank2u')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - RM 696972.50'), 0)

def totalI = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Total Investments'), 0)

Mobile.verifyEqual(totalI, 'Total Investments')

Mobile.tap(findTestObject('Banking - Investments/android.widget.ImageView0'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/4.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - Contact Bank'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/5.png', FailureHandling.CONTINUE_ON_FAILURE)

def contact = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Contact Bank (1)'), 0)

Mobile.verifyEqual(contact, 'Contact Bank')

def info = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - For any enquiries regarding your account please call the Customer Care Hotline at 1 300 88 6688.'), 
    0)

Mobile.verifyEqual(info, 'For any enquiries regarding your account, please call the Customer Care Hotline at 1 300 88 6688.')

def call = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Call Now'), 0)

Mobile.verifyEqual(call, 'Call Now')

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - Call Now'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 1300886688'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking - Investments/android.widget.Button0 - CALL'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.Button0 - CANCEL'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.Button0 - CANCEL'), 0)

'vertical swipe'
Mobile.swipe(490, 1600, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1600, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1600, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1600, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1600, 490, 500)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/7.png', FailureHandling.CONTINUE_ON_FAILURE)

def mgia = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Maybank Gold Investment Account'), 
    0)

Mobile.verifyEqual(mgia, 'Maybank Gold Investment Account')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 7050 1960 0026'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - RM 0.00'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 0.0 g'), 0)

def mgia1 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Maybank Gold Investment Account (1)'), 
    0)

Mobile.verifyEqual(mgia1, 'Maybank Gold Investment Account')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 7050 1960 0019'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - RM 0.00 (1)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 0.0 g (1)'), 0)

def asnb = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - ASNB Accounts'), 0)

Mobile.verifyEqual(asnb, 'ASNB Accounts')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - View More'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - View More'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - ASNB Accounts (1)'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.ImageView0 (1)'), 0)

def mfca = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Master Foreign Currency Account'), 
    0)

Mobile.verifyEqual(mfca, 'Master Foreign Currency Account')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 7520 7700 0042'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - RM 9928.02'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - GBP'), 0)

def mfca1 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Master Foreign Currency Account (1)'), 
    0)

Mobile.verifyEqual(mfca1, 'Master Foreign Currency Account')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 7020 7200 0166'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - RM 41559.92'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - USD'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - GBP'), 0)

def mfca2 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Master Foreign Currency Account (2)'), 
    0)

Mobile.verifyEqual(mfca2, 'Master Foreign Currency Account')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 7520 7700 0042 (1)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - RM 9928.02 (1)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Foreign Currency'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - GBP (1)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Account Type'), 0)

def ifcma = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Investment Foreign Currency Master Account'), 
    0)

Mobile.verifyEqual(ifcma, 'Investment Foreign Currency Master Account')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Foreign Currency Amount'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - GBP 1798.88'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Today Price'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 1 GBP  RM 5.51900'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Purpose'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Other'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.ImageView0 (2)'), 0)

def usd = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - USD'), 0)

Mobile.verifyEqual(usd, 'USD')

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - USD'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Master Foreign Currency Account (2)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 7020 7200 0166 (1)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - RM 41559.92 (1)'), 0)

def fc = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Foreign Currency'), 0)

Mobile.verifyEqual(fc, 'Foreign Currency')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - USD (1)'), 0)

def at = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Account Type'), 0)

Mobile.verifyEqual(at, 'Account Type')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Investment Foreign Currency Master Account'), 
    0)

def fca = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Foreign Currency Amount'), 0)

Mobile.verifyEqual(fca, 'Foreign Currency Amount')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - USD 9443.29'), 0)

def TP = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Today Price'), 0)

Mobile.verifyEqual(TP, 'Today Price')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 1 USD  RM 4.40100'), 0)

def p = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Purpose'), 0)

Mobile.verifyEqual(p, 'Purpose')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Other'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.ImageView0 (2)'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/10.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

'vertical swipe'
Mobile.swipe(490, 1300, 490, 1000)

def cur = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - JPY'), 0)

Mobile.verifyEqual(cur, 'JPY')

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - JPY'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/11.png', FailureHandling.CONTINUE_ON_FAILURE)

def mfca3 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Master Foreign Currency Account (2)'), 
    0)

Mobile.verifyEqual(mfca3, 'Master Foreign Currency Account')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 7050 1900 0045'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - RM 472.07'), 0)

def fc1 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Foreign Currency'), 0)

Mobile.verifyEqual(fc1, 'Foreign Currency')

def cur2 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - JPY (1)'), 0)

Mobile.verifyEqual(cur2, 'JPY')

def at2 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Account Type'), 0)

Mobile.verifyEqual(at2, 'Account Type')

def ifcma3 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Investment Foreign Currency Master Account'), 
    0)

Mobile.verifyEqual(ifcma3, 'Investment Foreign Currency Master Account')

def fca3 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Foreign Currency Amount'), 0)

Mobile.verifyEqual(fca3, 'Foreign Currency Amount')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - JPY 11882.00'), 0)

def tp3 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Today Price'), 0)

Mobile.verifyEqual(tp3, 'Today Price')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 1 JPY  RM 0.03973'), 0)

def p3 = Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Purpose'), 0)

Mobile.verifyEqual(p3, 'Purpose')

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Other'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.ImageView0 (2)'), 0)

WebUI.delay(10)

'vertical swipe'
Mobile.swipe(490, 1440, 490, 700)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - CNY'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - CNY'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Master Foreign Currency Account (2)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 7520 7700 0036'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - RM 0.00 (2)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Foreign Currency'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - CNY (1)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Account Type'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Investment Foreign Currency Master Account'), 
    0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Foreign Currency Amount'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - CNY 0.00'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Today Price'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 1 CNY  RM 0.63200'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Purpose'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Other'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.ImageView0 (2)'), 0)

WebUI.delay(10)

'vertical swipe'
Mobile.swipe(490, 1440, 490, 700)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - GBP (2)'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - GBP (2)'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Master Foreign Currency Account (2)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 7020 7200 0159'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - RM 0.00 (2)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Foreign Currency'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - GBP (1)'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Account Type'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Investment Foreign Currency Master Account'), 
    0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Foreign Currency Amount'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - GBP 0.00'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Today Price'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - 1 GBP  RM 5.51900'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Purpose'), 0)

Mobile.getText(findTestObject('Banking - Investments/android.widget.TextView0 - Other'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.ImageView0 (2)'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/13.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking - Investments/android.widget.ImageView0 (3)'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking - Investments/android.widget.ImageView0 (4)'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingINVESTMENTS/15.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

