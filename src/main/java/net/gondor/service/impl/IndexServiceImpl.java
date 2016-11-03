package net.gondor.service.impl;

import net.gondor.biz.IndexBiz;
import net.gondor.service.IndexService;

public class IndexServiceImpl implements IndexService{
	IndexBiz indexBiz;

	public void setIndexBiz(IndexBiz indexBiz) {
		this.indexBiz = indexBiz;
	}

	@Override
	public String getNowDate() {
		// TODO Auto-generated method stub
		return indexBiz.getNowDate();
	}
}
