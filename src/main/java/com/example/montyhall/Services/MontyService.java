package com.example.montyhall.Services;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Random;

@Service
public class MontyService {
    // global variable required to access
    public int[] array;
    public Random rand;

    public MontyService(){
        array = new int[3];
        rand = new Random();
    }

    public double[] process(){
        // local variable required to calculate
        int playerChoice;
        int iteration,sample;
        int RightChoice;
        int initialChoiceWin = 0;
        int switchChoiceWin = 0;
        int[] tempArray = new int[2];
        int montyOpenDoor =-1;

        iteration = 10000;
        sample = iteration;

        while(iteration > 0){

            Arrays.fill(array,0);

            //Setup right door
            RightChoice = rand.nextInt(3);
            array[RightChoice] = 1;

            //Now player choose initial door
            playerChoice = rand.nextInt(3);

            //Now monty open one wrong door
            // if player choice is right door than 2 option available
            if(array[playerChoice] == 1) {
                for (int i = 0, j = 0; i < 3; i++) {
                    if (i != playerChoice){
                        tempArray[j++] = i;
                    }
                    montyOpenDoor = tempArray[rand.nextInt(2)];
                }
            }

            // if player choose wrong door than only door is required to open
            else{
                for(int i = 0; i < 3; i++){
                    if(i != playerChoice && array[i] != 1){
                        montyOpenDoor = i;
                        break;
                    }
                }
            }

            //Now check weather player initial choice
            if(array[playerChoice] == 1){
                initialChoiceWin ++;
            }
            else {
                int temp = -1;
                //choosing only last option
                for(int i = 0; i < 3; i++){
                    if(i != playerChoice && i != montyOpenDoor){
                        temp = i;
                    }
                }
                if(array[temp] == 1){
                    switchChoiceWin ++;
                }
            }
            iteration --;
        }
        double initialPercentage = (double) (initialChoiceWin * 100) /sample;
        double switchPercentage = (double) (switchChoiceWin * 100) /sample;
        return new double[]{initialPercentage,switchPercentage};
    }
}
