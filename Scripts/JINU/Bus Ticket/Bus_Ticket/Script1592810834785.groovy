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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release (3).apk', false)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - More'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Bus Tickets'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - 0'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - 9'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - 8'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - 3'), 0)

Mobile.getText(findTestObject('Maya/Bus Ticket/android.view.View0 - From'), 0)

Mobile.getText(findTestObject('Maya/Bus Ticket/android.view.View0 - To'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.view.View0 - From'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Kuala Lumpur'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.view.View0 - To'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.view.View0 - Melaka (Malacca)'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.Button0'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.view.View0 -  Depart'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.view.View0 - 23'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.Button0 - SEARCH'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.view.View0 - KLIA - Melaka (Malacca)'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.Button0 (1)'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Melaka (Malacca)'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.view.View0 - Kuala Lumpur'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.Button0 - SEARCH'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.Image0 - SEE'), 0)

Mobile.getText(findTestObject('Maya/Bus Ticket/android.view.View0 - Pick-Up Point'), 0)

Mobile.getText(findTestObject('Maya/Bus Ticket/android.view.View0 - Drop-Off Point'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.view.View0 - 01'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.Button0 - CONTINUE DETAILS'), 0)

Mobile.setText(findTestObject('Maya/Bus Ticket/android.widget.EditText0'), 'test11', 0)

Mobile.setText(findTestObject('Maya/Bus Ticket/android.widget.EditText0 (1)'), 'jh@gmail.com', 0)

Mobile.setText(findTestObject('Maya/Bus Ticket/android.widget.EditText0 (2)'), '1164377717', 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.Button0 - CONTINUE BOOKING'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.view.View0 - Trip'), 0)

Mobile.getText(findTestObject('Maya/Bus Ticket/android.widget.TextView0 -  Selected seats'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.Button0 - CONTINUE PAYMENT'), 0)

Mobile.setText(findTestObject('Maya/Bus Ticket/android.widget.EditText0 (3)'), 'pass1234', 0)

Mobile.getText(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Date'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Pay Now'), 0)

Mobile.getText(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Payment failed'), 0)

Mobile.tap(findTestObject('Maya/Bus Ticket/android.widget.TextView0 - Done'), 0)

Mobile.closeApplication()

