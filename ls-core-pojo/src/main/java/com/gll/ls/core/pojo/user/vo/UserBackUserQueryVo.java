package com.gll.ls.core.pojo.user.vo;

import java.util.Date;
import java.util.List;

import com.gll.ls.core.pojo.BaseQuery;

public class UserBackUserQueryVo extends BaseQuery {
	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	// 属性 扩展类
	private UserBackUserCustom userBackUserCustom;

	// where 条件
	private boolean usernameLike;
	private boolean passwordLike;
	private boolean emailLike;
	private boolean phoneLike;
	private boolean imgUrlLike;
	private boolean saltLike;
	private boolean realNameLike;
	private boolean genderLike;
	private boolean idCardLike;
	private boolean degreeLike;
	private boolean schoolLike;
	private boolean registerIpLike;
	private boolean lastLoginIpLike;
	private Integer userIdStart;
	private Integer userIdEnd;
	private Date registerTimeStart;
	private Date registerTimeEnd;
	private Date lastLoginTimeStart;
	private Date lastLoginTimeEnd;
	private Integer loginCountStart;
	private Integer loginCountEnd;
	private Integer isLockedStart;
	private Integer isLockedEnd;

	// 根据 主键 批量查找 字段
	private List<Integer> userIdList;

	// update快照更新 字段
	private boolean updateUsername;
	private boolean updatePassword;
	private boolean updateEmail;
	private boolean updatePhone;
	private boolean updateImgUrl;
	private boolean updateSalt;
	private boolean updateRealName;
	private boolean updateGender;
	private boolean updateIdCard;
	private boolean updateDegree;
	private boolean updateSchool;
	private boolean updateRegisterTime;
	private boolean updateLastLoginTime;
	private boolean updateRegisterIp;
	private boolean updateLastLoginIp;
	private boolean updateLoginCount;
	private boolean updateIsAdmin;
	private boolean updateIsLocked;
	private boolean updateIsDisplay;
	private boolean updateIsEnable;
	private boolean updateIsActivation;
	private boolean updateIsDel;

	/**
	 * ============================= select ======================================
	 */
	/**
	 * 设置查询字段：UserId
	 */
	public UserBackUserQueryVo selectUserId() {
		selectFields.add("user_id");
		return this;
	}

	/**
	 * 设置查询字段：Username
	 */
	public UserBackUserQueryVo selectUsername() {
		selectFields.add("username");
		return this;
	}

	/**
	 * 设置查询字段：Password
	 */
	public UserBackUserQueryVo selectPassword() {
		selectFields.add("password");
		return this;
	}

	/**
	 * 设置查询字段：Email
	 */
	public UserBackUserQueryVo selectEmail() {
		selectFields.add("email");
		return this;
	}

	/**
	 * 设置查询字段：Phone
	 */
	public UserBackUserQueryVo selectPhone() {
		selectFields.add("phone");
		return this;
	}

	/**
	 * 设置查询字段：ImgUrl
	 */
	public UserBackUserQueryVo selectImgUrl() {
		selectFields.add("img_url");
		return this;
	}

	/**
	 * 设置查询字段：Salt
	 */
	public UserBackUserQueryVo selectSalt() {
		selectFields.add("salt");
		return this;
	}

	/**
	 * 设置查询字段：RealName
	 */
	public UserBackUserQueryVo selectRealName() {
		selectFields.add("real_name");
		return this;
	}

	/**
	 * 设置查询字段：Gender
	 */
	public UserBackUserQueryVo selectGender() {
		selectFields.add("gender");
		return this;
	}

	/**
	 * 设置查询字段：IdCard
	 */
	public UserBackUserQueryVo selectIdCard() {
		selectFields.add("id_card");
		return this;
	}

	/**
	 * 设置查询字段：Degree
	 */
	public UserBackUserQueryVo selectDegree() {
		selectFields.add("degree");
		return this;
	}

	/**
	 * 设置查询字段：School
	 */
	public UserBackUserQueryVo selectSchool() {
		selectFields.add("school");
		return this;
	}

