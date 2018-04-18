package jp.co.sss.crud.repository;

import jp.co.sss.crud.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * 部署テーブルのアクセスRepository.
 * 
 * @author n.tanimoto
 */
@Component
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
