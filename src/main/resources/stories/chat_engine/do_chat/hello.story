Narrative:
  As a user of the chat system
  I want a friendly response to simple greetings
  So that I feel comfortable when chatting to the robot

Scenario: Chat engine replies to hello

Given that I have established a chat
When I say "Hello"
Then the response is "Hiya"

Scenario: Chat engine notices when "Hello" comes late in the chat

Given that I have established a chat
And some things have been said
When I say "Hello"
Then the response is "It's a bit late for hello..."