#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int n;
    cin >> n;
    double s = 0;

    for (int i = 1; i <= n; ++i){
        s += pow(-1, i + 1) * 1.0 / i;
    }
    cout << s;

    return 0;
}
