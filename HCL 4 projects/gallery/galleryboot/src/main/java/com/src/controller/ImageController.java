package com.src.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.src.entity.Image;
import com.src.service.ImageService;

@Controller
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private ImageService imageService;
    
    
    @GetMapping("/list")
    public String listImages(Model theModel) {
        List < Image > theImages = imageService.getImages();
        
        theModel.addAttribute("images", theImages);
        return "list-images";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Image theImage = new Image();
        theModel.addAttribute("image", theImage);
        return "image-form";
    }

    @PostMapping("/saveImage")
    public String saveImage(@ModelAttribute("image") Image theImage) {
        imageService.saveImage(theImage);
        return "redirect:/image/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("imageId") int theId,
        Model theModel) {
        Optional<Image> theImage = imageService.getImage(theId);
        theModel.addAttribute("image", theImage);
        return "image-form";
    }

    @GetMapping("/delete")
    public String deleteImage(@RequestParam("imageId") int theId) {
    	Image c =new Image();
    	c.setId(theId);
        imageService.deleteImage(c);
        return "redirect:/image/list";
    }
}

