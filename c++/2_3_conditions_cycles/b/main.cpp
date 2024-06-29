#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int a, b, c;
    cin >> a;
    cin >> b;
    cin >> c;
    if (a + b < c || a + c < b || c + b < a)
        cout << "UNDEFINED";
    else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
        cout << "YES";
    else
        cout << "NO";
    return 0;
}
