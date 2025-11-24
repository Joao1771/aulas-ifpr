qtd = int(input('Quantidade de clientes para cadastro: '))
clientes = []
nomes = []
for i in range(qtd):
    print('Início do cadastro')
    nome = input('Insira o nome: ')
    email = input('Insira o email: ')
    telefone = input('Insira o telefone: ')
    clientes.append([nome, email, telefone])
    nomes.append(nome)
    print('---Fim do cadastro---')
print(f'Os(As) clientes: {nomes}, foram cadastrados!')

# Quantidade de clientes para cadastro: 3
# Início do cadastro
# Insira o nome: João
# Insira o email: joao@email.com
# Insira o telefone: 64345-3543
# ---Fim do cadastro---
# Início do cadastro
# Insira o nome: Maria
# Insira o email: maria@email.com
# Insira o telefone: 54352-76565
# ---Fim do cadastro---
# Início do cadastro
# Insira o nome: Otávio
# Insira o email: otavio@email.com
# Insira o telefone: 54232-65234
# ---Fim do cadastro---
# Os(As) clientes: ['João', 'Maria', 'Otávio'], foram cadastrados!