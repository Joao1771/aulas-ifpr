palavra = "casa"
r = len(palavra) #4    igual o .length
r = palavra+palavra #casacasa   concatenar
r = palavra[0:2] #["ca","a"]     recorte
r = palavra.find("s") #2    encontra o elemento e retorna seu índice

r = palavra.split('s')
#["ca","a"]      separa usando o termo escrito (pode fazer retornar todas as falas de uma frase separando com espaço)

r = palavra.upper() #CASA       igual o ToUpperCase
r = palavra.lower() #casa        igual o ToLowerCase
r = palavra.replace("s", "p") #capa     troca um termo pelo outro