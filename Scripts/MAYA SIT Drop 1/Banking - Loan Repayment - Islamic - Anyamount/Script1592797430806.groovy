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

'peileng'
Mobile.startApplication('/Users/mosaj/Desktop/apk/app-sit-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

WebUI.delay(5)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Transfer'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Transfer'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Banking Loans/android.widget.EditText0'), 'pass1234', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.EditText0 - '), 0)

WebUI.delay(2)

Mobile.tapAtPosition(985, 1827)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/3.png', FailureHandling.CONTINUE_ON_FAILURE)

'vertical swipe'
Mobile.swipe(490, 1800, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1800, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1800, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1800, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1800, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1800, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1800, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1800, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1800, 490, 500)

'vertical swipe'
Mobile.swipe(490, 1800, 490, 500)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/4.png', FailureHandling.CONTINUE_ON_FAILURE)

def mil = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan'), 0)

Mobile.verifyEqual(mil, 'Maybank Islamic Loan')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan'), 0)

def pl = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/5.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(pl, 'Pay Loan')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4640 1692 0107'), 0)

def mia = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentAmount'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 2366'), 0)

def mid = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentDue'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0'), 0)

def aa = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4640 1692 0107 (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/6.png', FailureHandling.CONTINUE_ON_FAILURE)

def mil2 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (2)'), 0)

Mobile.verifyEqual(mil2, 'Maybank Islamic Loan')

def bank = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank'), 0)

Mobile.verifyEqual(bank, 'Maybank')

def ea = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Enter amount'), 0)

Mobile.verifyEqual(ea, 'Enter amount')

def rm = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM'), 0)

Mobile.verifyEqual(rm, 'RM')

Mobile.getText(findTestObject('Banking Loans/android.widget.EditText0 - 0.00'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0'), 0)

def c = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(c, 'Confirmation')

def mil3 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (3)'), 0)

Mobile.verifyEqual(mil3, 'Maybank Islamic Loan')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4640 1692 0107 (2)'), 0)

def amount = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 5.55'), 0)

Mobile.verifyEqual(amount, 'RM 5.55')

def date = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Date'), 0)

Mobile.verifyEqual(date, 'Date')

def today = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Today'), 0)

Mobile.verifyEqual(today, 'Today')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Today'), 0)

def cancel = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Cancel'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/8.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(cancel, 'Cancel')

def done = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done'), 0)

Mobile.verifyEqual(done, 'Done')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done'), 0)

def note = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Note'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/9.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(note, 'Note:')

def msg = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

Mobile.verifyEqual(msg, 'Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay from'), 0)

WebUI.delay(2)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 1000)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Current Account'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 0140 1148 5752'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 99237790.80'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Current Account'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/11.png', FailureHandling.CONTINUE_ON_FAILURE)

def pn = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

Mobile.verifyEqual(pn, 'Pay Now')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

def ps = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment success'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(ps, 'Payment success')

def ref = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyEqual(ref, 'Reference ID')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 179940217M'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Date  time'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 23 Apr 2020 1210 AM'), 0)

def sr = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

Mobile.verifyEqual(sr, 'Share Receipt')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/13.png', FailureHandling.CONTINUE_ON_FAILURE)

def sr1 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.verifyEqual(sr1, 'Share Receipt')

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (1)'), 0)

def d1 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(d1, 'Done')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(10)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/15.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

