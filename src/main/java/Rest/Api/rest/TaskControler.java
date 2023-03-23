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

import java.util.List;

@RepositoryRestController
class TaskControler {

    private static final Logger logger= LoggerFactory.getLogger(TaskControler.class);
    protected  final TaskRepository repositry;

    TaskControler(final TaskRepository repositry){
        this.repository = repositry;
    }

    List<Task> readAllTasks(){
    logger.warn("all the task");
    return repositry.;
    }
}
