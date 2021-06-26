package uz.pdp.appUploadDownload.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appUploadDownload.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
