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

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Quick Actions'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/QRPay/android.widget.ImageView0'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Scan  Pay'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Enter amount'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - RM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.EditText0 - 0.00'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/QRPay/android.view.ViewGroup0'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/QRPay/android.widget.ImageView0 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Confirmation'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - MOHAMED SYAHID'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - 1140 1382 3409'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Pay From'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Savings Account'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Pay'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Pay'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - transfer'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - successful'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - 1140 1382 3409 (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - MOHAMED SYAHID (1)'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - RM 2.50'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Ref ID'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - 180046685Q'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Time'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - 30 Apr 2020 1122 PM'), 0)

Mobile.getText(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Done'), 0)

Mobile.tap(findTestObject('MAYA Drop 2/QRPay/android.widget.TextView0 - Done'), 0)

not_run: Mobile.closeApplication()

