package com.unicamp.mc322.lab13;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.unicamp.mc322.lab13.utils.ICrazyDS;
import com.unicamp.mc322.lab13.utils.IOrder;
import com.unicamp.mc322.lab13.dataStructs.*;
import com.unicamp.mc322.lab13.exceptions.*;
import com.unicamp.mc322.lab13.models.*;

public class Main {

	public static void main(String[] args) {
		//ICrazyDS crazyDS = new CrazyDS(new OrderingStrategy()); // Descomentar essa linha e comentar a proxima para testar diferentes estratégias de pontuacao
		ICrazyDS crazyDS = new CrazyDS(new MyStrategy());
		IOrder order1 = new Presencial(new User("name1", "cpf1", Period.between(LocalDate.of( 1990 , Month.JUNE , 25 ), LocalDate.now()).getYears()));
		IOrder order2 = new Presencial(new User("name2", "cpf2", Period.between(LocalDate.of( 1986 , Month.JANUARY , 22 ), LocalDate.now()).getYears()));
		IOrder order3 = new Online(new User("name3", "cpf3", Period.between(LocalDate.of( 1992 , Month.JANUARY , 25 ), LocalDate.now()).getYears()));
		try {
			IOrder order5 = new Online(new User("name5", "cpf5", Period.between(LocalDate.of( 2010 , Month.DECEMBER , 12 ), LocalDate.now()).getYears()));
		} catch (CreateOrderException e) {
			//e.printStackTrace();
            System.out.println("-ok: Show error in logs");
		}
		try {
			IOrder order6 = new Presencial(new User("", "cpf6", Period.between(LocalDate.of( 1980 , Month.DECEMBER , 12 ), LocalDate.now()).getYears()));
		} catch (CreateOrderException e) {
			//e.printStackTrace();
            System.out.println("-ok: Show error in logs");
		}
		try {
			IOrder order7 = new Presencial(new User("nome7", "\t", Period.between(LocalDate.of( 1980 , Month.DECEMBER , 12 ), LocalDate.now()).getYears()));
		} catch (CreateOrderException e) {
			//e.printStackTrace();
            System.out.println("-ok: Show error in logs");
		}
	     crazyDS.add(order1);
	     crazyDS.incrementarTurnos();
	     crazyDS.add(order2);
	     crazyDS.incrementarTurnos();
	     crazyDS.add(order3);
	     crazyDS.incrementarTurnos();
	     System.out.println("---- A: Elements ----");
	     crazyDS.printPedidos();
	     crazyDS.incrementarTurnos();

        System.out.println("---- B: Getting and removing the element with highest priority ----");
        IOrder p1;
        try {
            p1 = crazyDS.peek();
            crazyDS.incrementarTurnos();
            System.out.println("-selected element");
            p1.printUser();
            crazyDS.remove(p1);
            crazyDS.incrementarTurnos();
            System.out.println("-elements");
            crazyDS.printPedidos();
            crazyDS.incrementarTurnos();
        } catch (CrazyDSException e) {
            e.printStackTrace();
        }

        System.out.println("---- C: Adding an old person ----");
        try {
        	IOrder order4 = new Presencial(new User("name4", "cpf4", Period.between(LocalDate.of( 1987 , Month.JANUARY , 25 ), LocalDate.now()).getYears()));
        	crazyDS.add(order4);
            crazyDS.incrementarTurnos();
        } catch (CrazyDSException e) {
        	e.printStackTrace();
        } catch (CreateOrderException e) {
        	//e.printStackTrace();
            System.out.println("-ok: Show error in logs");
        }
        
        crazyDS.printPedidos();
        crazyDS.incrementarTurnos();
        System.out.println("-selected element");
        IOrder p2 = crazyDS.peek();
        crazyDS.incrementarTurnos();
        p2.printUserInfo();

        System.out.println("---- D: Checking an exception ----");
        try {
            IOrder p3 = crazyDS.get(1000);
            crazyDS.incrementarTurnos(); //Nao sera executado
        } catch (CrazyDSException e) {
            //e.printStackTrace();
            System.out.println("-ok: Show error in logs");
        }
    }
}