	/**
	 * 设置查询字段：RegisterTime
	 */
	public UserBackUserQueryVo selectRegisterTime() {
		selectFields.add("register_time");
		return this;
	}

	/**
	 * 设置查询字段：LastLoginTime
	 */
	public UserBackUserQueryVo selectLastLoginTime() {
		selectFields.add("last_login_time");
		return this;
	}

	/**
	 * 设置查询字段：RegisterIp
	 */
	public UserBackUserQueryVo selectRegisterIp() {
		selectFields.add("register_ip");
		return this;
	}

	/**
	 * 设置查询字段：LastLoginIp
	 */
	public UserBackUserQueryVo selectLastLoginIp() {
		selectFields.add("last_login_ip");
		return this;
	}

	/**
	 * 设置查询字段：LoginCount
	 */
	public UserBackUserQueryVo selectLoginCount() {
		selectFields.add("login_count");
		return this;
	}

	/**
	 * 设置查询字段：IsAdmin
	 */
	public UserBackUserQueryVo selectIsAdmin() {
		selectFields.add("is_admin");
		return this;
	}

	/**
	 * 设置查询字段：IsLocked
	 */
	public UserBackUserQueryVo selectIsLocked() {
		selectFields.add("is_locked");
		return this;
	}

	/**
	 * 设置查询字段：IsDisplay
	 */
	public UserBackUserQueryVo selectIsDisplay() {
		selectFields.add("is_display");
		return this;
	}

	/**
	 * 设置查询字段：IsEnable
	 */
	public UserBackUserQueryVo selectIsEnable() {
		selectFields.add("is_enable");
		return this;
	}

	/**
	 * 设置查询字段：IsActivation
	 */
	public UserBackUserQueryVo selectIsActivation() {
		selectFields.add("is_activation");
		return this;
	}

	/**
	 * 设置查询字段：IsDel
	 */
	public UserBackUserQueryVo selectIsDel() {
		selectFields.add("is_del");
		return this;
	}

	/**
	 * ==============================批量查询时的Order条件顺序设置==========================
	 * /*
	 * /**
	 * 设置排序按属性：UserId
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyUserId(boolean isAsc) {
		orderFields.add(new OrderField("user_id", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Username
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyUsername(boolean isAsc) {
		orderFields.add(new OrderField("username", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Password
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyPassword(boolean isAsc) {
		orderFields.add(new OrderField("password", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Email
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyEmail(boolean isAsc) {
		orderFields.add(new OrderField("email", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Phone
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyPhone(boolean isAsc) {
		orderFields.add(new OrderField("phone", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：ImgUrl
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyImgUrl(boolean isAsc) {
		orderFields.add(new OrderField("img_url", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Salt
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbySalt(boolean isAsc) {
		orderFields.add(new OrderField("salt", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：RealName
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyRealName(boolean isAsc) {
		orderFields.add(new OrderField("real_name", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Gender
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyGender(boolean isAsc) {
		orderFields.add(new OrderField("gender", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IdCard
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyIdCard(boolean isAsc) {
		orderFields.add(new OrderField("id_card", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：Degree
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyDegree(boolean isAsc) {
		orderFields.add(new OrderField("degree", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：School
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbySchool(boolean isAsc) {
		orderFields.add(new OrderField("school", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：RegisterTime
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyRegisterTime(boolean isAsc) {
		orderFields.add(new OrderField("register_time", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：LastLoginTime
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyLastLoginTime(boolean isAsc) {
		orderFields.add(new OrderField("last_login_time", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：RegisterIp
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyRegisterIp(boolean isAsc) {
		orderFields.add(new OrderField("register_ip", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：LastLoginIp
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyLastLoginIp(boolean isAsc) {
		orderFields.add(new OrderField("last_login_ip", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：LoginCount
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyLoginCount(boolean isAsc) {
		orderFields.add(new OrderField("login_count", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsAdmin
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyIsAdmin(boolean isAsc) {
		orderFields.add(new OrderField("is_admin", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsLocked
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyIsLocked(boolean isAsc) {
		orderFields.add(new OrderField("is_locked", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDisplay
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyIsDisplay(boolean isAsc) {
		orderFields.add(new OrderField("is_display", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsEnable
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyIsEnable(boolean isAsc) {
		orderFields.add(new OrderField("is_enable", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsActivation
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyIsActivation(boolean isAsc) {
		orderFields.add(new OrderField("is_activation", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * 设置排序按属性：IsDel
	 * 
	 * @param isAsc
	 *            是(true):升序，否(false):降序
	 */
	public UserBackUserQueryVo orderbyIsDel(boolean isAsc) {
		orderFields.add(new OrderField("is_del", isAsc ? "ASC" : "DESC"));
		return this;
	}

