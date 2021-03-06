package com.capgemini.medicalcollection.database;

import java.util.LinkedHashSet;
import java.util.Set;

import com.capgemini.medicalcollection.bean.MedicineBean;

public class MedicineDataBase {

	static Set<MedicineBean> madlist = new LinkedHashSet<MedicineBean>();

	static {

		MedicineBean m1 = new MedicineBean(10001, "Crocine", 200, "Allopathic");
		MedicineBean m2 = new MedicineBean(10002, "Paracetamol", 250, "Allopathic");
		MedicineBean m3 = new MedicineBean(10003, "Liv-52", 400, "Himalaya");
		madlist.add(m1);
		madlist.add(m2);
		madlist.add(m3);

	}

	public Set<MedicineBean> getMed() {

		return madlist;

	}

}
