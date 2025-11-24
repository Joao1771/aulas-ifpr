pessoa1= input("Escreva o nome da primeira pessoa ")
salario1 = input("Escreva o salario da primeira pessoa: R$")
pessoa2= input("Escreva o nome da segunda pessoa ")
salario2 = input("Escreva o salario da segunda pessoa: R$")
comparacao = 0

def checar():
  if(not salario1.isdigit() or not salario2.isdigit()):
    return True;

if not checar():

    salario1 = float(salario1)
    salario2 = float(salario2)

    if(float(salario2)>float(salario1)):
        comparacao = salario2 - salario1
        print(f"o salário de {pessoa2}, R${salario2}, é maior que o salário de {pessoa1}, R${salario1} \n A comparação é de {comparacao}")
    elif(float(salario2)<float(salario1)):
        comparacao = salario1 - salario2
        print(f"o salário de {pessoa1}, R${salario1}, é maior que o salário de {pessoa2}, R${salario2} \n A comparação é de {comparacao}")
    else:
        comparacao = 0
        print(f"o salário da primeira pessoa, R${salario1}, é igual ao salário da segunda pessoa, R${salario2} \n A comparação é de {comparacao}")
else:
      print("Escreva apenas números")

#       Escreva o nome da primeira pessoa ze
# Escreva o salario da primeira pessoa: R$2000
# Escreva o nome da segunda pessoa alfredo
# Escreva o salario da segunda pessoa: R$1900
# o salário de ze, R$2000.0, é maior que o salário de alfredo, R$1900.0 
#  A comparação é de 100.0