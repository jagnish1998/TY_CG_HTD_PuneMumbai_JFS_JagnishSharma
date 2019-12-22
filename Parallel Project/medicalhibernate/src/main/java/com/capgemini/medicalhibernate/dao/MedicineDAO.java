package com.capgemini.medicalhibernate.dao;

import java.util.List;

import com.capgemini.medicalhibernate.bean.MedicineBean;

public interface MedicineDAO {

	public List<MedicineBean> getMedicine();

	public boolean addMedicine(MedicineBean medBean);

	public boolean removeMedicine(int mCode);

	public boolean updateMedicineName(int mid, String name);

	public boolean updateMedicinePrice(int id, double price);

	public boolean updateMedicineCategory(int medId, String catgeory);


}
