/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class OpenPdf {
    public static void openByID(String id){
    try{
        if((new File("E:\\"+id+".pdf")).exists()){
            Process p = Runtime
                    .getRuntime()
                    .exec("rund1123 url.d11,FileProtocolHandler E:\\"+id+".pdf");
        }
        else
            JOptionPane.showMessageDialog(null, "File is not Exsists");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
       }
    }
}
