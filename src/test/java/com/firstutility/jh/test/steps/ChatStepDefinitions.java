package com.firstutility.jh.test.steps;

import net.thucydides.core.annotations.Steps;
import static org.hamcrest.Matchers.is;
import org.jbehave.core.annotations.*;
import static org.junit.Assert.assertThat;

public class ChatStepDefinitions {
    @Steps
    ChatSteps chat;
    private String response = "";

    @Given("that I have established a chat")
    public void givenChatEstablished() {
        chat.init();
    }

    @Given("some things have been said")
    public void givenThingsAlreadySaid() {
        response = chat.say("Some arbitrary words");
    }

    @Given("that I identified myself as: $name")
    @Alias("that I identified myself as: <name>")
//    @Composite(steps = { 
//        "Given that I have established a chat", 
//        "When I say: My name is <name>" })
    public void givenIdentifyAs(@Named("name") String name) {
        givenChatEstablished();
        whenSaid("My name is " + name);
    }

    @When("I say: <said>")
    @Alias("I say: $said")
    public void whenSaid(@Named("said") String said) {
        response = chat.say(said);
    }

    @Then("the response is: <response>")
    @Alias("the response is: $response")
    public void responseIs(@Named("response") String response) {
        assertThat(this.response, is(response));
    }
}
