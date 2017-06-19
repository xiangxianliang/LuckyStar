package com.gll.ls.core.pojo.user.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBackUserExample implements Serializable {
	/**
	 * user_back_user
	 */
	protected String orderByClause;

	/**
	 * user_back_user
	 */
	protected boolean distinct;

	/**
	 * user_back_user
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * user_back_user
	 */
	private static final long serialVersionUID = 1L;

	public UserBackUserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * user_back_user 2017-06-17
	 */
	protected abstract static class GeneratedCriteria implements Serializable {
		/**
		 * user_back_user
		 */
		private static final long serialVersionUID = 1L;

		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andImgUrlIsNull() {
			addCriterion("img_url is null");
			return (Criteria) this;
		}

		public Criteria andImgUrlIsNotNull() {
			addCriterion("img_url is not null");
			return (Criteria) this;
		}

		public Criteria andImgUrlEqualTo(String value) {
			addCriterion("img_url =", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlNotEqualTo(String value) {
			addCriterion("img_url <>", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlGreaterThan(String value) {
			addCriterion("img_url >", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
			addCriterion("img_url >=", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlLessThan(String value) {
			addCriterion("img_url <", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlLessThanOrEqualTo(String value) {
			addCriterion("img_url <=", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlLike(String value) {
			addCriterion("img_url like", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlNotLike(String value) {
			addCriterion("img_url not like", value, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlIn(List<String> values) {
			addCriterion("img_url in", values, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlNotIn(List<String> values) {
			addCriterion("img_url not in", values, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlBetween(String value1, String value2) {
			addCriterion("img_url between", value1, value2, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andImgUrlNotBetween(String value1, String value2) {
			addCriterion("img_url not between", value1, value2, "imgUrl");
			return (Criteria) this;
		}

		public Criteria andSaltIsNull() {
			addCriterion("salt is null");
			return (Criteria) this;
		}

		public Criteria andSaltIsNotNull() {
			addCriterion("salt is not null");
			return (Criteria) this;
		}

		public Criteria andSaltEqualTo(String value) {
			addCriterion("salt =", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotEqualTo(String value) {
			addCriterion("salt <>", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltGreaterThan(String value) {
			addCriterion("salt >", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltGreaterThanOrEqualTo(String value) {
			addCriterion("salt >=", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLessThan(String value) {
			addCriterion("salt <", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLessThanOrEqualTo(String value) {
			addCriterion("salt <=", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltLike(String value) {
			addCriterion("salt like", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotLike(String value) {
			addCriterion("salt not like", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltIn(List<String> values) {
			addCriterion("salt in", values, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotIn(List<String> values) {
			addCriterion("salt not in", values, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltBetween(String value1, String value2) {
			addCriterion("salt between", value1, value2, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotBetween(String value1, String value2) {
			addCriterion("salt not between", value1, value2, "salt");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNull() {
			addCriterion("real_name is null");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNotNull() {
			addCriterion("real_name is not null");
			return (Criteria) this;
		}

		public Criteria andRealNameEqualTo(String value) {
			addCriterion("real_name =", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotEqualTo(String value) {
			addCriterion("real_name <>", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThan(String value) {
			addCriterion("real_name >", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThanOrEqualTo(String value) {
			addCriterion("real_name >=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThan(String value) {
			addCriterion("real_name <", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThanOrEqualTo(String value) {
			addCriterion("real_name <=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLike(String value) {
			addCriterion("real_name like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotLike(String value) {
			addCriterion("real_name not like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameIn(List<String> values) {
			addCriterion("real_name in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotIn(List<String> values) {
			addCriterion("real_name not in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameBetween(String value1, String value2) {
			addCriterion("real_name between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotBetween(String value1, String value2) {
			addCriterion("real_name not between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andGenderIsNull() {
			addCriterion("gender is null");
			return (Criteria) this;
		}

		public Criteria andGenderIsNotNull() {
			addCriterion("gender is not null");
			return (Criteria) this;
		}

		public Criteria andGenderEqualTo(String value) {
			addCriterion("gender =", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotEqualTo(String value) {
			addCriterion("gender <>", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThan(String value) {
			addCriterion("gender >", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThanOrEqualTo(String value) {
			addCriterion("gender >=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThan(String value) {
			addCriterion("gender <", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThanOrEqualTo(String value) {
			addCriterion("gender <=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLike(String value) {
			addCriterion("gender like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotLike(String value) {
			addCriterion("gender not like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderIn(List<String> values) {
			addCriterion("gender in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotIn(List<String> values) {
			addCriterion("gender not in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderBetween(String value1, String value2) {
			addCriterion("gender between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotBetween(String value1, String value2) {
			addCriterion("gender not between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andIdCardIsNull() {
			addCriterion("id_card is null");
			return (Criteria) this;
		}

		public Criteria andIdCardIsNotNull() {
			addCriterion("id_card is not null");
			return (Criteria) this;
		}

		public Criteria andIdCardEqualTo(String value) {
			addCriterion("id_card =", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardNotEqualTo(String value) {
			addCriterion("id_card <>", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardGreaterThan(String value) {
			addCriterion("id_card >", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardGreaterThanOrEqualTo(String value) {
			addCriterion("id_card >=", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardLessThan(String value) {
			addCriterion("id_card <", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardLessThanOrEqualTo(String value) {
			addCriterion("id_card <=", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardLike(String value) {
			addCriterion("id_card like", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardNotLike(String value) {
			addCriterion("id_card not like", value, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardIn(List<String> values) {
			addCriterion("id_card in", values, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardNotIn(List<String> values) {
			addCriterion("id_card not in", values, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardBetween(String value1, String value2) {
			addCriterion("id_card between", value1, value2, "idCard");
			return (Criteria) this;
		}

		public Criteria andIdCardNotBetween(String value1, String value2) {
			addCriterion("id_card not between", value1, value2, "idCard");
			return (Criteria) this;
		}

		public Criteria andDegreeIsNull() {
			addCriterion("degree is null");
			return (Criteria) this;
		}

		public Criteria andDegreeIsNotNull() {
			addCriterion("degree is not null");
			return (Criteria) this;
		}

		public Criteria andDegreeEqualTo(String value) {
			addCriterion("degree =", value, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeNotEqualTo(String value) {
			addCriterion("degree <>", value, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeGreaterThan(String value) {
			addCriterion("degree >", value, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeGreaterThanOrEqualTo(String value) {
			addCriterion("degree >=", value, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeLessThan(String value) {
			addCriterion("degree <", value, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeLessThanOrEqualTo(String value) {
			addCriterion("degree <=", value, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeLike(String value) {
			addCriterion("degree like", value, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeNotLike(String value) {
			addCriterion("degree not like", value, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeIn(List<String> values) {
			addCriterion("degree in", values, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeNotIn(List<String> values) {
			addCriterion("degree not in", values, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeBetween(String value1, String value2) {
			addCriterion("degree between", value1, value2, "degree");
			return (Criteria) this;
		}

		public Criteria andDegreeNotBetween(String value1, String value2) {
			addCriterion("degree not between", value1, value2, "degree");
			return (Criteria) this;
		}

		public Criteria andSchoolIsNull() {
			addCriterion("school is null");
			return (Criteria) this;
		}

		public Criteria andSchoolIsNotNull() {
			addCriterion("school is not null");
			return (Criteria) this;
		}

		public Criteria andSchoolEqualTo(String value) {
			addCriterion("school =", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotEqualTo(String value) {
			addCriterion("school <>", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolGreaterThan(String value) {
			addCriterion("school >", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolGreaterThanOrEqualTo(String value) {
			addCriterion("school >=", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLessThan(String value) {
			addCriterion("school <", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLessThanOrEqualTo(String value) {
			addCriterion("school <=", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolLike(String value) {
			addCriterion("school like", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotLike(String value) {
			addCriterion("school not like", value, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolIn(List<String> values) {
			addCriterion("school in", values, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotIn(List<String> values) {
			addCriterion("school not in", values, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolBetween(String value1, String value2) {
			addCriterion("school between", value1, value2, "school");
			return (Criteria) this;
		}

		public Criteria andSchoolNotBetween(String value1, String value2) {
			addCriterion("school not between", value1, value2, "school");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeIsNull() {
			addCriterion("register_time is null");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeIsNotNull() {
			addCriterion("register_time is not null");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeEqualTo(Date value) {
			addCriterion("register_time =", value, "registerTime");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeNotEqualTo(Date value) {
			addCriterion("register_time <>", value, "registerTime");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeGreaterThan(Date value) {
			addCriterion("register_time >", value, "registerTime");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("register_time >=", value, "registerTime");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeLessThan(Date value) {
			addCriterion("register_time <", value, "registerTime");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
			addCriterion("register_time <=", value, "registerTime");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeIn(List<Date> values) {
			addCriterion("register_time in", values, "registerTime");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeNotIn(List<Date> values) {
			addCriterion("register_time not in", values, "registerTime");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeBetween(Date value1, Date value2) {
			addCriterion("register_time between", value1, value2, "registerTime");
			return (Criteria) this;
		}

		public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
			addCriterion("register_time not between", value1, value2, "registerTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeIsNull() {
			addCriterion("last_login_time is null");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeIsNotNull() {
			addCriterion("last_login_time is not null");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeEqualTo(Date value) {
			addCriterion("last_login_time =", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeNotEqualTo(Date value) {
			addCriterion("last_login_time <>", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeGreaterThan(Date value) {
			addCriterion("last_login_time >", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("last_login_time >=", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeLessThan(Date value) {
			addCriterion("last_login_time <", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
			addCriterion("last_login_time <=", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeIn(List<Date> values) {
			addCriterion("last_login_time in", values, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeNotIn(List<Date> values) {
			addCriterion("last_login_time not in", values, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
			addCriterion("last_login_time between", value1, value2, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
			addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andRegisterIpIsNull() {
			addCriterion("register_ip is null");
			return (Criteria) this;
		}

		public Criteria andRegisterIpIsNotNull() {
			addCriterion("register_ip is not null");
			return (Criteria) this;
		}

		public Criteria andRegisterIpEqualTo(String value) {
			addCriterion("register_ip =", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpNotEqualTo(String value) {
			addCriterion("register_ip <>", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpGreaterThan(String value) {
			addCriterion("register_ip >", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpGreaterThanOrEqualTo(String value) {
			addCriterion("register_ip >=", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpLessThan(String value) {
			addCriterion("register_ip <", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpLessThanOrEqualTo(String value) {
			addCriterion("register_ip <=", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpLike(String value) {
			addCriterion("register_ip like", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpNotLike(String value) {
			addCriterion("register_ip not like", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpIn(List<String> values) {
			addCriterion("register_ip in", values, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpNotIn(List<String> values) {
			addCriterion("register_ip not in", values, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpBetween(String value1, String value2) {
			addCriterion("register_ip between", value1, value2, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpNotBetween(String value1, String value2) {
			addCriterion("register_ip not between", value1, value2, "registerIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpIsNull() {
			addCriterion("last_login_ip is null");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpIsNotNull() {
			addCriterion("last_login_ip is not null");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpEqualTo(String value) {
			addCriterion("last_login_ip =", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpNotEqualTo(String value) {
			addCriterion("last_login_ip <>", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpGreaterThan(String value) {
			addCriterion("last_login_ip >", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
			addCriterion("last_login_ip >=", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpLessThan(String value) {
			addCriterion("last_login_ip <", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
			addCriterion("last_login_ip <=", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpLike(String value) {
			addCriterion("last_login_ip like", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpNotLike(String value) {
			addCriterion("last_login_ip not like", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpIn(List<String> values) {
			addCriterion("last_login_ip in", values, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpNotIn(List<String> values) {
			addCriterion("last_login_ip not in", values, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpBetween(String value1, String value2) {
			addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpNotBetween(String value1, String value2) {
			addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLoginCountIsNull() {
			addCriterion("login_count is null");
			return (Criteria) this;
		}

		public Criteria andLoginCountIsNotNull() {
			addCriterion("login_count is not null");
			return (Criteria) this;
		}

		public Criteria andLoginCountEqualTo(Integer value) {
			addCriterion("login_count =", value, "loginCount");
			return (Criteria) this;
		}

		public Criteria andLoginCountNotEqualTo(Integer value) {
			addCriterion("login_count <>", value, "loginCount");
			return (Criteria) this;
		}

		public Criteria andLoginCountGreaterThan(Integer value) {
			addCriterion("login_count >", value, "loginCount");
			return (Criteria) this;
		}

		public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("login_count >=", value, "loginCount");
			return (Criteria) this;
		}

		public Criteria andLoginCountLessThan(Integer value) {
			addCriterion("login_count <", value, "loginCount");
			return (Criteria) this;
		}

		public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
			addCriterion("login_count <=", value, "loginCount");
			return (Criteria) this;
		}

		public Criteria andLoginCountIn(List<Integer> values) {
			addCriterion("login_count in", values, "loginCount");
			return (Criteria) this;
		}

		public Criteria andLoginCountNotIn(List<Integer> values) {
			addCriterion("login_count not in", values, "loginCount");
			return (Criteria) this;
		}

		public Criteria andLoginCountBetween(Integer value1, Integer value2) {
			addCriterion("login_count between", value1, value2, "loginCount");
			return (Criteria) this;
		}

		public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
			addCriterion("login_count not between", value1, value2, "loginCount");
			return (Criteria) this;
		}

		public Criteria andIsAdminIsNull() {
			addCriterion("is_admin is null");
			return (Criteria) this;
		}

		public Criteria andIsAdminIsNotNull() {
			addCriterion("is_admin is not null");
			return (Criteria) this;
		}

		public Criteria andIsAdminEqualTo(Integer value) {
			addCriterion("is_admin =", value, "isAdmin");
			return (Criteria) this;
		}

		public Criteria andIsAdminNotEqualTo(Integer value) {
			addCriterion("is_admin <>", value, "isAdmin");
			return (Criteria) this;
		}

		public Criteria andIsAdminGreaterThan(Integer value) {
			addCriterion("is_admin >", value, "isAdmin");
			return (Criteria) this;
		}

		public Criteria andIsAdminGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_admin >=", value, "isAdmin");
			return (Criteria) this;
		}

		public Criteria andIsAdminLessThan(Integer value) {
			addCriterion("is_admin <", value, "isAdmin");
			return (Criteria) this;
		}

		public Criteria andIsAdminLessThanOrEqualTo(Integer value) {
			addCriterion("is_admin <=", value, "isAdmin");
			return (Criteria) this;
		}

		public Criteria andIsAdminIn(List<Integer> values) {
			addCriterion("is_admin in", values, "isAdmin");
			return (Criteria) this;
		}

		public Criteria andIsAdminNotIn(List<Integer> values) {
			addCriterion("is_admin not in", values, "isAdmin");
			return (Criteria) this;
		}

		public Criteria andIsAdminBetween(Integer value1, Integer value2) {
			addCriterion("is_admin between", value1, value2, "isAdmin");
			return (Criteria) this;
		}

		public Criteria andIsAdminNotBetween(Integer value1, Integer value2) {
			addCriterion("is_admin not between", value1, value2, "isAdmin");
			return (Criteria) this;
		}

		public Criteria andIsLockedIsNull() {
			addCriterion("is_locked is null");
			return (Criteria) this;
		}

		public Criteria andIsLockedIsNotNull() {
			addCriterion("is_locked is not null");
			return (Criteria) this;
		}

		public Criteria andIsLockedEqualTo(Integer value) {
			addCriterion("is_locked =", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedNotEqualTo(Integer value) {
			addCriterion("is_locked <>", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedGreaterThan(Integer value) {
			addCriterion("is_locked >", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_locked >=", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedLessThan(Integer value) {
			addCriterion("is_locked <", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedLessThanOrEqualTo(Integer value) {
			addCriterion("is_locked <=", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedIn(List<Integer> values) {
			addCriterion("is_locked in", values, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedNotIn(List<Integer> values) {
			addCriterion("is_locked not in", values, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedBetween(Integer value1, Integer value2) {
			addCriterion("is_locked between", value1, value2, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedNotBetween(Integer value1, Integer value2) {
			addCriterion("is_locked not between", value1, value2, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsDisplayIsNull() {
			addCriterion("is_display is null");
			return (Criteria) this;
		}

		public Criteria andIsDisplayIsNotNull() {
			addCriterion("is_display is not null");
			return (Criteria) this;
		}

		public Criteria andIsDisplayEqualTo(Integer value) {
			addCriterion("is_display =", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayNotEqualTo(Integer value) {
			addCriterion("is_display <>", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayGreaterThan(Integer value) {
			addCriterion("is_display >", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_display >=", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayLessThan(Integer value) {
			addCriterion("is_display <", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayLessThanOrEqualTo(Integer value) {
			addCriterion("is_display <=", value, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayIn(List<Integer> values) {
			addCriterion("is_display in", values, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayNotIn(List<Integer> values) {
			addCriterion("is_display not in", values, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayBetween(Integer value1, Integer value2) {
			addCriterion("is_display between", value1, value2, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsDisplayNotBetween(Integer value1, Integer value2) {
			addCriterion("is_display not between", value1, value2, "isDisplay");
			return (Criteria) this;
		}

		public Criteria andIsEnableIsNull() {
			addCriterion("is_enable is null");
			return (Criteria) this;
		}

		public Criteria andIsEnableIsNotNull() {
			addCriterion("is_enable is not null");
			return (Criteria) this;
		}

		public Criteria andIsEnableEqualTo(Integer value) {
			addCriterion("is_enable =", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableNotEqualTo(Integer value) {
			addCriterion("is_enable <>", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableGreaterThan(Integer value) {
			addCriterion("is_enable >", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_enable >=", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableLessThan(Integer value) {
			addCriterion("is_enable <", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableLessThanOrEqualTo(Integer value) {
			addCriterion("is_enable <=", value, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableIn(List<Integer> values) {
			addCriterion("is_enable in", values, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableNotIn(List<Integer> values) {
			addCriterion("is_enable not in", values, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableBetween(Integer value1, Integer value2) {
			addCriterion("is_enable between", value1, value2, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsEnableNotBetween(Integer value1, Integer value2) {
			addCriterion("is_enable not between", value1, value2, "isEnable");
			return (Criteria) this;
		}

		public Criteria andIsActivationIsNull() {
			addCriterion("is_activation is null");
			return (Criteria) this;
		}

		public Criteria andIsActivationIsNotNull() {
			addCriterion("is_activation is not null");
			return (Criteria) this;
		}

		public Criteria andIsActivationEqualTo(Integer value) {
			addCriterion("is_activation =", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationNotEqualTo(Integer value) {
			addCriterion("is_activation <>", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationGreaterThan(Integer value) {
			addCriterion("is_activation >", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_activation >=", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationLessThan(Integer value) {
			addCriterion("is_activation <", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationLessThanOrEqualTo(Integer value) {
			addCriterion("is_activation <=", value, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationIn(List<Integer> values) {
			addCriterion("is_activation in", values, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationNotIn(List<Integer> values) {
			addCriterion("is_activation not in", values, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationBetween(Integer value1, Integer value2) {
			addCriterion("is_activation between", value1, value2, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsActivationNotBetween(Integer value1, Integer value2) {
			addCriterion("is_activation not between", value1, value2, "isActivation");
			return (Criteria) this;
		}

		public Criteria andIsDelIsNull() {
			addCriterion("is_del is null");
			return (Criteria) this;
		}

		public Criteria andIsDelIsNotNull() {
			addCriterion("is_del is not null");
			return (Criteria) this;
		}

		public Criteria andIsDelEqualTo(Integer value) {
			addCriterion("is_del =", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelNotEqualTo(Integer value) {
			addCriterion("is_del <>", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelGreaterThan(Integer value) {
			addCriterion("is_del >", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_del >=", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelLessThan(Integer value) {
			addCriterion("is_del <", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelLessThanOrEqualTo(Integer value) {
			addCriterion("is_del <=", value, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelIn(List<Integer> values) {
			addCriterion("is_del in", values, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelNotIn(List<Integer> values) {
			addCriterion("is_del not in", values, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelBetween(Integer value1, Integer value2) {
			addCriterion("is_del between", value1, value2, "isDel");
			return (Criteria) this;
		}

		public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
			addCriterion("is_del not between", value1, value2, "isDel");
			return (Criteria) this;
		}
	}

	/**
	 * user_back_user
	 */
	public static class Criteria extends GeneratedCriteria implements Serializable {

		/**
		 * user_back_user
		 */
		private static final long serialVersionUID = 1L;

		protected Criteria() {
			super();
		}
	}

	/**
	 * user_back_user 2017-06-17
	 */
	public static class Criterion implements Serializable {

		/**
		 * user_back_user
		 */
		private static final long serialVersionUID = 1L;

		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}