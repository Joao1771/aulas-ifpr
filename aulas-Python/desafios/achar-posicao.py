lista = []
for i in range(15):
  numero = int(input("Digite um numero: "))
  lista.append(numero)

pesquisa = int(input("Digite o numero a ser achado: "))
if pesquisa in lista:
  for i in range(len(lista)):
    if lista[i] == pesquisa:
      print(f"O numero {pesquisa} está na posição {i+1}")
else:
    print("O numero não está na lista")

#     Digite o numero a ser achado: 5
#     O numero 5 está na posição 4