	/**
	 * ========================== get * set =========================================
	 */

	/**
	 * @return userBackUserCustom
	 */
	public UserBackUserCustom getUserBackUserCustom() {
		return userBackUserCustom;
	}

	/**
	 * @param userBackUserCustom
	 *            要设置的 userBackUserCustom
	 */
	public void setUserBackUserCustom(UserBackUserCustom userBackUserCustom) {
		this.userBackUserCustom = userBackUserCustom;
	}

	/**
	 * @return usernameLike
	 */
	public Boolean isUsernameLike() {
		return usernameLike;
	}

	/**
	 * @param usernameLike
	 *            要设置的usernameLike
	 */
	public void setUsernameLike(boolean usernameLike) {
		this.usernameLike = usernameLike;
	}

	/**
	 * @return passwordLike
	 */
	public Boolean isPasswordLike() {
		return passwordLike;
	}

	/**
	 * @param passwordLike
	 *            要设置的passwordLike
	 */
	public void setPasswordLike(boolean passwordLike) {
		this.passwordLike = passwordLike;
	}

	/**
	 * @return emailLike
	 */
	public Boolean isEmailLike() {
		return emailLike;
	}

	/**
	 * @param emailLike
	 *            要设置的emailLike
	 */
	public void setEmailLike(boolean emailLike) {
		this.emailLike = emailLike;
	}

	/**
	 * @return phoneLike
	 */
	public Boolean isPhoneLike() {
		return phoneLike;
	}

	/**
	 * @param phoneLike
	 *            要设置的phoneLike
	 */
	public void setPhoneLike(boolean phoneLike) {
		this.phoneLike = phoneLike;
	}

	/**
	 * @return imgUrlLike
	 */
	public Boolean isImgUrlLike() {
		return imgUrlLike;
	}

	/**
	 * @param imgUrlLike
	 *            要设置的imgUrlLike
	 */
	public void setImgUrlLike(boolean imgUrlLike) {
		this.imgUrlLike = imgUrlLike;
	}

	/**
	 * @return saltLike
	 */
	public Boolean isSaltLike() {
		return saltLike;
	}

	/**
	 * @param saltLike
	 *            要设置的saltLike
	 */
	public void setSaltLike(boolean saltLike) {
		this.saltLike = saltLike;
	}

	/**
	 * @return realNameLike
	 */
	public Boolean isRealNameLike() {
		return realNameLike;
	}

	/**
	 * @param realNameLike
	 *            要设置的realNameLike
	 */
	public void setRealNameLike(boolean realNameLike) {
		this.realNameLike = realNameLike;
	}

	/**
	 * @return genderLike
	 */
	public Boolean isGenderLike() {
		return genderLike;
	}

	/**
	 * @param genderLike
	 *            要设置的genderLike
	 */
	public void setGenderLike(boolean genderLike) {
		this.genderLike = genderLike;
	}

	/**
	 * @return idCardLike
	 */
	public Boolean isIdCardLike() {
		return idCardLike;
	}

	/**
	 * @param idCardLike
	 *            要设置的idCardLike
	 */
	public void setIdCardLike(boolean idCardLike) {
		this.idCardLike = idCardLike;
	}

	/**
	 * @return degreeLike
	 */
	public Boolean isDegreeLike() {
		return degreeLike;
	}

	/**
	 * @param degreeLike
	 *            要设置的degreeLike
	 */
	public void setDegreeLike(boolean degreeLike) {
		this.degreeLike = degreeLike;
	}

