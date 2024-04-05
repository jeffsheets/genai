package com.sheetsj.genai.controller

import org.springframework.ai.chat.ChatClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatController(val chatClient: ChatClient) {

    @GetMapping("/haiku")
    fun haiku(@RequestParam(defaultValue = "write a haiku about software engineering") message: String): String {
        return chatClient.call(message)
    }

    @GetMapping("/quote")
    fun quote(): String {
        val message = """
          Give me a random one-line quote from a famous computer scientist or software developer. 
          To help make it random, the first letter of the last name should coincide with 
            the current second of the current minute of time.
          Include a newline at the end of the quote
            """
        return chatClient.call(message)
    }
}