numeros = []
res = 0

for i in range(15):
    n = int(input("Digite o número: "))
    numeros.append(n)

alvo = int(input("Digite o número alvo: "))

for i in range(len(numeros)):
    if numeros[i] == alvo:
        # só verifica anterior se i > 0
        if i > 0 and numeros[i - 1] % 2 != 0:
            res += 1

print(res)

# Digite o número: 7
# Digite o número: 5
# Digite o número: 2
# Digite o número: 8
# Digite o número: 3
# Digite o número: 9
# Digite o número: 4
# Digite o número: 2
# Digite o número: 5
# Digite o número: 8
# Digite o número: 3
# Digite o número: 4
# Digite o número: 7
# Digite o número: 1
# Digite o número: 7
# Digite o número alvo:8
# 0