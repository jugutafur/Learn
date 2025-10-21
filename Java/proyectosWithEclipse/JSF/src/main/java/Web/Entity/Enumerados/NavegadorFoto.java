package Web.Entity.Enumerados;

public class NavegadorFoto {
	
	private String srcImage;
	private String srcImagenMiniatura;
	private String descripcion;
	private String titulo;

	public NavegadorFoto() {}

	public NavegadorFoto(String srcImage, String srcImagenMiniatura, String descripcion, String titulo) {
		this.srcImage = srcImage;
		this.srcImagenMiniatura = srcImagenMiniatura;
		this.descripcion = descripcion;
		this.titulo = titulo;
	}

	public String getSrcImage() {return srcImage;}
	public void setSrcImage(String srcImage) {this.srcImage = srcImage;}
	
	public String getSrcImagenMiniatura() {return srcImagenMiniatura;}
	public void setSrcImagenMiniatura(String srcImagenMiniatura) {this.srcImagenMiniatura = srcImagenMiniatura;}

	public String getDescripcion() {return descripcion;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
}
