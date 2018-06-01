package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Goods;
import com.example.demo.service.GoodsService;

@RestController
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	   @GetMapping(value = "goodslist")
	    private Map<String, Object> goodslist() {
	        Map<String, Object> modelMap = new HashMap<String, Object>();
	        List<Goods> goodslist = goodsService.findAll();
	        modelMap.put("goodslist", goodslist);
	        return modelMap;
	    }
	   
	   @GetMapping(value = "/findById")
	    private Map<String, Object> findById(Integer id) {
	        Map<String, Object> modelMap = new HashMap<String, Object>();
	       Goods goods = goodsService.findById(id);
	        modelMap.put("goods", goods);
	        return modelMap;
	    }
	   
	   /**
	     * 添加
	     * @param area
	     * @return
	     */
	    @PostMapping(value = "/addgoods")
	    private Map<String, Object> addArea(@RequestBody Goods goods) {
	        Map<String, Object> modelMap = new HashMap<String, Object>();
//	        goods.setId(UUID.randomUUID().toString());
	        Goods goods1 = goodsService.save(goods);
	        Boolean isSuccess=goods1==null?false:true;
	        modelMap.put("success", isSuccess);
	        return modelMap;
	    }
	    
	    
	    /**
	     * 
	     * @param area
	     * @return
	     */
	    @PostMapping(value = "/updategoods")
	    private Map<String, Object> updategoods(@RequestBody Goods goods) {
	        Map<String, Object> modelMap = new HashMap<String, Object>();
//	        goods.setId(UUID.randomUUID().toString());
	        Goods goods1 = goodsService.update(goods);
	        Boolean isSuccess=goods1==null?false:true;
	        modelMap.put("success", isSuccess);
	        return modelMap;
	    }

	    
	    /**
	     * 
	     * @param area
	     * @return
	     */
	    @GetMapping(value = "/deletegoods")
	    private Map<String, Object> deletegoods(Integer id) {
	        Map<String, Object> modelMap = new HashMap<String, Object>();
//	        goods.setId(UUID.randomUUID().toString());
	         goodsService.delete(id);
//	        Boolean isSuccess=goods1==null?false:true;
	        modelMap.put("success", true);
	        return modelMap;
	    }

}
