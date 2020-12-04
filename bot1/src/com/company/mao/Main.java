package com.company.mao;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextArea Chatarea = new JTextArea();
    private JTextField chatbox = new JTextField();

    public Main(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600 ,600);
        frame.setTitle("Chatbot");
        frame.add(Chatarea);
        frame.add(chatbox);
//TEXT Area
        Chatarea.setSize(500, 400);
        Chatarea.setLocation(2,2);


        //for text fiel aka chatbox
        chatbox.setSize(540,30);
        chatbox.setLocation(2,500);


        chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String texte = chatbox.getText();
                Chatarea.append("Me  -->"+ texte + "\n");
                chatbox.setText("");

                if(texte.contains("hi")) {
                    bot("holla");

                }else {
                    bot("I Dont understand you");

                }


            }
        });




    }
    private void bot(String string){


        Chatarea.append("BOT -->"+ string +"\n");
    }

    public static void main(String[] args) {
        new Main();




    }
}
