

import java.util.List;

public class Staff {

	/**
	 * 
	 */
	private List<Integer> dateOfJoin;
	/**
	 * 
	 */
	public String department;
	/**
	 * 
	 */
	public Integer employeeID;
	/**
	 * Getter of dateOfJoin
	 */
	public List<Integer> getDateOfJoin() {
	 	 return dateOfJoin; 
	}
	/**
	 * Setter of dateOfJoin
	 */
	public void setDateOfJoin(List<Integer> dateOfJoin) { 
		 this.dateOfJoin = dateOfJoin; 
	}
	/**
	 * Getter of department
	 */
	public String getDepartment() {
	 	 return department; 
	}
	/**
	 * Setter of department
	 */
	public void setDepartment(String department) { 
		 this.department = department; 
	}
	/**
	 * Getter of employeeID
	 */
	public Integer getEmployeeID() {
	 	 return employeeID; 
	}
	/**
	 * Setter of employeeID
	 */
	public void setEmployeeID(Integer employeeID) { 
		 this.employeeID = employeeID; 
	}
	/**
	 * 
	 * @param employeeID 
	 * @return 
	 */
	private String CheckSchedule(Integer employeeID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param employeeID 
	 * @return 
	 */
	private String CheckSchedule(String employeeID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param employeeID 
	 * @param requestedDate 
	 * @return 
	 */
	public Boolean requestLeave(String employeeID, EDate requestedDate) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param employeeID 
	 * @param DOB 
	 * @return 
	 */
	private String accessPayStub(String employeeID, EDate DOB) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param DOB 
	 * @param employeeID 
	 * @return 
	 */
	private String accessPayStub(EDate DOB, String employeeID) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param requestedDate 
	 * @param employeeID 
	 * @return 
	 */
	public Boolean requestLeave(EDate requestedDate, String employeeID) { 
		// TODO Auto-generated method
		return null;
	 } 

}