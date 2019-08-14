package com.hibernateRelationship.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernateRelationship.doa.CarRepository;
import com.hibernateRelationship.doa.CollegeRepository;
import com.hibernateRelationship.doa.DepartmentRepository;
import com.hibernateRelationship.doa.EmployeeRepository;
import com.hibernateRelationship.doa.LaptopRepository;
import com.hibernateRelationship.doa.OwnerRepository;
import com.hibernateRelationship.doa.PhotoRepository;
import com.hibernateRelationship.doa.SpecimenRepository;
import com.hibernateRelationship.doa.StudentRepository;
import com.hibernateRelationship.doa.UserRepository;
import com.hibernateRelationship.models.Cars;
import com.hibernateRelationship.models.College;
import com.hibernateRelationship.models.Departments;
import com.hibernateRelationship.models.Employees;
import com.hibernateRelationship.models.Laptops;
import com.hibernateRelationship.models.Owners;
import com.hibernateRelationship.models.Photos;
import com.hibernateRelationship.models.Specimen;
import com.hibernateRelationship.models.Students;
import com.hibernateRelationship.models.Users;

@RestController
@CrossOrigin(origins="*") //set globally cross origin, so all request can access api's
public class HomeController {
	
	@Autowired
	SpecimenRepository specimenRepository;
	
	@Autowired
	List<Specimen> specimenList;
	
	@Autowired
	PhotoRepository photoRepository;
	
	@Autowired
	List<Photos> photoList;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	List<Students> studentList;
	
	@Autowired
	CollegeRepository collegeRepository;

	@Autowired
	List<College> collegeList;
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	List<Departments> departmentList;
	
	@Autowired
	Departments department;
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	List<Employees> employeeList;
	
	@Autowired
	Employees employee;
	
	@Autowired
	OwnerRepository ownerRepository;

	@Autowired
	List<Owners> ownerList;
	
	@Autowired
	Owners owner;

	@Autowired
	CarRepository carRepository;

	@Autowired
	List<Cars> carList;
	
	@Autowired
	Users user;
	
	@Autowired
	UserRepository userRepository;

	@Autowired
	List<Users> userList;
	
	@Autowired
	Laptops laptop;
	
	@Autowired
	LaptopRepository laptopRepository;

