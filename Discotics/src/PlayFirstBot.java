/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jiang Han
 */
public class PlayFirstBot {

    private enum State1 {
        S0, S1, S2, S3, S4, S5, S6, S7, S8, S9, S10,
        S11, S12, S13, S14, S15, S16, S17, S18, S19, S20,
        S21, S22, S23, S24, S25, S26, S27, S28, S29, S30,
        S31, S32, S33, S34, S35, S36, S37, S38, S39, S40,
        S41, S42, S43, S44, S45, S46, S47, S48, S49, S50,
        S51, S52, S53, S54, S55, S56, S57, S58, S59, S60,
        S61, S62, S63;
    }
    private State1 currState;

    public PlayFirstBot() {
        this.reset();
    }
    
    public void reset (){
        currState = State1.S0;
    }

    public Coordinate getFirstOutput() {
        currState = State1.S1;
        return Coordinate.numberToCoordinate(9);
    }

    public Coordinate getOutput(Coordinate input) {
        int n = Coordinate.coordinateToNumber(input);
        int output = -1;
        switch (currState) {
            case S1:
                switch (n) {
                    case 1:
                        output = 3;
                        currState = State1.S59;
                        break;
                    case 2:
                        output = 7;
                        currState = State1.S54;
                        break;
                    case 3:
                        output = 1;
                        currState = State1.S49;
                        break;
                    case 4:
                        output = 3;
                        currState = State1.S44;
                        break;
                    case 5:
                        output = 1;
                        currState = State1.S17;
                        break;
                    case 6:
                        output = 7;
                        currState = State1.S12;
                        break;
                    case 7:
                        output = 1;
                        currState = State1.S7;
                        break;
                    case 8:
                        output = 3;
                        currState = State1.S1;
                        break;
                }
                break;
            case S2:
                switch (n) {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 7:
                        output = 6;
                        currState = State1.S3;
                        break;
                    case 6:
                        output = 5;
                        currState = State1.S4;
                        break;
                }
                break;
            case S4:
                switch (n) {
                    case 1:
                    case 2:
                    case 4:
                        output = 7;
                        currState = State1.S5;
                        break;
                    case 7:
                        output = 1;
                        currState = State1.S6;
                        break;
                }
                break;
            case S7:
                switch (n) {
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 8:
                        output = 5;
                        currState = State1.S8;
                        break;
                    case 5:
                        output = 3;
                        currState = State1.S9;
                        break;
                }
                break;
            case S9:
                switch (n) {
                    case 2:
                    case 4:
                    case 8:
                        output = 6;
                        currState = State1.S10;
                        break;
                    case 6:
                        output = 2;
                        currState = State1.S11;
                        break;
                }
                break;
            case S12:
                switch (n) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        output = 8;
                        currState = State1.S13;
                        break;
                    case 8:
                        output = 5;
                        currState = State1.S14;
                        break;
                }
                break;
            case S14:
                switch (n) {
                    case 1:
                    case 2:
                    case 4:
                        output = 3;
                        currState = State1.S14;
                        break;
                    case 3:
                        output = 1;
                        currState = State1.S16;
                        break;
                }
                break;
            case S17:
                switch (n) {
                    case 3:
                        output = 7;
                        currState = State1.S18;
                        break;
                    case 7:
                        output = 3;
                        currState = State1.S21;
                        break;
                    case 8:
                        output = 2;
                        currState = State1.S24;
                        break;
                    case 6:
                        output = 4;
                        currState = State1.S29;
                        break;
                    case 4:
                        output = 6;
                        currState = State1.S34;
                        break;
                    case 2:
                        output = 8;
                        currState = State1.S39;
                        break;
                }
                break;
            case S18:
                switch (n) {
                    case 2:
                    case 4:
                    case 6:
                        output = 8;
                        currState = State1.S19;
                        break;
                    case 8:
                        output = 4;
                        currState = State1.S20;
                        break;
                }
                break;
            case S21:
                switch (n) {
                    case 2:
                    case 4:
                    case 8:
                        output = 6;
                        currState = State1.S22;
                        break;
                    case 6:
                        output = 2;
                        currState = State1.S23;
                        break;
                }
                break;
            case S24:
                switch (n) {
                    case 4:
                    case 6:
                    case 7:
                        output = 3;
                        currState = State1.S25;
                        break;
                    case 3:
                        output = 7;
                        currState = State1.S26;
                        break;
                }
                break;
            case S26:
                switch (n) {
                    case 6:
                        output = 4;
                        currState = State1.S27;
                        break;
                    case 4:
                        output = 6;
                        currState = State1.S28;
                        break;
                }
                break;
            case S29:
                switch (n) {
                    case 2:
                    case 3:
                    case 8:
                        output = 7;
                        currState = State1.S30;
                        break;
                    case 7:
                        output = 3;
                        currState = State1.S31;
                        break;
                }
                break;
            case S31:
                switch (n) {
                    case 8:
                        output = 2;
                        currState = State1.S32;
                        break;
                    case 2:
                        output = 8;
                        currState = State1.S33;
                        break;
                }
                break;
            case S34:
                switch (n) {
                    case 2:
                    case 7:
                    case 8:
                        output = 3;
                        currState = State1.S35;
                        break;
                    case 3:
                        output = 7;
                        currState = State1.S36;
                        break;
                }
                break;
            case S36:
                switch (n) {
                    case 2:
                        output = 8;
                        currState = State1.S37;
                        break;
                    case 8:
                        output = 2;
                        currState = State1.S38;
                        break;
                }
                break;
            case S39:
                switch (n) {
                    case 3:
                    case 4:
                    case 6:
                        output = 7;
                        currState = State1.S40;
                        break;
                    case 7:
                        output = 3;
                        currState = State1.S41;
                        break;
                }
                break;
            case S41:
                switch (n) {
                    case 4:
                        output = 6;
                        currState = State1.S42;
                        break;
                    case 6:
                        output = 4;
                        currState = State1.S43;
                        break;
                }
                break;
            case S44:
                switch (n) {
                    case 1:
                    case 2:
                    case 5:
                    case 7:
                    case 8:
                        output = 6;
                        currState = State1.S45;
                        break;
                    case 6:
                        output = 5;
                        currState = State1.S46;
                        break;
                }
                break;
            case S46:
                switch (n) {
                    case 1:
                    case 2:
                    case 8:
                        output = 7;
                        currState = State1.S47;
                        break;
                    case 7:
                        output = 1;
                        currState = State1.S48;
                        break;
                }
                break;
            case S49:
                switch (n) {
                    case 2:
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                        output = 5;
                        currState = State1.S50;
                        break;
                    case 5:
                        output = 7;
                        currState = State1.S51;
                        break;
                }
                break;
            case S51:
                switch (n) {
                    case 2:
                    case 4:
                    case 6:
                        output = 8;
                        currState = State1.S52;
                        break;
                    case 8:
                        output = 4;
                        currState = State1.S53;
                        break;
                }
                break;
            case S54:
                switch (n) {
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        output = 8;
                        currState = State1.S55;
                        break;
                    case 8:
                        output = 5;
                        currState = State1.S56;
                        break;
                }
                break;
            case S56:
                switch (n) {
                    case 1:
                    case 4:
                    case 6:
                        output = 3;
                        currState = State1.S57;
                        break;
                    case 3:
                        output = 1;
                        currState = State1.S58;
                        break;
                }
                break;
            case S59:
                switch (n) {
                    case 2:
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                        output = 6;
                        currState = State1.S60;
                        break;
                    case 6:
                        output = 7;
                        currState = State1.S61;
                        break;
                }
                break;
            case S61:
                switch (n) {
                    case 2:
                    case 4:
                    case 5:
                        output = 8;
                        currState = State1.S62;
                        break;
                    case 8:
                        output = 5;
                        currState = State1.S63;
                        break;
                }
                break;
        }
        return Coordinate.numberToCoordinate(output);
    }
}
