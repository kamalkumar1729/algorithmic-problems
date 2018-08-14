package sorting

object bubble extends App {

  val arr = scala.collection.mutable.ArrayBuffer(18,8,6,9,10,17,3,1,11,5,4)

  val length = arr.length

  for(iter_1<- 0 until length){

    for(iter_2 <- iter_1+1 until length){

      println(arr)
      println("i="+iter_1+"  j="+iter_2)

      if(arr(iter_1) > arr(iter_2)){
        val temp = arr(iter_2)
        arr(iter_2) = arr(iter_1)
        arr(iter_1)  = temp
      }

    }

  }

  println(arr)

}