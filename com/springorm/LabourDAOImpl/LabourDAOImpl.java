package com.springorm.LabourDAOImpl;

import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.springorm.LabourDAO.LabourDAO;
import com.springorm.entity.Labour;


public class LabourDAOImpl implements LabourDAO {
	
	private HibernateTemplate ht;

	// To insert record of department
	@Transactional
	public int insertLabour(Labour Lb) {
		ht.save(Lb);
		return 1;

	}

	// To update record of department
	@Transactional
	public int updateLabour(Labour Lb) {
		ht.update(Lb);
		return 1;

	}

	// To delete record of department
	@Transactional
	public int deleteLabour(Labour Lb) {
		ht.delete(Lb);
		return 1;

	}

	// To get specific record
	public Labour getLabour(int LabourID) {

		Labour Lb = ht.get(Labour.class, LabourID);
		return Lb;

	}

	// To get all records
	public List<Labour> getAllLabours() {

		List<Labour> LbList = ht.loadAll(Labour.class);
		return LbList;

	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}


}
