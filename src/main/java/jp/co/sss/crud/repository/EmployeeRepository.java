package jp.co.sss.crud.repository;

import java.util.List;

import jp.co.sss.crud.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * 社員テーブルのアクセスRepository.
 * 
 * @author n.tanimoto
 */
@Component
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	/**
	 * 社員テーブルを社員名の部分一致で検索する.
	 * 
	 * @param keyword
	 *            社員名
	 * @return 社員テーブル一覧
	 */
	List<Employee> findByEmpNameLikeOrderByEmpId(String empName);

	/**
	 * 社員テーブルを部署IDで検索する.
	 * 
	 * @param deptId
	 *            部署ID
	 * @return 社員テーブル一覧
	 */
	List<Employee> findByDeptIdOrderByEmpId(Long deptId);

}
