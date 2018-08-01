package strings

object first_non_repeating extends App {

  import scala.collection.mutable.Map

  // Map[char,(frequency,last_occurrence)]

  def firstNonRepeating(s:String):Int={

    val freq = Map.empty[Char,(Int,Int)]

    /**
    * if( c => not present in map)
    *    add c in map, count = 1, first_index= i
    * else
    *    count++, rest is same
    *
    * */


    for(i <- 0 to s.length-1){
      if(freq.contains(s.charAt(i))) {
        freq(s.charAt(i)) = (freq(s.charAt(i))._1 + 1, freq(s.charAt(i))._2)
      }
      else {
        freq(s.charAt(i)) = (1, i)
      }
    }

   // s.foreach(ch => { if(freq.contains(ch)) freq(ch)+=1  else freq(ch)=1 })

    var non_rep_index = s.length

   freq.foreach(keyVal => {

     val ch = keyVal._1
     val tup = keyVal._2
     val fr = tup._1
     val first_index = tup._2


     if(fr == 1 && (first_index < non_rep_index)) {
       non_rep_index = first_index
      // println("nrindex"+non_rep_index)
     }
   })

    // return expression
    if (non_rep_index == s.length)
      -1
    else
      non_rep_index
  }







// Test Strings

  println(firstNonRepeating(""))
  println(firstNonRepeating("ppasdklfwwwasdfartgsafiovhiquwfhc"))
  println(firstNonRepeating("asdfufhiqw6tfgs"))
  println(firstNonRepeating("qqqqqqqqqqqqqqqqqqqqq"))

}
