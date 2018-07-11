package chai.biz;

import java.util.List;

import chai.bean.Userbean;

public interface Userbiz {
	List<Userbean> selectAll();
    Userbean  selectbyid(String id);
    int insert(Userbean bean);
    boolean update(Userbean bean);
    boolean delete(String id);
}
