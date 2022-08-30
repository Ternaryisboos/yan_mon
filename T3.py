a = 12
at = "zhangshan"
ttt = True
print('==============')
a = 'ABC'
b = a
a = 'XYZ'
print(b)

print('===============')
n = 123
f = 456.789
s1 = 'Hello, world'
s2 = 'Hello, \'Adam\''
s3 = r'Hello, "Bart"'
s4 = "zhanshan"
# s4 = r'''Hello,
print(n)
print(f)
print(s1)
print(s2)
print(s3)
print(s4)
s5 = 2.1415926

print(ord('A'))

print('================')

han = 2
def hanshu(han):
    if han > 5:
          return  han
    else:
            return  -han

print(hanshu(han))

print('===============')

print(hanshu)

def power(x):
    return x *  x    
print(power(4))

def pott(x,n):
    s = 1
    while n >0:
        n = n - 1
        s = x * s
    return s

print(pott(5,2))