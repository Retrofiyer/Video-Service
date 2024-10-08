package com.video_transmission.Service;

import com.video_transmission.Entities.Video;
import com.video_transmission.Repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VideoService implements IVideoService{

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public Video uploadVideo(Video video) {
        video.setUploadDate(LocalDateTime.now().toString());
        return videoRepository.save(video);
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
