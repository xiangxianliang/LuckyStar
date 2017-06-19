package com.gll.ls.web.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gll.ls.core.pojo.utils.tree.vo.Tree;
import com.gll.ls.core.pojo.utils.user.vo.ActiveUserBack;
import com.gll.ls.core.service.user.ext.UserBackUserService;
import com.gll.ls.core.utils.session.SessionProvider;

/**
 * 用户个人中心
 * 
 * 登出
 * 
 * @author xl
 *
 */
@Controller
@RequestMapping(value = "/user/personal")
public class PersonalController {

	public static final String L_PATH = "/user/personal";

	// 注入
	@Autowired
	private SessionProvider sessionProvider;
	@Autowired
	private UserBackUserService userBackUserService;

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	// ============= get * set ================================================================================

	/**
	 * 获取用户 菜单 树形结构
	 * 
	 * @param activeUserBack
	 * @return
	 */
	@RequestMapping(value = "/usermenuTree.do")
	public @ResponseBody List<Tree> usermenuTree(ActiveUserBack activeUserBack) {
		List<Tree> menus = activeUserBack.getTreeList();
		return menus;
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
