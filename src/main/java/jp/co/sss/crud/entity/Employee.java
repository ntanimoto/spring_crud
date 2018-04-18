package jp.co.sss.crud.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 社員テーブルのBean.
 * 
 * @author n.tanimoto
 */
@Entity
@Table(name = "employee")
public class Employee {

	/**
	 * デフォルトコンストラクタ.
	 */
	public Employee() {

	}

	/**
	 * コンストラクタ(初期化有).
	 * 
	 * @param empId
	 *            社員ID
	 * @param empPass
	 *            パスワード
	 * @param empName
	 *            社員名
	 * @param gender
	 *            性別
	 * @param address
	 *            住所
	 * @param birthday
	 *            生年月日
	 * @param authority
	 *            権限
	 * @param deptId
	 *            部署ID
	 */
	public Employee(Long empId, String empPass, String empName, Long gender,
			String address, Timestamp birthday, Long authority, Long deptId) {
		this.empId = empId;
		this.empPass = empPass;
		this.empName = empName;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
		this.authority = authority;
		this.deptId = deptId;
	}

	/** 社員ID. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_emp_gen_gen")
	@SequenceGenerator(name = "seq_emp_gen", sequenceName = "seq_emp", allocationSize = 1)
	private Long empId;

	/** パスワード. */
	@Column
	private String empPass;

	/** 社員名. */
	@Column
	private String empName;

	/** 性別. */
	@Column
	private Long gender;

	/** 住所. */
	@Column
	private String address;

	/** 生年月日. */
	@Column
	private Timestamp birthday;

	/** 権限. */
	@Column
	private Long authority;

	/** 部署ID. */
	@Column
	private Long deptId;

	/** 部署テーブルとの結合定義 */
	@ManyToOne
	@JoinColumn(name = "dept_id", referencedColumnName = "deptId")
	private Department department;

	/**
	 * 社員IDを取得する.
	 * 
	 * @return 社員ID
	 */
	public Long getEmpId() {
		return empId;
	}

	/**
	 * 社員IDを設定する.
	 * 
	 * @param empId
	 *            社員ID
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	/**
	 * パスワードを取得する.
	 * 
	 * @return パスワード
	 */
	public String getEmpPass() {
		return empPass;
	}

	/**
	 * パスワードを設定する.
	 * 
	 * @param empPass
	 *            パスワード
	 */
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	/**
	 * 社員名を取得する.
	 * 
	 * @return 社員名
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * 社員名を設定する.
	 * 
	 * @param empName
	 *            社員名
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * 性別を取得する.
	 * 
	 * @return 性別
	 */
	public Long getGender() {
		return gender;
	}

	/**
	 * 性別を設定する.
	 * 
	 * @param gender
	 *            性別
	 */
	public void setGender(Long gender) {
		this.gender = gender;
	}

	/**
	 * 住所を取得する.
	 * 
	 * @return 住所
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 住所を設定する.
	 * 
	 * @param address
	 *            住所
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 生年月日を取得する.
	 * 
	 * @return 生年月日
	 */
	public Timestamp getBirthday() {
		return birthday;
	}

	/**
	 * 生年月日を設定する.
	 * 
	 * @param birthday
	 *            生年月日
	 */
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	/**
	 * 権限を取得する.
	 * 
	 * @return 権限
	 */
	public Long getAuthority() {
		return authority;
	}

	/**
	 * 権限を設定する.
	 * 
	 * @param authority
	 *            権限
	 */
	public void setAuthority(Long authority) {
		this.authority = authority;
	}

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
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empPass=" + empPass
				+ ", empName=" + empName + ", gender=" + gender + ", address="
				+ address + ", birthday=" + birthday + ", authority="
				+ authority + ", deptId=" + deptId + ", department="
				+ department + "]";
	}

}
