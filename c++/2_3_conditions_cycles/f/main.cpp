#include <iostream>
#include <string>

using namespace std;

int main()
{
    string n;
    cin >> n;
    int s = 0;


    for(string::size_type i = 0; i < n.length(); ++i){
        s +=  n[i] - '0';
    }
    cout << s;

    return 0;
}
