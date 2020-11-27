package ons.group8.repositories;

import ons.group8.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJPA extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    @Query(value = "INSERT INTO user_role(userId, roleId) VALUES(:userId, :roleId)", nativeQuery = true)
    void saveUserRole(@Param("userId") Long userId,@Param("roleId") Integer roleId);
}
