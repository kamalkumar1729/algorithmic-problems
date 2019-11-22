package recursion

object gcd extends App {
  def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b,a%b)
  println(gcd(122,66))
}
