import scala.annotation.tailrec

def powerOfTwo(n: BigInt): BigInt = {
  @tailrec
  def loop(x: BigInt, accumulator: BigInt = 2): BigInt = {
    if (x == 1) accumulator
    else loop(x-1, 2*accumulator)
  }

  loop(n)
}
