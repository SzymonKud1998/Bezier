package com.company;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import static java.lang.Math.*;

class Surface extends JPanel {




    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        //tło
        g2d.setPaint(new Color(255,255,255));
        g2d.fillRect(0, 0, 1280, 720);
        //Krzywe S
        int[] tab_x = {355,185,503,305};
        int[] tab_y = {126,123,308,308};
            double t;
            for(t=0;t<1.0;t+=0.0005){
                double xt = pow(1-t,3)*tab_x[0]+3*t*pow(1-t,2)*tab_x[1]+3*pow(t,2)*(1-t)*tab_x[2]+pow(t,3)*tab_x[3];
                double yt = pow(1-t,3)*tab_y[0]+3*t*pow(1-t,2)*tab_y[1]+3*pow(t,2)*(1-t)*tab_y[2]+pow(t,3)*tab_y[3];
                g2d.setPaint(new Color(0));
                g2d.fillRect((int)xt,(int)yt,1,1);
            }
        int[] tab_x1 = {361,191,509,311};
        int[] tab_y1 = {126,123,308,308};
        for(t=0;t<1.0;t+=0.0005){
            double xt1 = pow(1-t,3)*tab_x1[0]+3*t*pow(1-t,2)*tab_x1[1]+3*pow(t,2)*(1-t)*tab_x1[2]+pow(t,3)*tab_x1[3];
            double yt1 = pow(1-t,3)*tab_y1[0]+3*t*pow(1-t,2)*tab_y1[1]+3*pow(t,2)*(1-t)*tab_y1[2]+pow(t,3)*tab_y1[3];
            g2d.setPaint(new Color(0));
            g2d.fillRect((int)xt1,(int)yt1,1,1);
        }
        //Krzywe K
        int[] tab_x2 = {394,394,394,394};
        int[] tab_y2 = {126,126,308,308};
        for(t=0;t<1.0;t+=0.0005){
            double xt2 = pow(1-t,3)*tab_x2[0]+3*t*pow(1-t,2)*tab_x2[1]+3*pow(t,2)*(1-t)*tab_x2[2]+pow(t,3)*tab_x2[3];
            double yt2 = pow(1-t,3)*tab_y2[0]+3*t*pow(1-t,2)*tab_y2[1]+3*pow(t,2)*(1-t)*tab_y2[2]+pow(t,3)*tab_y2[3];
            g2d.setPaint(new Color(0));
            g2d.fillRect((int)xt2,(int)yt2,1,1);
        }
        int[] tab_x3 = {400,406,500,500};
        int[] tab_y3 = {308,150,308,308};
        for(t=0;t<1.0;t+=0.0005){
            double xt3 = pow(1-t,3)*tab_x3[0]+3*t*pow(1-t,2)*tab_x3[1]+3*pow(t,2)*(1-t)*tab_x3[2]+pow(t,3)*tab_x3[3];
            double yt3 = pow(1-t,3)*tab_y3[0]+3*t*pow(1-t,2)*tab_y3[1]+3*pow(t,2)*(1-t)*tab_y3[2]+pow(t,3)*tab_y3[3];
            g2d.setPaint(new Color(0));
            g2d.fillRect((int)xt3,(int)yt3,1,1);
        }
        int[] tab_x4 = {506,406,506,506};
        int[] tab_y4 = {126,226,226,308};
        for(t=0;t<1.0;t+=0.0005){
            double xt4 = pow(1-t,3)*tab_x4[0]+3*t*pow(1-t,2)*tab_x4[1]+3*pow(t,2)*(1-t)*tab_x4[2]+pow(t,3)*tab_x4[3];
            double yt4 = pow(1-t,3)*tab_y4[0]+3*t*pow(1-t,2)*tab_y4[1]+3*pow(t,2)*(1-t)*tab_y4[2]+pow(t,3)*tab_y4[3];
            g2d.setPaint(new Color(0));
            g2d.fillRect((int)xt4,(int)yt4,1,1);
        }
        int[] tab_x5 = {400,390,500,500};
        int[] tab_y5 = {126,240,126,126};
        for(t=0;t<1.0;t+=0.0005){
            double xt5 = pow(1-t,3)*tab_x5[0]+3*t*pow(1-t,2)*tab_x5[1]+3*pow(t,2)*(1-t)*tab_x5[2]+pow(t,3)*tab_x5[3];
            double yt5 = pow(1-t,3)*tab_y5[0]+3*t*pow(1-t,2)*tab_y5[1]+3*pow(t,2)*(1-t)*tab_y5[2]+pow(t,3)*tab_y5[3];
            g2d.setPaint(new Color(0));
            g2d.fillRect((int)xt5,(int)yt5,1,1);
        }
        int[] tab_x6 = {394,394,400,400};
        int[] tab_y6 = {126,126,126,126};
        for(t=0;t<1.0;t+=0.0005){
            double xt6 = pow(1-t,3)*tab_x6[0]+3*t*pow(1-t,2)*tab_x6[1]+3*pow(t,2)*(1-t)*tab_x6[2]+pow(t,3)*tab_x6[3];
            double yt6 = pow(1-t,3)*tab_y6[0]+3*t*pow(1-t,2)*tab_y6[1]+3*pow(t,2)*(1-t)*tab_y6[2]+pow(t,3)*tab_y6[3];
            g2d.setPaint(new Color(0));
            g2d.fillRect((int)xt6,(int)yt6,1,1);
        }
        int[] tab_x7 = {394,394,400,400};
        int[] tab_y7= {308,308,308,308};
        for(t=0;t<1.0;t+=0.0005){
            double xt7 = pow(1-t,3)*tab_x7[0]+3*t*pow(1-t,2)*tab_x7[1]+3*pow(t,2)*(1-t)*tab_x7[2]+pow(t,3)*tab_x7[3];
            double yt7 = pow(1-t,3)*tab_y7[0]+3*t*pow(1-t,2)*tab_y7[1]+3*pow(t,2)*(1-t)*tab_y7[2]+pow(t,3)*tab_y7[3];
            g2d.setPaint(new Color(0));
            g2d.fillRect((int)xt7,(int)yt7,1,1);
        }
        int[] tab_x8 = {500,500,506,506};
        int[] tab_y8= {308,308,308,308};
        for(t=0;t<1.0;t+=0.0005){
            double xt8 = pow(1-t,3)*tab_x8[0]+3*t*pow(1-t,2)*tab_x8[1]+3*pow(t,2)*(1-t)*tab_x8[2]+pow(t,3)*tab_x8[3];
            double yt8 = pow(1-t,3)*tab_y8[0]+3*t*pow(1-t,2)*tab_y8[1]+3*pow(t,2)*(1-t)*tab_y8[2]+pow(t,3)*tab_y8[3];
            g2d.setPaint(new Color(0));
            g2d.fillRect((int)xt8,(int)yt8,1,1);
        }
        int[] tab_x9 = {500,500,506,506};
        int[] tab_y9= {126,126,126,126};
        for(t=0;t<1.0;t+=0.0005){
            double xt9 = pow(1-t,3)*tab_x9[0]+3*t*pow(1-t,2)*tab_x9[1]+3*pow(t,2)*(1-t)*tab_x9[2]+pow(t,3)*tab_x9[3];
            double yt9 = pow(1-t,3)*tab_y9[0]+3*t*pow(1-t,2)*tab_y9[1]+3*pow(t,2)*(1-t)*tab_y9[2]+pow(t,3)*tab_y9[3];
            g2d.setPaint(new Color(0));
            g2d.fillRect((int)xt9,(int)yt9,1,1);
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

class BasicEx extends JFrame {

    public BasicEx() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Inicjały Szymon Kudrewicz");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                BasicEx ex = new BasicEx();
                ex.setVisible(true);
            }
        });
    }
}
