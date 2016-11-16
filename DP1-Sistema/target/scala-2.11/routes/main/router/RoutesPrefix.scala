
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JoseLuis/Documents/DP1/DP1-Sistema/DP1-Sistema/conf/routes
// @DATE:Tue Nov 15 20:03:13 COT 2016


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
