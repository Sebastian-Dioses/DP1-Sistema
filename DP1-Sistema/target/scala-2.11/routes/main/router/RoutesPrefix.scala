
// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:C:/Users/MARCELO/Documents/GitHub/DP1-Sistema/DP1-Sistema/conf/routes
// @DATE:Tue Nov 15 19:00:06 COT 2016
=======
// @SOURCE:C:/Users/JoseLuis/Documents/DP1/DP1-Sistema/DP1-Sistema/conf/routes
// @DATE:Tue Nov 15 20:03:13 COT 2016
>>>>>>> 24dff40eaed1b655d957aba2eef3eba483c90e50


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
