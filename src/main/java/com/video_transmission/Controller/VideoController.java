package com.video_transmission.Controller;

import com.video_transmission.Entities.Video;
import com.video_transmission.Service.IVideoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video")
@Tag(name = "Api Rest for brands use Swagger 3 - Videos")
public class VideoController {

    @Autowired
    private IVideoService videoService;

    @PostMapping("/save")
    @Operation(summary = "This endpoint is used to upload videos")
    public ResponseEntity<?> uploadVideo(@RequestBody Video video){
        videoService.uploadVideo(video);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    @Operation(summary = "This endpoint retrieves all videos")
    public ResponseEntity<?> getAllVideos(){
        List<Video> videos = videoService.getAllVideos();
        return ResponseEntity.ok(videos);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteVideo(@PathVariable String id){
        videoService.deleteVideo(id);
        return ResponseEntity.ok().build();
    }
}
