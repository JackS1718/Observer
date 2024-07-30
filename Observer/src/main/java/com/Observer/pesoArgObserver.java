package com.Observer;

public class pesoArgObserver extends Observer {
     

        private double valorCambio = 29.86;
        
        public pesoArgObserver(Subject subject) {
            this.subject = subject;
            this.subject.agregar(this);
        }
        
        @Override
        public void actualizar () {
            System.out.println("ARG: " + (subject.getEstado () * valorCambio ));
        }
        
        }
