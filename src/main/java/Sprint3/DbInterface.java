package Sprint3;

import com.codoid.products.exception.FilloException;

public interface DbInterface {
    public void selectRecord();
    public void updateRecord();
    public void insertRecord() throws FilloException;
    public void deleteRecord() throws FilloException;
}
