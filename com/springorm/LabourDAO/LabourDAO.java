package com.springorm.LabourDAO;

import java.util.List;

import com.springorm.entity.Labour;


public interface LabourDAO {
	public int insertLabour(Labour Lb);

	public int updateLabour(Labour Lb);

	public int deleteLabour(Labour Lb);

	public Labour getLabour(int id);

	public List<Labour> getAllLabours();


}
