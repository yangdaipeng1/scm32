package cn.itcast.scm.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.scm.dao.SupplierMapper;
import cn.itcast.scm.entity.Supplier;
import cn.itcast.scm.service.SupplierService;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierMapper supplierMapper;

	public int intsertSupplier(Supplier supplier) throws Exception {
		// TODO Auto-generated method stub
		return supplierMapper.insertSupplier(supplier);
	}

	

	



}
