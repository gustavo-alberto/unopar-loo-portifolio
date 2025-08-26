# Sistema Bancário Simples (Java + Maven)

Este projeto é um **sistema bancário simples** desenvolvido em **Java**, utilizando **Maven** como gerenciador de dependências.

O código principal (`GerenciaBanco.java`) solicita os dados do usuário (nome, sobrenome e CPF), cria uma conta bancária e disponibiliza um **menu interativo** com operações básicas:

- Consultar saldo
- Depositar valores
- Sacar valores
- Encerrar sessão

A classe `BankAccount` encapsula as operações da conta, como depósito, saque e consulta de saldo.

## 🚀 Executando o Projeto

### 1. Via NetBeans (ou outro IDE Java)

1. Abra o projeto no **NetBeans**.
2. Certifique-se de ter configurado o **JDK**.
3. Compile e execute a classe principal:
4. Use o console interativo para navegar pelo menu.

### 2. Via Docker

#### 📦 Construir a imagem

No diretório raiz do projeto (onde está o `Dockerfile`), execute:

```bash
docker build -t sistema-bancario .
```

#### ▶️ Rodar o container

Execute o container em modo interativo para poder digitar no menu:

```bash
docker run -it --rm sistema-bancario
```

#### 📖 Exemplo de Uso

```
Seja bem-vindo ao sistema bancário.
Qual o seu nome?
Gustavo
Qual o seu sobrenome?
Alberto
Qual o seu CPF?
123.456.789-00

------Menu------

1. Consultar Saldo.
2. Depositar.
3. Sacar.
4. Encerrar.
   Escolha uma opção:
```
