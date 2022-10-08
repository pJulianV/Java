/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.libreriasjavalab;

/**
 *
 * @author USUARIO
 */

import javax.swing.JOptionPane;    // Needed for Dialog Box

/**
 *   This program demonstrates
 *   showInputDialog.
 */
public class LibreriasJavaLab
{
   public static void main(String[] args)
   {
      String name;

      // Get the user's name.
      name = JOptionPane.showInputDialog("What is your name? ");

      // Display message
      JOptionPane.showMessageDialog(null, "Hello " + name);
   }
}

import java.persistence.Entity;

@Entity
public class EntityName
                {
                public long Id {get;set;}
                public string Name {get;set;}
                }