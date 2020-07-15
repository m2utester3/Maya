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

'app launch'
Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

var150 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bills'), 0)

Mobile.verifyEqual(var150, 'Split Bill')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/1.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bills'), 0)

var1500 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Enter your 6-digit PIN'), 0)

Mobile.verifyEqual(var1500, 'Enter your 6-digit PIN')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/2.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/3.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5'), 0)

var151 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bill'), 0)

Mobile.verifyEqual(var151, 'Split Bill')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/4.png', FailureHandling.CONTINUE_ON_FAILURE)

var152 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - TO COLLECT'), 0)

Mobile.verifyEqual(var152, 'TO COLLECT')

var153 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Got an IOU situation'), 0)

Mobile.verifyEqual(var153, 'Got an IOU situation?')

var154 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/UAT - SplitBill msg evenly seprate'), 0)

Mobile.verifyEqual(var154, 'Evenly or separately,\nit\'s time to split the bill with friends!')

var155 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split a Bill'), 0)

Mobile.verifyEqual(var155, 'Split a Bill')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/5.png', FailureHandling.CONTINUE_ON_FAILURE)

var156 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - TO PAY'), 0)

Mobile.verifyEqual(var156, 'TO PAY')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - TO PAY'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Got an IOU situation'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split a Bill'), 0)

var157 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - PAST'), 0)

Mobile.verifyEqual(var157, 'PAST')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - PAST'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Got an IOU situation'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split a Bill'), 0)

var158 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - GROUP'), 0)

Mobile.verifyEqual(var158, 'GROUP')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/6.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - GROUP'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Got an IOU situation'), 0)

var159 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Create Group'), 0)

Mobile.verifyEqual(var159, 'Create Group')

Mobile.swipe(100, 445, 1000, 445)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - TO COLLECT (1)'), 0)

var160 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split a Bill'), 0)

Mobile.verifyEqual(var160, 'Split a Bill')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split a Bill'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bill (1)'), 0)

Mobile.hideKeyboard()

var161 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Whats this bill for'), 0)

Mobile.verifyEqual(var161, 'What\'s this bill for?')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/7.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('MAYA Drop 2/SplitBills/android.widget.EditText0 - Enter bill name'), 'foodmovie', 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add notes (optional)'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/SplitBills/android.widget.EditText0 - Enter notes'), 'payall', 0)

WebUI.delay(3)

Mobile.hideKeyboard()

var162 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Howd you like to split this bill'), 
    0)

Mobile.verifyEqual(var162, 'How\'d you like to split this bill?')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/8.png', FailureHandling.CONTINUE_ON_FAILURE)

var163 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Evenly'), 0)

Mobile.verifyEqual(var163, 'Evenly')

var164 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Separately'), 0)

Mobile.verifyEqual(var164, 'Separately')

WebUI.delay(3)

var165 = Mobile.getText(findTestObject('MAYA drop 2 SPY/spli bill - continue'), 0)

Mobile.verifyEqual(var165, 'Continue')

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA drop 2 SPY/spli bill - continue'), 0)

Mobile.tapAtPosition(width * 0.48148, height * 0.92447)

var166 = Mobile.getText(findTestObject('MAYA drop 2 SPY/split bill - no split selection msg'), 0)

Mobile.verifyEqual(var166, 'Please select type of split bill')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/9.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Evenly'), 0)

Mobile.tapAtPosition(width * 0.48148, height * 0.92447)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bill (1)'), 0)

var167 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - How much would you like to split'), 
    0)

Mobile.verifyEqual(var167, 'How much would you like to split?')

var168 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.EditText0 - 0.00'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 5 (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 0'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/10.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.ImageView0 (1)'), 0)

var170 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add Contact'), 0)

Mobile.verifyEqual(var170, 'Add Contact')

var171 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - FRIENDS'), 0)

Mobile.verifyEqual(var171, 'FRIENDS')

var172 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - GROUPS'), 0)

Mobile.verifyEqual(var172, 'GROUPS')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/11.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

Mobile.tapAtPosition(width * 0.46296, height * 0.41666)

Mobile.tapAtPosition(width * 0.46296, height * 0.51562)

Mobile.tapAtPosition(width * 0.46296, height * 0.71875)

var173 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add'), 0)

Mobile.verifyEqual(var173, 'Done')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bill'), 0)

