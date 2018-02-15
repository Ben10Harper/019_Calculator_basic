/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_basic;

import javax.swing.*;
import java.awt.event.*;
 
 
class Calculator implements ActionListener
{
    JFrame frame;
    JTextField textField;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,bsquare,bcube,bsqrt,blog10;
 
    static double firstNumber=0,secondNumber=0,result=0;
    static int operator=0;
 
    Calculator()
    {
        frame=new JFrame("Calculator");
        textField=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("<--");
        bclr=new JButton("Clear");
        bsquare=new JButton("x^2");
        bcube=new JButton("x^3");
        bsqrt=new JButton("sqrt");
        blog10=new JButton("log10");
        
        
        textField.setBounds(30,40,280,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        bsquare.setBounds(320,100,75,40);
        
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        bcube.setBounds(320,170,75,40);
        
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        bsqrt.setBounds(320,240,75,40);
        
        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        blog10.setBounds(320,310,75,40);
        
        bdel.setBounds(60,380,100,40);
        bclr.setBounds(180,380,100,40);
        
        frame.add(textField);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bdiv);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bmul);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bsub);
        frame.add(bdec);
        frame.add(b0);
        frame.add(beq);
        frame.add(badd);
        frame.add(bdel);
        frame.add(bclr);
        frame.add(bsquare);
        frame.add(bcube);
        frame.add(bsqrt);
        frame.add(blog10);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(445,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
        bsquare.addActionListener(this);
        bcube.addActionListener(this);
        bsqrt.addActionListener(this);
        blog10.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            textField.setText(textField.getText().concat("1"));
        
        if(e.getSource()==b2)
            textField.setText(textField.getText().concat("2"));
        
        if(e.getSource()==b3)
            textField.setText(textField.getText().concat("3"));
        
        if(e.getSource()==b4)
            textField.setText(textField.getText().concat("4"));
        
        if(e.getSource()==b5)
            textField.setText(textField.getText().concat("5"));
        
        if(e.getSource()==b6)
            textField.setText(textField.getText().concat("6"));
        
        if(e.getSource()==b7)
            textField.setText(textField.getText().concat("7"));
        
        if(e.getSource()==b8)
            textField.setText(textField.getText().concat("8"));
        
        if(e.getSource()==b9)
            textField.setText(textField.getText().concat("9"));
        
        if(e.getSource()==b0)
            textField.setText(textField.getText().concat("0"));
        
        if(e.getSource()==bdec)
            textField.setText(textField.getText().concat("."));
        
        if(e.getSource()==badd)
        {
            firstNumber=Double.parseDouble(textField.getText());
            operator=1;
            textField.setText("");
        } 
        
        if(e.getSource()==bsub)
        {
            firstNumber=Double.parseDouble(textField.getText());
            operator=2;
            textField.setText("");
        }
        
        if(e.getSource()==bmul)
        {
            firstNumber=Double.parseDouble(textField.getText());
            operator=3;
            textField.setText("");
        }
        
        if(e.getSource()==bdiv)
        {
            firstNumber=Double.parseDouble(textField.getText());
            operator=4;
            textField.setText("");
        }
        
        if(e.getSource()==beq)
        {
            secondNumber=Double.parseDouble(textField.getText());
        
            switch(operator)
            {
                case 1: result=firstNumber+secondNumber;
                    break;
        
                case 2: result=firstNumber-secondNumber;
                    break;
        
                case 3: result=firstNumber*secondNumber;
                    break;
        
                case 4: result=firstNumber/secondNumber;
                    break;
        
                default: result=0;
            }
        
            textField.setText(""+result);
        }
        
        if(e.getSource()==bclr)
            textField.setText("");
        
        if(e.getSource()==bdel)
        {
            String s=textField.getText();
            textField.setText("");
            for(int i=0;i<s.length()-1;i++)
            textField.setText(textField.getText()+s.charAt(i));
            //It takes the text already in the bar, then in a for loop that does every number besides the last one, length-1 is
            //the last number and it goes as long as it's less than that number. So for every number besides the last, it rewrites 
            //the numbers which makes it seem like the last digit was deleted.
        }
        if(e.getSource()==bsquare)
        {
            firstNumber=Double.parseDouble(textField.getText());
            double ans = Math.pow(firstNumber, 2.0);
            textField.setText(""+ans);
        }
        if(e.getSource()==bcube)
        {
            firstNumber=Double.parseDouble(textField.getText());
            double ans = Math.pow(firstNumber, 3.0);
            textField.setText(""+ans);
        }   
        if(e.getSource()==bsqrt)
        {
            firstNumber=Double.parseDouble(textField.getText());
            double ans = Math.sqrt(firstNumber);
            textField.setText(""+ans);
        }   
        if(e.getSource()==blog10)
        {
            firstNumber=Double.parseDouble(textField.getText());
            double ans = Math.log10(firstNumber);
            textField.setText(""+ans);
        }   
    }
 
    public static void main(String...s)
    {
        /*
        double mathTest = Math.pow(10.0, 2.0);
        System.out.println("10^2="+mathTest);
        
        mathTest = Math.sqrt(25.0);
        System.out.println("sqrt(25)="+mathTest);
        
        mathTest = Math.pow(25.0, 0.5);
        System.out.println("pow version of sqrt(25)="+mathTest);
        
        mathTest = Math.pow(10.0, 2.5);
        System.out.println("10^2.5="+mathTest);
        
        mathTest = Math.log10(100.0);
        System.out.println("log10(100)="+mathTest);
        
        mathTest = Math.log10(500.0);
        System.out.println("log10(500)="+mathTest);
        
        mathTest = Math.log10(5.0);
        System.out.println("log10(5)="+mathTest);
        */
        new Calculator();
    }
}