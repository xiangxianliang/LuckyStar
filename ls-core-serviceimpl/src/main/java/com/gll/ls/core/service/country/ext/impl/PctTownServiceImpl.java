package com.gll.ls.core.service.country.ext.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gll.ls.core.dao.country.custom.PctTownMapperCustom;
import com.gll.ls.core.dao.country.mapper.PctTownMapper;
import com.gll.ls.core.pojo.country.vo.PctTownCustom;
import com.gll.ls.core.pojo.country.vo.PctTownQueryVo;
import com.gll.ls.core.service.country.base.impl.PctTownServiceBaseImpl;
import com.gll.ls.core.service.country.ext.PctTownService;
import com.gll.ls.utils.web.result.DataGridResultInfo;

@Service
@Transactional
public class PctTownServiceImpl extends PctTownServiceBaseImpl implements PctTownService {

	@Resource
	private PctTownMapper pctTownMapper;
	@Resource
	private PctTownMapperCustom pctTownMapperCustom;

	/**
	 * 分页查询
	 */
	public DataGridResultInfo<PctTownCustom> getTownListDataGridByQueryVo(PctTownQueryVo pctTownQueryVo, int rows, int page) {
		// TODO 设置排序

		PctTownCustom t = pctTownQueryVo.getPctTownCustom();
		pctTownQueryVo.setPageSize(rows);// 每页显示个数
		pctTownQueryVo.setPageNo(page);// 当前页码

		int count = pctTownMapperCustom.getPctTownCustomCount(pctTownQueryVo);
		List<PctTownCustom> list = pctTownMapperCustom.getPctTownCustomListWithPage(pctTownQueryVo);

		DataGridResultInfo<PctTownCustom> resultInfo = new DataGridResultInfo<PctTownCustom>();
		resultInfo.setTotal(count);// 设置总行数
		resultInfo.setRows(list);// 结果集
		return resultInfo;
	}

	/**
	 * 添加
	 */
	public Integer addTownByQueryVo(PctTownQueryVo pctTownQueryVo) {
		// TODO 自定义

		return pctTownMapperCustom.addPctTownCustomByQueryVo(pctTownQueryVo);
	}

	/**
	 * 根据id查询
	 */
	public PctTownCustom getTownByKey(String townCode) {
		// TODO 自定义

		return pctTownMapperCustom.getPctTownCustomByKey(townCode);
	}

	/**
	 * 根据id更新
	 */
	public Integer updateTownByKey(PctTownQueryVo pctTownQueryVo) {
		// TODO 自定义 快照

		return pctTownMapperCustom.updatePctTownCustomByKeySnapshots(pctTownQueryVo);
	}

	/**
	 * 根据id删除
	 */
	public Integer deleteTownByKey(String townCode) {
		// TODO 自定义

		return pctTownMapperCustom.deletePctTownCustomByKey(townCode);
	}

	/**
	 * 根据id 批量删除
	 */
	public Integer deleteTownByKeyList(List<String> townCodeList) {
		// TODO 自定义

		return pctTownMapperCustom.deletePctTownCustomByKeyList(townCodeList);
	}

	/**
	 * Ajax校验 是否可以使用
	 */
	public Boolean checkTown(String townCode, PctTownQueryVo pctTownQueryVo) {
		// TODO 自定义 快照

		List<PctTownCustom> list = pctTownMapperCustom.getPctTownCustomListByQueryVo(pctTownQueryVo);
		if (list.size() == 0) {
			return true;
		} else if (list.size() == 1) {
			if (null == townCode) {
				// 存在相同的模块
				return false;
			} else {
				String tid = list.get(0).getTownCode();
				if (tid.equals(townCode)) {
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
