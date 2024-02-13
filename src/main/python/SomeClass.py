#!/usr/bin/env python3

# https://stackoverflow.com/a/1641236/4337151

class SomeClass:
    def __init__(self):
        self.my_var = "42"
        self._my_var = "_42"
        self.__my_var = "__42"

    def get_my_private_var(self):
        return self.__my_var

if __name__ == "__main__":
    x = SomeClass()
    # print(x.get_my_private_var())

    # print(x.my_var)
    # print(x._my_var)
    # print(x.__my_var)

    # print(dir(x))
    # print(x._SomeClass__my_var) # the interpreter intentionally renames the variable.


