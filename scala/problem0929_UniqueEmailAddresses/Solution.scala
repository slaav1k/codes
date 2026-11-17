package problem0929_UniqueEmailAddresses

object Solution {
  def numUniqueEmails(emails: Array[String]): Int = {
    emails.map(email => {
      val parts = email.split("@")
      parts(0).replaceAll("\\.", "").split("\\+")(0) + "@" + parts(1)
    }).distinct.length
  }
}
