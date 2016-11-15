
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/conf/routes
<<<<<<< HEAD
// @DATE:Sun Nov 13 19:03:59 COT 2016
=======
// @DATE:Mon Nov 14 20:48:28 COT 2016
>>>>>>> marcelo


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
