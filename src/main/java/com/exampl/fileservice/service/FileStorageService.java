package com.exampl.fileservice.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileStorageService {
    String storeFile(MultipartFile file);

    void savePng(MultipartFile file) throws IOException;

    Resource loadFileAsResource(String fileName);
}
