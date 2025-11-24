#contador
def contador():
    inicio = int(input("começa do:"))
    termino = int(input("termina em:"))
    tudo = [[]]
    x = 0
    while(inicio <= termino):
        inicio += 1
        tudo[x].append(inicio)
        if(inicio % 50 == 0):
          tudo.append([])
          x += 1

    while(x >= 0):
        print(tudo[x])
        x -= 1
contador()

# começa do:1
# termina em:10

#[2, 3, 4, 5, 6, 7, 8, 9, 10]