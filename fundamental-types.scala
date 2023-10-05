/* Fundamental Types */
object HelloWorld {
    def main(args: Array[String]) {
        val anInt: Int = 5
        val aDouble: Double = 3.2
        var aFloat: Float = 1.3f
        val aLong: Long = 199l
        val anotherLong: Long = 1999L
        val aShort: Short = 120
        val aByte: Byte = 1
        
        val aChar = 'c'
        
        // non-numeric types:
        val aUnit: Unit = ()
        val aBoolean: Boolean = false;
        val anotherBoolean: Boolean = true;
        val aString: String = "hello";
        
        val aNull: Null = null
        
        var aBigInt = BigInt(1234567890)
        var aBigDecimal = BigDecimal(123456.789)
        
        val anAnyVal: AnyVal = 123
        val anAnyRef: AnyRef = aString
        val anAny: Any = 3.4
        
        println("anInt  = " + anInt)
        println("aDouble  = " + aDouble)
        println("aFloat  = " + aFloat)
        println("aLong  = " + aLong)
        println("anotherLong  = " + anotherLong)
        println("aShort  = " + aShort)
        println("aByte  = " + aByte)
        
        println("aChar  = " + aChar)
        
        println("aUnit  = " + aUnit)
        println("aBoolean  = " + aBoolean)
        println("anotherBoolean  = " + anotherBoolean)
        println("aString  = " + aString)
        
        println("aNull  = " + aNull)
        
        println("aBigInt  = " + aBigInt)
        println("aBigDecimal  = " + aBigDecimal)
        
        println("anAnyVal  = " + anAnyVal)
        println("anAnyRef  = " + anAnyRef)
        println("anAny  = " + anAny)
        
        
        println("Nil")
        println(Nil) // List()
        println("List()")
        println(List())
        
    }
}
