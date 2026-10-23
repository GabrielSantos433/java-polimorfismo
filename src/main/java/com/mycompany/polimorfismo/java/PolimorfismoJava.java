/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo.java;

/**
 *
 * @author Gabriel Leme
 */
import java.util.ArrayList;
public class PolimorfismoJava {

    
// Classe Base
public static class Animal {
    public int patas = 0;
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

// Subclasse 1
public static class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        patas = 4;
        System.out.println("O cachorro late: Au Au!");
    }
}

// Subclasse 2
 public static class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia: Miau!");
    }
}

// Execução
public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        
        Cachorro cao = new Cachorro();
        Gato cat = new Gato();
        
        ArrayList<Animal> meusAnimais = new ArrayList<Animal>();
        meusAnimais.add(meuAnimal);
        meusAnimais.add(cao);
        meusAnimais.add(cat);
        for(Animal animalAtual : meusAnimais){
            animalAtual.fazerSom();
            System.out.println("Qtd patas: " + animalAtual.patas);
        }
    }

    
    
}
