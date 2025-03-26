package com.microsservices.mq_pedidos.database.repository;

import com.microsservices.mq_pedidos.database.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
