package com.unicamp.mc322.lab13.dataStructs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.unicamp.mc322.lab13.exceptions.CrazyDSException;
import com.unicamp.mc322.lab13.utils.*;

public class CrazyDS implements ICrazyDS {
	
	private IOrderingStrategy strategy = null;
	private List<IOrder> pedidos = new ArrayList<IOrder>();
	
	public CrazyDS(OrderingStrategy strategy) {
		this.strategy = strategy;
	};
	
	public CrazyDS(MyStrategy strategy) {
		this.strategy = strategy;
	};

	@Override
	public void add(IOrder pedido) {
		pedidos.add(pedido);
		sortPedidos();
	}

	@Override
	public void remove(IOrder pedido) {
		pedidos.remove(pedido);
		
	}

	@Override
	public IOrder peek() {
		return pedidos.get(0);
	}
	
	@Override
	public IOrder get(int index) {
		if (index > pedidos.size()) {
			throw new CrazyDSException(index, pedidos.size());
		}
		return pedidos.get(index);
	}

	@Override
	public void printPedidos() {
		for(IOrder pedido : pedidos) {
			pedido.printInfoPedido();
		}
	}

	@Override
	public void sortPedidos() {
		Collections.sort(pedidos, new Comparator<IOrder>() {
			public int compare(final IOrder pedido_1, final IOrder pedido_2) {
		          return strategy.getScore(pedido_1).compareTo(strategy.getScore(pedido_2));
		      }
		});
	}

	@Override
	public void incrementarTurnos() {
		for(IOrder pedido : pedidos) {
			pedido.incrementarTurno();
		}
	}

}
