mensagem = input("insira a mensagem a ser criptografada: ")
chave = int(input("insira a chave: "))

for letra in mensagem:
    codigo = ord(letra) + chave
    print(chr(codigo), end="")