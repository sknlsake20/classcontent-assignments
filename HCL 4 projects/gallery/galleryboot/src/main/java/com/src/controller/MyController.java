package com.src.controller;

import java.sql.PreparedStatement;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.src.dao.FileUploadDAO;
import com.src.entity.UploadFile;

@Controller
public class MyController {
	
	@Autowired
	private FileUploadDAO fileUploadDao;
	@Autowired DataSource datasource; 
	
	@RequestMapping("/submitlogin")
	public String loginsubmit(HttpServletRequest req,Model m)
	{
		String u=req.getParameter("uname");
		String p=req.getParameter("pwd");
		java.sql.Connection con=null;
		   try {
		   
		    con= datasource.getConnection();
		String query="select * from picturelogin where username=? and password=?";
		    PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, u);
		ps.setString(2, p);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			return "display";
		}
		else
		{
		m.addAttribute("msg","Invalid username and password");
		  return "error";
		}
		   }
		catch (SQLException e) {
		e.printStackTrace();
		}
		   return null;
		}
	@RequestMapping("/")
	public String display()
	{
		return "index";
	}
	
	


	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String showUploadForm(HttpServletRequest request) {
		return "Upload";
	}
	
    @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
    public String handleFileUpload(HttpServletRequest request,
            @RequestParam MultipartFile[] fileUpload) throws Exception {
         
        if (fileUpload != null && fileUpload.length > 0) {
        	
            for (MultipartFile aFile : fileUpload){
                 
                System.out.println("Saving file: " + aFile.getOriginalFilename());
                
                UploadFile uploadFile = new UploadFile();
                uploadFile.setFileName(aFile.getOriginalFilename());
                uploadFile.setData(aFile.getBytes());
                
                fileUploadDao.save(uploadFile);                
            }
        }
 
        return "Success";
    }
}

