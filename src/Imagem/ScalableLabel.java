package Imagem;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ScalableLabel extends JLabel {

    private Image originalImage;

    public ScalableLabel() {
        super();
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
    }

    public void setImage(String resourcePath) {
        try {
            ImageIcon ic = new ImageIcon(getClass().getResource(resourcePath));
            originalImage = ic.getImage();
            repaint();
        } catch (Exception ex) {
            originalImage = null;
            System.err.println("Imagem não encontrada: " + resourcePath);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (originalImage != null) {
            int labelW = getWidth();
            int labelH = getHeight();
            int imgW = originalImage.getWidth(null);
            int imgH = originalImage.getHeight(null);
            if (imgW <= 0 || imgH <= 0) return;

            double fator = Math.min((double) labelW / imgW, (double) labelH / imgH);
            int novaW = (int) Math.round(imgW * fator);
            int novaH = (int) Math.round(imgH * fator);

            int x = (labelW - novaW) / 2;
            int y = (labelH - novaH) / 2;

            g.drawImage(originalImage, x, y, novaW, novaH, this);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        if (originalImage != null) {
            return new Dimension(originalImage.getWidth(null), originalImage.getHeight(null));
        }
        return super.getPreferredSize();
    }
}