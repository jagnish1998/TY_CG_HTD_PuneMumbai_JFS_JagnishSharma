package com.capgemini.medicalcollection.dao;

import java.util.Set;

import com.capgemini.medicalcollection.bean.MedicineBean;

public interface MedicineDAO {
	public Set<MedicineBean> getMedicine();

	public boolean addMedicine(MedicineBean bean);

	public boolean removeMedicine(int mCode);
	
	public boolean updateMedicine(int mCode,double price);
}
