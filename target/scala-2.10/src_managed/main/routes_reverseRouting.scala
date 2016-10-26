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

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:12
// @LINE:11
=======
// @LINE:13
// @LINE:12
=======
// @LINE:15
// @LINE:14
// @LINE:10
>>>>>>> origin/JL
// @LINE:9
>>>>>>> origin/JL
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:12
class ReverseWebJarAssets {
    

// @LINE:12
=======
// @LINE:13
class ReverseWebJarAssets {
    

// @LINE:13
>>>>>>> origin/JL
=======
// @LINE:15
class ReverseWebJarAssets {
    

// @LINE:15
>>>>>>> origin/JL
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:11
class ReverseAssets {
    

// @LINE:11
=======
// @LINE:12
class ReverseAssets {
    

// @LINE:12
>>>>>>> origin/JL
=======
// @LINE:14
class ReverseAssets {
    

// @LINE:14
>>>>>>> origin/JL
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
// @LINE:10
>>>>>>> origin/JL
// @LINE:9
>>>>>>> origin/JL
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:6
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "index")
}
                                                

// @LINE:8
def test(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "registroPedido")
}
                                                

=======
>>>>>>> origin/JL
=======
// @LINE:10
def newuser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newuser")
}
                                                

>>>>>>> origin/JL
// @LINE:7
def simulation(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "simulation")
}
                                                

// @LINE:9
def users(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user")
}
                                                

// @LINE:8
def test(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "registroPedido")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "index")
}
                                                

// @LINE:5
def login(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:12
// @LINE:11
=======
// @LINE:13
// @LINE:12
=======
// @LINE:15
// @LINE:14
// @LINE:10
>>>>>>> origin/JL
// @LINE:9
>>>>>>> origin/JL
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:12
class ReverseWebJarAssets {
    

// @LINE:12
=======
// @LINE:13
class ReverseWebJarAssets {
    

// @LINE:13
>>>>>>> origin/JL
=======
// @LINE:15
class ReverseWebJarAssets {
    

// @LINE:15
>>>>>>> origin/JL
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:11
class ReverseAssets {
    

// @LINE:11
=======
// @LINE:12
class ReverseAssets {
    

// @LINE:12
>>>>>>> origin/JL
=======
// @LINE:14
class ReverseAssets {
    

// @LINE:14
>>>>>>> origin/JL
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
// @LINE:10
>>>>>>> origin/JL
// @LINE:9
>>>>>>> origin/JL
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:10
def newuser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newuser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newuser"})
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
                        

<<<<<<< HEAD
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
=======
// @LINE:9
def users : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.users",
>>>>>>> origin/JL
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
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
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
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
        


<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:12
// @LINE:11
=======
// @LINE:13
// @LINE:12
=======
// @LINE:15
// @LINE:14
// @LINE:10
>>>>>>> origin/JL
// @LINE:9
>>>>>>> origin/JL
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:12
class ReverseWebJarAssets {
    

// @LINE:12
=======
// @LINE:13
class ReverseWebJarAssets {
    

// @LINE:13
>>>>>>> origin/JL
=======
// @LINE:15
class ReverseWebJarAssets {
    

// @LINE:15
>>>>>>> origin/JL
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      
    
}
                          

<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:11
class ReverseAssets {
    

// @LINE:11
=======
// @LINE:12
class ReverseAssets {
    

// @LINE:12
>>>>>>> origin/JL
=======
// @LINE:14
class ReverseAssets {
    

// @LINE:14
>>>>>>> origin/JL
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
// @LINE:10
>>>>>>> origin/JL
// @LINE:9
>>>>>>> origin/JL
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

<<<<<<< HEAD
<<<<<<< HEAD
// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """index""")
)
                      

// @LINE:8
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Seq(), "GET", """""", _prefix + """registroPedido""")
)
                      

=======
>>>>>>> origin/JL
=======
// @LINE:10
def newuser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newuser(), HandlerDef(this, "controllers.Application", "newuser", Seq(), "GET", """""", _prefix + """newuser""")
)
                      

>>>>>>> origin/JL
// @LINE:7
def simulation(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.simulation(), HandlerDef(this, "controllers.Application", "simulation", Seq(), "GET", """""", _prefix + """simulation""")
)
                      

// @LINE:9
def users(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.users(), HandlerDef(this, "controllers.Application", "users", Seq(), "GET", """""", _prefix + """user""")
)
                      

// @LINE:8
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Seq(), "GET", """""", _prefix + """registroPedido""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """index""")
)
                      

// @LINE:5
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    