import useState from 'react'
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Button from "@mui/material/Button";
import Typography from "@mui/material/Typography";
import ThumbUpOffAltIcon from '@mui/icons-material/ThumbUpOffAlt';
import ThumbDownOffAltIcon from '@mui/icons-material/ThumbDownOffAlt';

const GifCard = ({id, title, url}) => {

  //const { URLResponse} = ServiceGif()
	return (
    <div>
      <Card sx={{ maxWidth: 345 }}>
        <CardMedia
          sx={{ height: 140 }}
          image={url}
          title={`participante ${title}`}/>
        <CardContent>
          <Typography gutterBottom variant="h5" component="div">
            id = {id}
          </Typography>
          <Typography gutterBottom variant="h5" component="div">
            Title = {title}
          </Typography>
          <Typography variant="body2" sx={{ color: 'text.secondary' }}>
            {url}
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
    
	)
}

export default GifCard;



    {/*
      <div>
      <p>componete GifCard</p>
      <li key={id}>
        <img  
          src={url} 
          alt='gif'/>
        <p>tittle = {title}</p>
        <p>id = {id}</p>
      </li>
    </div>
    */}