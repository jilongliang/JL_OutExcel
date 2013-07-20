package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pojo.UserInfo;
import util.DbHelper;

/**
 * 客户
 * 
 */

@SuppressWarnings("all")
public interface UserInfoDao { 
	/**
	 * 获取全部客户
	 */
	public List<UserInfo> getAllUserInfo(String sqlWhere);
}
