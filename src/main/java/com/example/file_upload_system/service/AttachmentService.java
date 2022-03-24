package com.example.file_upload_system.service;

import com.example.file_upload_system.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveAttachment (MultipartFile file) throws Exception;

    Attachment getAttachment (String fileId) throws Exception;
}
