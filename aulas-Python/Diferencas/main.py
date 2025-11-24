p1 = input("Digite uma palavra: ")
p2 = input("Digite outra palavra de mesmo tamanho: ")
erros = 0

if(len(p1) == len(p2)):
  for i in range(len(p1)):
    if(p1[i] != p2[i]):
      erros += 1
  print(erros)
else:
  print("As palavras devem ter o mesmo tamanho.")

#   Digite uma palavra: casarao
# Digite outra palavra de mesmo tamanho: macacao
# 3