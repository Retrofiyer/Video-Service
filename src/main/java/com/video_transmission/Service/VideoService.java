package com.video_transmission.Service;

import com.video_transmission.Entities.Video;
import com.video_transmission.Message.VideoMessageProducer;
import com.video_transmission.Repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VideoService implements IVideoService{

    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private VideoMessageProducer videoMessageProducer;

    @Override
    public Video uploadVideo(Video video) {
        video.setUploadDate(LocalDateTime.now().toString());
        Video savedVideo = videoRepository.save(video);
        videoMessageProducer.sendVideo(savedVideo);
        return savedVideo;
    }

    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    @Override
    public void deleteVideo(String id) {
        videoRepository.deleteById(id);
    }
}
