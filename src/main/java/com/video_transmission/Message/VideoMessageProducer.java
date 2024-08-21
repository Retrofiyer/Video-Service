package com.video_transmission.Message;

import com.video_transmission.Entities.Video;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoMessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendVideo(Video video){
        rabbitTemplate.convertAndSend("video.queue", video);
    }
}
