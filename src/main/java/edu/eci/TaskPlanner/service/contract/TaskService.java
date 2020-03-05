package edu.eci.TaskPlanner.service.contract;
import edu.eci.TaskPlanner.model.*;
import java.util.*;

public interface TaskService {
    List<Task> geAll();
    
    Task getById(String id);
    
    List<Task> getByUserId(String userId);
    
    Task assignTaskToUser(String taskId, User user);
    
    void remove(String taskId);
    
    Task update(Task task);
}