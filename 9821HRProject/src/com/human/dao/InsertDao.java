package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.human.dto.CountriesDto;
import com.human.dto.DepartmentsDto;
import com.human.dto.EmployeesDto;
import com.human.dto.JobsDto;
import com.human.dto.LocationsDto;
import com.human.dto.RegionsDto;
import com.human.util.DBConn;
import com.human.util.Request;
import com.human.util.Response;

public class InsertDao {
	Scanner sc = new Scanner(System.in);

	// employees �����߰�
	public void insert_employees() {
		Request request = new Request();
		Response response = new Response();

		System.out.println("������ �߰��մϴ�.");
		System.out.println("�߰��� employeeId �Է�");
		int employee_id = DBConn.inputInt();

		System.out.println("first_name �Է� ");
		String first_name = DBConn.inputString();

		System.out.println("last_name �Է� ");
		String last_name = DBConn.inputString();

		System.out.println("email �Է� ");
		String email = DBConn.inputString();

		System.out.println("phone_number�� �Է� ");
		String phone_number = DBConn.inputString();

		System.out.println("hire_date �Է� ");
		Date hire_date = DBConn.inputDate();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dtype = formatter.format(hire_date);

		search_jobs_id();
		System.out.println("job_id �Է� ");
		String job_id = DBConn.inputString();
		
		//String returnJOB = inputJobID(job_id);

		System.out.println("salary �Է� ");
		int salary = DBConn.inputInt();

		System.out.println("commission_pct�� �Է� ");
		double commission_pct = DBConn.inputDouble();

		System.out.println("managerId �Է� ");
		int manager_id = DBConn.inputInt();

		search_dept_id();
		System.out.println("departmentId �Է� ");
		int department_id = DBConn.inputInt();

		EmployeesDto dto = new EmployeesDto();
		dto.setemployee_id(employee_id);
		dto.setfirst_name(first_name);
		dto.setlast_name(last_name);
		dto.setEmail(email);
		dto.setphone_number(phone_number);
		dto.sethire_date(dtype);
		dto.setjob_id(job_id);
		dto.setsalary(salary);
		dto.setcommission_pct(commission_pct);
		dto.setmanager_id(manager_id);
		dto.setdepartment_id(department_id);

		request.setEmployeesDto(dto);
		response.getArrEmployeesDto();

		int i = insert_ex(dto.getemployee_id(), dto.getfirst_name(), dto.getlast_name(), dto.getEmail(),
				dto.getphone_number(), dto.gethire_date(), dto.getjob_id(), dto.getsalary(), dto.getcommission_pct(),
				dto.getmanager_id(), dto.getdepartment_id());
		response.setResultValue(i);

		System.out.println(request.getEmployeesDto().getemployee_id() + "�� ������ �߰��Ǿ����ϴ�.");
	}

