# 1
x = input("número: ")
x = int(x)
cont = 1
divisores = 0
while cont < x:
    if x % cont == 0:
        divisores += cont
    cont+= 1
print(divisores, 'divisores')

# número: 8
# 7 divisores