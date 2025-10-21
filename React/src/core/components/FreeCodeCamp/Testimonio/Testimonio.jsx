import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Button from "@mui/material/Button";
import Typography from "@mui/material/Typography";
import ThumbUpOffAltIcon from '@mui/icons-material/ThumbUpOffAlt';
import ThumbDownOffAltIcon from '@mui/icons-material/ThumbDownOffAlt';

//import participanteUno from '../../../../assets/FreeCodeCamp/participante-Uno.jpg';

// Importa todas las imágenes JPG de la carpeta FreeCodeCamp
const imagenes = import.meta.glob('../../../../assets/FreeCodeCamp/*.jpg', { eager: true });

function Testimonio (props){
  const altImagen = `fotografia ${props.name}`;

 // Construye el nombre completo del archivo con base en props.imagen
  const ruta = `../../../../assets/FreeCodeCamp/participante-${props.imagen}.jpg`;

  // Busca la imagen correspondiente en el objeto 'imagenes'
  const imagenSeleccionada = imagenes[ruta]?.default;

  return (
    <div>
      <Card sx={{ maxWidth: 345 }}>
        <CardMedia
          sx={{ height: 140 }}
          image={imagenSeleccionada}
          title={`participante ${props.name}`}/>
        <CardContent>
          <Typography gutterBottom variant="h5" component="div">
            {props.name} en {props.city}
          </Typography>
          <Typography gutterBottom variant="h7" component="div">
            {props.profession} en {props.company}
          </Typography>
          <Typography variant="body2" sx={{ color: 'text.secondary' }}>
            {props.testimonio}
          </Typography>
        </CardContent>
        <CardActions>
          <Button 
          size="small"
          startIcon={<ThumbUpOffAltIcon />}
          >like</Button>
          <Button 
          size="small" 
          startIcon={<ThumbDownOffAltIcon />}  
          color="error"
          >dislike</Button>
        </CardActions>
      </Card>
    </div>
  );
};

export default Testimonio;