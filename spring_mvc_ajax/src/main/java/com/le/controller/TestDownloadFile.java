package com.le.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class TestDownloadFile {
    @RequestMapping(value = "/test/down")
    public ResponseEntity<byte[]> testdown(HttpSession session) throws IOException {
        ServletContext servletContext=session.getServletContext();
        String realpath= servletContext.getRealPath("/WEB-INF/img/1.jpg");
        InputStream inputStream=new FileInputStream(realpath);
        byte[] bytes=new byte[inputStream.available()];
        inputStream.read(bytes);
        MultiValueMap<String,String> heads=new HttpHeaders();
        heads.add("Content-Disposition","attachment;filename=1.jpg");
        HttpStatus httpStatus=HttpStatus.OK;
        ResponseEntity<byte[]> responseEntity=new ResponseEntity<>(bytes,heads,httpStatus);
        inputStream.close();
        return responseEntity;
    }
}
