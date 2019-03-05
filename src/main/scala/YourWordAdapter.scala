package words

class YourWordAdapter(line: String) extends WordInterface {

    
    def get_sounds() : List[String] = {
        var arr = line.split(" ")
        var word: String = arr(0)
        var l: List[String] = List()
        for (x <- 2 to arr.length-1) {
                l = l:+arr(x)
        }
        return l
    }
    
    def get_word() : String = {
        var arr = line.split(" ")
        var the_word: String = arr(0)
        return the_word
    }
    
    
    def sounds(): String = {
        var sounds : List[String] = get_sounds()
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
        return this.get_word().toLowerCase()    
    }
    
}
