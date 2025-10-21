package Domain.Services;

import java.util.List;
import java.util.ArrayList;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
import javax.swing.JOptionPane;

import Conection.Portfolio.Conexion;
import Conection.Portfolio.ConexionRepository;
import Domain.Repository.General.NavigatorPhotoRepository;
import Domain.dto.Potfolio.NavigatorPhoto;

@Named
@ApplicationScoped
public class NavigatorPhotoService extends Conexion implements NavigatorPhotoRepository, ConexionRepository {

	private List<NavigatorPhoto> _listPhotos;
	String bases = "";
	
	@PostConstruct
    public void init() {
		getData();
	}
	
	/*
	@PostConstruct
    public void init() {
		this._listPhotos = new ArrayList<>();
		_listPhotos.add(new NavigatorPhoto("/imagenes/navigator/1.jpg", "/imagenes/navigator/11.jpg","Description for Image 1", "Title 1"));
	}
	*/
	
	@Override
    public List<NavigatorPhoto> get_listPhotos() {
		return _listPhotos;
		}

	@Override
	public void getData() {
		this._listPhotos = new ArrayList<>();
		try {
			Statement statement = Conexion.getConexion().createStatement();
			String query = "select * from NavegadorFoto";
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				bases+= resultSet.getString(2)+ "\n";
				NavigatorPhoto navigatorPhoto = new NavigatorPhoto();
				navigatorPhoto.setItemImageSrc(resultSet.getString(2));
				navigatorPhoto.setThumbnailImageSrc(resultSet.getString(3));
				navigatorPhoto.setAlt(resultSet.getString(4));
				navigatorPhoto.setTitle(resultSet.getString(5));
				this._listPhotos.add(navigatorPhoto);
			}
			//JOptionPane.showMessageDialog(null, bases);
			
		} catch (SQLException ex) {
			//JOptionPane.showMessageDialog(null, ex.toString());
		}
	}
	/*
	public static void main(String[] args) {
		System.out.println("ver");
		
		List<NavigatorPhoto> recoverNavigatorPhoto = new ArrayList<>();
		NavigatorPhotoService navigatorPhotoService = new NavigatorPhotoService();
		
		navigatorPhotoService.getData();
		
		recoverNavigatorPhoto = navigatorPhotoService.get_listPhotos();
		
		
		for(NavigatorPhoto e : recoverNavigatorPhoto) {
			System.out.println(e.toString());
		}
	}*/
}
