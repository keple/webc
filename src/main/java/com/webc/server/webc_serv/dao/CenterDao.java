package com.webc.server.webc_serv.dao;

import java.util.List;
import java.util.Map;

import com.webc.server.webc_serv.model.CenterVO;

public interface CenterDao {
    public List<CenterVO> selectRegistedCenterAll();
    public List<CenterVO> selectRegistedCenter(Map<String,Object> paramMap);
    public CenterVO selectDetailCenter(Map<String,Object> paramMap);


}