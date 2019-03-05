package words

class YourWordAdapter(word: String, sounds: List[String]) extends WordInterface {

    def sounds(): String = { 
        var newstr: String = "";
        for (x <- 0 to sounds.length-1) {
            if(x == sounds.length-1) {
                newstr = newstr + sounds(x).toLowerCase()
            }
            else {
                newstr = newstr + sounds(x).toLowerCase() + ","
            }
            
        }
        return newstr    
    }
      def spelling() : String = { 
        return this.word.toLowerCase()    
    }
    
}
