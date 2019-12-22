package com.capgemini.medicalcollection.dao;

import java.util.Set;

import com.capgemini.medicalcollection.bean.MedicineBean;
import com.capgemini.medicalcollection.bean.UserBean;
import com.capgemini.medicalcollection.controller.AdminIndex;
import com.capgemini.medicalcollection.controller.RegisterUser;
import com.capgemini.medicalcollection.database.MedicineDataBase;
import com.capgemini.medicalcollection.database.UserDataBase;

public class MedicineDAOImpli implements MedicineDAO {
	MedicineDataBase dataBase = new MedicineDataBase();
	Set<MedicineBean> medList = dataBase.getMed();

	@Override
	public Set<MedicineBean> getMedicine() {
		return dataBase.getMed();
	}

	@Override
	public boolean addMedicine(MedicineBean bean) {
		int check = 0;
		bean.setmedicineCode(medList.size() + 10001);
		boolean isAdded = false;
		for (MedicineBean medList : medList) {
			if (bean.getmedicineName().equals(medList.getmedicineName())) {
				check++;
			}
		}
		if (check == 0) {
			medList.add(bean);
			isAdded = true;
		} else {
			System.out.println("Medicine Already Exist");
		}
		return isAdded;
	}

	@Override
	public boolean removeMedicine(int mCode) {

		int check = 0;
		boolean isRemoved = false;
		MedicineBean bean = new MedicineBean();
		for (MedicineBean medList : medList) {
			if (mCode == medList.getmedicineCode()) {
				bean = medList;
				check++;
			}
		}
		if (check != 0) {
			medList.remove(bean);
			isRemoved = true;
		} else {
			System.out.println("Invalid Medicine Id");
		}
		return isRemoved;
	}

	@Override
	public boolean updateMedicine(int mCode, double price) {
		int check = 0;
		boolean isUpdated = false;
		MedicineBean bean = new MedicineBean();
		for (MedicineBean medList : medList) {
			if (mCode == medList.getmedicineCode()) {
				bean = medList;
				check++;
			}
		}
		if (check != 0) {
			bean.setPrice(price);
			isUpdated = true;
		} else {
			System.out.println("Inalid Medicine ID");
		}
		return isUpdated;
	}
}
