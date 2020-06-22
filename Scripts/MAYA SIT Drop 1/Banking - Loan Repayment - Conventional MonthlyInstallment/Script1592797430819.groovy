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

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank2u'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Maybank2u'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/21.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - Investments/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (1)'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Transfer (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Transfer (1)'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/23.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Banking Loans/android.widget.EditText0'), 'pass1234', 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.EditText0 - '), 0)

WebUI.delay(2)

Mobile.tapAtPosition(985, 1827)

WebUI.delay(5)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Transfer (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/25.png', FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Loan (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/26.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Anyamount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0.00 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentDue (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 0 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentAmount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 1596'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - MonthlyInstalmentAmount (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Confirmation'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/27.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Maybank Conventional Loan (2)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 4020 7200 0002'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 1596 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Date'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Today'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Cancel'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/28.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Note'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/29.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Money withdrawn from your insured deposit(s) is no longer protected by PIDM if transferred to non PIDM members and products.'), 
    0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay from'), 0)

WebUI.delay(2)

'vertical swipe'
Mobile.swipe(490, 1500, 490, 1000)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Current Account (2)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/30.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 0140 1148 5752 (1)'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - RM 99237785.25'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Pay Now'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Payment success'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/31.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Reference ID'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 179940314M'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Date  time'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - 23 Apr 2020 1218 AM'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/32.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (1)'), 0)

WebUI.delay(5)

Mobile.getText(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('Banking Loans/android.widget.TextView0 - Done (1)'), 0)

WebUI.delay(10)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/33.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Banking Loans/android.widget.ImageView0 (2)'), 0)

WebUI.delay(10)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/bankingLOAN/34.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.closeApplication()

