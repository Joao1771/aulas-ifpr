
#programa que le dois nomes e dois salários relativos a esses nomes
# Mostra quem recebe mais ou se recebem igualmente
p1 = input("Digite o nome da primeira pessoa: ")
p2 = input("Digite o nome da segunda pessoa: ")
sal1 = float(input(f"Digite o salário de {p1}: "))
sal2 = float(input(f"Digite o salário de {p2}: "))


s1 = str(sal1).replace(".",",")
s2 = str(sal2).replace(".",",")
print(f"{p1} recebe {s1}R$, {p2} recebe {s2}R$")

if(sal1 > sal2):
    print(f"{p1} recebe {sal1 - sal2}R$ a mais que {p2}")
if(sal2 > sal1):
    print(f"{p2} recebe {sal2-sal1}R$ a mais que {p1}")
if(sal1 == sal2):
    print(f"{p1} e {p2} recebem o mesmo salário")


    