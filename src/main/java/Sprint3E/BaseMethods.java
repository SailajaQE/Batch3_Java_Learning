package Sprint3E;

import com.codoid.products.exception.FilloException;

import java.sql.SQLException;

public interface BaseMethods {
    public void selectRecord() throws SQLException;
    public void updateRecord() throws SQLException;
    public void insertRecord() throws FilloException;
    public void deleteRecord() throws FilloException, SQLException;
}
