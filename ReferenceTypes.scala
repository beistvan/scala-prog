/* Reference Types */
object ReferenceTypes {
    def main(args: Array[String]) {
        var aFive: Int = 5
        var anyValFive: AnyVal = 5
        // var anyRefFive: AnyRef = 5 // error: the result type of an implicit conversion must be more specific than AnyRef

        var array: Array[Int] = Array(1, 2)
        var anyRefArray: Array[Int] = Array(1, 2)
        // var anyValArray: AnyVal = Array(1, 2) // error

        val aNull: Null = null
        // val anotherNull: Null = "a null" // error: type mismatch;

        println("aFive  = " + aFive)
        println("anyValFive  = " + anyValFive)

        println("array  = [" + array.mkString(",") + "]")
        println("aranyRefArrayray  = [" + anyRefArray.mkString(",") + "]")
        println("array(1)  = " + array(1))
        // println("array(10)  = " + array(10)) // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 2

        println("aNull  = " + aNull)
        
        // Output:
        /*
        aFive  = 5
        anyValFive  = 5
        array  = [1,2]
        aranyRefArrayray  = [1,2]
        array(1)  = 2
        aNull  = null
        */
    }
}
