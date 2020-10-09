package com.murali.sample.controllers

import com.murali.sample.views.html.index
import javax.inject._
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
    def home = Action {implicit request =>
      Ok(index())
  }
}



