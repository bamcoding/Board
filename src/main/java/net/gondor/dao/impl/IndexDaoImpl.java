package net.gondor.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import net.gondor.dao.IndexDao;

public class IndexDaoImpl extends SqlSessionDaoSupport implements IndexDao{

	@Override
	public String getNowDate() {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("index.getNowDate");
	}

}
