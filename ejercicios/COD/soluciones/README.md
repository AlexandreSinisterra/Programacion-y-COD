
sequenceDiagram
participant View
participant Controller
participant Model
participant ObserverGasolina
activate Controller
View ->> Controller: avanzar()
Controller ->> View: pedirMatricula()
Controller ->> View: pedirDistancia()
Controller ->> Model: avanzar(Matricula, Distancia)
deactivate Controller
Model ->> Model: getCoche(matricula)
Model ->> Model: coche.avanzar()
Model ->> ObserverGasolina: update(coche)
Model ->> Controller: avanzar devuelve true
Controller ->> View: Mensaje avanzar satisfactorio
ObserverGasolina ->> ObserverGasolina: tiene menos de 10l? SI
ObserverGasolina ->> View: msg("Tienes que respotar")

