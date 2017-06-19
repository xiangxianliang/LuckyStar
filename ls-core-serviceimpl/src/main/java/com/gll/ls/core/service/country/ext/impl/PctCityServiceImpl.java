package com.gll.ls.core.service.country.ext.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.country.custom.PctCityMapperCustom;
import com.gll.ls.core.dao.country.mapper.PctCityMapper;
import com.gll.ls.core.pojo.country.vo.PctCityCustom;
import com.gll.ls.core.pojo.country.vo.PctCityQueryVo;
import com.gll.ls.core.service.country.base.impl.PctCityServiceBaseImpl;
import com.gll.ls.core.service.country.ext.PctCityService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

@Service
@Transactional
public class PctCityServiceImpl extends PctCityServiceBaseImpl implements PctCityService {

	@Resource
	private PctCityMapper pctCityMapper;
	@Resource
	private PctCityMapperCustom pctCityMapperCustom;

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<PctCityCustom> getCityListDataGridByQueryVo(PctCityQueryVo pctCityQueryVo, int rows, int page) {
		// TODO 设置排序

		PctCityCustom t = pctCityQueryVo.getPctCityCustom();
		pctCityQueryVo.setPageSize(rows);// 每页显示个数
		pctCityQueryVo.setPageNo(page);// 当前页码

		int count = pctCityMapperCustom.getPctCityCustomCount(pctCityQueryVo);
		List<PctCityCustom> list = pctCityMapperCustom.getPctCityCustomListWithPage(pctCityQueryVo);

		DataGridResultInfo<PctCityCustom> resultInfo = new DataGridResultInfo<PctCityCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集
		return resultInfo;
	}

	/**
	 * 添加
	 */
	public Integer addCityByQueryVo(PctCityQueryVo pctCityQueryVo) {
		// TODO 自定义

		return pctCityMapperCustom.addPctCityCustomByQueryVo(pctCityQueryVo);
	}

	/**
	 * 根据id查询
	 */
	public PctCityCustom getCityByKey(String cityCode) {
		// TODO 自定义

		return pctCityMapperCustom.getPctCityCustomByKey(cityCode);
	}

	/**
	 * 根据id更新
	 */
	public Integer updateCityByKey(PctCityQueryVo pctCityQueryVo) {
		// TODO 自定义 快照

		return pctCityMapperCustom.updatePctCityCustomByKeySnapshots(pctCityQueryVo);
	}

	/**
	 * 根据id删除
	 */
	public Integer deleteCityByKey(String cityCode) {
		// TODO 自定义

		return pctCityMapperCustom.deletePctCityCustomByKey(cityCode);
	}

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteCityByKeyList(List<String> cityCodeList) {
		// TODO 自定义

		return pctCityMapperCustom.deletePctCityCustomByKeyList(cityCodeList);
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkCity(String cityCode, PctCityQueryVo pctCityQueryVo) {
		// TODO 自定义 快照

		List<PctCityCustom> list = pctCityMapperCustom.getPctCityCustomListByQueryVo(pctCityQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == cityCode) {
				// 存在相同的模块
				return false;
			} else {
				String tid = list.get(0).getCityCode();
				if (tid.equals(cityCode)) {
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
