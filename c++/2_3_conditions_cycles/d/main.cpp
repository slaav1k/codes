#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int b, a;
    bool f = false;
    cin >> b >> a;
    if (a % 400 == 0)
        f = true;
    else if (a % 100 != 0 && a % 4 == 0)
        f = true;
    else
        f = false;
    int result;
    switch (b) {
            case 1:
                result = 31;
                break;
            case 2:
                if (f)
                    result = 29;
                else
                    result = 28;
                break;
            case 3:
                result = 31;
                break;
            case 4:
                result = 30;
                break;
            case 5:
                result = 31;
                break;
            case 6:
                result = 30;
                break;
            case 7:
                result = 31;
                break;
            case 8:
                result = 31;
                break;
            case 9:
                result = 30;
                break;
            case 10:
                result = 31;
                break;
            case 11:
                result = 30;
                break;
            case 12:
                result = 31;
                break;
            default:
                result = 0;
        }
        std::cout << result << "\n";

    return 0;
}
