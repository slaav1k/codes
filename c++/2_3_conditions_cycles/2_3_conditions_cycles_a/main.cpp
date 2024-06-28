#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int x, y, a, b;
    cin >> x;
    cin >> y;
    cin >> a;
    cin >> b;
    if (abs(x - a) == abs(y - b) || x == a || y == b)
        cout << "YES";
    else
        cout << "NO";
    return 0;
}
