package edu.eci.TaskPlanner.service.contract;
import edu.eci.TaskPlanner.model.*;
import java.util.*;

public interface UserService {
    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
}