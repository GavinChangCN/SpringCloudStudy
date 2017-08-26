package com.welkin.cloud.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * User: 章华隽
 * E-mail: nefeed@163.com
 * Desc:
 * Date: 2017-08-26
 * Time: 16:48
 */
@Controller
public class FileUploadController {
    /**
     * 上传文件
     * 测试方法：
     * 有界面的测试：http://localhost:8050/index.html
     * 使用命令：curl -F "file=@文件全名" localhost:8050/upload
     * ps.该示例比较简单，没有做IO异常、文件大小、文件非空等处理
     * @param file 待上传的文件
     * @return 文件在服务器上的绝对路径
     * @throws IOException IO异常
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody
    String handleFileUpload(@RequestParam(value = "file", required = true) MultipartFile file) throws IOException {
        Integer start = (int) (new Date().getTime() / 1000L);
        System.out.println("当前时间：" + start);
        byte[] bytes = file.getBytes();
        File fileToSave = new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes, fileToSave);
        Integer end = (int) (new Date().getTime() / 1000L);
        System.out.println("结束时间：" + end);
        System.out.println("用时：" + (start - end) + "s");
        return fileToSave.getAbsolutePath();
    }
}