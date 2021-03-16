package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import com.example.demo.Models.Topic;

@RestController
public class HelloController {
    @Autowired
    private TopicServices topicServices;
    @RequestMapping("/hello")
    public List<Topic> SayHi(){
        return topicServices.getAlltopics();
    }
    @RequestMapping("/hello/{name}")
    public Topic getTopic(@PathVariable("name") String name) {
        return topicServices.getTopic(name);
    }

    @RequestMapping(method=RequestMethod.POST,value="/hello")
    public void addTopic(@RequestBody Topic topic){
        topicServices.addTopic(topic);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/hello/{name}")
    public void UpdateTopic(@RequestBody Topic topic,@PathVariable("name") String name){
        topicServices.UpdateTopic(name,topic);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/hello/{name}")
    public void DeleteTopic(@PathVariable("name") String name){
        topicServices.DeleteTopic(name);
    }
}
