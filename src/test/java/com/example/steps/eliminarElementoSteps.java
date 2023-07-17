package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class eliminarElementoSteps {
    private Actor actor;

    @Given("el actor está en el Notepad Online")
    public void queElActorEstaEnElNotepadOnline() {
        OnStage.setTheStage(new OnlineCast());
        actor = OnStage.theActorCalled("actor");
    }

    @When("el actor agrega el ítem {string} a la lista")
    public void elActorAgregaItemALaLista(String item) {

        actor.attemptsTo(aLista(item));
    }

    @Then("la lista muestra el ítem {string}")
    public void laListaMuestraItem(String item) {

    }
}
