package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println();
		
		System.out.println("\n##### Test 1: findById department #####");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		
		
		System.out.println("\n######Test 2: department insert #####");
		Department newDepartment = new Department(6, "Arts");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New department " + newDepartment.getId());
		
		System.out.println();
		
		System.out.println("\n#####Test 3: update department ####");
		department = departmentDao.findById(3);
		department.setName("Courses");
		departmentDao.update(department);
		System.out.println("Update completeded"); 
		
		System.out.println("\n ##### Test 4: delete department #####");
		System.out.print("Enter department for to delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department deleted");
		
		System.out.println("\n=== TEST 5: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) { 
		    System.out.println(dep);
		}

	}
	
}
