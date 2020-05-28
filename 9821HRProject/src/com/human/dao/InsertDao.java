package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.human.dto.CountriesDto;
import com.human.dto.EmployeesDto;
import com.human.dto.LocationsDto;
import com.human.dto.RegionsDto;
import com.human.util.DBConn;
import com.human.util.Request;
import com.human.util.Response;

public class InsertDao {
	Scanner sc = new Scanner(System.in);

	// employees 직원추가
	public void insert_employees() {
		Request request = new Request();
		Response response = new Response();

		System.out.println("직원을 추가합니다.");
		System.out.println("추가할 employeeId 입력");
		int employee_id = DBConn.inputInt();

		System.out.println("first_name 입력 ");
		String first_name = DBConn.inputString();

		System.out.println("last_name 입력 ");
		String last_name = DBConn.inputString();

		System.out.println("email 입력 ");
		String email = DBConn.inputString();

		System.out.println("phone_number를 입력 ");
		String phone_number = DBConn.inputString();

		System.out.println("hire_date 입력 ");
		Date hire_date = DBConn.inputDate();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dtype = formatter.format(hire_date);

		System.out.println("job_id 입력 ");
		System.out.println(
				"1.IT_PROG, 2.ST_MAN, 3.ST_CLERK, 4.SA_MAN, 5.SA_REP, 6.AD_ASST, 7.MK_MAN, 8.MK_REP, 9.MK_REP, 10.AC_MGR, 11.AC_ACCOUNT");
		String job_id = sc.nextLine();
		String returnJOB = inputJobID(job_id);

		System.out.println("salary 입력 ");
		int salary = DBConn.inputInt();

		System.out.println("commission_pct를 입력 ");
		double commission_pct = DBConn.inputDouble();

		System.out.println("managerId 입력 ");
		int manager_id = DBConn.inputInt();

		System.out.println("departmentId 입력 ");
		int department_id = DBConn.inputInt();

		EmployeesDto dto = new EmployeesDto();
		dto.setemployee_id(employee_id);
		dto.setfirst_name(first_name);
		dto.setlast_name(last_name);
		dto.setEmail(email);
		dto.setphone_number(phone_number);
		dto.sethire_date(dtype);
		dto.setjob_id(returnJOB);
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

		System.out.println(request.getEmployeesDto().getemployee_id() + "번 직원이 추가되었습니다.");
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
				System.out.println("잘못된 입력입니다.");
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
		System.out.println("완료");
		return returnValue;
	}

	// locations 지점 추가
	public void insert_locations() {
		Request request = new Request();
		Response response = new Response();

		System.out.println("location을 추가합니다.");
		System.out.println("추가할 location_id 입력");
		int location_id = DBConn.inputInt();

		System.out.println("street_address 입력 ");
		String street_address = DBConn.inputString();

		System.out.println("postal_code 입력 ");
		String postal_code = DBConn.inputString();

		System.out.println("city 입력 ");
		String city = DBConn.inputString();

		System.out.println("state_province를 입력 ");
		String state_province = DBConn.inputString();

		search_countries();
		System.out.println("country_id를 입력");
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

		System.out.println(request.getLocationsDto().getCity() + "지역이 추가되었습니다.");

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
		System.out.println("완료");
		return returnValue;
	}

	// regions 대륙 추가
	public void insert_regions() {
		Request request = new Request();
		Response response = new Response();

		System.out.println("region을 추가합니다.");
		System.out.println("region_id를 입력하세요");
		int region_id = DBConn.inputInt();
		System.out.println("region_name을 입력하세요");
		String region_name = DBConn.inputString();

		RegionsDto rDto = new RegionsDto();
		rDto.setregion_id(region_id);
		rDto.setregion_name(region_name);

		request.setRegionsDto(rDto);
		response.getArrRegionsDto();

		int i = insert_regions(rDto.getregion_id(), rDto.getregion_name());
		response.setResultValue(i);

		System.out.println(request.getRegionsDto().getregion_name() + "지역이 추가되었습니다.");
	}

	public int insert_regions(int region_id, String region_name) {

		int returnValue = 0;
		DBConn.getInstance();
		String sql = "INSERT INTO REGIONS " + "VALUES (%d,'%s')";
		sql = String.format(sql, region_id, region_name);
		System.out.println(sql);
		returnValue = DBConn.StatementUpdate(sql);
		DBConn.dbClose();
		System.out.println("완료");

		return returnValue;
	}

	// countries 국가 추가
	public void insert_countries() {
		Request request = new Request();
		Response response = new Response();

		System.out.println("country를 추가합니다.");
		System.out.println("country_id를 입력하세요");
		String country_id = DBConn.inputString();
		System.out.println("country_name을 입력하세요");
		String country_name = DBConn.inputString();
		search_regions();
		System.out.println("region_id를 입력하세요");
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
		System.out.println("완료");

		return returnValue;
	}


	// <RegionsDto> 출력
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

	// <CountriesDto> 출력
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

	// <EmployeesDto> 출력
	public ArrayList<EmployeesDto> search_employees() {
		ArrayList<EmployeesDto> dtos = new ArrayList<EmployeesDto>();
		DBConn.getInstance();
		String sql = "select * from employees";
		ResultSet rs = DBConn.StatementQuery(sql);
		try {
			while (rs.next()) {
				EmployeesDto dto = new EmployeesDto();
				dto.setjob_id(rs.getString("job_id"));
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

}
