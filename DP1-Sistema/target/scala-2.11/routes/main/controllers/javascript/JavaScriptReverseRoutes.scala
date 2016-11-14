
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/conf/routes
// @DATE:Mon Nov 14 13:20:47 COT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:32
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReversePedidosC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosC.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedido/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:16
    def detail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosC.detail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedido/detail" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:15
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosC.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pedido/add"})
        }
      """
    )
  
    // @LINE:14
    def newO: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosC.newO",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedido/new"})
        }
      """
    )
  
    // @LINE:13
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosC.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedido"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseUsuariosC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosC.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/add"})
        }
      """
    )
  
    // @LINE:20
    def newO: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosC.newO",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/new"})
        }
      """
    )
  
    // @LINE:19
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosC.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReversePersonasC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonasC.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persona"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseVuelosC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VuelosC.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vuelo"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:11
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

  // @LINE:23
  class ReverseCiudadesC(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CiudadesC.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ciudad/add"})
        }
      """
    )
  
    // @LINE:24
    def newO: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CiudadesC.newO",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ciudad/new"})
        }
      """
    )
  
    // @LINE:23
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
