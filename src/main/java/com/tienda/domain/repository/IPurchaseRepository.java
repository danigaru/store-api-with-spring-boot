package com.tienda.domain.repository;

import com.tienda.domain.dto.Purchase;

import java.util.List;
import java.util.Optional;

public interface IPurchaseRepository {

    List<Purchase> getAll();

    Optional<List<Purchase>> getByClient(String clientId);

    Purchase save(Purchase purchase);

}
