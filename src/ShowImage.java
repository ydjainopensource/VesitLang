
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


/**
 * A Java class to demonstrate how to load an image from disk with the
 * ImageIO class. Also shows how to display the image by creating an
 * ImageIcon, placing that icon an a JLabel, and placing that label on
 * a JFrame.
 *
 * Taken from https://alvinalexander.com/blog/post/jfc-swing/complete-java-program-code-open-read-display-image-file
 * License Missing
 * @author alvin alexander, alvinalexander.com
 */


public class ShowImage {
    public static void  display(final String filename,final String title) {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame editorFrame = new JFrame(title);
                editorFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

                BufferedImage image = null;
                try
                {
                    image = ImageIO.read(new File(filename));
                }
                catch (Exception e)
                {
                    System.err.println(filename);
                    System.err.println("Failed to display Image");
                    System.err.println("Abort!!!");
                    e.printStackTrace();
                    System.exit(1);
                }
                ImageIcon imageIcon = new ImageIcon(image);
                JLabel jLabel = new JLabel();
                jLabel.setIcon(imageIcon);
                editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

                editorFrame.pack();
                editorFrame.setLocationRelativeTo(null);
                editorFrame.setVisible(true);
            }
        });
    }
}