package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.Goods;

public interface GoodsRepository extends JpaRepository<Goods, Integer>{

}
