package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.Models.Topic;

import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicServices {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
        new Topic("htl","non"),
        new Topic("omar","azzzougagh")
    ));
    public List<Topic> getAlltopics(){
        return topics;
    }
    
    public Topic getTopic(String name){
        return topics.stream().filter(t -> t.getName().equals(name)).findFirst().get();
    }
    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void UpdateTopic(String name, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getName().equals(name)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void DeleteTopic(String name) {
        topics.removeIf(t -> t.getName().equals(name));
    }

}
