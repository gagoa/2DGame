package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Shoes extends SuperObject{

	GamePanel gp;
	
	public OBJ_Shoes(GamePanel gp) {
		
		this.gp = gp;
		
		name = "Shoes";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/shoes.png"));
			uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
