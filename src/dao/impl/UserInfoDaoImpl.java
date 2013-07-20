package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.UserInfoDao;
import pojo.UserInfo;
import util.ConfigDbHelper;
import util.DbHelper;

/**
 * 客户
 * 
 */

@SuppressWarnings("all")
public class UserInfoDaoImpl implements UserInfoDao {

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	/**
	 * 获取全部客户
	 */
	public List<UserInfo> getAllUserInfo(String sqlWhere) {
		List<UserInfo> infoList = new ArrayList<UserInfo>();
		// 查询商品SQL
		String sql = "select * from userInfo " + sqlWhere;
		try {
			/**
			 * 这个是常用的DbHelper连接
			 */
			// conn = DbHelper.getInstance().getMSSQLConnection();
			/**
			 * 读取配置的连接方式
			 */
			conn = ConfigDbHelper.getInstance().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				UserInfo userInfo = new UserInfo();
				userInfo.setId(rs.getString("id"));
				userInfo.setTelephone(rs.getString("telephone"));
				userInfo.setAddress(rs.getString("address"));
				userInfo.setUsername(rs.getString("username"));
				infoList.add(userInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbHelper.Relesae(rs, stmt, conn);
		}
		return infoList;
	}
}
