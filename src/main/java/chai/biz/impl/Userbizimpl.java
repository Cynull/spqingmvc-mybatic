package chai.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import chai.bean.Userbean;
import chai.biz.Userbiz;
import chai.dao.Userdao;

@Service("userBiz")
public class Userbizimpl implements Userbiz{
	private  Userdao  userdao;
   
	@Resource(name="userdao")
	public void setUserdao(Userdao userdao) {
		this.userdao = userdao;
	}

	@Override
	public List<Userbean> selectAll() {
		// TODO Auto-generated method stub
		return userdao.selectAll();
	}

	@Override
	public Userbean selectbyid(String id) {
		// TODO Auto-generated method stub
		return userdao.selectbyid(id);
	}

	@Override
	public int insert(Userbean bean) {
		// TODO Auto-generated method stub
		return userdao.insert(bean);
	}

	@Override
	public boolean update(Userbean bean) {
		// TODO Auto-generated method stub
		return userdao.update(bean)>0;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return userdao.delete(id)>0;
	}

}
