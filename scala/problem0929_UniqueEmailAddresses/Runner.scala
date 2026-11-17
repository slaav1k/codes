package problem0929_UniqueEmailAddresses

object Runner {
  def main(array: Array[String]): Unit = {
    println(Solution.numUniqueEmails(Array("test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com")))
    println(Solution.numUniqueEmails(Array("a@leetcode.com","b@leetcode.com","c@leetcode.com")))
  }

}
