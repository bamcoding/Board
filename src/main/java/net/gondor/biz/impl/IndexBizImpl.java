package net.gondor.biz.impl;

import net.gondor.biz.IndexBiz;
import net.gondor.dao.IndexDao;

public class IndexBizImpl implements IndexBiz{
	IndexDao indexDao;

	public void setIndexDao(IndexDao indexDao) {
		this.indexDao = indexDao;
	}

	@Override
	public String getNowDate() {
		// TODO Auto-generated method stub
		return indexDao.getNowDate();
	}
}
