package com.Observer;

public class SolObserver extends Observer{
  
    private double valorCambio = 3.25;

    public SolObserver(Subject subject) {
        this.subject = subject;
        this.subject.agregar(this);
    }
    
    @Override
    public void actualizar () {
        System.out.printLn("PEN: " + (subject.getEstado () * valorCambio ));
    }
}
