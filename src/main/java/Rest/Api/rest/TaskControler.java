package Rest.Api.rest;
import Rest.Api.model.TaskRepository;
import Rest.Api.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.scheduling.config.Task;

import java.util.List;

@RepositoryRestController
final class TaskControler {

    private static final Logger logger= LoggerFactory.getLogger(TaskControler.class);
    protected  final TaskRepository repository;

    TaskControler(final TaskRepository repositry){
        this.repository = repositry;
    }

    List<Task> readAllTasks(){
        logger.warn("all the task");
        return repository.findAll();
    }
}