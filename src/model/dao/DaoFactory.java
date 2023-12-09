package model.dao;

import db.DB;
import model.dao.impl.DepartmentDao_JDBC;
import model.dao.impl.SellerDao_JDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDao_JDBC (DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDao_JDBC(DB.getConnection()); 
	}

}
