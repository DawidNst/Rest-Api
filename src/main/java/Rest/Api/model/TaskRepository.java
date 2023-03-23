package Rest.Api.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.config.Task;

@RepositoryRestResource(path = "tasks")
interface TaskRepository extends JpaRepository<Task, Integer> {

    @Override
    void deleteById(Integer integer);

    @Override
    void delete(Task task);

}
