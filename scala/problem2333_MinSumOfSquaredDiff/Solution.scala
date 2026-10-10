package problem2333_MinSumOfSquaredDiff

import scala.collection.mutable

object Solution {
  def minSumSquareDiff(nums1: Array[Int], nums2: Array[Int], k1: Int, k2: Int): Long = {
    val pq = mutable.PriorityQueue[Int]()
    var k = k1.toLong + k2.toLong

    for (i <- nums1.indices) {
      pq.enqueue(Math.abs(nums1(i) - nums2(i)))
    }

    while (k > 0 && pq.nonEmpty) {
      val max = pq.dequeue()
      if (max == 0) return 0L
      pq.enqueue(max - 1)
      k -= 1
    }

    pq.map(x => x.toLong * x).sum
  }
}
