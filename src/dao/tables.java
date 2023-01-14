/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(200),UNIQUE (email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','0702887002','nittambuwa','admin','What is your pet?','siba','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            String billTable = "create table bill(id int AUTO_INCREMENT primary key,name varchar(200),mobileNumber varchar(200),email varchar (200), date varchar(200),total varchar(200),createdBy varchar(200))";
            DBOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DBOperations.setDataOrDelete(adminDetails, "Admin Details Addred Successfully");
            DBOperations.setDataOrDelete(categoryTable, "Cetegory Table created Successfully");
            DBOperations.setDataOrDelete(productTable, "Product Table created Successfully");
            DBOperations.setDataOrDelete(billTable, "Bill Table created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
