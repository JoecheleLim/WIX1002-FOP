/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
import java.util.Random;
public class HeroParty {
    private Hero[] heroList;
    
    public HeroParty(Hero[] heroList) {
        this.heroList = heroList;
    }
    
    public void sortList() {
        for(int i=0; i<heroList.length; i++) {
            for(int j=0; j<heroList.length-1; j++) {
                if(heroList[j].getPower() > heroList[j+1].getPower()){
                    // sort power
                    double a = heroList[j].getPower();
                    double b = heroList[j+1].getPower();
                    double temp = a;
                    heroList[j].setPower(b);
                    heroList[j+1].setPower(temp);
                    
                    // sort name
                    String c = heroList[j].getName();
                    String d = heroList[j+1].getName();
                    String temp1 = c;
                    heroList[j].setName(d);
                    heroList[j+1].setName(temp1);
                    
                    // sort element
                    String e = heroList[j].getElement();
                    String f = heroList[j+1].getElement();
                    String temp2 = e;
                    heroList[j].setElement(f);
                    heroList[j+1].setElement(temp2);
                }
            }
        }
    }
    
    public void  battleWinners(Monster enemy) {
        for(Hero hero: heroList) {
            double damage = hero.getPower()*(1- (enemy.getResistance(hero.getElement())));
            if (damage >= enemy.getHp()) {
                System.out.println(hero.getName());
            }
        }
    }
    
    public void  battleBoss(Monster boss){
        Random g = new Random();
        double maxDamage = 0.0;
        Hero mainHero = null;
        Hero supportHero = null;
        for(int i=0; i<heroList.length; i++) {
            for(int j=0; j<heroList.length; j++) {
                if(i==j) continue;
                Hero hero1 = heroList[i];
                Hero hero2 = heroList[j];
                
                String element1 = hero1.getElement();
                String element2 = hero2.getElement();
                
                double bonus = 0;
                double damage1 = hero1.getPower()*(1- boss.getResistance(hero1.getElement()));
                double damage2 = hero2.getPower()*(1- boss.getResistance(hero2.getElement()));
                
                if(element1.equals("Pyro") && element2.equals("Hydro"))
                    damage1 *= 1.5;
                if(element1.equals("Pyro") && element2.equals("Cryo"))
                    damage1 *= 2.0;
                if(element1.equals("Pyro") && element2.equals("Electro"))
                    bonus = (50 + g.nextInt(101));
                if(element1.equals("Hydro") && element2.equals("Electro"))
                    bonus = (1 + g.nextInt(20))*5;
                if(element1.equals("Electro") && element2.equals("Cryo"))
                    damage2 = hero2.getPower()*(0.9- boss.getResistance(hero2.getElement()));
                
                double totalDamage = damage1 + damage2 + bonus;
                if (totalDamage > maxDamage) {
                    maxDamage = totalDamage;
                    mainHero = hero1;
                    supportHero = hero2;
                }
            }
        }
        
        if(mainHero != null && supportHero != null) {
            System.out.printf("The pair with the highest damage: %s and %s  \nTotal damage dealt: %.1f\n", mainHero.getName(), supportHero.getName(), maxDamage);
        }
    }
    
}
