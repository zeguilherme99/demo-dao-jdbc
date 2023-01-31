package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller Seller);
    void update(Seller Seller);
    void deleteById(Integer Id);
    Seller findById(Integer Id);
    List<Seller> findAll();
}
