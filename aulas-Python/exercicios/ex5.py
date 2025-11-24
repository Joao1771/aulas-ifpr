# 5
valor = int(input('valor do produto: '))
entrada = 0
parcelas = 0
if valor % 3 == 0:
  entrada = int(valor / 3)
  parcelas = int(valor / 3)
  print(f'A entrada do produto é R${entrada} e tem duas parcelas de R${parcelas}')
else :
  entrada = int(valor /3 + valor % 3)
  parcelas = int(valor / 3)
  print(f'A entrada do produto é R${entrada} e tem duas parcelas de R${parcelas}')
  
#   valor do produto: 350
# A entrada do produto é R$118 e tem duas parcelas de R$116