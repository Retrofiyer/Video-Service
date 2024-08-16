package com.video_transmission.Service;

import com.video_transmission.Entities.Video;

import java.util.List;

public interface IVideoService {
    Video uploadVideo(Video video);
    List<Video> getAllVideos();
    void deleteVideo(String id);
}
