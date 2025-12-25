package ma.mal0101.exam.web;

import ma.mal0101.exam.service.ITaskCreationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("tasks")
public class TaskController {
    @Autowired
    ITaskCreationService taskCreationService;
    @PostMapping("/create")
    public String createTask(@RequestParam("title") String title,
                             @RequestParam("username") String username) {
        taskCreationService.createTask(title, username);
        return "redirect:/task/success";
    }
    @GetMapping("/success")
    public String showSuccessPage() {
        return "redirect:/task/success";
    }
}