	/**
	 * @return schoolLike
	 */
	public Boolean isSchoolLike() {
		return schoolLike;
	}

	/**
	 * @param schoolLike
	 *            要设置的schoolLike
	 */
	public void setSchoolLike(boolean schoolLike) {
		this.schoolLike = schoolLike;
	}

	/**
	 * @return registerIpLike
	 */
	public Boolean isRegisterIpLike() {
		return registerIpLike;
	}

	/**
	 * @param registerIpLike
	 *            要设置的registerIpLike
	 */
	public void setRegisterIpLike(boolean registerIpLike) {
		this.registerIpLike = registerIpLike;
	}

	/**
	 * @return lastLoginIpLike
	 */
	public Boolean isLastLoginIpLike() {
		return lastLoginIpLike;
	}

	/**
	 * @param lastLoginIpLike
	 *            要设置的lastLoginIpLike
	 */
	public void setLastLoginIpLike(boolean lastLoginIpLike) {
		this.lastLoginIpLike = lastLoginIpLike;
	}

	/**
	 * @return userIdStart
	 */
	public Integer getUserIdStart() {
		return userIdStart;
	}

	/**
	 * @param userIdStart
	 *            要设置的userIdStart
	 */
	public void setUserIdStart(Integer userIdStart) {
		this.userIdStart = userIdStart;
	}

	/**
	 * @return userIdEnd
	 */
	public Integer getUserIdEnd() {
		return userIdEnd;
	}

	/**
	 * @param userIdEnd
	 *            要设置的userIdEnd
	 */
	public void setUserIdEnd(Integer userIdEnd) {
		this.userIdEnd = userIdEnd;
	}

	/**
	 * @return registerTimeStart
	 */
	public Date getRegisterTimeStart() {
		return registerTimeStart;
	}

	/**
	 * @param registerTimeStart
	 *            要设置的registerTimeStart
	 */
	public void setRegisterTimeStart(Date registerTimeStart) {
		this.registerTimeStart = registerTimeStart;
	}

	/**
	 * @return registerTimeEnd
	 */
	public Date getRegisterTimeEnd() {
		return registerTimeEnd;
	}

	/**
	 * @param registerTimeEnd
	 *            要设置的registerTimeEnd
	 */
	public void setRegisterTimeEnd(Date registerTimeEnd) {
		this.registerTimeEnd = registerTimeEnd;
	}

	/**
	 * @return lastLoginTimeStart
	 */
	public Date getLastLoginTimeStart() {
		return lastLoginTimeStart;
	}

	/**
	 * @param lastLoginTimeStart
	 *            要设置的lastLoginTimeStart
	 */
	public void setLastLoginTimeStart(Date lastLoginTimeStart) {
		this.lastLoginTimeStart = lastLoginTimeStart;
	}

	/**
	 * @return lastLoginTimeEnd
	 */
	public Date getLastLoginTimeEnd() {
		return lastLoginTimeEnd;
	}

	/**
	 * @param lastLoginTimeEnd
	 *            要设置的lastLoginTimeEnd
	 */
	public void setLastLoginTimeEnd(Date lastLoginTimeEnd) {
		this.lastLoginTimeEnd = lastLoginTimeEnd;
	}

	/**
	 * @return loginCountStart
	 */
	public Integer getLoginCountStart() {
		return loginCountStart;
	}

	/**
	 * @param loginCountStart
	 *            要设置的loginCountStart
	 */
	public void setLoginCountStart(Integer loginCountStart) {
		this.loginCountStart = loginCountStart;
	}

	/**
	 * @return loginCountEnd
	 */
	public Integer getLoginCountEnd() {
		return loginCountEnd;
	}

	/**
	 * @param loginCountEnd
	 *            要设置的loginCountEnd
	 */
	public void setLoginCountEnd(Integer loginCountEnd) {
		this.loginCountEnd = loginCountEnd;
	}

	/**
	 * @return isLockedStart
	 */
	public Integer getIsLockedStart() {
		return isLockedStart;
	}

	/**
	 * @param isLockedStart
	 *            要设置的isLockedStart
	 */
	public void setIsLockedStart(Integer isLockedStart) {
		this.isLockedStart = isLockedStart;
	}

