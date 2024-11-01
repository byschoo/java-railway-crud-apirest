package com.byschoo.springmavenpostgres.springmavenpostgres.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.byschoo.springmavenpostgres.springmavenpostgres.Entities.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long> {

}
