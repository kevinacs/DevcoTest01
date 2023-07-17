Feature: Agregar 5 ítems a la lista en y borrar uno
  Scenario: Agregar ítem a la lista
    Given el actor está en el Notepad Online
    When el actor agrega el ítem "Ejemplo" a la lista
    Then la lista muestra el ítem "Ejemplo"