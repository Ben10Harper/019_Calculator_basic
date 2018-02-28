/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_basic;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
 
 
class Calculator implements ActionListener
{
    JFrame frame;
    JTextField textField;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,bsquare,bcube,bsqrt,blog10,bsind,bsinr,bcosd,bcosr,bhex,boct,bbin,bln;
 
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
        bdel=new JButton("backspace");
        bclr=new JButton("Clear");
        bsquare=new JButton("x^2");
        bcube=new JButton("x^3");
        bsqrt=new JButton("sqrt");
        blog10=new JButton("log10");
        bsind=new JButton("sin(deg)");
        bsinr=new JButton("sin(rad)");
        bcosd=new JButton("cos(deg)");
        bcosr=new JButton("cos(rad)");
        bhex=new JButton("to hex");
        boct=new JButton("to oct");
        bbin=new JButton("to bin");
        bln=new JButton("log e");
        
        
        textField.setBounds(30,40,605,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        bsquare.setBounds(320,100,95,40);
        bsind.setBounds(425,100,95,40);
        bhex.setBounds(530,100,95,40);
        
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        bcube.setBounds(320,170,95,40);
        bsinr.setBounds(425,170,95,40);
        boct.setBounds(530,170,95,40);
        
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        bsqrt.setBounds(320,240,95,40);
        bcosd.setBounds(425,240,95,40);
        bbin.setBounds(530,240,95,40);
        
        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        blog10.setBounds(320,310,95,40);
        bcosr.setBounds(425,310,95,40);
        bln.setBounds(530,310,95,40);
        
        bdel.setBounds(40,380,260,40);
        bclr.setBounds(320,380,305,40);
        
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
        frame.add(bsind);
        frame.add(bsinr);
        frame.add(bcosd);
        frame.add(bcosr);
        frame.add(bhex);
        frame.add(boct);
        frame.add(bbin);
        frame.add(bln);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setSize(660,500);
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
        bsind.addActionListener(this);
        bsinr.addActionListener(this);
        bcosd.addActionListener(this);
        bcosr.addActionListener(this);
        bhex.addActionListener(this);
        boct.addActionListener(this);
        bbin.addActionListener(this);
        bln.addActionListener(this);
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
        if(e.getSource()==bsind)
        {
            firstNumber=Double.parseDouble(textField.getText());
            double ans = Math.sin((firstNumber*(Math.PI/180)));
            textField.setText(""+ans);
        } 
        if(e.getSource()==bsinr)
        {
            firstNumber=Double.parseDouble(textField.getText());
            double ans = Math.sin(firstNumber);
            textField.setText(""+ans);
        } 
        if(e.getSource()==bcosd)
        {
            firstNumber=Double.parseDouble(textField.getText());
            double ans = Math.cos((firstNumber*(Math.PI/180)));
            if(firstNumber==90){
                ans = 0;
            }
            textField.setText(""+ans);
        } 
        if(e.getSource()==bcosr)
        {
            firstNumber=Double.parseDouble(textField.getText());
            double ans = Math.cos(firstNumber);
            textField.setText(""+ans);
        } 
        if(e.getSource()==bhex)
        {
            firstNumber=Double.parseDouble(textField.getText());
            int i = (int)firstNumber;
            String ans = Integer.toHexString(i).toUpperCase();
            textField.setText(ans);
        } 
        if(e.getSource()==boct)
        {
            firstNumber=Double.parseDouble(textField.getText());
            int i = (int)firstNumber;
            String ans = Integer.toOctalString(i).toUpperCase();
            textField.setText(ans);
        } 
        if(e.getSource()==bbin)
        {
            firstNumber=Double.parseDouble(textField.getText());
            int i = (int)firstNumber;
            String ans = Integer.toBinaryString(i);
            textField.setText(ans);
        } 
        if(e.getSource()==bln)
        {
            firstNumber=Double.parseDouble(textField.getText());
            double ans = Math.log(firstNumber);
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
        
        String baseTest = Integer.toHexString(255).toUpperCase();
        System.out.println("baseTest for decimal 255 = "+baseTest);
        */
        new Calculator();
    }
}