package com.huyi.porvue.controller;

import com.huyi.porvue.entity.ResultEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadController {

    @RequestMapping("/upload")
    public ResultEntity upload(MultipartFile file) {
        if(file!=null && !file.isEmpty()){
            //获取文件的原始名称
            String originalFilename = file.getOriginalFilename();
            //新的名称
            String fileName = UUID.randomUUID()+"_"+originalFilename;
            //保存文件地址
            File destFile = new File("D:\\pic",fileName);

            try {
                file.transferTo(destFile);
                String userface = "http://localhost:85/img/"+fileName;
                return ResultEntity.ok(userface);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return ResultEntity.error();
    }

}
