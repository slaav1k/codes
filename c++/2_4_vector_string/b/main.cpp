#include <iostream>
#include <string>

using namespace std;

int main()
{
    string s, out;
    cin >> s;

    out.push_back(s[0]);
    for (size_t i = 1; i != s.size(); ++i) {
        char c = s[i];
        switch (c) {
            case 'b':
            case 'f':
            case 'p':
            case 'v':
            if (out.back() != '1') {
                    out.push_back('1');
                }
                break;
            case 'c':
            case 'g':
            case 'j':
            case 'k':
            case 'q':
            case 's':
            case 'x':
            case 'z':
            if (out.back() != '2') {
                    out.push_back('2');
                }
                break;
            case 'd':
            case 't':
            if (out.back() != '3') {
                    out.push_back('3');
                }
                break;
            case 'l':
            if (out.back() != '4') {
                    out.push_back('4');
                }
                break;
            case 'm':
            case 'n':
            if (out.back() != '5') {
                    out.push_back('5');
                }
                break;
            case 'r':
            if (out.back() != '6') {
                    out.push_back('6');
                }
                break;
        }
    }
    while (out.size() < 4) {
        out.push_back('0');
    }
    out.resize(4);
    cout << out;

}

