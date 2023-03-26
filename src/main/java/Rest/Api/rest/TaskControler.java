package Rest.Api.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;

@RepositoryRestController
class TaskControler {

    private static final Logger logger= LoggerFactory.getLogger(TaskControler.class);
    private final TaskRepository repository;

    TaskControler(final TaskRepository repositry){
        this.repository = repositry;
    }

    ResponseEntity<?> readAllTasks(){
    logger.warn("all the task");
    return ResponseEntity.ok(repository.);
    }
}
