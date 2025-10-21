package app.service.api;

import java.io.IOException;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.InputStreamResource;
import org.springframework.web.multipart.MultipartFile;
import model.entity.Avatar;

public interface AvatarService {
	Avatar saveAvatar(MultipartFile file)throws IOException;
	ResponseEntity<InputStreamResource> loadAvatar(String id)throws IOException;
}
