/**
 *
 */
package controllers

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import scala.Option.option2Iterable
import conf.Global
import play.api.mvc.AnyContent
import play.api.mvc.Request
import play.api.mvc.Call

/**
 * @author stefan.illgen
 *
 */
object AssetUtil {

  def at(file: String, request: Request[AnyContent]): String = {    
    // relative path
    val call:Call = controllers.routes.Assets.at(file)    
    if(exists(call.absoluteURL(false)(request)))
    	return controllers.routes.Assets.at(file).toString;
    // absolute path
    if(exists(file))
      return file;
    // else ..
    return "ERROR"
  }

  private def exists(path: String): Boolean = {
    try {
      val urlc = (new URL(path)).openConnection().asInstanceOf[HttpURLConnection]
      urlc.connect()
      return urlc.getResponseCode() == HttpURLConnection.HTTP_OK
    } catch {
      case ioe: IOException => if(Global.isDebugMode) ioe.printStackTrace
      case npe: NullPointerException => if(Global.isDebugMode) npe.printStackTrace
    }
    false
  }

}