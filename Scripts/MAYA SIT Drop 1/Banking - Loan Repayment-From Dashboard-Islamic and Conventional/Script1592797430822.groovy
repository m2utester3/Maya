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

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/70.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Maybank2u'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/71.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - FIXED DEPOSITS'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - LOANS'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/72.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - LOANS'), 0)

def m2 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/73.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(m2, 'Maybank2u')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 1937110.86'), 0)

def ob = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Outstanding Balance'), 0)

Mobile.verifyEqual(ob, 'Outstanding Balance')

WebUI.delay(5)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 750)

def mil4 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (4)'), 0)

Mobile.verifyEqual(mil4, 'Maybank Islamic Loan')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (4)'), 0)

def mil5 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (5)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/74.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(mil5, 'Maybank Islamic Loan')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 417832.59 (1)'), 0)

def mil6 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (6)'), 0)

Mobile.verifyEqual(mil6, 'Maybank Islamic Loan')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4640 1692 0107 (4)'), 0)

def an1 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Account Name'), 0)

Mobile.verifyEqual(an1, 'Account Name')

def cfs = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - CFS DNO SIX'), 0)

Mobile.verifyEqual(cfs, 'CFS DNO SIX')

def ob2 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Outstanding Balance (1)'), 0)

Mobile.verifyEqual(ob2, 'Outstanding Balance')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - -RM 417832.59'), 0)

def ocof = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Outstanding Cost of Finance'), 0)

Mobile.verifyEqual(ocof, 'Outstanding Cost of Finance')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 300000.00'), 0)

def ogdp = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Outstanding GPP'), 0)

Mobile.verifyEqual(ogdp, 'Outstanding GPP')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00 (2)'), 0)

def misc = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Misc Charges'), 0)

Mobile.verifyEqual(misc, 'Misc Charges')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00 (3)'), 0)

def pdd = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment Due Date'), 0)

Mobile.verifyEqual(pdd, 'Payment Due Date')

def na = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - NA'), 0)

Mobile.verifyEqual(na, 'N/A')

WebUI.delay(1)

'vertical swipe'
Mobile.swipe(490, 1650, 490, 750)

def mi5 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Monthly Instalment'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/75.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(mi5, 'Monthly Instalment')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 2366.00'), 0)

def id2 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Installment Due'), 0)

Mobile.verifyEqual(id2, 'Installment Due')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00 (4)'), 0)

def pia3 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment in Advance'), 0)

Mobile.verifyEqual(pia3, 'Payment in Advance')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 7984.47'), 0)

def pr3 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Profit Rate'), 0)

Mobile.verifyEqual(pr3, 'Profit Rate')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4.95'), 0)

def pf3 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment Frequency'), 0)

Mobile.verifyEqual(pf3, 'Payment Frequency')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Monthly'), 0)

def pl33 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (2)'), 0)

Mobile.verifyEqual(pl33, 'Pay Loan')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (2)'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/loan set password'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('MAYA SIT Regression SPY/loan set password'), 'pass1234', 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/76.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/loan set password'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.tapAtPosition(980, 1822)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (7)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/77.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4640 1692 0107 (5)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentAmount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 2366 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00 (1)'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentAmount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/78.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4640 1692 0107 (2)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 2366 (2)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Date'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Cancel'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Note'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay from'), 0)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 1000)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (3)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/79.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/80.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

def pss = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment success'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/81.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(pss, 'Payment success')

def reff = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyEqual(reff, 'Reference ID')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 179940391M'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Date  time'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 23 Apr 2020 1230 AM'), 0)

def srr1 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

Mobile.verifyEqual(srr1, 'Share Receipt')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

def srr11 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/82.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(srr11, 'Share Receipt')

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (1)'), 0)

WebUI.delay(2)

def dd2 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

Mobile.verifyEqual(dd2, 'Done')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(10)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 700)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan (3)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/83.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4020 7200 0002 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 171031.27'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan (4)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 171031.27 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan (5)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4020 7200 0002 (2)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Account Name'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - CFS DNO SIX'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Outstanding Balance (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - -RM 171031.27'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Outstanding Progressive Interest'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00 (5)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Other charges'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00 (2)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Advance Payment Available for Redraw'), 0)

WebUI.delay(2)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 700)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 79017.22'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/84.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment Due Date (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 1 Feb 2015'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Monthly Instalment'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 1596.00'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Installment Due'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00 (4)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment in Advance'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 79017.22 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Interest Rate'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 3.80'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment Frequency'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Monthly'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (2)'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (2)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/85.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4020 7200 0002 (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentAmount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 1596'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentDue (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00 (1)'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4020 7200 0002 (4)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/86.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan (6)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Enter amount'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.EditText0 - 0.00'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/87.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan (2)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4020 7200 0002'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 2.02'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Date'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Cancel'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Note'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay from'), 0)

WebUI.delay(2)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 700)

WebUI.delay(2)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (3)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/88.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 0140 1148 5752 (2)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 99233823.25'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/89.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

def ps33 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment success'), 0)

Mobile.verifyEqual(ps33, 'Payment success')

def rid = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyEqual(rid, 'Reference ID')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 179940504M'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Date  time'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 23 Apr 2020 1242 AM'), 0)

def srk = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

Mobile.verifyEqual(srk, 'Share Receipt')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

WebUI.delay(5)

def srk1 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/90.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(srk1, 'Share Receipt')

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (1)'), 0)

WebUI.delay(5)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/91.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(5)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/92.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 1934742.84'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Outstanding Balance'), 0)

WebUI.delay(5)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 700)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (4)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4640 1692 0107 (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4020 7200 0002 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 171029.25'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (4)'), 0)

WebUI.delay(2)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/93.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (2)'), 0)

WebUI.delay(2)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Enter amount'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.EditText0 - 0.00'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0'), 0)

WebUI.delay(2)

def mms = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Please enter amount between RM 0.01 to RM 999999.99'), 
    0)

Mobile.verifyEqual(mms, 'Please enter amount between RM 0.01 to RM 999,999.99')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/99.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (2)'), 0)

WebUI.delay(2)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/94.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentAmount (1)'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentAmount (1)'), 0)

WebUI.delay(3)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/95.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay from'), 0)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 700)

WebUI.delay(2)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/96.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/97.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(10)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/98.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

