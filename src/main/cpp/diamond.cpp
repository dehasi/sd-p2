// g++ diamond.cpp
#include <iostream>

using namespace std;

/*
        AbstractDuck
          /      \
    FastDuck     BigDuck
          \      /
          MagicDuck
*/


class AbstractDuck {
public:
    AbstractDuck() {
        cout << "new AbstractDuck() called" << endl;
    }

    virtual void swim() {
      cout << "I'm swimming! But I can't compile! \n";
    }
};

class FastDuck: public AbstractDuck {
public:
    FastDuck() {
        cout << "new FastDuck() called" << endl;
    }
};

class BigDuck: public AbstractDuck {
public:
    BigDuck() {
        cout << "new BigDuck() called" << endl;
    }
};

class MagicDuck : public FastDuck, BigDuck {
public:
    MagicDuck() {
        cout << "new MagicDuck() called" << endl;
    }
};

int main() {

  MagicDuck duck;
  // duck.swim();
  return 0;
}