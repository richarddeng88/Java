
package org.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.sql.DataSource;

@WebService(serviceName = "RateWebService")
public class RateWebService {

    @Resource(name = "mybank")
    private DataSource mybank;
    
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "exchange")
    public double exchange(@WebParam(name = "usd") double usd) {
        try {
            //TODO write your implementation code here:
            Connection con = mybank.getConnection();
            PreparedStatement stmt = con.prepareStatement("select value from rate whare id = ?");
            stmt.setInt(1,1);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            double rate=rs.getDouble(1);
            rs.close();
            con.close();
            return usd*rate;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return 0.0;
        }
    }
}
