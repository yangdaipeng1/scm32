package cn.itcast.scm.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.scm.dao.SupplierMapper;
import cn.itcast.scm.entity.Goods;
import cn.itcast.scm.entity.Page;
import cn.itcast.scm.entity.Supplier;
import cn.itcast.scm.service.BaseService;
import cn.itcast.scm.service.GoodsService;
import cn.itcast.scm.service.SupplierService;

@Service("goodsService")
public class GoodsServiceImpl extends BaseServiceImpl<Goods> implements GoodsService{
	
	/*@Autowired
		private SupplierMapper supplierMapper;
	*/
	
	/*
	public int insert(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return supplierMapper.insert(entity);
	}

	public int delete(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public Supplier select(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	public Page<Supplier> selectPage(Page<Supplier> page) {
		// TODO Auto-generated method stub
		page.setList(supplierMapper.selectPageList(page));
		page.setTotalRecord(supplierMapper.selectPageCount(page));
		return page;
	}


	public Page<Supplier> selectPageUseDyc(Page<Supplier> page) {
		// TODO Auto-generated method stub
		page.setList(supplierMapper.selectPageListUseDyc(page));
		page.setTotalRecord(supplierMapper.selectPageCountUseDyc(page));
		return page;
	}


	public int deleteList(String[] pks) throws Exception {
		// TODO Auto-generated method stub
		return supplierMapper.deleteList(pks);
	}

	public int update(Supplier entity) throws Exception {
		// TODO Auto-generated method stub
		return supplierMapper.update(entity);
	}

*/
	
}
