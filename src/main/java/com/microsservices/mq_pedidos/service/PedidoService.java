package com.microsservices.mq_pedidos.service;

import com.microsservices.mq_pedidos.database.model.ItemPedido;
import com.microsservices.mq_pedidos.database.model.Pedido;
import com.microsservices.mq_pedidos.database.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private PedidoRepository pedidoRepository;

    public Pedido salvar(Pedido pedido) {
        if(pedido.getItens() != null){
            for(ItemPedido itemPedido : pedido.getItens()){
                itemPedido.setPedido(pedido);
            }
        }
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

}
