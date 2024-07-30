package com.Observer;

import com.Observer.Subject;

import io.micrometer.observation.ObservationRegistry;

import java.util.List;


public class Subject {
   
    private List<Observer> observers = new ObservationRegistry() {
        private int estado;


    public int getEstado() {
            return estado;
    }

    public void setEstado(int estado){
            this.estado = estado;
            notificarTodosObservers();
    } 
    
    public void agregar(observer observer) {
        observers.add(observer);
     }

     public void notificarTodosObservers() {
        for (Observer observer : observers) {
            observer.forEach(x -> x.actualizar());
        }
     }

};

    public void agregar(SolObserver solObserver) {
        
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }
    public double getEstado() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getEstado'");
    }
    public void setEstado(int i) {
    
        throw new UnsupportedOperationException("Unimplemented method 'setEstado'");
    }
   
  }
