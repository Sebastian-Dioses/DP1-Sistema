<<<<<<< HEAD
// @SOURCE:C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/conf/routes
// @HASH:d1bea76cfee579fdc40e5e5f98ef52cabbe97aee
// @DATE:Tue Oct 25 16:02:06 COT 2016
=======
// @SOURCE:C:/Users/JoseLuis/Documents/GitHub/DP1-Sistema/conf/routes
<<<<<<< HEAD
// @HASH:7c1552daf4003bf61d082a1477bd20f0e05258cf
// @DATE:Tue Oct 25 17:51:37 COT 2016
>>>>>>> origin/JL
=======
// @HASH:1714834964d038433324eff6ae66c7f363c36972
// @DATE:Tue Oct 25 18:51:52 COT 2016
>>>>>>> origin/JL


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_Application_login0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:6
private[this] lazy val controllers_Application_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index"))))
        

// @LINE:7
private[this] lazy val controllers_Application_simulation2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("simulation"))))
        

// @LINE:8
private[this] lazy val controllers_Application_test3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registroPedido"))))
        

<<<<<<< HEAD
// @LINE:11
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_WebJarAssets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """simulation""","""controllers.Application.simulation()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registroPedido""","""controllers.Application.test()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
=======
// @LINE:9
private[this] lazy val controllers_Application_users4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user"))))
        

// @LINE:10
private[this] lazy val controllers_Application_newuser5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newuser"))))
        

// @LINE:14
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
<<<<<<< HEAD
def documentation = List(("""GET""", prefix,"""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """simulation""","""controllers.Application.simulation()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registroPedido""","""controllers.Application.test()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user""","""controllers.Application.users()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
>>>>>>> origin/JL
=======

// @LINE:15
private[this] lazy val controllers_WebJarAssets_at7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """simulation""","""controllers.Application.simulation()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registroPedido""","""controllers.Application.test()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user""","""controllers.Application.users()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newuser""","""controllers.Application.newuser()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
>>>>>>> origin/JL
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Application_login0(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:6
case controllers_Application_index1(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """index"""))
   }
}
        

// @LINE:7
case controllers_Application_simulation2(params) => {
   call { 
        invokeHandler(controllers.Application.simulation(), HandlerDef(this, "controllers.Application", "simulation", Nil,"GET", """""", Routes.prefix + """simulation"""))
   }
}
        

// @LINE:8
case controllers_Application_test3(params) => {
   call { 
        invokeHandler(controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Nil,"GET", """""", Routes.prefix + """registroPedido"""))
   }
}
        

<<<<<<< HEAD
// @LINE:11
case controllers_Assets_at4(params) => {
=======
// @LINE:9
case controllers_Application_users4(params) => {
   call { 
        invokeHandler(controllers.Application.users(), HandlerDef(this, "controllers.Application", "users", Nil,"GET", """""", Routes.prefix + """user"""))
   }
}
        

<<<<<<< HEAD
// @LINE:12
case controllers_Assets_at5(params) => {
>>>>>>> origin/JL
=======
// @LINE:10
case controllers_Application_newuser5(params) => {
   call { 
        invokeHandler(controllers.Application.newuser(), HandlerDef(this, "controllers.Application", "newuser", Nil,"GET", """""", Routes.prefix + """newuser"""))
   }
}
        

// @LINE:14
case controllers_Assets_at6(params) => {
>>>>>>> origin/JL
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:12
case controllers_WebJarAssets_at5(params) => {
=======
// @LINE:13
case controllers_WebJarAssets_at6(params) => {
>>>>>>> origin/JL
=======
// @LINE:15
case controllers_WebJarAssets_at7(params) => {
>>>>>>> origin/JL
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        
}

}
     