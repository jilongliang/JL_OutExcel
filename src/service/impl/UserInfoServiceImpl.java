package service.impl;

import java.util.List;

import pojo.UserInfo;
import service.UserInfoService;
import dao.UserInfoDao;
import dao.impl.UserInfoDaoImpl;


public class UserInfoServiceImpl implements UserInfoService {
	UserInfoDao userInfoDao=new UserInfoDaoImpl();
	/**
	 * 获取全部客户
	 */
	public List<UserInfo> getAllUserInfo(String sqlWhere){
		return userInfoDao.getAllUserInfo(sqlWhere);
	}
}
