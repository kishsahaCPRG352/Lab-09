package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import models.Role;
import models.User;

public class RoleDB {
    
    public List<Role> getAll() throws Exception {

        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            List<Role> roleList = em.createNamedQuery("Role.findAll", Role.class).getResultList();
            return roleList;
        } finally {
            em.close();
        }

    }
    
    public Role get(int index) throws Exception
    {
        
        return null;
    }
}
