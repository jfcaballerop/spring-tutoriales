package com.mrknight.jpaexample.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicsvc;

    @GetMapping("topics")
    public List<Topic> getAllTopics() {
        return topicsvc.getAllTopics();
    }

    @PostMapping("topics")
    public void addTopics(@RequestBody Topic topic) {
        topicsvc.addTopic(topic);

    }

    @GetMapping("topics/{id}")
    public Optional<Topic> getTopic(@PathVariable("id") String id) {
        return topicsvc.getTopic(id);

    }

    @PutMapping("topics/{id}")
    public void updateTopic(@PathVariable("id") String id, @RequestBody Topic t) {
        topicsvc.updateTopic(t, id);
    }

    @DeleteMapping("topics/{id}")
    public void delTopic(@PathVariable("id") String id) {
        topicsvc.deleteTopic(id);
    }
}