package sorting

import scala.collection.mutable.ArrayBuffer

object bubble extends App {

  val array = scala.collection.mutable.ArrayBuffer(18,8,6,9,10,17,3,1,11,5,4)
  val length = array.length

  def bubble(arr:ArrayBuffer[Int])= {
    for (i <- 0 until length) {
      for (j <- 0 until length - i - 1) {
             if(arr(j) > arr(j+1)){
               val temp = arr(j)
               arr(j) = arr(j+1)
               arr(j+1) = temp
             }
      }
    }
  }

  println(array)
  bubble(array)
  println(array)

}
