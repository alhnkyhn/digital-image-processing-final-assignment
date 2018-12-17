package digitalımageprocessing;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DoGreyscale {
    int width;
    int height;
    public DoGreyscale(BufferedImage image) throws IOException{
        width = image.getWidth();
        height = image.getHeight();
        for(int i=0; i<height; i++) {
         
            for(int j=0; j<width; j++) {
            
               Color c = new Color(image.getRGB(j, i));
               int red = (int)(c.getRed() * 0.299);
               int green = (int)(c.getGreen() * 0.587);
               int blue = (int)(c.getBlue() *0.114);
               Color newColor = new Color(red+green+blue,
               
               red+green+blue,red+green+blue);
               
               image.setRGB(j,i,newColor.getRGB());
            }
         }
        File ouptut = new File("grayscale.jpg");
        ImageIO.write(image, "jpg", ouptut);
        
    }
    
}
