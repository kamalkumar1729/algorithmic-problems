package sorting

import scala.collection.mutable.ArrayBuffer

object insertion extends App {


  val array = ArrayBuffer(6,3,2,7,9,3,6,4,2,6,8)

  def insertion(arr:ArrayBuffer[Int])={
    val len = arr.length
    var j = 0

    for (i <- 1 until len){
      j = i-1
      while(arr(j) >= arr(i) && j>=0){
        println("i="+i+"j="+j+" "+arr(j)+" "+arr(i))

        val temp = arr(j)
        arr(j) = arr(i)
        arr(i) = temp
        j=j-1
      }
    }
  }


  println(array)
  insertion(array)
  println(array)



// Throwing error




}
