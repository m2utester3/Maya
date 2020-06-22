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

Mobile.startApplication('/Users/mosaj/Desktop/apk/app-sit-universal-release.apk', false)

def height = Mobile.getDeviceHeight()

def width = Mobile.getDeviceWidth()

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Skip'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Skip'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Hello'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Hello'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Lets Get Started'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - No account Get started with MAE'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - No account Get started with MAE'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Your money moments start here'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Get an account that helps you with your day to day spending. Set it all up from your phone.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Next'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Next'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Whats your full name and mobile number'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Full name (as per MyKadPassport)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your full name'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your full name'), 'Gohar Mohammad Mosaj', 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Mobile number'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - 60'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0'), '1126311930', 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Hi M Mosaj Gohar Tell us your ID type and number'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - MyKad'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.view.ViewGroup0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - MyKad number'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your MyKad number'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Passport'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.view.ViewGroup0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Passport number'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter passport number'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter passport number'), 'z3824603', 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Date of Birth'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Enter date of birth'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Enter date of birth'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Cancel'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - 2008'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.ImageView0'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.ImageView0'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.ImageView0'), 0)

WebUI.delay(2)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - 1996'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - 1996'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/MAE - DOB'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/MAE - DOB'), 0)

WebUI.delay(10)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Nationality'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Select Nationality'), 0)

Mobile.tapAtPosition(295, 1590)

WebUI.delay(15)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Cancel (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Whats your address'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Address line 1'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your address'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your address'), '21-11', 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Address line 2'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your address (1)'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your address (1)'), 'Bukit Bintang', 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - City'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your city'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your city'), 'Kuala Lumpur', 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - State'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Please Select'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Please Select'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Cancel (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - WP KUALA LUMPUR'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Postcode'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your postcode'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (1)'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your postcode'), '50200', 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Whats your email address and invite code (if any)'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Email address'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter email address'), 0)

Mobile.setText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter email address'), 'mosajgohar@gmail.com', 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Invite code (optional)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.EditText0 - Enter your code'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Hi Mosaj go'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - We need to know if its really you. Lets take a selfie and capture your ID.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Find a place with good lighting'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Ensure your MyKad or passport is clear and readable'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Ensure your face fits in the frame and all your facial features can be seen clearly'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Passport Verification'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Snap a photo of your passport biodata page.'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.ImageView0 (2)'), 0)

WebUI.delay(20)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Passport Verification'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Snap a photo of your passport biodata page.'), 
    0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Retake'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Time for a selfie'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - If its blurry you could always retake'), 
    0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.ImageView0 (3)'), 0)

WebUI.delay(20)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (2)'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/MAE Onboarding/android.widget.TextView0 - Continue (2)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/MAE Onboarding/MAE - Final onboarding Msg'), 0)

not_run: Mobile.closeApplication()

