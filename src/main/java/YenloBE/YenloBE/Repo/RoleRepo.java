package YenloBE.YenloBE.Repo;

import YenloBE.YenloBE.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Integer> {
    Optional<Role> findById(Integer id);
}
