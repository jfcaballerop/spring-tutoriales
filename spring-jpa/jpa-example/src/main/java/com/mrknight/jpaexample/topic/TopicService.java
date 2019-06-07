package com.mrknight.jpaexample.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepo;

    public List<Topic> getAllTopics() {

        List<Topic> topics = new ArrayList<>();
        topicRepo.findAll().forEach(topics::add);

        return topics;
    }

    public void addTopic(Topic t) {
        topicRepo.save(t);
    }

    public Optional<Topic> getTopic(String id) {
        return topicRepo.findById(id);

    }

    public void updateTopic(Topic t, String id) {
        topicRepo.save(t);
    }

    public void deleteTopic(String id) {
        topicRepo.deleteById(id);

    }

}