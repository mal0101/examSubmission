package ma.mal0101.exam.service;


import ma.mal0101.exam.dao.entities.Task;

public interface ITaskCreationService {
    Task createTask(String taskTitle, String username);
}
