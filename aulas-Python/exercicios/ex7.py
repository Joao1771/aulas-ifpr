# 7
numero = int(input('elementos da serie: '))
e = 1
for i in range(1,numero + 1):
  fatorial = 1
  for j in range(1,i + 1):
    fatorial *= j
  e += 1/fatorial
print(e)

# elementos da serie: 3000
# 2.7182818284590455