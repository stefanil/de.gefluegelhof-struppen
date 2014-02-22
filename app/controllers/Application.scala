package controllers

import play.api._
import play.api.mvc._
import play.api.templates.Html
import models.Portfolio

/**
 * @author stefan.illgen
 */
object Application extends Controller {

  def index = Action {
    Redirect("/unternehmen")
  }

  def angebot = Action { implicit request =>
    Ok(views.html.angebot.render(Portfolio.apply, request))
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