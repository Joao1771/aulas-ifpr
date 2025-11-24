// adicionar tarefa

#include <stdio.h> // scanf e printf (entrada e saida)
#include <string.h> // strcpy e strcspn
#include <stdlib.h> // malloc e free (manipulacao de memoria)

//cria um struct com a tarefa e um ponteiro para o proximo item
struct Item {
    char tarefa[50]; // recebe uma string de 50 caracteres no maximo
    
    struct Item *prox;//Este campo guarda um endereço de memória que aponta para outro nodo.
    //Assim, cada nodo sabe onde está o próximo, formando uma corrente.
    //Se prox for NULL, significa que não existe próximo nodo e a lista termina ali.
    
}; //define um apelido para struct Nodo

// Cria um novo nodo
struct Item* criarItem(char *texto) {
    
    struct Item *novo = malloc(sizeof(struct Item)); //malloc aloca um espaço na memoria e retorna o ponteiro para ele
    strcpy(novo->tarefa, texto); //strcpy(destino, origem) move uma string para outra area da memoria
    novo->prox = NULL;
    return novo;
}


// Imprime a lista inteira
void imprimirLista(struct Item *lista) {
    struct Item *atual = lista;
    
    printf("**************Lista de tarefas**************\n\n");

    while (atual != NULL) {
        printf("- %s\n", atual->tarefa); // do endereco de atual pega a tarefa
        atual = atual->prox;   // vai para o próximo nodo
    }
    
    printf("Pressione qualquer tecla para continuar...\n");
    getchar();
}

// adiciona a tarefa 
void adicionar(struct Item **lista){ //**lista: pega o ponteiro do ponteiro da lista
        char tarefa[50];
        
        printf("**************Adicionar tarefas**************\n");
        printf("Escreva a tarefa:\n");
        
        //fgets(variavel, tamanho, stdin)
        //igual o scanf mas para strings completas com espaços
        fgets(tarefa, 50, stdin);
        
        system("clear"); // limpa o terminal
        
        //troca o \n pelo \0 para não printar o enter
        //strcspn(variavel, char) -> retorna a posicao do char na string
        tarefa[strcspn(tarefa, "\n")] = '\0';
        
        struct Item *novo = criarItem(tarefa); // cria um nodo com a tarefa do usuario
        novo->prox = *lista;   // aponta o novo para o antigo primeiro
        *lista = novo;
        
        printf("Adicionada a tarefa:\n\n  %s\n\n",tarefa);
        printf("Pressione qualquer tecla para continuar...\n");
        getchar(); // igual input()
        system("clear");

    }
    
int main(){
    struct Item *lista = NULL; //cria a lista como NULL 
    
    printf("****************************************************** \n \n" );
    printf("Digite a letra [a] se quiser alterar uma tarefa \n");
    printf("Digite a letra [e] se quiser excluir uma tarefa \n" );
    printf("Digite a letra [l] se quiser ler as tarefas \n" );
    printf("Digite a letra [d] se quiser adicionar uma tarefa \n \n" );  
   
   
    char opcao;
    printf("Digite uma opção: ");
    scanf(" %c", &opcao); 
    
    if(opcao == 'a'){
        
    } else if (opcao == 'e'){
        
    }else if (opcao == 'l'){
        printf("ele");
        imprimirLista(lista);
    } else if(opcao == 'd'){
        adicionar(&lista);
    }
   
   
    printf("****************************************************** \n" );
   
    return 0;
}

//dicas: codeguru