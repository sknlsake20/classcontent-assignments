package com.src.service;

import java.util.List;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.ImageDAO;
import com.src.entity.Image;

@Service
   
public  class ImageServiceImpl implements ImageService {

	@Autowired
    private ImageDAO ImageDAO;

    @Override
    @Transactional
    public List < Image > getImages() {
        return (List<Image>) ImageDAO.findAll();
    }

    @Override
    @Transactional
    public void saveImage(Image theImage) {
    	ImageDAO.save(theImage);
    }

    @Override
    @Transactional
    public Optional<Image> getImage(int theId) {
        return ImageDAO.findById(theId);
    }

    @Override
    @Transactional
    public void deleteImage(Image theImage) {
    	ImageDAO.delete(theImage);
    }
}
