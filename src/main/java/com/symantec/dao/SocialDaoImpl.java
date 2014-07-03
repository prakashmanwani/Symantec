package com.symantec.dao;
 
import java.util.List;
 
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
 
import com.symantec.entity.Clothes;
import com.symantec.entity.Social;
import com.symantec.entity.UserDetail;
 
public class SocialDaoImpl extends HibernateDaoSupport implements SocialDao{
 
       public void addSocial(Social social) {
           getHibernateTemplate().save(social);
       }
       public List<Social> getListOfAllSocial(){
              return getHibernateTemplate().find("from Social s");
       }
       /*
       public List<Social> getSocialOnDate(String availFrom,String availTo ){
              List<Social> socialDtl = getHibernateTemplate().find("select * from Social s where s.availFrom=? and s.availTo=?",availFrom,availTo);
              if(socialDtl != null && !socialDtl.isEmpty()){
                     return socialDtl;
              }
              return null;
       }
       */
       @Override
       public Social getUser(int id){
              List<Social> socialdtl = getHibernateTemplate().find("select u from Clothes u where u.id=?",id);
              if(socialdtl != null && !socialdtl.isEmpty()){
                     return socialdtl.get(0);
              }
              return null;
       }
 
}
