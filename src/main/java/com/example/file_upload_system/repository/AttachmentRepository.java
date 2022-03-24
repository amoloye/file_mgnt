package com.example.file_upload_system.repository;

import com.example.file_upload_system.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,String> {

}
