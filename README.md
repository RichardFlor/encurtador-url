<h1 align="center">
  Encurtador De Url 
</h1>



## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [H2 Database](https://www.baeldung.com/spring-boot-h2-database)



## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```


A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## H2 Database


- [H2 Database](https://www.baeldung.com/spring-boot-h2-database).
- [Acesso H2 Database](http://localhost:8080/h2-console).

```
$ http GET :8080/url/tkaiQdsnz

```


## API Endpoints


- Gerar Url Encurtada 
```
$ http POST :8080/url/shorten

{
    "url": "https://www.youtube.com/@ComprehensibleEnglish/playlists"
}

Retorno: 

{
    "url": "https://xxx.com/tkaiQdsnz"
}

```

- Buscar Url Encurtada 
```
$ http GET :8080/url/tkaiQdsnz

```

