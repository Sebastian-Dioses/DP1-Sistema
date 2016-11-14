
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/conf/routes
// @DATE:Mon Nov 14 13:20:47 COT 2016

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
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """controllers.SessionC.login()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""", """controllers.SessionC.authenticate()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""", """controllers.SessionC.logout()"""),
    ("""GET""", prefix, """controllers.Application.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """simulation""", """controllers.Application.simulation()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pedido""", """controllers.PedidosC.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pedido/new""", """controllers.PedidosC.newO()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pedido/add""", """controllers.PedidosC.create()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pedido/detail""", """controllers.PedidosC.detail(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pedido/delete""", """controllers.PedidosC.delete(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user""", """controllers.UsuariosC.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/new""", """controllers.UsuariosC.newO()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/add""", """controllers.UsuariosC.create()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ciudad""", """controllers.CiudadesC.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ciudad/new""", """controllers.CiudadesC.newO()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ciudad/add""", """controllers.CiudadesC.create()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persona""", """controllers.PersonasC.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vuelo""", """controllers.VuelosC.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_SessionC_login0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_SessionC_login0_invoker = createInvoker(
    controllers.SessionC.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SessionC",
      "login",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """login"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_SessionC_authenticate1_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_SessionC_authenticate1_invoker = createInvoker(
    controllers.SessionC.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SessionC",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_SessionC_logout2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_SessionC_logout2_invoker = createInvoker(
    controllers.SessionC.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SessionC",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_index3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index3_invoker = createInvoker(
    controllers.Application.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_simulation4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("simulation")))
  )
  private[this] lazy val controllers_Application_simulation4_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_PedidosC_index5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido")))
  )
  private[this] lazy val controllers_PedidosC_index5_invoker = createInvoker(
    controllers.PedidosC.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PedidosC",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """pedido"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_PedidosC_newO6_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/new")))
  )
  private[this] lazy val controllers_PedidosC_newO6_invoker = createInvoker(
    controllers.PedidosC.newO(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PedidosC",
      "newO",
      Nil,
      "GET",
      """""",
      this.prefix + """pedido/new"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_PedidosC_create7_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/add")))
  )
  private[this] lazy val controllers_PedidosC_create7_invoker = createInvoker(
    controllers.PedidosC.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PedidosC",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """pedido/add"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PedidosC_detail8_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/detail")))
  )
  private[this] lazy val controllers_PedidosC_detail8_invoker = createInvoker(
    controllers.PedidosC.detail(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PedidosC",
      "detail",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """pedido/detail"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PedidosC_delete9_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/delete")))
  )
  private[this] lazy val controllers_PedidosC_delete9_invoker = createInvoker(
    controllers.PedidosC.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PedidosC",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """pedido/delete"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UsuariosC_index10_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UsuariosC_index10_invoker = createInvoker(
    controllers.UsuariosC.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosC",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UsuariosC_newO11_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/new")))
  )
  private[this] lazy val controllers_UsuariosC_newO11_invoker = createInvoker(
    controllers.UsuariosC.newO(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosC",
      "newO",
      Nil,
      "GET",
      """""",
      this.prefix + """user/new"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_UsuariosC_create12_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/add")))
  )
  private[this] lazy val controllers_UsuariosC_create12_invoker = createInvoker(
    controllers.UsuariosC.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosC",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """user/add"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CiudadesC_index13_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad")))
  )
  private[this] lazy val controllers_CiudadesC_index13_invoker = createInvoker(
    controllers.CiudadesC.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CiudadesC",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """ciudad"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CiudadesC_newO14_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad/new")))
  )
  private[this] lazy val controllers_CiudadesC_newO14_invoker = createInvoker(
    controllers.CiudadesC.newO(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CiudadesC",
      "newO",
      Nil,
      "GET",
      """""",
      this.prefix + """ciudad/new"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_CiudadesC_create15_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad/add")))
  )
  private[this] lazy val controllers_CiudadesC_create15_invoker = createInvoker(
    controllers.CiudadesC.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CiudadesC",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """ciudad/add"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_PersonasC_index16_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persona")))
  )
  private[this] lazy val controllers_PersonasC_index16_invoker = createInvoker(
    controllers.PersonasC.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonasC",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """persona"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_VuelosC_index17_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vuelo")))
  )
  private[this] lazy val controllers_VuelosC_index17_invoker = createInvoker(
    controllers.VuelosC.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VuelosC",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """vuelo"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Assets_at18_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
    controllers.Assets.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_SessionC_login0_route(params) =>
      call { 
        controllers_SessionC_login0_invoker.call(controllers.SessionC.login())
      }
  
    // @LINE:7
    case controllers_SessionC_authenticate1_route(params) =>
      call { 
        controllers_SessionC_authenticate1_invoker.call(controllers.SessionC.authenticate())
      }
  
    // @LINE:8
    case controllers_SessionC_logout2_route(params) =>
      call { 
        controllers_SessionC_logout2_invoker.call(controllers.SessionC.logout())
      }
  
    // @LINE:10
    case controllers_Application_index3_route(params) =>
      call { 
        controllers_Application_index3_invoker.call(controllers.Application.index())
      }
  
    // @LINE:11
    case controllers_Application_simulation4_route(params) =>
      call { 
        controllers_Application_simulation4_invoker.call(controllers.Application.simulation())
      }
  
    // @LINE:13
    case controllers_PedidosC_index5_route(params) =>
      call { 
        controllers_PedidosC_index5_invoker.call(controllers.PedidosC.index())
      }
  
    // @LINE:14
    case controllers_PedidosC_newO6_route(params) =>
      call { 
        controllers_PedidosC_newO6_invoker.call(controllers.PedidosC.newO())
      }
  
    // @LINE:15
    case controllers_PedidosC_create7_route(params) =>
      call { 
        controllers_PedidosC_create7_invoker.call(controllers.PedidosC.create())
      }
  
    // @LINE:16
    case controllers_PedidosC_detail8_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PedidosC_detail8_invoker.call(controllers.PedidosC.detail(id))
      }
  
    // @LINE:17
    case controllers_PedidosC_delete9_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PedidosC_delete9_invoker.call(controllers.PedidosC.delete(id))
      }
  
    // @LINE:19
    case controllers_UsuariosC_index10_route(params) =>
      call { 
        controllers_UsuariosC_index10_invoker.call(controllers.UsuariosC.index())
      }
  
    // @LINE:20
    case controllers_UsuariosC_newO11_route(params) =>
      call { 
        controllers_UsuariosC_newO11_invoker.call(controllers.UsuariosC.newO())
      }
  
    // @LINE:21
    case controllers_UsuariosC_create12_route(params) =>
      call { 
        controllers_UsuariosC_create12_invoker.call(controllers.UsuariosC.create())
      }
  
    // @LINE:23
    case controllers_CiudadesC_index13_route(params) =>
      call { 
        controllers_CiudadesC_index13_invoker.call(controllers.CiudadesC.index())
      }
  
    // @LINE:24
    case controllers_CiudadesC_newO14_route(params) =>
      call { 
        controllers_CiudadesC_newO14_invoker.call(controllers.CiudadesC.newO())
      }
  
    // @LINE:25
    case controllers_CiudadesC_create15_route(params) =>
      call { 
        controllers_CiudadesC_create15_invoker.call(controllers.CiudadesC.create())
      }
  
    // @LINE:27
    case controllers_PersonasC_index16_route(params) =>
      call { 
        controllers_PersonasC_index16_invoker.call(controllers.PersonasC.index())
      }
  
    // @LINE:29
    case controllers_VuelosC_index17_route(params) =>
      call { 
        controllers_VuelosC_index17_invoker.call(controllers.VuelosC.index())
      }
  
    // @LINE:32
    case controllers_Assets_at18_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at18_invoker.call(controllers.Assets.at(path, file))
      }
  }
}
