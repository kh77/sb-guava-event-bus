## Spring Boot - Guava Event Bus Example

- Async Event Bus
- Sync Event Bus
- Check this EventBusConfig class for EventBus configuration
- Check the console log which threads are associated with eventbus as a sync and asycn flow
- CustomExceptionHandler -> for handling global exception in the subscription of event-bus.

- ### Create User
        curl --location --request POST 'http://localhost:8080/users' \
        --header 'accept: */*' \
        --header 'Content-Type: application/json' \
        --data-raw '{
        "name": "hello world",
        "email": "hello@hotmail.com"
        }'
