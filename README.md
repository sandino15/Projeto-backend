# Projeto-backend
Projeto Back-End Kotlin - Faculdade UNINASSAU

Grupo Gym Fit

# Sandino Lourenço -Matricula- 01544309
# Bruno Matricula-
# Caio Matricula-
# Eduardo Matricula-          
# Thais Júlia Matricula- 01551266

LEVANTAMENTO DE REQUISITOS DA APLICAÇÃO MOBLIE E BACK-END.

Aplicção de App de Academia.
Documento de Requisitos: requisitos solicitados pelo cliente, Daivid Leal.

# Requisitos funcionais

      
  







# Imagens do projeto - Figma
1 Tela inicial / tela de cadastro

 ![image](https://user-images.githubusercontent.com/105602423/232133876-48bf026e-e30c-4bd6-8e71-0cff9af750a1.png)
 
 
 2 telas de informações
 
![image](https://user-images.githubusercontent.com/105602423/232343042-f190847a-b462-4b2d-9321-e80b790ccd4e.png)


 3 tela principal / tela de treino 

 ![image](https://user-images.githubusercontent.com/105602423/232142735-867a4368-5b02-4932-a1b6-9561658625e7.png)
 
 
 
 







# UML do Mobile
<div align="center">
<img src="" width="500px"/>
</div>

# UML do BackEnd

<div align="center">
<img src=/>
</div>


# Contrato com o JSON



Post/Login

esse endpoint é responsável por fazer o Login do usuario   
e receberá como parâmetro email e senha.

Post

```
{ "Id:1
  "Email:brunosantos@gmail.com"
  "Password:"26342523"
}  


Retorna:
Status cod :404


{"toke:" usuario Não encontrato" }

```


Post/User

esse endpoint é responsável por fazer cadastro do usuario <br/>
e recebera como parâmetro nome, email e senha.

post

```


{ "Id:1
  "name:"bruno santos "
  "Email:brunosantos@gmail.com
  "Password:"26342523"
}  

Retorna:


{ "toke:"Email foi utilizado " }


Retorna:


{"toke:"Erro no email e na senha "}

```


Get/ficha de treino

esse enpoint é responsável pela ficha de treino do usuario <br/>
e recebera como parâmetro: genero ,  objetivo do usuario exemplo<br/>
se e  ganho de massa ou emagrecer, peso do usuario ,<br/>
 e altura e 
 
 

 Get 

 ```
 { "Id:"1"
   "genero:"masculino"
   "Objetivo do treino:"emagrecer"
   "altura:"1,75"
   "peso:"82 kg " 
   "
  }
  

```
