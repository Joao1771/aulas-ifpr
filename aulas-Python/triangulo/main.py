lados = []
for i in range(3):
  lado = int(input("Digite o tamanho do lado do triangulo: "))
  lados.append(lado)
condicao = lados[1] + lados[2] > lados[0]
if condicao:
  condicao = lados[0]+ lados[1] > lados[2]
  if condicao:
    condicao = lados[0] + lados[2] > lados[1]
    if condicao:
      print("eh um triangulo")

# Digite o tamanho do lado do triangulo: 4
# Digite o tamanho do lado do triangulo: 8
# Digite o tamanho do lado do triangulo: 2