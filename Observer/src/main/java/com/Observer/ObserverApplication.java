package com.Observer;

import com.Observer.pesoArgObserver;
import com.Observer.PesoMexObserver;
import com.Observer.SolObserver;
import com.Observer.Subject;

public class ObserverApplication {

	public static void main(String[] args) {
		Subject subject = new Subject();


		new pesoArgObserver(subject);
		new PesoMexObserver(subject);
		new SolObserver(subject);
	

		System.out.println("Si desea cambiar 10 dólares obtendra:");
		subject.setEstado(10);
		System.out.println("------------");
		System.out.println("Si desea cambiar 100 dólares obtendra:");
		subject.setEstado(100);
	}

}
