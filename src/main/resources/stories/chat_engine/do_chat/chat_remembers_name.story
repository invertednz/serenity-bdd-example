Narrative:
  As a user of the chat system
  I want the system to remember my name
  So that I'm reassured that it cares about me

Scenario: Chat engine replies to My Name Is...

Given that I have established a chat
When I say "My name is John"
Then the response is "Good to hear from you John."

Scenario: Chat engine includes name in certain responses

Given that I identified myself as "John"
When I say <said>
Then the response is <response>

Examples:
| said          | response      |
| Who am I?     | You are John. |
| Robot?        | Yes John?     |