var174 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Selected friends (4)'), 0)

Mobile.verifyEqual(var174, 'Selected friends (4)')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/12.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Katalon'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 60 11-1286 7164'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 6ceylon'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Aaron  Maybank'), 0)

var175 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add More'), 0)

Mobile.verifyEqual(var175, 'Add More')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add More'), 0)

var176 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add Contact'), 0)

Mobile.verifyEqual(var176, 'Add Contact')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/13.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

Mobile.tapAtPosition(width * 0.46296, height * 0.81770)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bill'), 0)

Mobile.swipe(490, 1600, 490, 1200)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/14.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Abdul  Maybank'), 0)

var177 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Continue (1)'), 0)

Mobile.verifyEqual(var177, 'Continue')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Continue (1)'), 0)

var178 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bill'), 0)

Mobile.verifyEqual(var178, 'Split Bill')

var179 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split amount'), 0)

Mobile.verifyEqual(var179, 'Split amount')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/15.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - RM 58.60'), 0)

var180 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Bill name'), 0)

Mobile.verifyEqual(var180, 'Bill name')

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.EditText0 - foodmovie'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Notes'), 0)

var181 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.EditText0 - payall'), 0)

Mobile.verifyEqual(var181, 'payall')

var182 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Receipt'), 0)

Mobile.verifyEqual(var182, 'Receipt')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/UAT - SplitBill CAMERA child'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/split bill - 1'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/split bill - 2'), 0)

Mobile.getText(findTestObject('MAYA drop 2 SPY/split bill - 3'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/16.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/split bill - 3'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/17.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/split bill - 4'), 0)

WebUI.delay(3)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/18.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA drop 2 SPY/split bill - attach receipt TICK'), 0)

var183 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Now'), 0)

Mobile.verifyEqual(var183, 'Split Now')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/19.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Now'), 0)

WebUI.delay(3)

Mobile.pressBack()

WebUI.delay(3)

var184 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split bill created'), 0)

Mobile.verifyEqual(var184, 'Split bill created')

var185 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Reference ID'), 0)

Mobile.verifyEqual(var185, 'Reference ID')

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - MB449916B'), 0)

var186 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Date  time'), 0)

Mobile.verifyEqual(var186, 'Date & time')

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - 30 Apr 2020 1849'), 0)

var187 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Done'), 0)

Mobile.verifyEqual(var187, 'Done')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/20.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bill'), 0)

var188 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - TO COLLECT (2)'), 0)

Mobile.verifyEqual(var188, 'TO COLLECT')

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - foodmovie'), 0)

var189 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Collected so far'), 0)

Mobile.verifyEqual(var189, 'Collected so far')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/21.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - RM 11.72 of RM 58.6'), 0)

not_run: Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Expires on 30 May 2020'), 0)

not_run: Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.view.ViewGroup0 (4)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - foodmovie'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bill'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - foodmovie (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - RM 58.6'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Expires on 30 May 2020 (1)'), 0)

var190 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Participants'), 0)

Mobile.verifyEqual(var190, 'Participants')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/22.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Katalon (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - RM 11.72'), 0)

var191 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Paid'), 0)

Mobile.verifyEqual(var191, 'Paid')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.ImageView0 (2)'), 0)

var192 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add Group as Favourite'), 0)

Mobile.verifyEqual(var192, 'Add Group as Favourite')

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Edit Bill Name'), 0)

not_run: var193 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Add Receipt'), 0)

not_run: Mobile.verifyEqual(var193, 'Add Receipt')

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/23.png', FailureHandling.CONTINUE_ON_FAILURE)

var194 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Remove Bill'), 0)

Mobile.verifyEqual(var194, 'Remove Bill')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Remove Bill'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/24.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Remove Bill (1)'), 0)

var195 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Bill sorted Remove it from your list now.'), 
    0)

Mobile.verifyEqual(var195, 'Bill sorted? Remove it from your list now.')

var196 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Cancel'), 0)

Mobile.verifyEqual(var196, 'Cancel')

var197 = Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Confirm'), 0)

Mobile.verifyEqual(var197, 'Confirm')

Mobile.tap(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Confirm'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/splitBills/25.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split Bill'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - TO COLLECT (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/SplitBills/android.widget.TextView0 - Split a Bill'), 0)

not_run: Mobile.closeApplication()

