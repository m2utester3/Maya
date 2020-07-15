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

Mobile.startApplication('/Users/mosaj/katalon/APK/app-uat-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

'quick actions- Transfer'
Mobile.getText(findTestObject('MAYA SIT v127 - trans own acct/android.widget.TextView0 - Transfer'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/1.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - 5'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/2.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Wallet'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Savings Account'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - 1140 1382 3409'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Available Balance'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - RM 16005.14'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - View Transactions'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Transfer'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Pay Bills'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Reload'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Pay Cards'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Split Bill'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/3.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Send  Request'), 0)

WebUI.delay(3)

'vertical swipe'
Mobile.swipe(500, 1500, 500, 1200)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Spending Summary'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - View All'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/4.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - View All'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/spy/UAT - Wallet SELECT JUNE - parent'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Spent So Far'), 0)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - RM 0.00'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Expenses'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Categories'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Merchants'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/5.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - No Transactions Yet'), 0)

'vertical swipe'
Mobile.swipe(490, 1440, 490, 770)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Add Transaction'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.ImageView0 (1)'), 0)

'3 dots'
Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.ImageView0 (2)'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Hide Balance on Dashboard'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Change Wallet Account'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Contact Bank'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/6.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Hide Balance on Dashboard'), 0)

'back button to go main screen'
Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/spy/UAT - Wallet - HOME'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - RM '), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/7.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Contact Bank'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Contact Bank (1)'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Call Now'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/8.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Call Now'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.Button0 - CANCEL'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.Button0 - CALL'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - 1300886688'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/9.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.Button0 - CANCEL'), 0)

'3 dots'
Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.ImageView0 (2)'), 0)

WebUI.delay(2)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/10.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Change Wallet Account'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Change Wallet Account (1)'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - This account will be used for all activities related to Wallet on the app.'), 
    0)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Savings Account-i'), 0)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - 164017810625'), 0)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - RM 1744294.62'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - MAE'), 0)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - 514712001309'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - RM 1022.77'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - MAE'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Confirm'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/11.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Confirm'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - View Transactions'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - View Transactions'), 0)

WebUI.delay(3)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Transactions'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/12.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/spy/UAT - wallet CROSS child'), 0)

WebUI.delay(3)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Transfer (1)'), 0)

not_run: WebUI.delay(3)

not_run: Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Transfer (1)'), 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.setText(findTestObject('MAYA Wallet spending/android.widget.EditText0'), 'pass1234', 0)

not_run: Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.EditText0 - '), 0)

not_run: Mobile.tapAtPosition(width * 0.91018, height * 0.09166)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Transfer (2)'), 0)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - TO OWN'), 0)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - TO OTHERS'), 0)

not_run: Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - DUITNOW'), 0)

WebUI.delay(3)

not_run: Mobile.tap(findTestObject('MAYA Wallet spending/spy/UAT - Wallet BACK btn from TRNS'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Pay Bills (1)'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Pay Bills (1)'), 0)

Mobile.setText(findTestObject('MAYA Wallet spending/android.widget.EditText0'), 'pass1234', 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.EditText0 - '), 0)

Mobile.tapAtPosition(width * 0.90740, height * 0.94791)

WebUI.delay(5)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Pay Bills (2)'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - BILLERS'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - JOMPAY'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - New Payment'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Favourites'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Reload (1)'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Reload (1)'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Reload (2)'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.ImageView0 (5)'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Pay Cards (1)'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Split Bill (1)'), 0)

WebUI.delay(5)

'horizontal swipe'
Mobile.swipe(890, 1500, 200, 1500)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/13.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Movie Tickets'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Movie Tickets'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/android.widget.TextView0 - Movie Tickets (1)'), 0)

WebUI.delay(5)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/14.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/android.widget.ImageView0 (6)'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - Flight Tickets'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - Flight Tickets'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - Bus Tickets'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/15.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - Bus Tickets'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - Travel'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - ERL Tickets'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - ERL Tickets'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - KLIA Ekspres'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/16.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - TICKETS'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - PAST'), 0)

Mobile.getText(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - Buy Tickets'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - Change Wallet Account'), 0)

'vertical swipe'
Mobile.swipe(490, 1440, 490, 770)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - Savings Account'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.TextView0 - Show Balance on Dashboard'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/wallet part 2/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('MAYA Wallet spending/spy/UAT - Wallet - HOME'), 0)

Mobile.takeScreenshot('/Users/mosaj/katalon/screenshots/wallet/17.jpeg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

not_run: Mobile.closeApplication()

