package com.example.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class notepad {
    public static final Target AGREGAR_ITEM = Target.the("Botón Agregar Item")
            .located(By.id("btn-add-item"));
    public static final Target INPUT_ITEM = Target.the("Campo de texto para el ítem")
            .located(By.id("input-item"));
    public static final Target BOTON_AGREGAR = Target.the("Botón Agregar")
            .located(By.id("btn-add"));
    public static final Target LISTA_ITEMS = Target.the("Lista de ítems")
            .located(By.id("item-list"));

    // Método adicional para verificar si la lista contiene un ítem específico
    public static Target ITEM_EN_LISTA(String item) {
        return Target.the("Ítem " + item).located(By.xpath("//li[contains(text(),'" + item + "')]"));
    }
}
