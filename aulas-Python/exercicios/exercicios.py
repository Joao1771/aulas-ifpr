import math

def fizzbuzz(n):
    for i in range(n):
        i += 1
        if i % 3 == 0 and i % 5 == 0: print("fizzbuzz")
        elif i % 3 == 0: print("fizz")
        elif i % 5 == 0: print("buzz")
        else: print(i)
        
# precisa melhorar mas vai ficar assim
def comendoListas(lista):
    ordenada = []
    formatada = []
    pares = []
    igual = False
    menor = 99999999999999
    soma = 0

    for item in lista:
        for j in formatada:
            if item == j: igual = True
        if igual == False: formatada.append(item)
        igual = False

    tamanhoOriginal = len(formatada)
    
    while len(ordenada) != tamanhoOriginal:
        for item in formatada:
            if item < menor: 
                menor = item
        ordenada.append(menor)
        formatada.remove(menor)
        menor = 99999999999999


    for item in ordenada: soma += item

    print(f"Soma: {soma} \nMedia: {soma / (len(ordenada) - 1)}\nMaior valor: {ordenada[-1]}")
    
    for item in ordenada:   
        if item % 2 == 0: pares.append(item)
    
    print(pares, ordenada)
    print()
    
def cumendoListas(lista):
    lista = set(lista)
    lista = list(lista)
    lista = sorted(tuple(lista))
    soma = sum(tuple(lista))
    media = soma / (len(lista) - 1)

    print(f"Soma {soma}\nMedia: {media}\nMaior valor: {max(lista)}")

def tabuada(numero):
#     usando range()
    # for n in range(10):
    #     print(f"{numero} x {n + 1} = {numero * (n + 1)}")

#   sem range()
    contador = 1
    while contador <= 10:
        print(f"{numero} x {contador} = {numero * contador}")
        contador += 1

def contarPalavras(string):
    string = string.lower()
    palavras = string.split()
    dicionario = {}

    for palavra in palavras:
        # in: verifica se esta no dicionario ou lista
        if palavra in dicionario: dicionario[palavra] += 1
        else: dicionario[palavra] = 1
    
    print(dicionario)

def compreensao(lista):
    # <valor final> for <item> in <iterable> if? <condicao> 
    pares = [n for n in lista if n % 2 == 0]

    # o valor final pode ser alterado, como com upper ou calculando igual aqui
    quadrados = [math.floor(n ** 0.5) for n in lista if n % 2 != 0]

    divisiveis = [n for n in lista if n % 5 == 0 or n % 3 == 0]

    print(pares, "\n", quadrados, "\n", divisiveis)

def validarIdade():
    idade = ""
    fim = False
    while not fim:
        idade = input()
        try: idade = int(idade)
        except: 
            print("Digite um valor numerico")
            continue
        else:
            if idade < 1 or not isinstance(idade, int):
                print("Digite uma idade valida")
            else: 
                print("Obrigado pela visita!")
                fim = True

# fizzbuzz(50)
# comendoListas([4, 7, 2, 7, 9, 4, 1, 10, 29, 14, 25, 25, 25, 80, 5, 3])
# cumendoListas([4, 7, 2, 7, 9, 4, 1, 10, 29, 14, 25, 25, 25, 80, 5, 3])
# tabuada(67)
# contarPalavras("string para teste e para Teste")
# compreensao(range(30))
# validarIdade()
