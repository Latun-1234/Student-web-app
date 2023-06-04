package in.Ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Ashokit.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {

}
