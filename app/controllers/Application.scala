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

  def angebot = Action { implicit request =>
    Ok(views.html.angebot.render(request))
  }

  def oeffnungszeiten = Action { implicit request =>
    Ok(views.html.oeffnungszeiten.render(request))
  }

  def kontakt = Action { implicit request =>
    Ok(views.html.kontakt.render(request))
  }
  
  def unternehmen = Action { implicit request =>
    Ok(views.html.unternehmen.render(request))
  }

}