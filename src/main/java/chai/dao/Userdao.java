package chai.dao;

import java.util.List;

import chai.bean.Userbean;

public interface Userdao {
    List<Userbean> selectAll();
    Userbean  selectbyid(String id);
    int insert(Userbean bean);
    int update(Userbean bean);
    int delete(String id);
  
}
