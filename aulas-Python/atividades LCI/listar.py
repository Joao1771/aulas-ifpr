
#programa que le numeros do usuario enquanto ele quiser continuar.
#Quando ele cansar, o programa mostra os numeros em ordem inversa

listaNumeros = []
opcao = 's'
while opcao == 's' or opcao == 'sim':
    listaNumeros.append(input("Digite um número: "))
    opcao = input("Continua? ")
listaNumeros.reverse()
print(listaNumeros)
