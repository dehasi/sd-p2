// g++ inheritance.cpp; a.out
#include <iostream>

using namespace std;

class IQuackable {
  public:
    virtual void quack() = 0;
};

class TQuackable {
  public:
    virtual void quack() {
        cout << "Quack! \n" ;
    }
};

class AbstractDuck {
  public:
    string color = "AbstractGray";
    virtual void swim() {
      cout << "All duck can swim! I'm swimming\n";
    }
};

class Duck: public AbstractDuck, IQuackable {
  public:
    string name = "NormalDuck";
     void quack() {
         cout << "Quack! \n";
     }
};

int main() {

  Duck duck;
  cout << "I'm " + duck.color + duck.name + "\n";
  duck.swim();
  duck.quack();

  return 0;
}