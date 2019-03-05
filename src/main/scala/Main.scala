import words._
object Main {
  def main(args: Array[String]): Unit = {
        var test: YourWordAdapter = new YourWordAdapter("ABASHED  AH0 B AE1 SH T")
        println(test.sounds())
        println(test.spelling())
        
    }  
}

