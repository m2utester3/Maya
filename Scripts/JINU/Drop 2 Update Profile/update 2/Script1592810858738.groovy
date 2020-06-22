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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (17).apk', true)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Name'), 0)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Mobile number'), 0)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Email address'), 0)

Mobile.setText(findTestObject('Maya/update Profile/android.widget.EditText0 - check'), 'ch', 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Save Changes'), 0)

Mobile.verifyElementExist(findTestObject('Maya/update Profile/android.widget.TextView0 - Name must contain at least 3 alphabetical characters and space(s) only.'), 
    0)

Mobile.setText(findTestObject('Maya/update Profile/android.widget.EditText0 - ch'), 'Test', 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 6019  028'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 2 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (1)'), 0)

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (17).apk', true)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Take a photo'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Take a photo'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Cancel'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Choose from library'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (6)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0'), 0)

Mobile.closeApplication()

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Please enter a valid mobile number in order to continue.'), 
    0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.EditText0 - Test'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 6019  028'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 6019  028'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 1'), 0)

Mobile.getText(findTestObject('Maya/update Profile/android.widget.TextView0 - Whats your mobile number'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 6'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 3 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - 7'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Confirm'), 0)

not_run: Mobile.tap(findTestObject('Maya/update Profile/android.widget.EditText0 - thgmail.com'), 0)

Mobile.setText(findTestObject('Maya/update Profile/android.widget.EditText0 - thgmail.com (1)'), 'th', 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Save Changes'), 0)

Mobile.verifyElementExist(findTestObject('Maya/update Profile/android.widget.TextView0 - Please enter a valid email address.'), 
    0)

Mobile.setText(findTestObject('Maya/update Profile/android.widget.EditText0 - th'), 'th@gmail.com', 0)
Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Take a photo'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (4)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Take a photo'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (5)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Cancel'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (3)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Choose from library'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.ImageView0 (6)'), 0)

Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0'), 0)


Mobile.tap(findTestObject('Maya/update Profile/android.widget.TextView0 - Save Changes'), 0)

Mobile.verifyElementExist(findTestObject('Maya/update Profile/android.widget.TextView0 - Profile successfully updated.'), 
    0)

Mobile.closeApplication()

