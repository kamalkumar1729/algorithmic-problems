package recursion

object Pow extends App {
  def pow(n: Long,p:Long):Long ={
    if (p==1L) n else n*pow(n,p-1)
  }
  println(pow(2,25))
}
