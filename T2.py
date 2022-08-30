# -*- coding: utf-8 -*-
# def hhh_test1(*args):
#     def sun():
#        ax = 0
#        for n in args:
#            ax = ax + n
#        return ax
#     return sun
# f = hhh_test1(1,2,3)
# print(f())

from tkinter.tix import Tree


def hhh_tet():
    f = []
    for i in range(1,4):
        def hh():
            return i * i
        f.append(hh)
    return f

f1,f2,f3 = hhh_tet()

print(f1())


print("======================")\


# def sun():
#     d =  0
#     def sun_1():
#         nonlocal d
#         d = d + 1
#         return d + 1
#     return sun_1
# ft = sun()
# print(ft())
# print(ft())
# print(ft())

print('================')

print('I\'m boos')

print(3 > 2) 

age  = 19

if age >= 18:
    print("yes")
else:
    print("NO")

    # a1111 = 1

    # t_ool = "zhangsan"

    # buerzhi  = True