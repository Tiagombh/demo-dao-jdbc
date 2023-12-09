package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println();

		/*System.out.println("\n######Test 1: department insert #####");
		Department newDepartment = new Department(5, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New department " + newDepartment.getId());*/
		
		System.out.println();
		
		System.out.println("\n#####Test 2: update department ####");
		Department department= new Department();
		department = departmentDao.findById(3);
		department.setName("Courses");
		departmentDao.update(department);
		System.out.println("Update completeded"); 
	}

}
