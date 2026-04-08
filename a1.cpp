#include <iostream>
using namespace std;

class Num  {

    int value;

public:
    Num (int v) {
        value = v;
    }

    Num  operator+(Num  & obj) {
        Num  temp(0);
        temp.value = value + obj.value;
        return temp;
    }

    void display() {
        cout << value << endl;
    }
};

int main() {

    Num  n1(10);
    Num  n2(20);

    Num n3 = n1+n2;
    n3.display();

    return 0;
}