package model;

import exceptions.NickNameContainsException;

import java.sql.*;
import java.util.List;

/**
 * Created by andrew_yashin on 4/25/17.
 */
public class ManagingUsersDB {
    private final static String driverClass = "com.mysql.jdbc.Driver";
    private final static String DB_NAME = "jdbc:mysql://localhost:3306/task3";
    private final static String DB_USERNAME = "root";
    private final static String DB_PASSWORD = "root";

    private final static String SELECT_FROM_TASK3_WHERE_NICKNAME
            = "SELECT * FROM user WHERE user.nickname=?";
    private final static String INSERT_USER_TO_DB =
                    "INSERT INTO user(" +
                            "user.name, \n" +
                            "user.surname, \n" +
                            "user.fathername, \n" +
                            "user.nickname, \n" +
                            "user.comment, \n" +
                            "user.group_name, \n" +
                            "user.home_phone, \n" +
                            "user.mobile_phone, \n" +
                            "user.mobile_phone2, \n" +
                            "user.email, \n" +
                            "user.skype, \n" +
                            "user.index_postal, \n" +
                            "user.city, \n" +
                            "user.street, \n" +
                            "user.numberhome, \n" +
                            "user.streetnumber, \n" +
                            "user.flatnumber, \n" +
                            "user.dateOfCreating, \n" +
                            "user.dateOfChanching)" +
                    "    VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    private Connection connection;


    private void makeConnection(){
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e){
            System.err.println("No such driver for JDBC");
        }
        try {
            connection = DriverManager.getConnection(DB_NAME, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e){
            System.err.println("Can\'t connect to the DB");
        }

    }

    private Connection getConnection(){
        if (connection == null){
            makeConnection();
        }
        return connection;
    }

    public boolean putUserToDB(Model model) throws NickNameContainsException{
        String nickName = model.getNickName();
        if (isContainsNickName(nickName)){
            throw new NickNameContainsException();
        }

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(INSERT_USER_TO_DB);

            preparedStatement.setString(1, model.getName());
            preparedStatement.setString(2, model.getSurname());
            preparedStatement.setString(3, model.getFatherName());
            preparedStatement.setString(4, model.getNickName());
            preparedStatement.setString(5, model.getComment());
            preparedStatement.setString(6, model.getGroup());
            preparedStatement.setString(7, model.getTelephoneHome());
            preparedStatement.setString(8, model.getTelephoneMobile());
            preparedStatement.setString(9, model.getTelephoneMobile2());
            preparedStatement.setString(10, model.getEmail());
            preparedStatement.setString(11, model.getSkype());
            preparedStatement.setString(12, model.getIndex());
            preparedStatement.setString(13, model.getCity());
            preparedStatement.setString(14, model.getStreet());
            preparedStatement.setString(15, model.getHomeNumber());
            preparedStatement.setString(16, model.getStreetNumber());
            preparedStatement.setString(17, model.getFlatNumber());
            preparedStatement.setString(18, model.getDateOfCreating());
            preparedStatement.setString(19, model.getDateOfModify());

            preparedStatement.execute();
        } catch (SQLException e){
            System.err.println("Cannot add new User to DB");
            return false;
        }

        return true;

    }

    public boolean isContainsNickName(String nickName){
        try{
            PreparedStatement preparedStatement = getConnection()
                    .prepareStatement(SELECT_FROM_TASK3_WHERE_NICKNAME);

            preparedStatement.setString(1, nickName);
            ResultSet result = preparedStatement.executeQuery();
            if (result.next()){
                return true;
            }
        } catch (SQLException e){
            System.err.println("Cannot get NickName");
        }
        return false;
    }
}
