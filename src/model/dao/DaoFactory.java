package model.dao;

import model.dao.impl.SellerDaoImpl_JDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoImpl_JDBC();

	}

}
