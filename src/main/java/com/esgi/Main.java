package com.esgi;

import com.dao.CoachDAO;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory fac = new XmlBeanFactory(r);

        // COURS
        Cours cours = (Cours)fac.getBean("c");
        cours.afficher();

        // COACH
        Coach coach = (Coach)fac.getBean("d");
        Cours c1 = (Cours)fac.getBean("c1");
        Cours c2 = (Cours)fac.getBean("c2");

        // OBJECTIF
        Objectif o1 = (Objectif)fac.getBean("o1");
        Objectif o2 = (Objectif)fac.getBean("o2");

        coach.addCours(c1);
        c1.addObjectifs(o1);

        coach.addCours(c2);
        c2.addObjectifs(o2);

        coach.afficher();

        // DAO
        CoachDAO coachdao = (CoachDAO) fac.getBean("dao");
        coachdao.setCoach(coach);
        coachdao.enregistrer();

    }
}
