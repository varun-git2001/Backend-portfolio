package com.portfolio.demo.Service;

import com.portfolio.demo.Table.Gallery;
import com.portfolio.demo.Repository.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryService {

    private final GalleryRepository galleryRepository;

    @Autowired
    public GalleryService(GalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }

    public List<Gallery> getAllGalleryItems() {
        return galleryRepository.findAll();
   }
}
