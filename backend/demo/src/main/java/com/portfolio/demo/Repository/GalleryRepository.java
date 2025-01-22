package com.portfolio.demo.Repository;

import com.portfolio.demo.Table.Gallery;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long> 
{
    Optional<Gallery> findByuserId(Long userId);
}
