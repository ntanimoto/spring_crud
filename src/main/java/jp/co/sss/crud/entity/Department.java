package jp.co.sss.crud.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	/** 部署ID. */
	@Id
	@GeneratedValue
	private Long deptId;

	/** 部署名. */
	@Column
	private String deptName;

	/** 社員テーブルとの結合定義. */
	@OneToMany(mappedBy = "department")
	private List<Employee> employeeList;

	/**
	 * 部署IDを取得する.
	 * 
	 * @return 部署ID
	 */
	public Long getDeptId() {
		return deptId;
	}

	/**
	 * 部署IDを設定する.
	 * 
	 * @param deptId
	 *            部署ID
	 */
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	/**
	 * 部署名を取得する.
	 * 
	 * @return 部署名
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * 部署名を設定する.
	 * 
	 * @param deptName
	 *            部署名
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * 
	 * @return the employeeList
	 */
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	/**
	 * @param employeeList
	 *            the employeeList to set
	 */
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName
				+ ", employeeList=" + employeeList + "]";
	}

}
