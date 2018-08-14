package sorting

object rec_bubble extends App {
  import scala.collection.mutable.ArrayBuffer

  val arr = ArrayBuffer(101,222,30,4,12,34,23,35,6,2,324,5234,354)
  val length = arr.length

  def rec_bubble(done_elems:Int, partially_sorted_arr:ArrayBuffer[Int]){
      //println("done elems"+done_elems)
      println(partially_sorted_arr)

      if(done_elems == length-1) return

      for(i <- done_elems until length){
         // println("arr"+done_elems+" "+ partially_sorted_arr(done_elems) +"  arr(i) = "+partially_sorted_arr(i))
          if(partially_sorted_arr(done_elems) > partially_sorted_arr(i)){
            val temp = partially_sorted_arr(i)
            partially_sorted_arr(i)=partially_sorted_arr(done_elems)
            partially_sorted_arr(done_elems) = temp
          }
      }
    //recursive call with done sorted index
      rec_bubble(done_elems+1, partially_sorted_arr)
  }

  println(arr)
  rec_bubble(0,arr)
  println(arr)

}
