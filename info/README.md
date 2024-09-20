1. run docker
2. send in postman POST => http://localhost:8080/send?message=Hello_Rabbit

or

1. Docker:
- image-> rabbitmq:3-management
- port-> 15672:15672(ui) / 5672:5672
RABBITMQ_DEFAULT_USER: admin
RABBITMQ_DEFAULT_PASS: admin
- http://localhost:15672/

user:admin
password:admin

2. How to run:
    + Application run as debug
    - gradle build -x test
    - in git bash ./gradlew build -x test
    -
3. http://localhost:8080/send?message=hello
4. http://localhost:8080/sendAndReceive?message=abc





