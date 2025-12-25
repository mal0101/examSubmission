package ma.mal0101.exam.service;

import ma.mal0101.exam.dao.entities.Task;
import ma.mal0101.exam.dao.entities.User;
import ma.mal0101.exam.dao.repositories.TaskRepository;
import ma.mal0101.exam.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskCreationServiceImpl implements ITaskCreationService{
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public Task createTask(String taskTitle, String username) {
        User user = userRepository.findByUsername(username);
        Task task = new Task();
        task.setTitle(taskTitle);
        task.setUser(user);
       return taskRepository.save(task);
    }
}
