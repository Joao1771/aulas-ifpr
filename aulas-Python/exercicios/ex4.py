# 4
dinheiro = int(input("dinheiro: "))
valores = [100,50,20,10,5,2]
for valor in valores:
    notas = int(dinheiro / valor)
    dinheiro = dinheiro % valor
    if notas > 0:
        print(notas, "notas de", "R$"+str(valor))

# dinheiro: 87
# 1 notas de R$50
# 1 notas de R$20
# 1 notas de R$10
# 1 notas de R$5
# 1 notas de R$2