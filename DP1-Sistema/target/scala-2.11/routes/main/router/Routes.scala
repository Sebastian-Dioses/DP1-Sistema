
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/conf/routes
// @DATE:Mon Nov 21 09:32:22 COT 2016

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
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cambiarPassword""", """controllers.UsuariosC.updatePassword()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cuenta""", """controllers.UsuariosC.account()"""),
    ("""GET""", prefix, """controllers.Application.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """simulation""", """controllers.Application.simulation()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """simulation/requestPackage""", """controllers.Application.requestPackage(scale:Long, time:Long)"""),
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
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ciudad/edit""", """controllers.CiudadesC.edit(id:String)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ciudad/update""", """controllers.CiudadesC.update()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """ciudad/delete""", """controllers.CiudadesC.delete(id:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persona""", """controllers.PersonasC.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persona/new""", """controllers.PersonasC.newO()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persona/add""", """controllers.PersonasC.create()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persona/edit""", """controllers.PersonasC.edit(id:Long)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persona/update""", """controllers.PersonasC.update()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persona/delete""", """controllers.PersonasC.delete(id:Long)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vuelo""", """controllers.VuelosC.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vuelo/new""", """controllers.VuelosC.newO()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vuelo/add""", """controllers.VuelosC.create()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vuelo/edit""", """controllers.VuelosC.edit(id:Long)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """vuelo/update""", """controllers.VuelosC.update()"""),
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
  private[this] lazy val controllers_UsuariosC_updatePassword4_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cambiarPassword")))
  )
  private[this] lazy val controllers_UsuariosC_updatePassword4_invoker = createInvoker(
    controllers.UsuariosC.updatePassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosC",
      "updatePassword",
      Nil,
      "POST",
      """""",
      this.prefix + """cambiarPassword"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UsuariosC_account5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cuenta")))
  )
  private[this] lazy val controllers_UsuariosC_account5_invoker = createInvoker(
    controllers.UsuariosC.account(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosC",
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

  // @LINE:15
  private[this] lazy val controllers_Application_requestPackage8_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("simulation/requestPackage")))
  )
  private[this] lazy val controllers_Application_requestPackage8_invoker = createInvoker(
    controllers.Application.requestPackage(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "requestPackage",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """simulation/requestPackage"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PedidosC_index9_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido")))
  )
  private[this] lazy val controllers_PedidosC_index9_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_PedidosC_newO10_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/new")))
  )
  private[this] lazy val controllers_PedidosC_newO10_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_PedidosC_create11_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/add")))
  )
  private[this] lazy val controllers_PedidosC_create11_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_PedidosC_detail12_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/detail")))
  )
  private[this] lazy val controllers_PedidosC_detail12_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_PedidosC_delete13_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedido/delete")))
  )
  private[this] lazy val controllers_PedidosC_delete13_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_UsuariosC_index14_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UsuariosC_index14_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_UsuariosC_newO15_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/new")))
  )
  private[this] lazy val controllers_UsuariosC_newO15_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_UsuariosC_create16_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/add")))
  )
  private[this] lazy val controllers_UsuariosC_create16_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_UsuariosC_delete17_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/delete")))
  )
  private[this] lazy val controllers_UsuariosC_delete17_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_CiudadesC_index18_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad")))
  )
  private[this] lazy val controllers_CiudadesC_index18_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_CiudadesC_newO19_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad/new")))
  )
  private[this] lazy val controllers_CiudadesC_newO19_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_CiudadesC_create20_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad/add")))
  )
  private[this] lazy val controllers_CiudadesC_create20_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_CiudadesC_edit21_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad/edit")))
  )
  private[this] lazy val controllers_CiudadesC_edit21_invoker = createInvoker(
    controllers.CiudadesC.edit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CiudadesC",
      "edit",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ciudad/edit"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_CiudadesC_update22_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad/update")))
  )
  private[this] lazy val controllers_CiudadesC_update22_invoker = createInvoker(
    controllers.CiudadesC.update(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CiudadesC",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """ciudad/update"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_CiudadesC_delete23_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ciudad/delete")))
  )
  private[this] lazy val controllers_CiudadesC_delete23_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_PersonasC_index24_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persona")))
  )
  private[this] lazy val controllers_PersonasC_index24_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_PersonasC_newO25_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persona/new")))
  )
  private[this] lazy val controllers_PersonasC_newO25_invoker = createInvoker(
    controllers.PersonasC.newO(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonasC",
      "newO",
      Nil,
      "GET",
      """""",
      this.prefix + """persona/new"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_PersonasC_create26_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persona/add")))
  )
  private[this] lazy val controllers_PersonasC_create26_invoker = createInvoker(
    controllers.PersonasC.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonasC",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """persona/add"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_PersonasC_edit27_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persona/edit")))
  )
  private[this] lazy val controllers_PersonasC_edit27_invoker = createInvoker(
    controllers.PersonasC.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonasC",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """persona/edit"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_PersonasC_update28_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persona/update")))
  )
  private[this] lazy val controllers_PersonasC_update28_invoker = createInvoker(
    controllers.PersonasC.update(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonasC",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """persona/update"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_PersonasC_delete29_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persona/delete")))
  )
  private[this] lazy val controllers_PersonasC_delete29_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_VuelosC_index30_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vuelo")))
  )
  private[this] lazy val controllers_VuelosC_index30_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_VuelosC_newO31_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vuelo/new")))
  )
  private[this] lazy val controllers_VuelosC_newO31_invoker = createInvoker(
    controllers.VuelosC.newO(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VuelosC",
      "newO",
      Nil,
      "GET",
      """""",
      this.prefix + """vuelo/new"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_VuelosC_create32_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vuelo/add")))
  )
  private[this] lazy val controllers_VuelosC_create32_invoker = createInvoker(
    controllers.VuelosC.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VuelosC",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """vuelo/add"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_VuelosC_edit33_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vuelo/edit")))
  )
  private[this] lazy val controllers_VuelosC_edit33_invoker = createInvoker(
    controllers.VuelosC.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VuelosC",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """vuelo/edit"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_VuelosC_update34_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vuelo/update")))
  )
  private[this] lazy val controllers_VuelosC_update34_invoker = createInvoker(
    controllers.VuelosC.update(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VuelosC",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """vuelo/update"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_VuelosC_delete35_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vuelo/delete")))
  )
  private[this] lazy val controllers_VuelosC_delete35_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_Assets_at36_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at36_invoker = createInvoker(
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
    case controllers_UsuariosC_updatePassword4_route(params) =>
      call { 
        controllers_UsuariosC_updatePassword4_invoker.call(controllers.UsuariosC.updatePassword())
      }
  
    // @LINE:11
    case controllers_UsuariosC_account5_route(params) =>
      call { 
        controllers_UsuariosC_account5_invoker.call(controllers.UsuariosC.account())
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
  
    // @LINE:15
    case controllers_Application_requestPackage8_route(params) =>
      call(params.fromQuery[Long]("scale", None), params.fromQuery[Long]("time", None)) { (scale, time) =>
        controllers_Application_requestPackage8_invoker.call(controllers.Application.requestPackage(scale, time))
      }
  
    // @LINE:17
    case controllers_PedidosC_index9_route(params) =>
      call { 
        controllers_PedidosC_index9_invoker.call(controllers.PedidosC.index())
      }
  
    // @LINE:18
    case controllers_PedidosC_newO10_route(params) =>
      call { 
        controllers_PedidosC_newO10_invoker.call(controllers.PedidosC.newO())
      }
  
    // @LINE:19
    case controllers_PedidosC_create11_route(params) =>
      call { 
        controllers_PedidosC_create11_invoker.call(controllers.PedidosC.create())
      }
  
    // @LINE:20
    case controllers_PedidosC_detail12_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PedidosC_detail12_invoker.call(controllers.PedidosC.detail(id))
      }
  
    // @LINE:21
    case controllers_PedidosC_delete13_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PedidosC_delete13_invoker.call(controllers.PedidosC.delete(id))
      }
  
    // @LINE:23
    case controllers_UsuariosC_index14_route(params) =>
      call { 
        controllers_UsuariosC_index14_invoker.call(controllers.UsuariosC.index())
      }
  
    // @LINE:24
    case controllers_UsuariosC_newO15_route(params) =>
      call { 
        controllers_UsuariosC_newO15_invoker.call(controllers.UsuariosC.newO())
      }
  
    // @LINE:25
    case controllers_UsuariosC_create16_route(params) =>
      call { 
        controllers_UsuariosC_create16_invoker.call(controllers.UsuariosC.create())
      }
  
    // @LINE:26
    case controllers_UsuariosC_delete17_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_UsuariosC_delete17_invoker.call(controllers.UsuariosC.delete(id))
      }
  
    // @LINE:28
    case controllers_CiudadesC_index18_route(params) =>
      call { 
        controllers_CiudadesC_index18_invoker.call(controllers.CiudadesC.index())
      }
  
    // @LINE:29
    case controllers_CiudadesC_newO19_route(params) =>
      call { 
        controllers_CiudadesC_newO19_invoker.call(controllers.CiudadesC.newO())
      }
  
    // @LINE:30
    case controllers_CiudadesC_create20_route(params) =>
      call { 
        controllers_CiudadesC_create20_invoker.call(controllers.CiudadesC.create())
      }
  
    // @LINE:31
    case controllers_CiudadesC_edit21_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_CiudadesC_edit21_invoker.call(controllers.CiudadesC.edit(id))
      }
  
    // @LINE:32
    case controllers_CiudadesC_update22_route(params) =>
      call { 
        controllers_CiudadesC_update22_invoker.call(controllers.CiudadesC.update())
      }
  
    // @LINE:33
    case controllers_CiudadesC_delete23_route(params) =>
      call(params.fromQuery[String]("id", None)) { (id) =>
        controllers_CiudadesC_delete23_invoker.call(controllers.CiudadesC.delete(id))
      }
  
    // @LINE:35
    case controllers_PersonasC_index24_route(params) =>
      call { 
        controllers_PersonasC_index24_invoker.call(controllers.PersonasC.index())
      }
  
    // @LINE:36
    case controllers_PersonasC_newO25_route(params) =>
      call { 
        controllers_PersonasC_newO25_invoker.call(controllers.PersonasC.newO())
      }
  
    // @LINE:37
    case controllers_PersonasC_create26_route(params) =>
      call { 
        controllers_PersonasC_create26_invoker.call(controllers.PersonasC.create())
      }
  
    // @LINE:38
    case controllers_PersonasC_edit27_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PersonasC_edit27_invoker.call(controllers.PersonasC.edit(id))
      }
  
    // @LINE:39
    case controllers_PersonasC_update28_route(params) =>
      call { 
        controllers_PersonasC_update28_invoker.call(controllers.PersonasC.update())
      }
  
    // @LINE:40
    case controllers_PersonasC_delete29_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PersonasC_delete29_invoker.call(controllers.PersonasC.delete(id))
      }
  
    // @LINE:42
    case controllers_VuelosC_index30_route(params) =>
      call { 
        controllers_VuelosC_index30_invoker.call(controllers.VuelosC.index())
      }
  
    // @LINE:43
    case controllers_VuelosC_newO31_route(params) =>
      call { 
        controllers_VuelosC_newO31_invoker.call(controllers.VuelosC.newO())
      }
  
    // @LINE:44
    case controllers_VuelosC_create32_route(params) =>
      call { 
        controllers_VuelosC_create32_invoker.call(controllers.VuelosC.create())
      }
  
    // @LINE:45
    case controllers_VuelosC_edit33_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_VuelosC_edit33_invoker.call(controllers.VuelosC.edit(id))
      }
  
    // @LINE:46
    case controllers_VuelosC_update34_route(params) =>
      call { 
        controllers_VuelosC_update34_invoker.call(controllers.VuelosC.update())
      }
  
    // @LINE:47
    case controllers_VuelosC_delete35_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_VuelosC_delete35_invoker.call(controllers.VuelosC.delete(id))
      }
  
    // @LINE:50
    case controllers_Assets_at36_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at36_invoker.call(controllers.Assets.at(path, file))
      }
  }
}
