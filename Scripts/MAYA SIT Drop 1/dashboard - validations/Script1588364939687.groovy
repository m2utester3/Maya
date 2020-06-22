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

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - Manage'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 5'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Manage Widgets'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Customise Top Actions'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Transfer'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Split Bills'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Reload'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Pay Bills'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Available Services'), 0)

'vertical swipe'
Mobile.swipe(490, 1440, 490, 350)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Send  Request'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Pay Card'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Movie Tickets'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Flight Tickets'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Bus Tickets'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - ERL Tickets'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Food'), 0)

WebUI.delay(5)

'vertical swipe'
Mobile.swipe(490, 500, 490, 1100)

Mobile.tap(findTestObject('dashboard validations/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Save Changes'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - Save Changes'), 0)

WebUI.delay(5)

'vertical swipe'
Mobile.swipe(490, 1440, 490, 900)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Start spending and this space will reflect your moneys activity.'), 
    0)

WebUI.delay(5)

'vertical swipe'
Mobile.swipe(490, 1440, 490, 900)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Tabung'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Saving for a getaway or rainy dayWhatever it is start your Tabung now.'), 
    0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Create Tabung'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - Create Tabung'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Start saving'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Track financial goals save with friends and boost your Tabung with Boosters to reach goals quicker than ever.'), 
    0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Lets Start'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - Lets Start'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Pick a category to start saving'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Travel'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Shopping'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Rainy Day'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Coin Jar'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - Travel'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - What are you saving for'), 0)

Mobile.setText(findTestObject('dashboard validations/android.widget.EditText0 - Enter Goal Name'), 'mosaj', 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - Continue'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - How much are you planning to save'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - When would you like to start this goal'), 
    0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - 23'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.ImageView0 (2)'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - When would you like to complete this Tabung'), 
    0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.ImageView0 (2)'), 0)

Mobile.setText(findTestObject('dashboard validations/android.widget.EditText0'), 'pass1234', 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.EditText0 - '), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Name'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - mosaj'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Goal amount'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - RM 10.00'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Start date'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - 23 Apr 2020'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - End date'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - 23 May 2020'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Whos saving'), 0)

WebUI.delay(5)

'vertical swipe'
Mobile.swipe(490, 1440, 490, 350)

Mobile.tap(findTestObject('dashboard validations/android.widget.ImageView0 (3)'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Cancel'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Done (1)'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - Done (1)'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Continue (1)'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.TextView0 - Continue (1)'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - Please select an account'), 0)

Mobile.getText(findTestObject('dashboard validations/android.widget.TextView0 - OK'), 0)

Mobile.tap(findTestObject('dashboard validations/android.widget.ImageView0 (4)'), 0)

not_run: Mobile.closeApplication()

