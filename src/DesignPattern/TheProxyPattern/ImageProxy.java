package DesignPattern.TheProxyPattern;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

//the virtual image or lazy initialization
public class ImageProxy implements Icon {
   volatile ImageIcon imageIcon;
   final URL imageUrl;
   Thread retrievalThread;
   boolean retrieving = false;
   public ImageProxy(URL imageUrl) {
      this.imageUrl = imageUrl;
   }

   public int getIconHeight() {
      if (imageIcon != null) {
         return imageIcon.getIconHeight();
      } else {
         return 600;
      }
   }

   public int getIconWidth() {
      if (imageIcon != null) {
         return imageIcon.getIconWidth();
      } else {
         return 800;
      }
   }

   synchronized void setImageIcon(ImageIcon imageIcon) {
      this.imageIcon = imageIcon;
   }

   public void paintIcon(final Component c, Graphics g, int x, int y) {
      if (imageIcon != null) {
         imageIcon.paintIcon(c, g, x, y);
      } else {
         g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
         if (!retrieving) {
            retrieving = true;

            retrievalThread = new Thread(new Runnable() {
               public void run() {
                  try {
                     setImageIcon(new ImageIcon(imageUrl, "CD Cover"));
                     c.repaint();
                  } catch (Exception e) {
                     e.printStackTrace();
                  }
               }
            });
            retrievalThread.start();
         }
      }
   }
}
