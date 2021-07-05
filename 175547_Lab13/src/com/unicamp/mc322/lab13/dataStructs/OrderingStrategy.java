package com.unicamp.mc322.lab13.dataStructs;

import com.unicamp.mc322.lab13.utils.IOrder;
import com.unicamp.mc322.lab13.utils.IOrderingStrategy;

public class OrderingStrategy implements IOrderingStrategy {

	@Override
	public Double getScore(IOrder order) {
		double priorityScore = 0;
		priorityScore = order.getUser().getIdade()*0.01 + order.getTurnos()*0.07;
		return priorityScore * (-1);
	}

}
