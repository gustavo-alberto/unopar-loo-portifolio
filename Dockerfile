# === ESTÁGIO 1: CONSTRUÇÃO ===
# Usa uma imagem com JDK e Maven. A tag "AS builder" dá um nome para este estágio.
FROM maven:3.9.6-eclipse-temurin-17 AS builder

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia o arquivo de configuração do Maven e o código fonte
COPY pom.xml .
COPY src ./src

# Compila o projeto e gera o .jar executável
# O comando 'package' do Maven cria o .jar em 'target/seu-projeto.jar'
RUN mvn package

# === ESTÁGIO 2: EXECUÇÃO (Runtime) ===
# Inicia um novo estágio com uma imagem de ambiente de execução mais leve
FROM openjdk:26-slim

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo .jar do estágio "builder" para este estágio
# O comando --from=builder busca o artefato no estágio anterior
COPY --from=builder /app/target/app.jar app.jar

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