	@Autowired
	List<Laptops> laptopList;
	
//	@CrossOrigin(origins="*")
	@GetMapping("/getSpecimenData")
	public List<Specimen> getSpecimenData()
	{
		System.out.println("/getSpecimenData request...");
		specimenList=(List<Specimen>)specimenRepository.findAll();
		System.out.println(specimenList);
		return specimenList;
	}
	
//	@CrossOrigin(origins="*")
	@GetMapping("/getPhotosData")
	public List<Photos> getPhotosData()
	{
		System.out.println("/getPhotosData request...");
		photoList=(List<Photos>)photoRepository.findAll();
		System.out.println(photoList);
		return photoList;
	}
	
//	@CrossOrigin(origins="*")
	@GetMapping("/getStudentData")
	public List<Students> getStudentData()
	{
		System.out.println("/getStudentData request...");
		studentList=(List<Students>)studentRepository.findAll();
		System.out.println(studentList);
		return studentList;
	}
	
//	@CrossOrigin(origins="*")
	@GetMapping("/getCollegeData")
	public List<College> getCollegeData()
	{
		System.out.println("/getCollegeData request...");
		collegeList=(List<College>)collegeRepository.findAll();
		System.out.println(collegeList);
		return collegeList;
	}
	
//	@CrossOrigin(origins="*")
	@GetMapping("/getDeparmentData")
	public List<Departments> getDeparmentData()
	{
		System.out.println("/getDeparmentData request...");
		departmentList=(List<Departments>)departmentRepository.findAll();
		System.out.println(departmentList);
		return departmentList;
	}
	
//	@CrossOrigin(origins="*")
	@GetMapping("/getEmployeeData")
	public List<Employees> getEmployeeData()
	{
		System.out.println("/getEmployeeData request...");
		employeeList=(List<Employees>)employeeRepository.findAll();
		System.out.println(employeeList);
		return employeeList;
	}
	
//	@CrossOrigin(origins="*")
	@PostMapping("/saveEmployeeData")
	public Employees saveEmployeeData(@RequestBody Employees employeeObj)
	{
		System.out.println("/saveEmployeeData request..."+employeeObj);
		employee=(Employees)employeeRepository.save(employeeObj);
		System.out.println(employee);
		return employee;
	}
	
//	@CrossOrigin(origins="*")
	@PostMapping("/saveDeparmentData")
	public Departments saveDeparmentData(@RequestBody Departments departmentObj)
	{
		System.out.println("/saveDeparmentData request..."+departmentObj);
		department=(Departments)departmentRepository.save(departmentObj);
		System.out.println(department);
		return department;
	}
	
//	@CrossOrigin(origins="*")
	@PostMapping("/getEmployeeDataByDepartmentId")
	public List<Employees> getEmployeeDataByDepartmentId(@RequestBody Employees employeeObj)
	{
		System.out.println("/getEmployeeDataByDepartmentId request..."+employeeObj);
		System.out.println("departmentId : "+employeeObj.getDepartment().getDepartmentId());
		employeeList=(List<Employees>)employeeRepository.findEmployeeByDepartmentId(employeeObj.getDepartment().getDepartmentId());
		System.out.println(employeeList);
		return employeeList;
	}
	
//	@CrossOrigin(origins="*")
	@PostMapping("/getEmployeeDataByEmployeeName")
	public List<Employees> getEmployeeDataByEmployeeName(@RequestBody Employees employeeObj)
	{
		System.out.println("/getEmployeeDataByEmployeeName request..."+employeeObj);
		System.out.println("departmentId : "+employeeObj.getEmployeeName());
		employeeList=(List<Employees>)employeeRepository.findEmployeeByEmployeeName(employeeObj.getEmployeeName());
		System.out.println(employeeList);
		return employeeList;
	}
	
//	@CrossOrigin(origins="*")
	@GetMapping("/getOwnerData")
	public List<Owners> getOwnerData()
	{
		System.out.println("/getOwnerData request...");
		ownerList=(List<Owners>)ownerRepository.findAll();
		System.out.println(ownerList);
		return ownerList;
	}
	
//	@CrossOrigin(origins="*")
	@PostMapping("/saveOwnerData")
	public Owners saveOwnerData(@RequestBody Owners ownerObj)
	{
		System.out.println("/getOwnerData request..."+ownerObj);
		owner=(Owners)ownerRepository.save(ownerObj);
		System.out.println(owner);
		return owner;
	}
	
//	@CrossOrigin(origins="*")
	@GetMapping("/getCarData")
	public List<Cars> getCarData()
	{
		System.out.println("/getCarData request...");
		carList=(List<Cars>)carRepository.findAll();
		System.out.println(carList);
		return carList;
	}
	
//	@CrossOrigin(origins="*")
	@GetMapping("/getLaptopData")
	public List<Laptops> getLaptopData()
	{
		System.out.println("/getLaptopData request...");
		laptopList=(List<Laptops>)laptopRepository.findAll();
		System.out.println(laptopList);
		return laptopList;
	}
	
//	@CrossOrigin(origins="*")
	@GetMapping("/getUserData")
	public List<Users> getUserData()
	{
		System.out.println("/getUserData request...");
		userList=(List<Users>)userRepository.findAll();
		System.out.println(userList);
		return userList;
	}
	
//	@CrossOrigin(origins="*")
	@PostMapping("/getUserDataByLaptopId")
	public List<Users> getUserDataByLaptopId(@RequestBody Users userObj)
	{
		System.out.println("/getUserData request...\n"+userObj+"\n"+userObj.getLaptop()+"\n"+userObj.getLaptop().get(0).getLaptopId());
		userList=(List<Users>)userRepository.findUserByLaptop(userObj.getLaptop().get(0));
		System.out.println(userList);
		return userList;
	}
	
//	@CrossOrigin(origins="*")
//	@CrossOrigin(origins="http://localhost:4200") //for specific post 
	@PostMapping("/getLaptopDataByLaptopName")
	public List<Laptops> getLaptopDataByLaptopName(@RequestBody Laptops laptopObj)
	{
		System.out.println("/getUserDataByLaptopName request...\n"+laptopObj+"\n"+laptopObj.getLaptopName());
		laptopList=(List<Laptops>)laptopRepository.findLaptopByLaptopName(laptopObj.getLaptopName());
		System.out.println(laptopList);
		return laptopList;
	}
}
