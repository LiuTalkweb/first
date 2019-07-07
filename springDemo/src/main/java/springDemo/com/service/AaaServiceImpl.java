package springDemo.com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import springDemo.com.dao.AaaDao;

@Component
//@Transactional
public class AaaServiceImpl implements AaaService {

	@Autowired
	private AaaDao dao;
	
	@Override
	public List<Map<String, Object>> dataList() {
		return dao.dataList();
	}

}
