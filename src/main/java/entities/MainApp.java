package entities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainApp {



    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
        EntityManager em = emf.createEntityManager();

        cd testing = new cd("Kidz bop", "Now thats what I call music", 2015, "The Kidz that bop",19.99 );

        em.persist(testing);
        em.getTransaction().commit();
    }


    /**
     * <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
     * <persistence version="3.0" xmlns="https://jakarta.ee/xml/ns/persistence"
     *              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     *              xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence
     *              https://jakarta.ee/xml/ns/persistence/persistence_3_0.xsd">
     *
     *     <persistence-unit name="jpa-hibernate-mysql">
     *         <description> Hibernate JPA Configuration Example</description>
     *         <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
     *         <properties>
     *             <property name="jakarta.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver" />
     *             <property name="jakarta.persistence.jdbc.url"    value="jdbc:mysql://localhost:3306/jpaEntityLab" />
     *             <property name="jakarta.persistence.jdbc.user"   value="taylor" />
     *             <property name="jakarta.persistence.jdbc.password" value="taylor123" />
     *             <property name="jakarta.persistence.schema-generation.database.action" value="update" />
     *             <property name="hibernate.dialect"    value="org.hibernate.dialect.MySQLDialect" />
     *             <property name="hibernate.show_sql"   value="true" />
     *             <property name="hibernate.format_sql" value="true" />
     *         </properties>
     *     </persistence-unit>
     * </persistence>
     */





//    <?xml version="1.0" encoding="UTF-8"?>
//<persistence>
//<persistence-unit name="testingPersistence" transaction-type="RESOURCE_LOCAL">
//<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
//    <properties>
//        <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver" />
//        <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/jpaEntityLab" />
//        <property name="javax.persistence.jdbc.user" value="taylor" />
//        <property name="javax.persistence.jdbc.password" value="taylor123" />
//    </properties>
//</persistence-unit>
//</persistence>


//    <!--<?xml version="1.0" encoding="UTF-8"?>-->
//<!--<persistence version="2.2"-->
//<!--             xmlns="http://xmlns.jcp.org/xml/ns/persistence"-->
//<!--             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"-->
//<!--             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence-->
//<!--     http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">-->
//
//<!--    <persistence-unit-->
//<!--            name="testingPersistence"-->
//<!--            transaction-type="RESOURCE_LOCAL">-->
//<!--        <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>-->
//
//<!--        <jta-data-source>java:global/jdbc/default</jta-data-source>-->
//
//<!--        <properties>-->
//<!--            <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver" />-->
//<!--            <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/jpaEntityLab" />-->
//<!--            <property name="javax.persistence.jdbc.user" value="taylor" />-->
//<!--            <property name="javax.persistence.jdbc.password" value="taylor123" />-->
//<!--        </properties>-->
//<!--    </persistence-unit>-->
//<!--</persistence>-->
}
