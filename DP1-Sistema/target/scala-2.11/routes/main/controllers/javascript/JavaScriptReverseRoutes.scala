
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/conf/routes
// @DATE:Wed Nov 16 11:43:20 COT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:49
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:16
  class ReversePedidosC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosC.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedido/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:19
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosC.detail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedido/detail" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:18
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosC.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pedido/add"})
        }
      """
    )
  
    // @LINE:17
    def newO: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosC.newO",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedido/new"})
        }
      """
    )
  
    // @LINE:16
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosC.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedido"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseUsuariosC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosC.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:24
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosC.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/add"})
        }
      """
    )
  
    // @LINE:23
    def newO: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosC.newO",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/new"})
        }
      """
    )
  
    // @LINE:11
    def account: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosC.account",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cuenta"})
        }
      """
    )
  
    // @LINE:10
    def updatePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosC.updatePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cambiarPassword"})
        }
      """
    )
  
    // @LINE:22
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosC.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReversePersonasC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasC.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persona/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:36
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasC.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "persona/add"})
        }
      """
    )
  
    // @LINE:37
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasC.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persona/edit" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:35
    def newO: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasC.newO",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persona/new"})
        }
      """
    )
  
    // @LINE:38
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasC.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "persona/update"})
        }
      """
    )
  
    // @LINE:34
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasC.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persona"})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseVuelosC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VuelosC.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vuelo/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:43
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VuelosC.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vuelo/add"})
        }
      """
    )
  
    // @LINE:44
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VuelosC.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vuelo/edit" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:42
    def newO: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VuelosC.newO",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vuelo/new"})
        }
      """
    )
  
    // @LINE:45
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VuelosC.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "vuelo/update"})
        }
      """
    )
  
    // @LINE:41
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VuelosC.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vuelo"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:14
    def simulation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.simulation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "simulation"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseSessionC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SessionC.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:9
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SessionC.changePassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cambiarPassword"})
        }
      """
    )
  
    // @LINE:7
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SessionC.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:6
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SessionC.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseCiudadesC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CiudadesC.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ciudad/edit" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:29
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CiudadesC.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ciudad/add"})
        }
      """
    )
  
    // @LINE:28
    def newO: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CiudadesC.newO",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ciudad/new"})
        }
      """
    )
  
    // @LINE:32
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CiudadesC.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ciudad/delete" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:31
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CiudadesC.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ciudad/update"})
        }
      """
    )
  
    // @LINE:27
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CiudadesC.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ciudad"})
        }
      """
    )
  
  }


}
