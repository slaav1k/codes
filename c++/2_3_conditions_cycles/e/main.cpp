#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int n, k;
    cin >> n >> k;

    int  days = n;

    for(int i = 1; i < n; ++i){
        cout << "   ";
    }

    for(int d = 1; d <= k; ++d){
        if (d < 10)
            cout << " ";
        cout << d;

        if (days == 7){
            days = 1;
            cout << "\n";
        }
        else {
            cout << " ";
            days += 1;
        }
    }

    if (days != 1) {
        cout << "\n";
    }




    return 0;
}
