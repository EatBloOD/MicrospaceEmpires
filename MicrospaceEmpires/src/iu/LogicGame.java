/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

/**
 *
 * @author Jorge
 */
public class LogicGame {
    
    public class Tabuleiro{
        //ARMAZEM
        private int metalStorage = 0;
        private int wealthStorage = 0;
        private int militaryStrength = 0;
        
        //PRODUÇÃO
        private int metalProduction;
        private int wealthProduction;
        
        //Fica em falta a tecnologia****************************************************************************************
        public Tabuleiro(){}
        
        public int getMetalStorage(){return metalStorage;}
        public int getWealthStorage(){return wealthStorage;}
        public int getMilitaryStrength(){return militaryStrength;}
        
        public void setMetalStorage(int quantidade){
            if(quantidade > 0){
                if(metalStorage+quantidade >= 5){
                    metalStorage = 5;
                }else{
                    metalStorage += quantidade;
                }
            }else{
                if(metalStorage+quantidade <= 0){
                    metalStorage = 0;
                }else{
                    metalStorage -= quantidade;
                }
            }
        }
        public void setWealthStorage(int quantidade){
            if(quantidade > 0){
                if(wealthStorage+quantidade >= 5){
                    wealthStorage = 5;
                }else{
                    wealthStorage += quantidade;
                }
            }else{
                if(wealthStorage+quantidade <= 0){
                    wealthStorage = 0;
                }else{
                    wealthStorage -= quantidade;
                }
            }
        }
        public void setMilitaryStrength(int quantidade){
            if(quantidade > 0){
                if(militaryStrength+quantidade >= 5){
                    militaryStrength = 5;
                }else{
                    militaryStrength += quantidade;
                }
            }else{
                if(militaryStrength+quantidade <= 0){
                    militaryStrength = 0;
                }else{
                    militaryStrength -= quantidade;
                }
            }
        }
        
        public int getMetalProduction(){return metalProduction;}
        public int getWealthProduction(){return wealthProduction;}
        
        public void setMetalProduction(int quantidade){
            if(quantidade > 0){
                if(metalProduction+quantidade >= 5){
                    metalProduction = 5;
                }else{
                    metalProduction += quantidade;
                }
            }else{
                if(metalProduction+quantidade <= 1){
                    metalProduction = 1;
                }else{
                    metalProduction -= quantidade;
                }
            }
        }
        public void setWealthProduction(int quantidade){
            if(quantidade > 0){
                if(wealthProduction+quantidade >= 5){
                    wealthProduction = 5;
                }else{
                    wealthProduction += quantidade;
                }
            }else{
                if(wealthProduction+quantidade <= 0){
                    wealthProduction = 0;
                }else{
                    wealthProduction -= quantidade;
                }
            }
        }
    }
    
    public class Carta{
        private String nome;
        private int wealth, metal, victoryPoints;
        
        public Carta(){
        }
    
    }
}
