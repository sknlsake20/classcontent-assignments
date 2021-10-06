package com.src.service;

import java.util.List;

import java.util.Optional;

import com.src.entity.Image;

public interface ImageService {

    public List < Image > getImages();

    public void saveImage(Image theImage);

    public Optional<Image> getImage(int theId);

    public void deleteImage(Image theImage);

	
}
