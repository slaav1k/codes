def isPalindrome(s):
    st = ''
    for i in s:
        if i.isalnum():
            st += i.lower()
    return st == st[::-1]


print(isPalindrome("0З"))
