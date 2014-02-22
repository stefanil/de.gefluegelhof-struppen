package conf

import java.io.File
import play.api._
import com.typesafe.config.ConfigFactory

/**
 * @author stefan.illgen
 */
object Global extends GlobalSettings {
  
  var mode = Mode.Prod
  
  override def onLoadConfig(config: Configuration, path: File, classloader: ClassLoader, mode: Mode.Mode): Configuration = {
    this.mode = mode
    val modeSpecificConfig = config ++ Configuration(ConfigFactory.load("application."+mode.toString.toLowerCase+".conf"))
    super.onLoadConfig(modeSpecificConfig, path, classloader, mode)
  }
  
  def isDevMode = {
    mode == Mode.Dev
  }
  
  def isTestMode = {
    mode == Mode.Test
  }
  
  def isProdMode = {
    mode == Mode.Prod
  }
  
  def isDebugMode = {
    isDevMode && isTestMode
  }
}