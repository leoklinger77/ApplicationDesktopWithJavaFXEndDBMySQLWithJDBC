package model.service;

import java.util.List;

import db.DbException;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	private DepartmentDao dao = DaoFactory.createDeparmentDao();

	public List<Department> findAll() {

		return dao.findAll();
	}

	public void saveOrUpdate(Department obj) {
		if(obj.getName() == null) {
			throw new DbException("Inserir Department");
		}
		if (obj.getId() == null) {
			dao.insert(obj);
		} else {
			dao.update(obj);
		}
	}

}
