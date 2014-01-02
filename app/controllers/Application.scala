package controllers

import java.io.File
import play.api._
import play.api.mvc._
import play.api.templates.Html
import java.net.URI
import java.net.URL
import java.io.FileReader
import java.util.ArrayList
import scala.collection.mutable.MutableList 

/**
 * @author stefan.illgen
 */
object Application extends Controller {

  def index = Action {
    Redirect("/unternehmen")
  }

  def angebot = Action {
    Ok(views.html.angebot.render)
  }

  def oeffnungszeiten = Action {
    Ok(views.html.oeffnungszeiten.render)
  }

  def kontakt = Action {
    Ok(views.html.kontakt.render)
  }
  
  def unternehmen = Action {
    Ok(views.html.unternehmen.render)
  }

}