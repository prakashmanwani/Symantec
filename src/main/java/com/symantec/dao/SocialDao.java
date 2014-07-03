package com.symantec.dao;
 
import java.util.List;
 
import com.symantec.entity.Social;
 
 
public interface SocialDao {
       public void addSocial(Social social);
       public List<Social> getListOfAllSocial();
       public Social getUser(int id);
}

