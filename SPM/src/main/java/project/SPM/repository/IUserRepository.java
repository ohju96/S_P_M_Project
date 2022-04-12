package project.SPM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.SPM.Entity.UserEntity;
import project.SPM.dto.UserDTO;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {
   // UserEntity findByUserEmail(String userEmail);
}