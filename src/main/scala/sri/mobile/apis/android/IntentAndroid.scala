package sri.mobile.apis.android

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait IntentAndroid extends js.Object {

  def openURL(url: String): Unit = js.native

  def canOpenURL(url: String, callback: js.Function): Unit = js.native

  def getInitialURL(callback: js.Function1[String, _]): Unit = js.native
}

@js.native
@JSImport("react-native","IntentAndroid")
object IntentAndroid extends IntentAndroid