package com.example.model;

import com.example.interactions.Wait;
import com.example.interactions.Click;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.example.ui.notepad;
public class eliminarElemento implements Task {
    private final String item;

    public eliminarElemento(String item) {
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AGREGAR_ITEM),
                Wait.forAMoment(),
                Write.theText(item).into(INPUT_ITEM),
                Click.on(BOTON_AGREGAR)
        );
    }

    public static AddItem toTheList(String item) {
        return instrumented(AddItem.class, item);
    }


}
