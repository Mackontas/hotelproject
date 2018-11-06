package controller.wrappers;

import java.sql.ResultSet;

public interface Select {
    ResultSet selectLine(String tableName, int id);
    ResultSet selectColumn(String tableName, String columnName);
    ResultSet selectTable(String tableName);
}
