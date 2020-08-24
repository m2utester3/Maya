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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\app-uat-universal-release.apk', false)

Mobile.tap(findTestObject('duitnow/android.widget.TextView0 - Transfer'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot1', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('duitnow/android.widget.EditText0'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('duitnow/android.view.ViewGroup0'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot2', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('duitnow/android.view.ViewGroup0 (1)'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - DuitNow'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - DuitNow'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot3', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Mobile Number'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - Mobile Number'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot4', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('duitnow/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('duitnow/android.widget.TextView0 - Home Doc'), 0)

Mobile.tap(findTestObject('duitnow/android.widget.TextView0 - Continue'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot5', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - The DuitNow ID entered is not valid.'), 
    0)

Mobile.clearText(findTestObject('duitnow/android.widget.EditText0 - 918 1098 5083 3'), 0)

Mobile.setText(findTestObject('duitnow/android.widget.EditText0 (1)'), '123', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('duitnow/android.widget.TextView0 - Continue'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Please input valid transfer details.'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot6', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - Please input valid transfer details.'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('duitnow/android.widget.EditText0 - 123'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('duitnow/android.widget.EditText0 (1)'), '60109011236', 0)

Mobile.tap(findTestObject('duitnow/android.widget.TextView0 - Continue'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - 601 3600 0045'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - 601 3600 0045'), 0)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Mobile Number (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot7', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - Mobile Number (1)'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Enter amount'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - Enter amount'), 0)

Mobile.delay(0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('duitnow/android.widget.ImageView0 (1)'), 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot9', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Amount needs to be at least RM 0.01.'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - Amount needs to be at least RM 0.01.'), 0)

Mobile.tap(findTestObject('duitnow/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('duitnow/android.widget.TextView0 - 0'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot10', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('duitnow/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.getText(findTestObject('duitnow/android.widget.TextView0 - 601 3600 0045 (1)'), 0)

Mobile.verifyElementExist(findTestObject('duitnow/android.widget.TextView0 - 601 3600 0045 (1)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('duitnow/android.widget.TextView0 - Continue (1)'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (2)'), '@@', 0)

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Please input a valid recipient reference.'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot11', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - Please input a valid recipient reference.'), 
    0)

Mobile.clearText(findTestObject('Maya/duitnow/android.widget.EditText0 - '), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (3)'), 'DuTest', 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot12', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Continue (1)'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Confirmation'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - 601 3600 0045'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot13', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - 601 3600 0045'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Date'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - Date'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - One-Off Transfer (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot14', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Done (2)'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - ID type'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Mobile Number'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot16', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - Mobile Number'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Today (2)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - One-Off Transfer (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot17', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - DuTest'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - Enter recipient reference'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Mobile Number'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - Mobile Number'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - RM 0.25'), 0)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Enter amount'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot18', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Transfer Now (2)'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - One-Tap Authorisation'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot19', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - One-Tap Authorisation'), 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Approve'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Reference ID (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - Reference ID (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot20', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/duitnow/android.widget.TextView0 - Date  time (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/duitnow/android.widget.TextView0 - Date  time (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot22', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Transfer successful'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot21', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Transfer successful'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 17180008563M'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 17180008563M'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 08 JUL 2020 1055 PM'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - 08 JUL 2020 1055 PM'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (9)'), 0)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.Button0 - Cancel (1)'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt (1)'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt (1)'), 0)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (10)'), 0)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Share Receipt'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - 17180008563M'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot24', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - 17180008563M'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Beneficiary name'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Beneficiary name'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Amount'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Amount'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Recipient reference'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - RM 2.00'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Recipient reference'), 0)

Mobile.verifyElementExist(findTestObject('Maya/New_Transfer/android.view.View0 - Test'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (10)'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Add to Favourites'), 0)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Add as Favourites'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot25', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Add to Favourites (1)'), 0)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot23', FailureHandling.STOP_ON_FAILURE)

Mobile.getText(findTestObject('Maya/New_Transfer/android.widget.TextView0 - SANDY LAM HUI MING Successfully added to Favourites'), 
    0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Done (1)'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot26', FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.ImageView0 (11)'), 0)

'Transaction history'
Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - Wallet'), 0)

Mobile.tap(findTestObject('Maya/New_Transfer/android.widget.TextView0 - View Transactions'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\LENOVO\\Screenshot\\Third Party\\Screenshot27', FailureHandling.STOP_ON_FAILURE)

Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\app-uat-universal-release.apk', true)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Ferz Malaysia'), 0)

Mobile.clearText(findTestObject('Maya/duitnow/android.widget.EditText0 - 011 2737 3395'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (4)'), '0172246410', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Continue (2)'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 (5)'), 'tesstestestestestestest', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Continue (3)'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 - Optional'), 'abcdefghijklmnop', 0)

Mobile.clearText(findTestObject('Maya/duitnow/android.widget.EditText0 - abcdefghijklmno'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 - Optional'), '@#$%^&&&', 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Transfer Now (3)'), 0)

Mobile.clearText(findTestObject('Maya/duitnow/android.widget.EditText0 -  (1)'), 0)

Mobile.setText(findTestObject('Maya/duitnow/android.widget.EditText0 - Optional'), 'abcd', 0)

Mobile.tap(findTestObject('Maya/duitnow/android.widget.TextView0 - Transfer Now (3)'), 0)

Mobile.closeApplication()

