# Getting Started

See the blog post at [https://sheetsj.com/blog/calling-openai-gpt-4-from-kotlin-with-spring-ai/](https://sheetsj.com/blog/calling-openai-gpt-4-from-kotlin-with-spring-ai/)

This is a Proof of Concept to call GenAI LLM's from Spring Boot using Spring-AI.

It is currently configured to call OpenAI GTP-4.

See settings in application.properties.

Create your Open AI Key in an environment variable `export SPRING_AI_OPENAI_API_KEY=<your-key-here>`

- [Spring AI Docs] (https://docs.spring.io/spring-ai/reference/api/clients/openai-chat.html)

### Running locally

- `./gradlew bootRun` to run the server
- Then in a different console: `curl localhost:8080/quote` or `curl localhost:8080/haiku`

- `./gradlew tasks` to see all available tasks

### References

- Thank you to Dan Vega for the [Spring AI Intro video](https://www.youtube.com/watch?v=yyvjT0v3lpY) for inspiration
- This project was generated via the [Spring Initializer](https://start.spring.io)

