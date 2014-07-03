package com.symantec.dao;
 
import java.util.List;
 
import com.symantec.entity.Clothes;
import com.symantec.entity.UserDetail;
 
public interface ClothDao {
       public void addCloth(Clothes hsrc);
       public List<Clothes> getListOfAllUser();
       public Clothes getUser(int id);
}
 
