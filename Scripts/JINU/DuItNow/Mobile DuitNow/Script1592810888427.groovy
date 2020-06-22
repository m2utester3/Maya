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

Mobile.startApplication('C:\\Users\\LENOVO\\Downloads\\app-sit-universal-release.apk', true)

Mobile.tap(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - Transfer'), 0)

Mobile.setText(findTestObject('Maya/duitnow Mobile/android.widget.EditText0'), 'pass1234', 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - DUITNOW'), 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/android.widget.ImageView0'), 0)

Mobile.setText(findTestObject('Maya/duitnow Mobile/android.widget.EditText0 (1)'), '12345', 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - Continue'), 0)

Mobile.clearText(findTestObject('Maya/duitnow Mobile/android.widget.EditText0 - 123 45'), 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - Home Doc'), 0)

Mobile.tap(findTestObject('Maya/duitnow Mobile/android.widget.TextView0 - Continue'), 0)

Mobile.clearText(findTestObject('Maya/duitnow Mobile/android.widget.EditText0 - 918 1098 5083 3'), 0)


