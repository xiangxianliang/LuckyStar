package com.gll.ls.core.pojo.user.po;

import java.io.Serializable;
import java.util.Date;

public class UserBackUser implements Serializable {
	/**
	 * 用户Id
	 */
	private Integer userId;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 手机
	 */
	private String phone;

	/**
	 * 图片(头像)
	 */
	private String imgUrl;

	/**
	 * 盐
	 */
	private String salt;

	/**
	 * 真实名字
	 */
	private String realName;

	/**
	 * 性别
	 */
	private String gender;

	/**
	 * 身份证号
	 */
	private String idCard;

	/**
	 * 学历
	 */
	private String degree;

	/**
	 * 毕业学校
	 */
	private String school;

	/**
	 * 注册时间
	 */
	private Date registerTime;

	/**
	 * 最近一次登录时间
	 */
	private Date lastLoginTime;

	/**
	 * 注册时使用的IP
	 */
	private String registerIp;

	/**
	 * 最近一次登录时使用的IP
	 */
	private String lastLoginIp;

	/**
	 * 登录次数
	 */
	private Integer loginCount;

	/**
	 * 是否为超级用户：0：否；1：是
	 */
	private Integer isAdmin;

	/**
	 * 账号是否锁定
	 */
	private Integer isLocked;

	/**
	 * 是否可见：1：可见；0：不可见
	 */
	private Integer isDisplay;

	/**
	 * 是否启用：1：启用；0：未启用
	 */
	private Integer isEnable;

	/**
	 * 是否激活：1：激活；0：未激活
	 */
	private Integer isActivation;

	/**
	 * 是否删除：1：未删除；0：删除
	 */
	private Integer isDel;

	/**
	 * user_back_user
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户Id
	 * 
	 * @return user_id 用户Id
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 用户Id
	 * 
	 * @param userId
	 *            用户Id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 用户名
	 * 
	 * @return username 用户名
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 用户名
	 * 
	 * @param username
	 *            用户名
	 */
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	/**
	 * 密码
	 * 
	 * @return password 密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 密码
	 * 
	 * @param password
	 *            密码
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * 邮箱
	 * 
	 * @return email 邮箱
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 邮箱
	 * 
	 * @param email
	 *            邮箱
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * 手机
	 * 
	 * @return phone 手机
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 手机
	 * 
	 * @param phone
	 *            手机
	 */
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * 图片(头像)
	 * 
	 * @return img_url 图片(头像)
	 */
	public String getImgUrl() {
		return imgUrl;
	}

	/**
	 * 图片(头像)
	 * 
	 * @param imgUrl
	 *            图片(头像)
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl == null ? null : imgUrl.trim();
	}

	/**
	 * 盐
	 * 
	 * @return salt 盐
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * 盐
	 * 
	 * @param salt
	 *            盐
	 */
	public void setSalt(String salt) {
		this.salt = salt == null ? null : salt.trim();
	}

	/**
	 * 真实名字
	 * 
	 * @return real_name 真实名字
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * 真实名字
	 * 
	 * @param realName
	 *            真实名字
	 */
	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	/**
	 * 性别
	 * 
	 * @return gender 性别
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * 性别
	 * 
	 * @param gender
	 *            性别
	 */
	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
	}

	/**
	 * 身份证号
	 * 
	 * @return id_card 身份证号
	 */
	public String getIdCard() {
		return idCard;
	}

	/**
	 * 身份证号
	 * 
	 * @param idCard
	 *            身份证号
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard == null ? null : idCard.trim();
	}

	/**
	 * 学历
	 * 
	 * @return degree 学历
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * 学历
	 * 
	 * @param degree
	 *            学历
	 */
	public void setDegree(String degree) {
		this.degree = degree == null ? null : degree.trim();
	}

	/**
	 * 毕业学校
	 * 
	 * @return school 毕业学校
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * 毕业学校
	 * 
	 * @param school
	 *            毕业学校
	 */
	public void setSchool(String school) {
		this.school = school == null ? null : school.trim();
	}

	/**
	 * 注册时间
	 * 
	 * @return register_time 注册时间
	 */
	public Date getRegisterTime() {
		return registerTime;
	}

	/**
	 * 注册时间
	 * 
	 * @param registerTime
	 *            注册时间
	 */
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	/**
	 * 最近一次登录时间
	 * 
	 * @return last_login_time 最近一次登录时间
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * 最近一次登录时间
	 * 
	 * @param lastLoginTime
	 *            最近一次登录时间
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * 注册时使用的IP
	 * 
	 * @return register_ip 注册时使用的IP
	 */
	public String getRegisterIp() {
		return registerIp;
	}

	/**
	 * 注册时使用的IP
	 * 
	 * @param registerIp
	 *            注册时使用的IP
	 */
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp == null ? null : registerIp.trim();
	}

	/**
	 * 最近一次登录时使用的IP
	 * 
	 * @return last_login_ip 最近一次登录时使用的IP
	 */
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	/**
	 * 最近一次登录时使用的IP
	 * 
	 * @param lastLoginIp
	 *            最近一次登录时使用的IP
	 */
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
	}

	/**
	 * 登录次数
	 * 
	 * @return login_count 登录次数
	 */
	public Integer getLoginCount() {
		return loginCount;
	}

	/**
	 * 登录次数
	 * 
	 * @param loginCount
	 *            登录次数
	 */
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	/**
	 * 是否为超级用户：0：否；1：是
	 * 
	 * @return is_admin 是否为超级用户：0：否；1：是
	 */
	public Integer getIsAdmin() {
		return isAdmin;
	}

	/**
	 * 是否为超级用户：0：否；1：是
	 * 
	 * @param isAdmin
	 *            是否为超级用户：0：否；1：是
	 */
	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * 账号是否锁定
	 * 
	 * @return is_locked 账号是否锁定
	 */
	public Integer getIsLocked() {
		return isLocked;
	}

	/**
	 * 账号是否锁定
	 * 
	 * @param isLocked
	 *            账号是否锁定
	 */
	public void setIsLocked(Integer isLocked) {
		this.isLocked = isLocked;
	}

	/**
	 * 是否可见：1：可见；0：不可见
	 * 
	 * @return is_display 是否可见：1：可见；0：不可见
	 */
	public Integer getIsDisplay() {
		return isDisplay;
	}

	/**
	 * 是否可见：1：可见；0：不可见
	 * 
	 * @param isDisplay
	 *            是否可见：1：可见；0：不可见
	 */
	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}

	/**
	 * 是否启用：1：启用；0：未启用
	 * 
	 * @return is_enable 是否启用：1：启用；0：未启用
	 */
	public Integer getIsEnable() {
		return isEnable;
	}

	/**
	 * 是否启用：1：启用；0：未启用
	 * 
	 * @param isEnable
	 *            是否启用：1：启用；0：未启用
	 */
	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	/**
	 * 是否激活：1：激活；0：未激活
	 * 
	 * @return is_activation 是否激活：1：激活；0：未激活
	 */
	public Integer getIsActivation() {
		return isActivation;
	}

	/**
	 * 是否激活：1：激活；0：未激活
	 * 
	 * @param isActivation
	 *            是否激活：1：激活；0：未激活
	 */
	public void setIsActivation(Integer isActivation) {
		this.isActivation = isActivation;
	}

	/**
	 * 是否删除：1：未删除；0：删除
	 * 
	 * @return is_del 是否删除：1：未删除；0：删除
	 */
	public Integer getIsDel() {
		return isDel;
	}

	/**
	 * 是否删除：1：未删除；0：删除
	 * 
	 * @param isDel
	 *            是否删除：1：未删除；0：删除
	 */
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
}