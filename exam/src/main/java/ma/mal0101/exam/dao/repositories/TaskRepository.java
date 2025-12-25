package ma.mal0101.exam.dao.repositories;

import ma.mal0101.exam.dao.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
