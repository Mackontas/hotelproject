package dao.factory;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.Properties;

import dao.ClientsDAO;
import dao.CreditCardDAO;
import dao.ClientsMySQLDAO;
import .dao.CreditCardMySQLDAO;
import dao.util.PropertiesUtil;
import org.apache.commons.dbcp.BasicDataSource;

public class MySQLDAOFactory extends DAOFactory {

    //Constants

    private static final String MYSQL_CONFIG_PROPERTIES = "mysql.properties";
    private static final String DRIVER_CLASS_NAME = "driverClassName";
    private static final String CONNECTION_URL = "connectionUrl";
    private static final String USER = "user";
    private static final String PASSWORD = "password";
    private static BasicDataSource mDatasource;

    /**
     * MySQL DAO Factory constructor
     */
    public MySQLDAOFactory() {
        setConection();
    }
    private static void setConection(){
        try {
            Properties mySQLproperties = new PropertiesUtil()
                    .getProperties(MYSQL_CONFIG_PROPERTIES);
            mDatasource = new BasicDataSource();
            mDatasource.setDriverClassName(
                    mySQLproperties.getProperty(DRIVER_CLASS_NAME));
            mDatasource.setUrl(mySQLproperties.getProperty(CONNECTION_URL));
            mDatasource.setUsername(mySQLproperties.getProperty(USER));
            mDatasource.setPassword(mySQLproperties.getProperty(PASSWORD));
            Class.forName(mySQLproperties.getProperty(DRIVER_CLASS_NAME));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Methods



    public static Connection getConnection() throws SQLException {
        if(mDatasource != null) {
            return mDatasource.getConnection();
        }
        else {
            setConection();
            return mDatasource.getConnection();
        }
    }
    /**
     * Returns factory instance
     */
	/*
	public static synchronized DAOFactory getInstance() {
		if (daoFactory == null) {
			daoFactory = new MySQLDAOFactory();
		}
		return daoFactory;
	}*/


    public ClientsDAO getEmpoyeeDAO() {
        return new ClientsMySQLDAO();
    }

    public CreditCardDAO getTrainingDAO() {
        return new CreditCardMySQLDAO();
    }

}
