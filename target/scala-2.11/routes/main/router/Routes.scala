
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/conf/routes
// @DATE:Sun Nov 06 16:26:51 COT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """controllers.Application.login()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""", """controllers.Application.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """simulation""", """controllers.Application.simulation()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registroPedido""", """controllers.Application.test()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user""", """controllers.Application.users()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newuser""", """controllers.Application.newuser()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Application_login0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_login0_invoker = createInvoker(
    controllers.Application.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_Application_index1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_Application_index1_invoker = createInvoker(
    controllers.Application.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """index"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_simulation2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("simulation")))
  )
  private[this] lazy val controllers_Application_simulation2_invoker = createInvoker(
    controllers.Application.simulation(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "simulation",
      Nil,
      "GET",
      """""",
      this.prefix + """simulation"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_test3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registroPedido")))
  )
  private[this] lazy val controllers_Application_test3_invoker = createInvoker(
    controllers.Application.test(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "test",
      Nil,
      "GET",
      """""",
      this.prefix + """registroPedido"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_users4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_Application_users4_invoker = createInvoker(
    controllers.Application.users(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "users",
      Nil,
      "GET",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_newuser5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newuser")))
  )
  private[this] lazy val controllers_Application_newuser5_invoker = createInvoker(
    controllers.Application.newuser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newuser",
      Nil,
      "GET",
      """""",
      this.prefix + """newuser"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_at6_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
    controllers.Assets.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Application_login0_route(params) =>
      call { 
        controllers_Application_login0_invoker.call(controllers.Application.login())
      }
  
    // @LINE:6
    case controllers_Application_index1_route(params) =>
      call { 
        controllers_Application_index1_invoker.call(controllers.Application.index())
      }
  
    // @LINE:7
    case controllers_Application_simulation2_route(params) =>
      call { 
        controllers_Application_simulation2_invoker.call(controllers.Application.simulation())
      }
  
    // @LINE:8
    case controllers_Application_test3_route(params) =>
      call { 
        controllers_Application_test3_invoker.call(controllers.Application.test())
      }
  
    // @LINE:9
    case controllers_Application_users4_route(params) =>
      call { 
        controllers_Application_users4_invoker.call(controllers.Application.users())
      }
  
    // @LINE:10
    case controllers_Application_newuser5_route(params) =>
      call { 
        controllers_Application_newuser5_invoker.call(controllers.Application.newuser())
      }
  
    // @LINE:14
    case controllers_Assets_at6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(controllers.Assets.at(path, file))
      }
  }
}