package com.symantec.dao;
 
import java.util.List;
 
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
 
import com.symantec.entity.Clothes;
import com.symantec.entity.UserDetail;
 
public class ClothDaoImpl extends HibernateDaoSupport implements ClothDao {
 
       @Override
       public void addCloth(Clothes hsrc) {
                getHibernateTemplate().save(hsrc);
             
       }
 
       @Override
       public List<Clothes> getListOfAllUser() {
              return getHibernateTemplate().find("from Clothes u");
       }
 
       @Override
       public Clothes getUser(int id){
              List<Clothes> clothdtl = getHibernateTemplate().find("select u from Clothes u where u.id=?",id);
              if(clothdtl != null && !clothdtl.isEmpty()){
                     return clothdtl.get(0);
              }
              return null;
       }
}