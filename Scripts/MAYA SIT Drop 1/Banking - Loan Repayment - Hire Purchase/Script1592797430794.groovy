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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/100.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Maybank2u'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/101.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - FIXED DEPOSITS'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - LOANS'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/102.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - LOANS'), 0)

def m2 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.verifyEqual(m2, 'Maybank2u')

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 1937110.86'), 0)

def ob = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Outstanding Balance'), 0)

Mobile.verifyEqual(ob, 'Outstanding Balance')

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp name'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/103.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp number'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp amount'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/loan hp name'), 0)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 1'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 1 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 2'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 2 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 3'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 3 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 4'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 4 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 5'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 5 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 6'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 6 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 7'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 7 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 8'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 8 value'), 0)

def pl33 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (2)'), 0)

Mobile.verifyEqual(pl33, 'Pay Loan')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (2)'), 0)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/loan set password'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('MAYA SIT Regression SPY/loan set password'), 'pass1234', 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/onboarding/104.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/loan set password'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.tapAtPosition(980, 1822)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Islamic Loan (7)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/105.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4640 1692 0107 (5)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentAmount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 2366 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00 (1)'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentAmount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/106.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/107.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/108.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

def pss = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment success'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/109.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/110.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(srr11, 'Share Receipt')

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (1)'), 0)

WebUI.delay(2)

def dd2 = Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

Mobile.verifyEqual(dd2, 'Done')

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(10)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/111.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA SIT Regression SPY/loan hp name'), 0)

WebUI.delay(5)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 1'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/112.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 1 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 2'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 2 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 3'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 3 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 4'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 4 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 5'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 5 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 6'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 6 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 7'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 7 value'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 8'), 0)

Mobile.getText(findTestObject('MAYA SIT Regression SPY/loan hp 8 value'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (2)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/113.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/114.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/115.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/116.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 0140 1148 5752 (2)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 99233823.25'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (3)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/117.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/118.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(srk1, 'Share Receipt')

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (1)'), 0)

WebUI.delay(5)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/119.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(5)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/120.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 1934742.84'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Outstanding Balance'), 0)

WebUI.delay(5)

WebUI.delay(10)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/121.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

