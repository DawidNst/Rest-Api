package Rest.Api.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.scheduling.TaskScheduler;

@RepositoryRestResource
interface TaskRepository extends JpaRepository<TaskRepository, Integer> {


}
