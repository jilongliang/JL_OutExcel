package service;

import java.util.List;

import pojo.UserInfo;


public interface UserInfoService {
	/**
	 * 获取全部客户
	 */
	public List<UserInfo> getAllUserInfo(String sqlWhere);
}
