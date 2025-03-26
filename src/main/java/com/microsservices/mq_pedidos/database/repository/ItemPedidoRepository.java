package com.microsservices.mq_pedidos.database.repository;

import com.microsservices.mq_pedidos.database.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
