package sorting

import scala.collection.mutable.ArrayBuffer

object selection extends App {

  val array = scala.collection.mutable.ArrayBuffer(18,8,6,9,10,17,3,1,11,5,4)


  def bubble(arr:ArrayBuffer[Int]):ArrayBuffer[Int]= {

    val length = arr.length

    var still_swapping_flag = false

    for (iter_1 <- 0 until length) {

      /*
    * flag can be kept which checks if elements are getting swapped in inner loop.
    * if not then array is already sorted and break the outer loop.
    * */

      still_swapping_flag = false

      for (iter_2 <- iter_1 + 1 until length) {

        println(arr)
        println("i=" + iter_1 + "  j=" + iter_2)

        if (arr(iter_1) > arr(iter_2)) {
          val temp = arr(iter_2)
          arr(iter_2) = arr(iter_1)
          arr(iter_1) = temp


          // NOT WORKING !!!
          // (a,b) in scala creates an immutable object of Tuple[T,W]
          // New technique to swap
          //( arr(iter_2) , arr(iter_1) ).swap

          still_swapping_flag = true
        }

      }

      if (!still_swapping_flag)
        return arr
    }

    arr
  }



  println(array)
  bubble(array)
  println(array)

}