package com.Observer;

public class PesoMexObserver extends Observer {

private double valorCambio = 19.07;

public PesoMexObserver(Subject subject) {
    this.subject = subject;
    this.subject.agregar(this);
}

@Override
public void actualizar () {
    System.out.println("MX: " + (subject.getEstado () * valorCambio ));
}

}
