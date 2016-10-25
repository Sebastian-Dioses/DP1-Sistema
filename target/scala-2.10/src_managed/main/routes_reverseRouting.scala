// @SOURCE:C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/conf/routes
// @HASH:d1bea76cfee579fdc40e5e5f98ef52cabbe97aee
// @DATE:Tue Oct 25 16:02:06 COT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:12
class ReverseWebJarAssets {
    

// @LINE:12
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "index")
}
                                                

// @LINE:8
def test(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "registroPedido")
}
                                                

// @LINE:7
def simulation(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "simulation")
}
                                                

// @LINE:5
def login(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:12
class ReverseWebJarAssets {
    

// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
      }
   """
)
                        

// @LINE:8
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registroPedido"})
      }
   """
)
                        

// @LINE:7
def simulation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.simulation",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "simulation"})
      }
   """
)
                        

// @LINE:5
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:12
class ReverseWebJarAssets {
    

// @LINE:12
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """index""")
)
                      

// @LINE:8
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Seq(), "GET", """""", _prefix + """registroPedido""")
)
                      

// @LINE:7
def simulation(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.simulation(), HandlerDef(this, "controllers.Application", "simulation", Seq(), "GET", """""", _prefix + """simulation""")
)
                      

// @LINE:5
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    