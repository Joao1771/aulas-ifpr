# 6
renda = int(input('renda mensal: '))
emprestimo = int(input('valor do emprestimo: '))
prestacoes = int(input('numero de prestacoes: '))
if emprestimo <= 10 * renda and emprestimo / prestacoes <= 0.3 * renda:
  print('emprestimo concedido!')
else:
  print('emprestimo nao concedido.')

#   renda mensal: 2000
# valor do emprestimo: 40
# numero de prestacoes: 2
# emprestimo concedido!