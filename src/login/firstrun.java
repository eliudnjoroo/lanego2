package login;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static lane.lane2.con;
import static lane.lane2.hassData;
import static lane.lane2.state;

public class firstrun {
    public static void main(String []args) throws ClassNotFoundException, SQLException{
        
        initialize();
        
    }

    public static void initialize() throws SQLException, ClassNotFoundException {
        
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:lng.db");
        
         if(!hassData ){
            createdatabase();
         }
         else{
             con.close();
             state.close();
        }
     }

    public static void createdatabase() throws ClassNotFoundException, SQLException {
        hassData = true;
        
        state = con.createStatement();
        ResultSet res= state.executeQuery("select name from sqlite_master"
                + " where type='table' and name='rcd'");
        if(!res.next()){
            
            Statement state3;
            Statement state4;
            Statement state5;
            Statement state6;
            Statement state7;
            Statement state8;
            Statement state9;
            Statement state10;
            try (Statement state2 = con.createStatement()) {
                state2.execute("create table rcd(no integer primary key autoincrement, "
                        + "ca varchar(30), "
                        + "fn varchar(30), "
                        + "sn varchar(30), "
                        + "tn varchar(30), "
                        + "id varchar(30) unique not null, "
                        + "pn varchar(30), "
                        + "vil varchar(30), "
                        + "la varchar(30), "
                        + "pv varchar(30), "
                        + "ac varchar(30), "
                        + "yb varchar(30), "
                        + "nb varchar(30));");
                state3 = con.createStatement();
                state3.execute("create table adm(un varchar(30) unique not null, "
                        + "pw varchar(30) unique not null, "
                        + "cd varchar(30) unique not null);");
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:lng.db");
                state4 = con.createStatement();
                state4.execute("create table cmf(un varchar(30) unique not null, "
                        + "pw varchar(30) unique not null, "
                        + "cd varchar(30) unique not null);");
                state5 = con.createStatement();
                state5.execute("create table ceo(un varchar(30) unique not null, "
                        + "pw varchar(30) unique not null, "
                        + "cd varchar(30) unique not null);");
                state6 = con.createStatement();
                state6.execute("create table nts(auther varchar(300), "
                        + "about varchar(300), "
                        + "notes varchar(1000000), "
                        + "date varchar(1000), "
                        + "const integer primary key autoincrement)");
                state7 = con.createStatement();
                state7.execute("insert into nts (auther, about, notes, date)\n" +
                        "values(\"authers name\",\"topic heading\",\"body of the notes writen here\",\"nothing yet saved\");");
                state8 = con.createStatement();
                state8.execute("create table sls(ca varchar(30), "
                        + "fn varchar(30), "
                        + "sn varchar(30), "
                        + "tn varchar(30), "
                        + "id varchar(30) unique not null, "
                        + "pn varchar(30), "
                        + "vil varchar(30), "
                        + "la varchar(30), "
                        + "pv varchar(30), "
                        + "ac varchar(30));");
                state9 = con.createStatement();
                state9.execute("create table stockin(item1 varchar(30) not null, "
                        + "quantity1 varchar(30) not null, "
                        + "quality1 varchar(30) not null, "
                        + "atprice1 integer not null, "
                        + "totalprice1 integer not null, "
                        + "date1 varchar(30) not null, "
                        + "transid1 integer primary key autoincrement, "
                        + "state1 varchar(30) not null);");
                state10 = con.createStatement();
                state10.execute("create table stockout(item2 varchar(30) not null, "
                        + "quantity2 varchar(30) not null, "
                        + "quality2 varchar(30) not null, "
                        + "atprice2 integer not null, "
                        + "totalprice2 integer not null, "
                        + "date2 varchar(30) not null, "
                        + "transid2 integer primary key autoincrement, "
                        + "state2 varchar(30) not null);");
                Statement state11;
                state11 = con.createStatement();
                state11.execute("create table stockhist(item3 varchar(30) not null, "
                        + "quant3 varchar(30) not null, "
                        + "spec3 varchar(30) not null, "
                        + "date3 varchar(30) not null, "
                        + "time3 varchar(30) not null, "
                        + "day3 varchar(30) not null, "
                        + "atprice3 varchar(30) not null, "
                        + "profit3 varchar(30) not null, "
                        + "sellp3 varchar(30) not null, "
                        + "collb3 varchar(30) not null, "
                        + "transid3 integer primary key autoincrement, "
                        + "suppn3 varchar(30));");
                state11.close();
                
                Statement state12;
                state12 = con.createStatement();
                state12.execute("create table supplier(sn1 varchar(30) not null, "
                        + "pn1 varchar(30) not null, "
                        + "mis1 varchar(30) not null, "
                        + "da1 varchar(30) not null, "
                        + "ea1 varchar(30) not null, "
                        + "comp1 varchar(30) not null, "
                        + "ms1 varchar(30) not null, "
                        + "id1 integer primary key autoincrement);");
                state12.close();
                
                Statement state13 = con.createStatement();
                state13.execute("create table stocksell(item3 varchar(30) not null, "
                        + "quant3 varchar(30) not null, "
                        + "spec3 varchar(30) not null, "
                        + "date3 varchar(30) not null, "
                        + "time3 varchar(30) not null, "
                        + "day3 varchar(30) not null, "
                        + "atprice3 varchar(30) not null, "
                        + "profit3 varchar(30) not null, "
                        + "sellp3 varchar(30) not null, "
                        + "collb3 varchar(30) not null, "
                        + "transid3 integer primary key autoincrement, "
                        + "suppn3 varchar(30));");
                state13.close();
                
                Statement state14 = con.createStatement();
                state14.execute("create table saleshist(ind integer primary key autoincrement, "
                        + "pm varchar(30) not null, "
                        + "dt varchar(30) not null, "
                        + "tm varchar(30) not null, "
                        + "day varchar(30) not null, "
                        + "wog varchar(30) not null, "
                        + "sb varchar(30) not null, "
                        + "cpn varchar(30));");
                state14.close();
                
                Statement state15 = con.createStatement();
                state15.execute("create table transhist(transid integer primary key autoincrement , "
                        + "ai varchar(30) not null, "
                        + "ao varchar(30) not null, "
                        + "day varchar(30) not null, "
                        + "tm varchar(30) not null, "
                        + "month varchar(30) not null, "
                        + "year varchar(30) not null);");
                state15.close();
                
                Statement state16;
                state16 = con.createStatement();
                state16.execute("create table customerlist(fn1 varchar(30) not null, "
                        + "sn1 varchar(30) not null, "
                        + "tn1 varchar(30) not null, "
                        + "pn1 varchar(30) not null, "
                        + "ea1 varchar(30) not null, "
                        + "ms1 varchar(30) not null, "
                        + "dt1 varchar(30) not null, "
                        + "id1 integer primary key autoincrement);");
                state16.close();
                
            }
            state3.close();
            state4.close();
            state5.close();
            state6.close();
            state7.close();
            state8.close();
            state9.close();
            state10.close();
            new login.welcomepage().setVisible(true);
            con.close();
            
        }else{
            con.close();
            state.close();
            new login.loginpage().setVisible(true);
        }
        con.close();
        state.close();
    }
}
