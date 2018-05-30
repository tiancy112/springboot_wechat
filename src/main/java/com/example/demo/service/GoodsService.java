package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Goods;

public interface GoodsService{
	
	List<Goods> findAll();
	
	Goods save(Goods goods);
	
	Goods findById(String id);
	
	Goods update(Goods goods);
	
	void delete(String id);

}
