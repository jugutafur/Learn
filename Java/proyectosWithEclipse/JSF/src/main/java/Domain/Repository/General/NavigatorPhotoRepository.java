package Domain.Repository.General;

import java.util.List;

import Domain.dto.Potfolio.NavigatorPhoto;

public interface NavigatorPhotoRepository {
	
	List<NavigatorPhoto> get_listPhotos();
}
