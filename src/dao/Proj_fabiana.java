/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dao;

import java.sql.*;

/**
 *
 * @author 20221074010033
 */
public class Proj_fabiana {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        Customer c = new Customer(1, "Dalai", "Lama", "dalai@microsoft.com", 10, 1);

        CustomerDAO dao = new CustomerDAO();

//        dao.insertCustomer(c);
//        dao.updateCustomer(611);
//        dao.deleteCustomer(610);
//        dao.showCustomers();
        System.out.println(dao.getCustomers());
    }
}
