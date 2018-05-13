package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bot extends JFrame {

    //Typing Area
    private JTextField txtEnter = new JTextField();

    //CHat Area
    private JTextArea txtBot = new JTextArea();



    public Bot() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Aireec's AI Bot");

        //Type attributes
        txtEnter.setLocation(2, 540);
        txtEnter.setSize(590, 30);

        //Chat Attributes
        txtBot.setLocation(15, 5);
        txtBot.setSize(560, 510);
        txtBot.setEditable(false);



        this.add(txtEnter);
        this.add(txtBot);

        //txtEnter ActionEvent
        txtEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uText = txtEnter.getText();
                txtBot.append("You: " + uText + "\n");


                if (uText.contains("Hi")) {
                    Boysay("Hello There");
                    }else {
                    if (uText.contains("How are you")){
                        int dicider = (int) (Math.random()*2+1);
                        if (dicider == 1 ){
                            Boysay("Not bad ");
                        }else if (dicider == 2){
                            Boysay("Im fine");
                        }else{
                            int decider = (int)(Math.random()*2+1);
                            if(dicider == 1) {
                                Boysay("I did not get that");
                            }else if(dicider == 2){
                                Boysay("Im sorry can you please repeat");
                            }
                        }
                    }

                }
                txtEnter.setText("");
            }

            public void Boysay(String s){
                txtBot.append("AI " + s + "\n");
            }
        });


    }

    public static void main(String[] args) {
        new Bot();

    }
}
