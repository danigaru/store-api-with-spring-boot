package com.tienda.persistent;

import com.tienda.domain.dto.Purchase;
import com.tienda.domain.repository.IPurchaseRepository;
import com.tienda.persistent.crud.IPurchaseCrudRepository;
import com.tienda.persistent.entity.Compra;
import com.tienda.persistent.mapper.PurchseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PurchaseRepository implements IPurchaseRepository {

    @Autowired
    private IPurchaseCrudRepository iPurchaseCrudRepository;

    @Autowired
    private PurchseMapper mapper;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases( (List<Compra>)  iPurchaseCrudRepository.findAll()  );
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return iPurchaseCrudRepository.findByIdCliente(clientId).map( compras -> mapper.toPurchases(compras));
    }

    @Override
    public Purchase save(Purchase purchase) {

        Compra compra = mapper.toCompra(purchase);

        compra.getComprasProductos().forEach( comprasProducto -> comprasProducto.setCompra(compra));

        return mapper.toPurchase(iPurchaseCrudRepository.save(compra));
    }
}
