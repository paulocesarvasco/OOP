package com.unicamp.mc322.lab13.dataStructs;

import com.unicamp.mc322.lab13.utils.IOrder;
import com.unicamp.mc322.lab13.utils.IOrderingStrategy;

public class MyStrategy implements IOrderingStrategy {

	@Override
	public Double getScore(IOrder order) {
		double priorityScore = 0;
		if (order.getTipoPedido()) {
			priorityScore = order.getUser().getIdade()*0.01 + order.getTurnos()*0.07;
			priorityScore *= 2; // Se o pedido for presencial a prioridade tem peso 2
		} else {
			priorityScore = order.getUser().getIdade()*0.01 + order.getTurnos()*0.07;
		}
		return priorityScore * (-1); // Multiplicado por -1 para inverter a ordem da lista
	}
}
