#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int a;
    cin >> a;
    if (a % 400 == 0)
        cout << "YES";
    else if (a % 100 != 0 && a % 4 == 0)
        cout << "YES";
    else
        cout << "NO";
    return 0;
}
