
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/conf/routes
// @DATE:Mon Nov 14 20:48:28 COT 2016

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
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cambiarPassword""", """controllers.SessionC.changePassword()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cambiarPassword""", """controllers.SessionC.updatePassword()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cuenta""", """controllers.SessionC.account()"""),
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
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/delete""", """controllers.UsuariosC.delete(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ciudad""", """controllers.CiudadesC.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ciudad/new""", """controllers.CiudadesC.newO()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ciudad/add""", """controllers.CiudadesC.create()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ciudad/delete""", """controllers.CiudadesC.delete(id:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persona""", """controllers.PersonasC.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persona/delete""", """controllers.PersonasC.delete(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vuelo""", """controllers.VuelosC.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vuelo/delete""", """controllers.VuelosC.delete(id:Long)"""),
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

  // @LINE:9
  private[this] lazy val controllers_SessionC_changePassword3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cambiarPassword")))
  )
  private[this] lazy val controllers_SessionC_changePassword3_invoker = createInvoker(
    controllers.SessionC.changePassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SessionC",
      "changePassword",
      Nil,
      "GET",
      """""",
      this.prefix + """cambiarPassword"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SessionC_updatePassword4_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cambiarPassword")))
  )
  private[this] lazy val controllers_SessionC_updatePassword4_invoker = createInvoker(
    controllers.SessionC.updatePassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SessionC",
      "updatePassword",
      Nil,
      "POST",
      """""",
      this.prefix + """cambiarPassword"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_SessionC_account5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cuenta")))
  )
  private[this] lazy val controllers_SessionC_account5_invoker = createInvoker(
    controllers.SessionC.account(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SessionC",
      "account",
      Nil,
      "GET",
      """""",
      this.prefix + """cuenta"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_index6_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index6_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_Application_simulation7_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("simulation")))
  )
  private[this] lazy val controllers_Application_simulation7_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_PedidosC_index8_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido")))
  )
  private[this] lazy val controllers_PedidosC_index8_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_PedidosC_newO9_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/new")))
  )
  private[this] lazy val controllers_PedidosC_newO9_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_PedidosC_create10_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/add")))
  )
  private[this] lazy val controllers_PedidosC_create10_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_PedidosC_detail11_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/detail")))
  )
  private[this] lazy val controllers_PedidosC_detail11_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_PedidosC_delete12_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/delete")))
  )
  private[this] lazy val controllers_PedidosC_delete12_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_UsuariosC_index13_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UsuariosC_index13_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_UsuariosC_newO14_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/new")))
  )
  private[this] lazy val controllers_UsuariosC_newO14_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_UsuariosC_create15_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/add")))
  )
  private[this] lazy val controllers_UsuariosC_create15_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_UsuariosC_delete16_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/delete")))
  )
  private[this] lazy val controllers_UsuariosC_delete16_invoker = createInvoker(
    controllers.UsuariosC.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosC",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """user/delete"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CiudadesC_index17_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad")))
  )
  private[this] lazy val controllers_CiudadesC_index17_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_CiudadesC_newO18_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad/new")))
  )
  private[this] lazy val controllers_CiudadesC_newO18_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_CiudadesC_create19_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad/add")))
  )
  private[this] lazy val controllers_CiudadesC_create19_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_CiudadesC_delete20_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad/delete")))
  )
  private[this] lazy val controllers_CiudadesC_delete20_invoker = createInvoker(
    controllers.CiudadesC.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CiudadesC",
      "delete",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ciudad/delete"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_PersonasC_index21_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persona")))
  )
  private[this] lazy val controllers_PersonasC_index21_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_PersonasC_delete22_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persona/delete")))
  )
  private[this] lazy val controllers_PersonasC_delete22_invoker = createInvoker(
    controllers.PersonasC.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonasC",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """persona/delete"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_VuelosC_index23_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vuelo")))
  )
  private[this] lazy val controllers_VuelosC_index23_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_VuelosC_delete24_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vuelo/delete")))
  )
  private[this] lazy val controllers_VuelosC_delete24_invoker = createInvoker(
    controllers.VuelosC.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VuelosC",
      "delete",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """vuelo/delete"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Assets_at25_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at25_invoker = createInvoker(
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
  
    // @LINE:9
    case controllers_SessionC_changePassword3_route(params) =>
      call { 
        controllers_SessionC_changePassword3_invoker.call(controllers.SessionC.changePassword())
      }
  
    // @LINE:10
    case controllers_SessionC_updatePassword4_route(params) =>
      call { 
        controllers_SessionC_updatePassword4_invoker.call(controllers.SessionC.updatePassword())
      }
  
    // @LINE:11
    case controllers_SessionC_account5_route(params) =>
      call { 
        controllers_SessionC_account5_invoker.call(controllers.SessionC.account())
      }
  
    // @LINE:13
    case controllers_Application_index6_route(params) =>
      call { 
        controllers_Application_index6_invoker.call(controllers.Application.index())
      }
  
    // @LINE:14
    case controllers_Application_simulation7_route(params) =>
      call { 
        controllers_Application_simulation7_invoker.call(controllers.Application.simulation())
      }
  
    // @LINE:16
    case controllers_PedidosC_index8_route(params) =>
      call { 
        controllers_PedidosC_index8_invoker.call(controllers.PedidosC.index())
      }
  
    // @LINE:17
    case controllers_PedidosC_newO9_route(params) =>
      call { 
        controllers_PedidosC_newO9_invoker.call(controllers.PedidosC.newO())
      }
  
    // @LINE:18
    case controllers_PedidosC_create10_route(params) =>
      call { 
        controllers_PedidosC_create10_invoker.call(controllers.PedidosC.create())
      }
  
    // @LINE:19
    case controllers_PedidosC_detail11_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PedidosC_detail11_invoker.call(controllers.PedidosC.detail(id))
      }
  
    // @LINE:20
    case controllers_PedidosC_delete12_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PedidosC_delete12_invoker.call(controllers.PedidosC.delete(id))
      }
  
    // @LINE:22
    case controllers_UsuariosC_index13_route(params) =>
      call { 
        controllers_UsuariosC_index13_invoker.call(controllers.UsuariosC.index())
      }
  
    // @LINE:23
    case controllers_UsuariosC_newO14_route(params) =>
      call { 
        controllers_UsuariosC_newO14_invoker.call(controllers.UsuariosC.newO())
      }
  
    // @LINE:24
    case controllers_UsuariosC_create15_route(params) =>
      call { 
        controllers_UsuariosC_create15_invoker.call(controllers.UsuariosC.create())
      }
  
    // @LINE:25
    case controllers_UsuariosC_delete16_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_UsuariosC_delete16_invoker.call(controllers.UsuariosC.delete(id))
      }
  
    // @LINE:27
    case controllers_CiudadesC_index17_route(params) =>
      call { 
        controllers_CiudadesC_index17_invoker.call(controllers.CiudadesC.index())
      }
  
    // @LINE:28
    case controllers_CiudadesC_newO18_route(params) =>
      call { 
        controllers_CiudadesC_newO18_invoker.call(controllers.CiudadesC.newO())
      }
  
    // @LINE:29
    case controllers_CiudadesC_create19_route(params) =>
      call { 
        controllers_CiudadesC_create19_invoker.call(controllers.CiudadesC.create())
      }
  
    // @LINE:30
    case controllers_CiudadesC_delete20_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_CiudadesC_delete20_invoker.call(controllers.CiudadesC.delete(id))
      }
  
    // @LINE:32
    case controllers_PersonasC_index21_route(params) =>
      call { 
        controllers_PersonasC_index21_invoker.call(controllers.PersonasC.index())
      }
  
    // @LINE:33
    case controllers_PersonasC_delete22_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PersonasC_delete22_invoker.call(controllers.PersonasC.delete(id))
      }
  
    // @LINE:35
    case controllers_VuelosC_index23_route(params) =>
      call { 
        controllers_VuelosC_index23_invoker.call(controllers.VuelosC.index())
      }
  
    // @LINE:36
    case controllers_VuelosC_delete24_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_VuelosC_delete24_invoker.call(controllers.VuelosC.delete(id))
      }
  
    // @LINE:39
    case controllers_Assets_at25_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at25_invoker.call(controllers.Assets.at(path, file))
      }
  }
}
