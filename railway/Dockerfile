# Usar uma imagem base do OpenJDK 17
FROM openjdk:17-jdk-alpine

# Diretório de trabalho
WORKDIR /app

# Copiar o arquivo pom.xml e o código-fonte
COPY pom.xml ./
COPY src ./src

# Instalar dependências e compilar o projeto
RUN ./mvnw clean install -DskipTests

# Expor a porta 8080
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["./mvnw", "spring-boot:run"]
