#include <iostream>
#include <string>

using namespace std;

int main()
{
    string s;
    cin >> s;
    bool f = true;
    if (s.length() < 8 || s.length() > 14)
        f = false;
    int upper = 0;
    int lower = 0;
    int digit = 0;
    int other = 0;

    for (char c : s) {
        if (c < 33 || c > 126) {
            return false;
        }
        if ('A' <= c && c <= 'Z') {
            upper = 1;
        } else if ('a' <= c && c <= 'z') {
            lower = 1;
        } else if ('0' <= c && c <= '9') {
            digit = 1;
        } else {
            other = 1;
        }
    }

    if (upper + lower + digit + other < 3)
        f = false;

    if (f)
        printf("YES");
    else
        printf("NO");


}
