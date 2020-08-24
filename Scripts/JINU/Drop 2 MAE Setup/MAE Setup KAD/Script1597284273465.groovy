import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\LENOVO\\Katalon Studio\\app-uat-universal-release.apk', true)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Next (2)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Skip (1)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Maybank2u (1)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - No account Get started with MAE (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Your money moments start here'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Next (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Whats your full name and mobile number (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Full name (as per MyKadPassport) (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Mobile number (1)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your full name (1)'), 'ab', 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 (1)'), 'gh', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (2)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Name should contain at least 6 characters. (1)'), 0)

Mobile.clearText(findTestObject('Maya/spy/android.widget.EditText0 - ab (1)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your full name (1)'), 'Khairul Nisa', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (2)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Your mobile number should contain digits only. (1)'), 
    0)

Mobile.clearText(findTestObject('Maya/spy/android.widget.EditText0 - gh'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 (1)'), '1143', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (2)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Mobile number should contain at least 10 digits. (1)'), 
    0)

Mobile.clearText(findTestObject('Maya/spy/android.widget.EditText0 - 1143'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 (1)'), '1164377717', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (2)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Hi Khairul Nisa Tell us your ID type and number (1)'), 
    0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - MyKad (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Passport (1)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.view.ViewGroup0 (2)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.ImageView0 (6)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (2)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - MyKad (1)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.view.ViewGroup0 (3)'), 0)

Mobile.tapAndHoldAtPosition(150, 700, 2)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Passport number (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Date of Birth (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Nationality (1)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter passport number (1)'), 'T5808', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Enter date of birth (1)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - 2008 (1)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.ImageView0 (7)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.ImageView0 (7)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - 1999'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Done (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Select Nationality (1)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.ImageView0 (8)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Done (4)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (2)'), 0)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(119, 172, 2)

not_run: Mobile.tap(findTestObject('Maya/spy/android.widget.ImageView0 (6)'), 0)

not_run: Mobile.tap(findTestObject('Maya/spy/android.view.ViewGroup0 (2)'), 0)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHoldAtPosition(117, 609, 2)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - MyKad number (1)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your MyKad number (2)'), '123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

not_run: Mobile.tapAndHoldAtPosition(121, 607, 1)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - MyKad number should contain 12 digits. (1)'), 0)

Mobile.clearText(findTestObject('Maya/spy/android.widget.EditText0 - 123'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your MyKad number (2)'), '!@#$%', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - MyKad number should contain 12 digits. (1)'), 0)

Mobile.clearText(findTestObject('Maya/spy/android.widget.EditText0 -  (1)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your MyKad number (2)'), '123456789012', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - The MyKad number you entered is invalid. (1)'), 0)

Mobile.clearText(findTestObject('Maya/spy/android.widget.EditText0 - 123456789012 (1)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your MyKad number (2)'), '850102036544', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Looks like you already have a MAE account. (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Existing MAE User'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.ImageView0 (9)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - No account Get started with MAE (2)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Next (4)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your full name (2)'), 'Khairul Nisa', 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 (2)'), '1164377717', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.view.ViewGroup0 (4)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your MyKad number (3)'), '840419025824', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Whats your residential address (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Address line 1 (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Address line 2 (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - City (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - State'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Postcode (1)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your address (4)'), 'fadghfk@@@', 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your address (5)'), 'dghkdaLFUGFFlgfgyfgofgfyGffbFOagdsodgadoydgydgODYGd', 
    0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your city (2)'), 'gdskgdFGFGHFGoffygfgfgcvfoFGFYGFYGFYgofgfgfgF', 
    0)

Mobile.tap(findTestObject('Maya/spy/android.widget.ImageView0 (10)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Done (5)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your postcode (1)'), 'ASDD', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Your postcode must not contain alphabets or special characters. (1)'), 
    0)

Mobile.clearText(findTestObject('Maya/spy/android.widget.EditText0 - ASDD'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your postcode (1)'), '102000', 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Whats your residential address (1)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.ImageView0 (11)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Done (5)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your employer name (1)'), '!@#$%^&*', 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Employer Name (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Occupation (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Sector (1)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.ImageView0 (12)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Done (5)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.ImageView0 (13)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Done (5)'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Employer name must not contain special characters. (1)'), 
    0)

Mobile.clearText(findTestObject('Maya/spy/android.widget.EditText0 -  (2)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your employer name (1)'), 'ASDDFJGFKFHDHDHDHDHDHWIIOGKKKKKKKKYEYEYEYUEHFFOGOG', 
    0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Whats your email address and invite code (if any) (1)'), 
    0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Email address (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Invite code (optional) (1)'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter email address (1)'), 'ACD', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Please enter a valid email address.'), 0)

Mobile.clearText(findTestObject('Maya/spy/android.widget.EditText0 - ACD'), 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter email address (1)'), 'th@gmail.com', 0)

Mobile.setText(findTestObject('Maya/spy/android.widget.EditText0 - Enter your code (1)'), '1234fhh', 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.clearText(findTestObject('Maya/spy/android.widget.EditText0 - 1234fhh'), 0)

Mobile.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - We need to know if its really you. Lets take a selfie and capture your ID. (1)'), 
    0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Hi Khairul Nisa'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Find a place with good lighting (1)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Ensure your MyKad or passport is clear and readable (1)'), 
    0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Ensure your face fits in the frame and all your facial features can be seen clearly (1)'), 
    0)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (3)'), 0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Lets begin by scanning the front and back of your MyKad.'), 
    0)

Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - MyKad Verification'), 0)

Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Front'), 0)

not_run: Mobile.tap(findTestObject('Maya/spy/android.widget.TextView0 - Continue (4)'), 0)

not_run: Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - If its blurry you could always retake'), 0)

not_run: Mobile.getText(findTestObject('Maya/spy/android.widget.TextView0 - Time for a selfie'), 0)

