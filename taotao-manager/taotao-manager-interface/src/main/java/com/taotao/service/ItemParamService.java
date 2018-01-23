package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItemParam;

public interface ItemParamService {
	TaotaoResult getItemParamByCid(long cid);
	EasyUIDataGridResult getItemParamList(int page, int rows);
	TaotaoResult insertItemParam(TbItemParam itemParam);
}
