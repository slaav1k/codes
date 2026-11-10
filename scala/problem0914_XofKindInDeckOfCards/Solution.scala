package problem0914_XofKindInDeckOfCards

object Solution {
  def hasGroupsSizeX(deck: Array[Int]): Boolean = {
    val counts = deck.groupBy(identity).view.mapValues(_.length).toMap
    val nod = findCommonGcd(counts)
    nod >= 2
  }

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a.abs else gcd(b, a % b)
  }

  private def findCommonGcd(counts: Map[Int, Int]): Int = {
    val frequencies = counts.values.toSeq
    frequencies.reduce(gcd)
  }
}