	/**
	 * @return isLockedEnd
	 */
	public Integer getIsLockedEnd() {
		return isLockedEnd;
	}

	/**
	 * @param isLockedEnd
	 *            要设置的isLockedEnd
	 */
	public void setIsLockedEnd(Integer isLockedEnd) {
		this.isLockedEnd = isLockedEnd;
	}

	/**
	 * @return userIdList
	 */
	public List<Integer> getUserIdList() {
		return userIdList;
	}

	/**
	 * @param userIdList
	 *            要设置的userIdList
	 */
	public void setUserIdList(List<Integer> userIdList) {
		this.userIdList = userIdList;
	}

	/**
	 * @return updateUsername
	 */
	public Boolean isUpdateUsername() {
		return updateUsername;
	}

	/**
	 * @param updateUsername
	 *            要设置的updateUsername
	 */
	public void setUpdateUsername(boolean updateUsername) {
		this.updateUsername = updateUsername;
	}

	/**
	 * @return updatePassword
	 */
	public Boolean isUpdatePassword() {
		return updatePassword;
	}

	/**
	 * @param updatePassword
	 *            要设置的updatePassword
	 */
	public void setUpdatePassword(boolean updatePassword) {
		this.updatePassword = updatePassword;
	}

	/**
	 * @return updateEmail
	 */
	public Boolean isUpdateEmail() {
		return updateEmail;
	}

	/**
	 * @param updateEmail
	 *            要设置的updateEmail
	 */
	public void setUpdateEmail(boolean updateEmail) {
		this.updateEmail = updateEmail;
	}

	/**
	 * @return updatePhone
	 */
	public Boolean isUpdatePhone() {
		return updatePhone;
	}

	/**
	 * @param updatePhone
	 *            要设置的updatePhone
	 */
	public void setUpdatePhone(boolean updatePhone) {
		this.updatePhone = updatePhone;
	}

	/**
	 * @return updateImgUrl
	 */
	public Boolean isUpdateImgUrl() {
		return updateImgUrl;
	}

	/**
	 * @param updateImgUrl
	 *            要设置的updateImgUrl
	 */
	public void setUpdateImgUrl(boolean updateImgUrl) {
		this.updateImgUrl = updateImgUrl;
	}

	/**
	 * @return updateSalt
	 */
	public Boolean isUpdateSalt() {
		return updateSalt;
	}

	/**
	 * @param updateSalt
	 *            要设置的updateSalt
	 */
	public void setUpdateSalt(boolean updateSalt) {
		this.updateSalt = updateSalt;
	}

	/**
	 * @return updateRealName
	 */
	public Boolean isUpdateRealName() {
		return updateRealName;
	}

	/**
	 * @param updateRealName
	 *            要设置的updateRealName
	 */
	public void setUpdateRealName(boolean updateRealName) {
		this.updateRealName = updateRealName;
	}

	/**
	 * @return updateGender
	 */
	public Boolean isUpdateGender() {
		return updateGender;
	}

	/**
	 * @param updateGender
	 *            要设置的updateGender
	 */
	public void setUpdateGender(boolean updateGender) {
		this.updateGender = updateGender;
	}

	/**
	 * @return updateIdCard
	 */
	public Boolean isUpdateIdCard() {
		return updateIdCard;
	}

	/**
	 * @param updateIdCard
	 *            要设置的updateIdCard
	 */
	public void setUpdateIdCard(boolean updateIdCard) {
		this.updateIdCard = updateIdCard;
	}

	/**
	 * @return updateDegree
	 */
	public Boolean isUpdateDegree() {
		return updateDegree;
	}

	/**
	 * @param updateDegree
	 *            要设置的updateDegree
	 */
	public void setUpdateDegree(boolean updateDegree) {
		this.updateDegree = updateDegree;
	}

	/**
	 * @return updateSchool
	 */
	public Boolean isUpdateSchool() {
		return updateSchool;
	}

	/**
	 * @param updateSchool
	 *            要设置的updateSchool
	 */
	public void setUpdateSchool(boolean updateSchool) {
		this.updateSchool = updateSchool;
	}

