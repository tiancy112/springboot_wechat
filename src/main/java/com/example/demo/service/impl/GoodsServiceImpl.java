package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Goods;
import com.example.demo.repository.GoodsRepository;
import com.example.demo.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsRepository goodsRepository;

	@Override
	public List<Goods> findAll() {
		// TODO Auto-generated method stub
		return goodsRepository.findAll();
	}

	@Override
	public Goods save(Goods goods) {
		// TODO Auto-generated method stub
		return goodsRepository.save(goods);
	}

	@Override
	public Goods findById(Integer id) {
		// TODO Auto-generated method stub
		return goodsRepository.findOne(id);
	}

	@Override
	public Goods update(Goods goods) {
		// TODO Auto-generated method stub
		return goodsRepository.save(goods);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		goodsRepository.delete(id);;;
	}


}
