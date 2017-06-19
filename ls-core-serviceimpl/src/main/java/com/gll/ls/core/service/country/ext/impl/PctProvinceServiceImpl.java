package com.gll.ls.core.service.country.ext.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.country.custom.PctProvinceMapperCustom;
import com.gll.ls.core.dao.country.mapper.PctProvinceMapper;
import com.gll.ls.core.pojo.country.vo.PctProvinceCustom;
import com.gll.ls.core.pojo.country.vo.PctProvinceQueryVo;
import com.gll.ls.core.service.country.base.impl.PctProvinceServiceBaseImpl;
import com.gll.ls.core.service.country.ext.PctProvinceService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

@Service
@Transactional
public class PctProvinceServiceImpl extends PctProvinceServiceBaseImpl implements PctProvinceService {

	@Resource
	private PctProvinceMapper pctProvinceMapper;
	@Resource
	private PctProvinceMapperCustom pctProvinceMapperCustom;

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<PctProvinceCustom> getProvinceListDataGridByQueryVo(PctProvinceQueryVo pctProvinceQueryVo, int rows, int page) {
		// TODO 设置排序

		PctProvinceCustom t = pctProvinceQueryVo.getPctProvinceCustom();
		pctProvinceQueryVo.setPageSize(rows);// 每页显示个数
		pctProvinceQueryVo.setPageNo(page);// 当前页码

		int count = pctProvinceMapperCustom.getPctProvinceCustomCount(pctProvinceQueryVo);
		List<PctProvinceCustom> list = pctProvinceMapperCustom.getPctProvinceCustomListWithPage(pctProvinceQueryVo);

		DataGridResultInfo<PctProvinceCustom> resultInfo = new DataGridResultInfo<PctProvinceCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集
		return resultInfo;
	}

	/**
	 * 添加
	 */
	public Integer addProvinceByQueryVo(PctProvinceQueryVo pctProvinceQueryVo) {
		// TODO 自定义

		return pctProvinceMapperCustom.addPctProvinceCustomByQueryVo(pctProvinceQueryVo);
	}

	/**
	 * 根据id查询
	 */
	public PctProvinceCustom getProvinceByKey(String provinceCode) {
		// TODO 自定义

		return pctProvinceMapperCustom.getPctProvinceCustomByKey(provinceCode);
	}

	/**
	 * 根据id更新
	 */
	public Integer updateProvinceByKey(PctProvinceQueryVo pctProvinceQueryVo) {
		// TODO 自定义 快照

		return pctProvinceMapperCustom.updatePctProvinceCustomByKeySnapshots(pctProvinceQueryVo);
	}

	/**
	 * 根据id删除
	 */
	public Integer deleteProvinceByKey(String provinceCode) {
		// TODO 自定义

		return pctProvinceMapperCustom.deletePctProvinceCustomByKey(provinceCode);
	}

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteProvinceByKeyList(List<String> provinceCodeList) {
		// TODO 自定义

		return pctProvinceMapperCustom.deletePctProvinceCustomByKeyList(provinceCodeList);
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkProvince(String provinceCode, PctProvinceQueryVo pctProvinceQueryVo) {
		// TODO 自定义 快照

		List<PctProvinceCustom> list = pctProvinceMapperCustom.getPctProvinceCustomListByQueryVo(pctProvinceQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == provinceCode) {
				// 存在相同的模块
				return false;
			} else {
				String tid = list.get(0).getProvinceCode();
				if (tid.equals(provinceCode)) {
					// id 相同， 并且size() 是1 return 可以使用
					return true;
				} else {
					// 存在相同的模块
					return false;
				}
			}
		}
		// 其他情况
		return false;
	}

}