	/**
	 * @return updateRegisterTime
	 */
	public Boolean isUpdateRegisterTime() {
		return updateRegisterTime;
	}

	/**
	 * @param updateRegisterTime
	 *            要设置的updateRegisterTime
	 */
	public void setUpdateRegisterTime(boolean updateRegisterTime) {
		this.updateRegisterTime = updateRegisterTime;
	}

	/**
	 * @return updateLastLoginTime
	 */
	public Boolean isUpdateLastLoginTime() {
		return updateLastLoginTime;
	}

	/**
	 * @param updateLastLoginTime
	 *            要设置的updateLastLoginTime
	 */
	public void setUpdateLastLoginTime(boolean updateLastLoginTime) {
		this.updateLastLoginTime = updateLastLoginTime;
	}

	/**
	 * @return updateRegisterIp
	 */
	public Boolean isUpdateRegisterIp() {
		return updateRegisterIp;
	}

	/**
	 * @param updateRegisterIp
	 *            要设置的updateRegisterIp
	 */
	public void setUpdateRegisterIp(boolean updateRegisterIp) {
		this.updateRegisterIp = updateRegisterIp;
	}

	/**
	 * @return updateLastLoginIp
	 */
	public Boolean isUpdateLastLoginIp() {
		return updateLastLoginIp;
	}

	/**
	 * @param updateLastLoginIp
	 *            要设置的updateLastLoginIp
	 */
	public void setUpdateLastLoginIp(boolean updateLastLoginIp) {
		this.updateLastLoginIp = updateLastLoginIp;
	}

	/**
	 * @return updateLoginCount
	 */
	public Boolean isUpdateLoginCount() {
		return updateLoginCount;
	}

	/**
	 * @param updateLoginCount
	 *            要设置的updateLoginCount
	 */
	public void setUpdateLoginCount(boolean updateLoginCount) {
		this.updateLoginCount = updateLoginCount;
	}

	/**
	 * @return updateIsAdmin
	 */
	public Boolean isUpdateIsAdmin() {
		return updateIsAdmin;
	}

	/**
	 * @param updateIsAdmin
	 *            要设置的updateIsAdmin
	 */
	public void setUpdateIsAdmin(boolean updateIsAdmin) {
		this.updateIsAdmin = updateIsAdmin;
	}

	/**
	 * @return updateIsLocked
	 */
	public Boolean isUpdateIsLocked() {
		return updateIsLocked;
	}

	/**
	 * @param updateIsLocked
	 *            要设置的updateIsLocked
	 */
	public void setUpdateIsLocked(boolean updateIsLocked) {
		this.updateIsLocked = updateIsLocked;
	}

	/**
	 * @return updateIsDisplay
	 */
	public Boolean isUpdateIsDisplay() {
		return updateIsDisplay;
	}

	/**
	 * @param updateIsDisplay
	 *            要设置的updateIsDisplay
	 */
	public void setUpdateIsDisplay(boolean updateIsDisplay) {
		this.updateIsDisplay = updateIsDisplay;
	}

	/**
	 * @return updateIsEnable
	 */
	public Boolean isUpdateIsEnable() {
		return updateIsEnable;
	}

	/**
	 * @param updateIsEnable
	 *            要设置的updateIsEnable
	 */
	public void setUpdateIsEnable(boolean updateIsEnable) {
		this.updateIsEnable = updateIsEnable;
	}

	/**
	 * @return updateIsActivation
	 */
	public Boolean isUpdateIsActivation() {
		return updateIsActivation;
	}

	/**
	 * @param updateIsActivation
	 *            要设置的updateIsActivation
	 */
	public void setUpdateIsActivation(boolean updateIsActivation) {
		this.updateIsActivation = updateIsActivation;
	}

	/**
	 * @return updateIsDel
	 */
	public Boolean isUpdateIsDel() {
		return updateIsDel;
	}

	/**
	 * @param updateIsDel
	 *            要设置的updateIsDel
	 */
	public void setUpdateIsDel(boolean updateIsDel) {
		this.updateIsDel = updateIsDel;
	}

}
