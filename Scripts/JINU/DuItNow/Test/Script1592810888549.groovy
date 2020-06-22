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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (6).apk', true)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Today'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 19'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Test'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 19 Apr 2020'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - RM 2.00'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 0109030162'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer Now'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Transfer scheduled'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 179860600M'), 0)

Mobile.getText(findTestObject('Maya/duitNowFav/android.widget.TextView0 - 16 Apr 2020 0819 PM'), 0)

Mobile.tap(findTestObject('Maya/duitNowFav/android.widget.TextView0 - Done (1)'), 0)

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (6).apk', true)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/NRIC Passport/android.widget.EditText0'), 'pass1234', 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - DUITNOW'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - DuitNow (1)'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.EditText0 - Enter passport number'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - ID cannot be empty Please enter an ID'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.EditText0 - Enter passport number (1)'), 0)

Mobile.setText(findTestObject('Maya/NRIC Passport/android.widget.EditText0 - Enter passport number'), 'ABCDEFG', 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Please select a country'), 0)

Mobile.getText(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Please select a country'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Maya/NRIC Passport/android.view.ViewGroup0'), 0)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (6).apk', true)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0'), 0)

Mobile.setText(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0'), 'NRC', 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - NRC 2'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - NRC 2'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - Please enter a recipient reference.'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0 (1)'), 0)

Mobile.setText(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0 (1)'), 'TRS', 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0 (1)'), 0)

Mobile.setText(findTestObject('Maya/duitNow Fav TAC/android.widget.EditText0 (1)'), 'TRS', 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - RM 3.00'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitNow Fav TAC/android.widget.TextView0 - Transfer Now'), 0)

Mobile.closeApplication()

