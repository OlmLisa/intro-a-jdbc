package com.dao;

import com.esgi.Coach;

import java.sql.*;

public class CoachDAO {
    private  String url;
    private  String user;
    private  String passwd;
    private  Coach coach;

    public CoachDAO() {}

    public CoachDAO(Coach coach, String url, String user, String passwd) {
        this.coach = coach;
        this.url = url;
        this.user = user;
        this.passwd = passwd;
    }

    public CoachDAO(String url, String user, String passwd) {
        this.url = url;
        this.user = user;
        this.passwd = passwd;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Connection OpenConnexion() { ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(this.url, this.user, this.passwd);
            System.out.println("Connecter");
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeConnexion(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String addCoachBdd(){
        return " insert into coach (nom, prenom, codepostal, cours_id)"
                + " values ('" + this.coach.getNom()+ "','"
                + this.coach.getPrenom()+"','"+ this.coach.getCodepostal()+ "', 1)";
    }
    public void enregistrer() throws SQLException {
        String query = this.addCoachBdd();
        Connection conn = OpenConnexion();
        Statement s = conn.createStatement();
        s.executeUpdate(query);
        closeConnexion(conn);
    }

    @Override
    public String toString() {
        return "CoachDAO{" +
                "coach=" + coach +
                '}';
    }
}
