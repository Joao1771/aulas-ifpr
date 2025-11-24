termo = input("Escreva qualquer caractere: ")
vogais = 'aeiou'
consoantes = "qwrtypsdfghjklzxcvbnmç"
if len(termo) == 1:
    if termo.isnumeric():
      print("é um número")
    elif termo in vogais or termo in vogais.upper():
      print('é uma vogal', end=' ')
      if termo in vogais.upper():
        print("maiúscula")
      else:
        print("minuscula")
    elif termo in consoantes  or termo in consoantes.upper():
      print("é uma consoante", end=' ')
      if termo in consoantes.upper():
        print("maiúscula")
      else:
        print("minuscula")
    else:
      print("é um simbolo")
else:
    print("Digite apenas 1 caractere")

# Escreva qualquer caractere: s
# é uma consoante minuscula