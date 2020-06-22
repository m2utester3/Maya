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

Mobile.startApplication('C:\\Users\\Hewlett Packard\\Documents\\MAYBANK\\AUTOMATION TESTING\\APK\\app-sit-universal-release.apk', 
    false)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Flight Tickets'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Kuala Lumpur'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Kuala Lumpur - KUL'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Singapore Changi Intl Airport'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (1)'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Singapore Changi Intl Airport - SIN'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - DEPART'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Date select'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Search'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Book'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Continue'), 0)

not_run: Mobile.getText(findTestObject('Flight Ticket_19June2020/android.view.View0 - Contact Information'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/Edit contact'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Select Contact'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 - Mrs Khairul Nisa'), 0)

/*Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 - Mrs'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (2)'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (3)'), 'Khairul', 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (4)'), 'Nisa', 0)

not_run: Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Spinner0'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 -     Malaysia (60)'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 - 60'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 - 60 (1)'), '172882814', 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 - 60 (1)'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 - 60 (1)'), '+60172882814', 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (5)'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (6)'), 'test@airpaz.com', 0)*/
Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - save'), 0)

Mobile.tap(findTestObject('Flight Ticket_Nisa_12June/android.view.View0 - Passenger Data 1 - Adult'), 0)

Mobile.tap(findTestObject('Flight Ticket_Nisa_12June/passenger_data_Use Passenger List'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 - Mrs Khairul Nisa'), 0)

/*Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 - Mrs'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (2)'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (3)'), 'Khairul', 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (4)'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (7)'), 'Nisa', 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (8)'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 (2)'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - Apr'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.view.View0 - 1984'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Set'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Spinner0 - Nationality'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 -     Malaysia'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Spinner0 - No baggage'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckedTextView0 - 20KG - RM 63.00'), 0)*/
Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - save (1)'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Book Now'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.CheckBox0 - I agree to the terms and conditions of Airpaz and AK-AirAsia Non-Refundable Policy. '), 
    0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.Button0 - Submit Payment'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 (9)'), 'pass1234', 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

/*Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Activate Now'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Yes'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Confirm'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 - Your ID number'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 - Your ID number (1)'), '730903095005', 
    0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 - GalaxyA10s'), 0)

Mobile.setText(findTestObject('Flight Ticket_19June2020/android.widget.EditText0 - GalaxyA10s'), 'GalaxyA10s', 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Continue'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Continue (1)'), 0)*/
Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Pay Now'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Approve'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('Flight Ticket_19June2020/android.widget.TextView0 - Back to Home'), 0)

Mobile.closeApplication()

