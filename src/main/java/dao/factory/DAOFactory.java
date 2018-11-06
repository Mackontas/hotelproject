package dao.factory;

import dao.ClientsDAO;
import dao.CreditCardDAO;

public abstract class DAOFactory {
    public static final int MYSQL = 1;

    public abstract ClientsDAO getEmpoyeeDAO();

    public abstract CreditCardDAO getTrainingDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {

        if (whichFactory == MYSQL)
                return new MySQLDAOFactory();//MySQLDAOFactory.getInstance();
            case ORACLE:
                return null;//new OracleDAOFactory();//OracleDAOFactory.getInstance();
            default:
                return null;
        }
    }
}