	public String inputJobID(String job_id) {
		String returnValue = null;
		boolean flag = true;
		while (flag) {
			switch (job_id) {
			case "1":
				returnValue = "IT_PROG";
				flag = false;
				break;
			case "2":
				returnValue = "ST_MAN";
				flag = false;
				break;
			case "3":
				returnValue = "ST_CLERK";
				flag = false;
				break;
			case "4":
				returnValue = "SA_MAN";
				flag = false;
				break;
			case "5":
				returnValue = "SA_REP";
				flag = false;
				break;
			case "6":
				returnValue = "AD_ASST";
				flag = false;
				break;
			case "7":
				returnValue = "MK_MAN";
				flag = false;
				break;
			case "8":
				returnValue = "MK_REP";
				flag = false;
				break;
			case "9":
				returnValue = "MK_REP";
				flag = false;
				break;
			case "10":
				returnValue = "AC_MGR";
				flag = false;
				break;
			case "11":
				returnValue = "AC_ACCOUNT";
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
		return returnValue;
	}

	public int insert_ex(int employee_id, String first_name, String last_name, String email, String phone_number,
			String hire_date, String job_id, int salary, double commission_pct, int manager_id, int department_id) {

		int returnValue = 0;
		DBConn.getInstance();
		String sql = "INSERT INTO employees " + "VALUES (%d,'%s','%s','%s','%s'," + "to_date('%s','yyyy-mm-dd'),"
				+ "'%s',%d,%f,%d,%d)";

		sql = String.format(sql, employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary,
				commission_pct, manager_id, department_id);
		System.out.println(sql);
		returnValue = DBConn.StatementUpdate(sql);
		DBConn.dbClose();
		System.out.println("�Ϸ�");
		return returnValue;
	}

	// locations ���� �߰�
	public void insert_locations() {
		Request request = new Request();
		Response response = new Response();

		System.out.println("location�� �߰��մϴ�.");
		System.out.println("�߰��� location_id �Է�");
		int location_id = DBConn.inputInt();

		System.out.println("street_address �Է� ");
		String street_address = DBConn.inputString();

		System.out.println("postal_code �Է� ");
		String postal_code = DBConn.inputString();

		System.out.println("city �Է� ");
		String city = DBConn.inputString();

		System.out.println("state_province�� �Է� ");
		String state_province = DBConn.inputString();

		search_countries();
		System.out.println("country_id�� �Է�");
		String country_id = DBConn.inputString();

		LocationsDto lDto = new LocationsDto();
		lDto.setlocation_id(location_id);
		lDto.setstreet_address(street_address);
		lDto.setpostal_code(postal_code);
		lDto.setCity(city);
		lDto.setstate_province(state_province);
		lDto.setcountry_id(country_id);

		request.setLocationsDto(lDto);
		response.getArrLocationsDto();

		int i = insert_location(lDto.getlocation_id(), lDto.getstreet_address(), lDto.getpostal_code(), lDto.getCity(),
				lDto.getstate_province(), lDto.getcountry_id());
		response.setResultValue(i);

		System.out.println(request.getLocationsDto().getCity() + "������ �߰��Ǿ����ϴ�.");

	}

	public int insert_location(int location_id, String street_address, String postal_code, String city,
			String state_province, String country_id) {

		int returnValue = 0;
		DBConn.getInstance();
		String sql = "INSERT INTO LOCATIONS " + "VALUES (%d,'%s','%s','%s','%s','%s')";

		sql = String.format(sql, location_id, street_address, postal_code, city, state_province, country_id);
		System.out.println(sql);
		returnValue = DBConn.StatementUpdate(sql);
		DBConn.dbClose();
		System.out.println("�Ϸ�");
		return returnValue;
	}

	// regions ��� �߰�
	public void insert_regions() {
		Request request = new Request();
		Response response = new Response();

		System.out.println("region�� �߰��մϴ�.");
		System.out.println("region_id�� �Է��ϼ���");
		int region_id = DBConn.inputInt();
		System.out.println("region_name�� �Է��ϼ���");
		String region_name = DBConn.inputString();

		RegionsDto rDto = new RegionsDto();
		rDto.setregion_id(region_id);
		rDto.setregion_name(region_name);

		request.setRegionsDto(rDto);
		response.getArrRegionsDto();

		int i = insert_regions(rDto.getregion_id(), rDto.getregion_name());
		response.setResultValue(i);

		System.out.println(request.getRegionsDto().getregion_name() + "������ �߰��Ǿ����ϴ�.");
	}

	public int insert_regions(int region_id, String region_name) {

		int returnValue = 0;
		DBConn.getInstance();
		String sql = "INSERT INTO REGIONS " + "VALUES (%d,'%s')";
		sql = String.format(sql, region_id, region_name);
		System.out.println(sql);
		returnValue = DBConn.StatementUpdate(sql);
		DBConn.dbClose();
		System.out.println("�Ϸ�");

		return returnValue;
	}

	// countries ���� �߰�
	public void insert_countries() {
		Request request = new Request();
		Response response = new Response();

		System.out.println("country�� �߰��մϴ�.");
		System.out.println("country_id�� �Է��ϼ���");
		String country_id = DBConn.inputString();
		System.out.println("country_name�� �Է��ϼ���");
		String country_name = DBConn.inputString();
		search_regions();
		System.out.println("region_id�� �Է��ϼ���");
		int region_id = DBConn.inputInt();

		CountriesDto cDto = new CountriesDto();
		cDto.setCountry_id(country_id);
		cDto.setCountry_name(country_name);
		cDto.setRegion_id(region_id);

		request.setCountriesDto(cDto);
		response.getArrCountriesDto();

		int i = insert_countries(cDto.getCountry_id(), cDto.getCountry_name(), cDto.getRegion_id());
		response.setResultValue(i);

	}

	public int insert_countries(String country_id, String country_name, int region_id) {
		int returnValue = 0;
		DBConn.getInstance();
		String sql = "INSERT INTO COUNTRIES " + "VALUES ('%s','%s',%d)";
		sql = String.format(sql, country_id, country_name, region_id);
		System.out.println(sql);
		returnValue = DBConn.StatementUpdate(sql);
		DBConn.dbClose();
		System.out.println("�Ϸ�");

		return returnValue;
	}

	// jobs ���� �߰�
	public void insert_jobs() {
		Request request = new Request();
		Response response = new Response();
		
		System.out.println("job�� �߰��մϴ�.");
		System.out.println("job_Id�� �Է��ϼ���");
		String jobId = DBConn.inputString();
		System.out.println("job_Title�� �Է��ϼ���");
		String jobTitle = DBConn.inputString();
		System.out.println("min_Salary�� �Է��ϼ���");
		int minSalary = DBConn.inputInt();
		System.out.println("max_Salary�� �Է��ϼ���");
		int maxSalary = DBConn.inputInt();
		
		JobsDto jDto = new JobsDto();
		jDto.setJobId(jobId);
		jDto.setJobTitle(jobTitle);
		jDto.setMinSalary(minSalary);
		jDto.setMaxSalary(maxSalary);

		request.setJobsDto(jDto);
		response.getArrJobsDto();
		
		int i = insert_jobs(jDto.getJobId(), jDto.getJobTitle(), jDto.getMinSalary(), jDto.getMaxSalary());
		response.setResultValue(i);

	}
	
	private int insert_jobs(String jobId, String jobTitle, int minSalary, int maxSalary) {
		int returnValue = 0;
		DBConn.getInstance();
		String sql = "INSERT INTO JOBS " + "VALUES ('%s','%s', %d, %d)";
		sql = String.format(sql, jobId, jobTitle, minSalary, maxSalary);
		System.out.println(sql);
		returnValue = DBConn.StatementUpdate(sql);
		DBConn.dbClose();
		System.out.println("�Ϸ�");

		return returnValue;
	}

	// department �μ� �߰�
	public void insert_department() {
		Request request = new Request();
		Response response = new Response();
		DepartmentsDto dto = new DepartmentsDto();
		
		System.out.println("department�� �߰��մϴ�.");
		System.out.println("department_id�� �Է��ϼ���");
		dto.setDepId(DBConn.inputInt());
		System.out.println("department_name�� �Է��ϼ���");
		dto.setDepName(DBConn.inputString());
		System.out.println("manager_ID�� �Է��ϼ���");
		dto.setDepManager(DBConn.inputInt());
		
		search_location_id();
		System.out.println("location_ID�� �Է��ϼ���");	
		dto.setDepLocation(DBConn.inputInt());
		
		int i = insert_department(dto);
		response.setResultValue(i);

	}
	private int insert_department(DepartmentsDto dto) {
		int returnValue = 0;
		DBConn.getInstance();
		String sql = "INSERT INTO departments " + "VALUES (%d,'%s',%d,%d)";
		sql = String.format(sql, dto.getDepId(), dto.getDepName(), dto.getDepManager(), dto.getDepLocation());
		System.out.println(sql);
		returnValue = DBConn.StatementUpdate(sql);
		DBConn.dbClose();
		System.out.println("�Ϸ�");

		return returnValue;
	}
	
	// <RegionsDto> ���
	public ArrayList<RegionsDto> search_regions() {
		ArrayList<RegionsDto> dtos = new ArrayList<RegionsDto>();
		DBConn.getInstance();
		//String sql = "select * from regions";
		String sql = "select * from regions";
		ResultSet rs = DBConn.StatementQuery(sql);
		try {
			while (rs.next()) {
				RegionsDto dto = new RegionsDto();
				dto.setregion_id(rs.getInt("region_id"));
				dto.setregion_name(rs.getString("region_name"));
				dtos.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (RegionsDto dto : dtos) {
			System.out.println(dto);
		}

		return dtos;
	}

	// <CountriesDto> ���
	public ArrayList<CountriesDto> search_countries() {
		ArrayList<CountriesDto> dtos = new ArrayList<CountriesDto>();
		DBConn.getInstance();
		String sql = "select * from countries";
		ResultSet rs = DBConn.StatementQuery(sql);
		try {
			while (rs.next()) {
				CountriesDto dto = new CountriesDto();
				dto.setCountry_id(rs.getString("country_id"));
				dto.setCountry_name(rs.getString("country_name"));
				dto.setRegion_id(rs.getInt("region_id"));
				dtos.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (CountriesDto dto : dtos) {
			System.out.println(dto);
		}

		return dtos;
	}

	// <EmployeesDto> ���
	public ArrayList<EmployeesDto> search_employees() {
		ArrayList<EmployeesDto> dtos = new ArrayList<EmployeesDto>();
		DBConn.getInstance();
		String sql = "select * from employees";
		ResultSet rs = DBConn.StatementQuery(sql);
		try {
			while (rs.next()) {
				EmployeesDto dto = new EmployeesDto();
				dto.setemployee_id(rs.getInt("employee_id"));
				dto.setfirst_name(rs.getString("first_name"));
				dto.setlast_name(rs.getString("last_name"));
				dto.setEmail(rs.getString("email"));
				dto.setphone_number(rs.getString("phone_number"));
				dto.sethire_date(rs.getString("hire_date"));
				dto.setjob_id(rs.getString("job_id"));
				dto.setsalary(rs.getInt("salary"));
				dto.setcommission_pct(rs.getDouble("commmission_pct"));
				dto.setmanager_id(rs.getInt("manager_id"));
				dto.setdepartment_id(rs.getInt("department_id"));
				dtos.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (EmployeesDto dto : dtos) {
			System.out.println(dto);
		}

		return dtos;
	}
	
	// <JobsDto> ���
	public ArrayList<JobsDto> search_jobs() {
		ArrayList<JobsDto> dtos = new ArrayList<JobsDto>();
		DBConn.getInstance();
		String sql = "select * from jobs";
		ResultSet rs = DBConn.StatementQuery(sql);
		try {
			while (rs.next()) {
				JobsDto dto = new JobsDto();	
				dto.setJobId(rs.getString("job_Id"));
				dto.setJobTitle(rs.getString("job_Title"));
				dto.setMinSalary(rs.getInt("min_Salary"));
				dto.setMaxSalary(rs.getInt("max_Salary"));
				dtos.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (JobsDto dto : dtos) {
			System.out.println(dto);
		}

		return dtos;
	}
	
	// <JobsDto>-jobsID ���
		public ArrayList<JobsDto> search_jobs_id() {
			ArrayList<JobsDto> dtos = new ArrayList<JobsDto>();
			DBConn.getInstance();
			String sql = "select * from jobs";
			ResultSet rs = DBConn.StatementQuery(sql);
			try {
				while (rs.next()) {
					JobsDto dto = new JobsDto();	
					dto.setJobId(rs.getString("job_Id"));
					dto.setJobTitle(rs.getString("job_Title"));
					dto.setMinSalary(rs.getInt("min_Salary"));
					dto.setMaxSalary(rs.getInt("max_Salary"));
					dtos.add(dto);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			for (JobsDto dto : dtos) {
				dto.flag = true;
				System.out.println(dto);
			}

			return dtos;
		}

	// <LocationsDto>-location_id ���
	public ArrayList<LocationsDto> search_location_id() {
		ArrayList<LocationsDto> dtos = new ArrayList<LocationsDto>();
		DBConn.getInstance();
		String sql = "select * from locations";
		ResultSet rs = DBConn.StatementQuery(sql);
		try {
			while (rs.next()) {
				LocationsDto dto = new LocationsDto();
				dto.setlocation_id(rs.getInt("location_Id"));
				dto.setstreet_address(rs.getString("street_address"));
				dto.setpostal_code(rs.getString("postal_code"));
				dto.setCity(rs.getString("city"));
				dto.setstate_province(rs.getString("state_province"));
				dto.setcountry_id(rs.getString("country_id"));
				dtos.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for (LocationsDto dto : dtos) {
			dto.flag = true;
			System.out.println(dto);
		}

		return dtos;
	}
	
	// <DepartmentsDto>-dept_id ���
		public ArrayList<DepartmentsDto> search_dept_id() {
			ArrayList<DepartmentsDto> dtos = new ArrayList<DepartmentsDto>();
			DBConn.getInstance();
			String sql = "select * from departments";
			ResultSet rs = DBConn.StatementQuery(sql);
			try {
				while (rs.next()) {
					DepartmentsDto dto = new DepartmentsDto();
					dto.setDepId(rs.getInt("department_Id"));
					dto.setDepName(rs.getString("department_Name"));
					dto.setDepManager(rs.getInt("Manager_Id"));
					dto.setDepLocation(rs.getInt("Location_ID"));
					dtos.add(dto);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			for (DepartmentsDto dto : dtos) {
				dto.flag = true;
				System.out.println(dto);
			}

			return dtos;
		}
		
		
	
}