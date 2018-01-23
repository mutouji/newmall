package com.taotao.content.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.content.service.ContentCategoryService;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import com.taotao.pojo.TbContentCategoryExample.Criteria;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private TbContentCategoryMapper contentCategoryMapper;

	@Override
	public List<EasyUITreeNode> getContentCatList(long parentId) {
		// 根据parentId查询子节点列表
		TbContentCategoryExample example = new TbContentCategoryExample();
		// 设置查询条件
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		// 执行查询
		List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
		// 返回结果为List
		List<EasyUITreeNode> resultList = new ArrayList<EasyUITreeNode>();
		for (TbContentCategory tbContentCategory : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(tbContentCategory.getId());
			node.setText(tbContentCategory.getName());
			node.setState(tbContentCategory.getIsParent() ? "closed" : "open");
			// 添加到列表
			resultList.add(node);
		}
		return resultList;
	}

	@Override
	public TaotaoResult insertContentCat(long parentId, String name) {
		// 创建一个内容分类对象
		TbContentCategory contentCategory = new TbContentCategory();
		contentCategory.setName(name);
		contentCategory.setParentId(parentId);
		// 新添加的节点都是叶子节点
		contentCategory.setIsParent(false);
		// 排序方法默认设置为1
		contentCategory.setSortOrder(1);
		// 分类状态：1(正常)，2(删除)
		contentCategory.setStatus(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());
		// 插入节点
		contentCategoryMapper.insert(contentCategory);
		// 判断父节点是否为叶子节点，为何要判断？
		TbContentCategory parentNode = contentCategoryMapper.selectByPrimaryKey(parentId);
		if (!parentNode.getIsParent()) {
			parentNode.setIsParent(true);
			// 更新父节点
			contentCategoryMapper.updateByPrimaryKey(parentNode);
		}
		return TaotaoResult.ok(contentCategory); // contentCategory对象里面是包含id属性的
	}

//	@Override
//	public TaotaoResult updateContentCategory(Long id, String name) {
//		// 通过id查询要修改的对象
//		TbContentCategory contentCategory = contentCategoryMapper.selectByPrimaryKey(id);
//		// 进行设置name属性
//		contentCategory.setName(name);
//		// 更新数据库
//		contentCategoryMapper.updateByPrimaryKey(contentCategory);
//		return TaotaoResult.ok();
//	}
//
//	@Override
//	public TaotaoResult deleteContentCategory(Long id) {
//
//		TbContentCategory contentCategory = contentCategoryMapper.selectByPrimaryKey(id);
//		// 判断当前有没有子类目录
//		int num = contentCategoryMapper.getChildrenNum(contentCategory);
//		if (num != 0)
//			throw new RuntimeException("父类目录下有子目录文件，不能删除");
//
//		int deleteByPrimaryKey = contentCategoryMapper.deleteByPrimaryKey(id);
//		if (deleteByPrimaryKey != 1)
//			throw new RuntimeException("删除失败");
//
//		return TaotaoResult.ok();
//	}
}
