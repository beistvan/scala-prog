/* Type Casting */
object TypeCasting {
    def main(args: Array[String]) {

        val aShort: Short = 128
        val anIntFromShort: Int = aShort
        val anInt: Int = 5
        // val aShortFromInt: Short = anInt // error: type mismatch;

        val aChar: Char = '#'
        val anIntFromChar: Int = aChar
        // val aCharFromInt: Char = anInt // error: type mismatch;

        println("aShort  = " + aShort)
        println("anIntFromShort  = " + anIntFromShort)
        println("anInt  = " + anInt)

        println("aChar  = " + aChar)
        println("anIntFromChar  = " + anIntFromChar)

        // Output:
        /*
        aShort  = 128
        anIntFromShort  = 128
        anInt  = 5
        aChar  = #
        anIntFromChar  = 35
        */
    }
}
