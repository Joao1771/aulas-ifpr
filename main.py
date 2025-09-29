import os
import WConio2

clock = 0
bichoC = 15
bichoX = 20
largura = 45
altura = 25

def gotoxy(x,y):
    print(f"\033[{y};{x}H", end='', flush=True)

os.system('cls')

while clock < 10000:
    tela = ''
    tela += '*'*(largura+2) + '\n'
    for j in range(altura): # vertical
        tela += '*'
        for i in range(largura): # horizontal
            if i == bichoX and j == bichoC:
                tela += 'X'
            else:
                tela += ' '
        tela += '*' + '\n'
    tela += '*'*(largura+2) + '\n'
    if clock % largura:
        if(bichoX > largura):
            bichoX = 0
        else:
            bichoX += 1

    gotoxy(0,0)
    print(tela)
    clock += 1
    if WConio2.kbhit():
        codigo, simbolo = WConio2.getch()

        #print(codigo, ' ', simbolo)

        match codigo:
            case 72: bichoC -= 1 # ^
            case 80: bichoC += 1 # v