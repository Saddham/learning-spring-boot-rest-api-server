# learning-spring-boot-rest-api-server
Learning Spring Boot Rest API Server

## Reference
https://spring.io/guides/tutorials/rest

## Run with
    $ mvn clean spring-boot:run

## API Usage
### Get list of employees
    $ curl -v localhost:8080/employees | json_pp
### Create new employee
    $ curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}' | json_pp
### Replace existing employee
    $ curl -X PUT localhost:8080/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}' | json_pp
### Delete existing employee
    $ curl -X DELETE localhost:8080/employees/3 | json_pp