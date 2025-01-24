package com.portfolio.demo.Controller;

import com.portfolio.demo.Service.GalleryService;
import com.portfolio.demo.Table.Gallery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gallery")
public class GalleryController 
{

    private final GalleryService galleryService;

    @Autowired
    public GalleryController(GalleryService galleryService) 
    {
        this.galleryService = galleryService;
    }

    @GetMapping("/2")
    public ResponseEntity<List<Gallery>> getAllGalleryItems() 
    {
        List<Gallery> galleryItems = galleryService.getAllGalleryItems();
        return ResponseEntity.ok(galleryItems);
    }
}
