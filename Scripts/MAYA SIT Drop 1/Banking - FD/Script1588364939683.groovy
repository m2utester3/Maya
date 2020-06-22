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

'personal3-pass1234'
Mobile.startApplication('/Users/mosaj/Desktop/apk/app-sit-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - Maybank2u'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - 5'), 0)

def FD = Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - FIXED DEPOSITS'), 0)

Mobile.verifyEqual(FD, 'FIXED DEPOSITS')

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - FIXED DEPOSITS'), 0)

def sumTotalD = Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 348703.00'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Total Deposits'), 0)

def sum1 = Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 60200.00'), 0)

def sum2 = Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 186000.00'), 0)

'vertical swipe'
Mobile.swipe(490, 800, 490, 400)

def sum3 = Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 102503.00'), 0)

not_run: def sumTotalD1 = sumTotalD.substring(3)

not_run: int sumTotalD11 = Integer.parseInt(sumTotalD1)

not_run: def sum11 = sum1.substring(3)

not_run: int sum111 = Integer.parseInt(sum11)

not_run: def sum21 = sum2.substring(3)

not_run: int sum211 = Integer.parseInt(sum21)

not_run: def sum31 = sum3.substring(3)

not_run: int sum311 = Integer.parseInt(sum31)

not_run: int total = (sum111 + sum211) + sum311

not_run: Mobile.verifyEqual(sumTotalD1, total)

Mobile.tap(findTestObject('Banking - FD/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Contact Bank'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - Contact Bank'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Contact Bank (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - For any enquiries regarding your account please call the Customer Care Hotline at 1 300 88 6688.'), 
    0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Call Now'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - Call Now'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 1300886688'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.Button0 - CALL'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.Button0 - CANCEL'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.Button0 - CANCEL'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Maybank Flexi Fixed Deposit'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 2140 1177 5179'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - No. of certs 15'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 60200.00 (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Murabahah Deposit Account'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 2640 1600 6244'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - No. of certs 18'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 186000.00 (1)'), 0)

'vertical swipe'
Mobile.swipe(490, 800, 490, 400)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Islamic Fixed Deposit'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 2640 1600 6148'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - No. of certs 16'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 102503.00'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - Maybank Flexi Fixed Deposit'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Maybank Flexi Fixed Deposit (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 2140 1177 5179 (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 60200.00 (2)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Total Principal Amount'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 4000.00'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Account Name'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - NAZREEE AZEEZ'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Term'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 12 month(s)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Interest Rate'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 3.88'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Maturity Date'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 7 Oct 2020'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Interest Payment Mode'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Add to Principal'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Instructions on Maturity'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Auto-Renewal'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Close'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Done'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.TextView0 - Murabahah Deposit Account (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Murabahah Deposit Account (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 2640 1600 6244 (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 186000.00 (2)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Total Principal Amount (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - RM 12000.00'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Account Name (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - NAZREEE AZEEZ (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Term (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 6 month(s)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Interest Rate (1)'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 3.20'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Maturity Date'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - 27 May 2019'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Interest Payment Mode'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Credit to Account 514012097173'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Instructions on Maturity'), 0)

Mobile.getText(findTestObject('Banking - FD/android.widget.TextView0 - Credit to Account 514012097173 (1)'), 0)

Mobile.tap(findTestObject('Banking - FD/android.widget.ImageView0 (2)'), 0)

not_run: Mobile.closeApplication()

