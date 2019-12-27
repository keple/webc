package com.webc.server.webc_serv.service;

import java.util.List;
import java.util.Map;

import com.webc.server.webc_serv.dao.CenterDao;
import com.webc.server.webc_serv.model.CenterVO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CenterService implements CenterDao {

    @Autowired
    SqlSession session;

    @Override
    public List<CenterVO> selectRegistedCenterAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<CenterVO> selectRegistedCenter(Map<String, Object> paramMap) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CenterVO selectDetailCenter(Map<String, Object> paramMap) {
        // TODO Auto-generated method stub
        return null;
    }
}