package Rest.Api.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.config.Task;

import java.util.List;

@RepositoryRestResource(path = "/tasks")

 public interface TaskRepository extends JpaRepository<Task, Integer> {

    @Override
    @RestResource(exported = false)
    void deleteById(Integer integer);

    @Override
    @RestResource(exported = false)
    void delete(Task task);

    @RestResource(path="done" , rel="done")
    List<Task> findByDone (@Param("state")boolean done);

}
