/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jiang Han
 */
public class PlaySecondBot {

    private enum State1 {
        S0, S1, S2, S3, S4, S5, S6, S7, S8, S9, S10,
        S11, S12, S13, S14, S15, S16, S17, S18, S19, S20,
        S21, S22, S23, S24, S25, S26, S27, S28, S29, S30,
        S31, S32, S33, S34, S35, S36, S37, S38, S39, S40,
        S41, S42, S43, S44, S45, S46, S47, S48, S49, S50,
        S51, S52, S53, S54, S55, S56, S57, S58, S59, S60,
        S61, S62, S63, S64, S65, S66, S67, S68, S69, S70,
        S71, S72, S73, S74, S75, S76, S77, S78, S79, S80,
        S81, S82, S83, S84, S85, S86, S87, S88, S89, S90,
        S91, S92, S93, S94, S95, S96, S97, S98, S99, S100,
        S101, S102, S103, S104, S105, S106, S107, S108, S109, S110,
        S111, S112, S113, S114, S115, S116, S117, S118, S119, S120,
        S121, S122, S123, S124, S125, S126, S127, S128, S129, S130,
        S131, S132, S133, S134, S135, S136, S137, S138, S139, S140,
        S141, S142, S143, S144, S145, S146, S147, S148, S149, S150,
        S151, S152, S153, S154, S155, S156, S157, S158, S159, S160,
        S161, S162, S163, S164, S165, S166, S167, S168, S169, S170,
        S171, S172, S173, S174, S175, S176, S177, S178, S179, S180,
        S181, S182, S183, S184, S185, S186, S187, S188, S189, S190,
        S191, S192, S193, S194, S195, S196, S197, S198, S199, S200,
        S201, S202, S203, S204, S205, S206, S207, S208, S209, S210,
        S211, S212, S213, S214
    }
    private State1 currState;

    public PlaySecondBot() {
        this.reset();
    }
    
    public void sayHello (){
        System.out.println("Hello I'm the second bot!");
    }

    public void reset() {
        currState = State1.S0;
    }

    public Coordinate getOutput(Coordinate input) {
        int n = Coordinate.coordinateToNumber(input);
        int output = -1;
        switch (currState) {
            case S0:
                switch (n) {
                    case 1:
                        output = 5;
                        currState = State1.S1;
                        break;
                    case 2:
                        output = 5;
                        currState = State1.S2;
                        break;
                    case 3:
                        output = 5;
                        currState = State1.S3;
                        break;
                    case 4:
                        output = 5;
                        currState = State1.S4;
                        break;
                    case 5:
                        output = 1;
                        currState = State1.S5;
                        break;
                    case 6:
                        output = 5;
                        currState = State1.S6;
                        break;
                    case 7:
                        output = 5;
                        currState = State1.S7;
                        break;
                    case 8:
                        output = 5;
                        currState = State1.S8;
                        break;
                    case 9:
                        output = 5;
                        currState = State1.S9;
                        break;
                }
                break;
            case S1:
                switch (n) {
                    case 2:
                        output = 3;
                        currState = State1.S10;
                        break;
                    case 3:
                        output = 2;
                        currState = State1.S11;
                        break;
                    case 4:
                        output = 7;
                        currState = State1.S12;
                        break;
                    case 6:
                        output = 3;
                        currState = State1.S13;
                        break;
                    case 7:
                        output = 4;
                        currState = State1.S14;
                        break;
                    case 8:
                        output = 4;
                        currState = State1.S15;
                        break;
                    case 9:
                        output = 2;
                        currState = State1.S16;
                        break;
                }
                break;
            case S2:
                switch (n) {
                    case 1:
                        output = 3;
                        currState = State1.S10;
                        break;
                    case 3:
                        output = 1;
                        currState = State1.S45;
                        break;
                    case 4:
                        output = 1;
                        currState = State1.S50;
                        break;
                    case 6:
                        output = 3;
                        currState = State1.S55;
                        break;
                    case 7:
                        output = 1;
                        currState = State1.S60;
                        break;
                    case 8:
                        output = 4;
                        currState = State1.S65;
                        break;
                    case 9:
                        output = 3;
                        currState = State1.S70;
                        break;
                }
                break;
            case S3:
                switch (n) {
                    case 1:
                        output = 2;
                        currState = State1.S11;
                        break;
                    case 2:
                        output = 1;
                        currState = State1.S45;
                        break;
                    case 4:
                        output = 1;
                        currState = State1.S75;
                        break;
                    case 6:
                        output = 9;
                        currState = State1.S80;
                        break;
                    case 7:
                        output = 4;
                        currState = State1.S85;
                        break;
                    case 8:
                        output = 6;
                        currState = State1.S90;
                        break;
                    case 9:
                        output = 6;
                        currState = State1.S95;
                        break;
                }
                break;
            case S4:
                switch (n) {
                    case 1:
                        output = 7;
                        currState = State1.S12;
                        break;
                    case 2:
                        output = 1;
                        currState = State1.S50;
                        break;
                    case 3:
                        output = 1;
                        currState = State1.S75;
                        break;
                    case 6:
                        output = 1;
                        currState = State1.S100;
                        break;
                    case 7:
                        output = 1;
                        currState = State1.S105;
                        break;
                    case 8:
                        output = 1;
                        currState = State1.S110;
                        break;
                    case 9:
                        output = 8;
                        currState = State1.S115;
                        break;
                }
                break;
            case S5:
                switch (n) {
                    case 2:
                        output = 8;
                        currState = State1.S120;
                        break;
                    case 3:
                        output = 7;
                        currState = State1.S138;
                        break;
                    case 4:
                        output = 6;
                        currState = State1.S144;
                        break;
                    case 6:
                        output = 4;
                        currState = State1.S162;
                        break;
                    case 7:
                        output = 3;
                        currState = State1.S167;
                        break;
                    case 8:
                        output = 2;
                        currState = State1.S173;
                        break;
                    case 9:
                        output = 3;
                        currState = State1.S178;
                        break;
                }
                break;
            case S6:
                switch (n) {
                    case 1:
                        output = 3;
                        currState = State1.S13;
                        break;
                    case 2:
                        output = 3;
                        currState = State1.S55;
                        break;
                    case 3:
                        output = 9;
                        currState = State1.S80;
                        break;
                    case 4:
                        output = 1;
                        currState = State1.S100;
                        break;
                    case 7:
                        output = 9;
                        currState = State1.S184;
                        break;
                    case 8:
                        output = 9;
                        currState = State1.S190;
                        break;
                    case 9:
                        output = 3;
                        currState = State1.S195;
                        break;
                }
                break;
            case S7:
                switch (n) {
                    case 1:
                        output = 4;
                        currState = State1.S14;
                        break;
                    case 2:
                        output = 1;
                        currState = State1.S60;
                        break;
                    case 3:
                        output = 4;
                        currState = State1.S85;
                        break;
                    case 4:
                        output = 1;
                        currState = State1.S105;
                        break;
                    case 6:
                        output = 9;
                        currState = State1.S184;
                        break;
                    case 8:
                        output = 9;
                        currState = State1.S200;
                        break;
                    case 9:
                        output = 8;
                        currState = State1.S205;
                        break;
                }
                break;
            case S8:
                switch (n) {
                    case 1:
                        output = 4;
                        currState = State1.S15;
                        break;
                    case 2:
                        output = 4;
                        currState = State1.S65;
                        break;
                    case 3:
                        output = 6;
                        currState = State1.S90;
                        break;
                    case 4:
                        output = 1;
                        currState = State1.S110;
                        break;
                    case 6:
                        output = 9;
                        currState = State1.S190;
                        break;
                    case 7:
                        output = 9;
                        currState = State1.S200;
                        break;
                    case 9:
                        output = 7;
                        currState = State1.S210;
                        break;
                }
                break;
            case S9:
                switch (n) {
                    case 1:
                        output = 2;
                        currState = State1.S16;
                        break;
                    case 2:
                        output = 3;
                        currState = State1.S70;
                        break;
                    case 3:
                        output = 6;
                        currState = State1.S95;
                        break;
                    case 4:
                        output = 8;
                        currState = State1.S115;
                        break;
                    case 6:
                        output = 3;
                        currState = State1.S195;
                        break;
                    case 7:
                        output = 8;
                        currState = State1.S205;
                        break;
                    case 8:
                        output = 7;
                        currState = State1.S210;
                        break;
                }
                break;
            case S10:
                switch (n) {
                    case 4:
                    case 6:
                    case 8:
                    case 9:
                        output = 7;
                        currState = State1.S17;
                        break;
                    case 7:
                        output = 4;
                        currState = State1.S18;
                        break;
                }
                break;
            case S11:
                switch (n) {
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                        output = 8;
                        currState = State1.S21;
                        break;
                    case 8:
                        output = 6;
                        currState = State1.S22;
                        break;
                }
                break;
            case S12:
                switch (n) {
                    case 2:
                    case 6:
                    case 8:
                    case 9:
                        output = 3;
                        currState = State1.S25;
                        break;
                    case 3:
                        output = 2;
                        currState = State1.S26;
                        break;
                }
                break;
            case S13:
                switch (n) {
                    case 2:
                    case 4:
                    case 8:
                    case 9:
                        output = 7;
                        currState = State1.S29;
                        break;
                    case 7:
                        output = 4;
                        currState = State1.S30;
                        break;
                }
                break;
            case S14:
                switch (n) {
                    case 2:
                    case 3:
                    case 8:    
                    case 9:
                        output = 6;
                        currState = State1.S33;
                        break;
                    case 6:
                        output = 2;
                        currState = State1.S34;
                        break;
                }
                break;
            case S15:
                switch (n) {
                    case 2:
                    case 3:
                    case 7:    
                    case 9:
                        output = 6;
                        currState = State1.S37;
                        break;
                    case 6:
                        output = 3;
                        currState = State1.S38;
                        break;
                }
                break;
            case S16:
                switch (n) {
                    case 3:
                    case 4:
                    case 6:    
                    case 7:
                        output = 8;
                        currState = State1.S41;
                        break;
                    case 8:
                        output = 7;
                        currState = State1.S42;
                        break;
                }
                break;
            case S18:
                switch (n) {
                    case 8:    
                    case 9:
                        output = 6;
                        currState = State1.S19;
                        break;
                    case 6:
                        output = 8;
                        currState = State1.S20;
                        break;
                }
                break;
            case S22:
                switch (n) {
                    case 7:    
                    case 9:
                        output = 4;
                        currState = State1.S23;
                        break;
                    case 4:
                        output = 7;
                        currState = State1.S24;
                        break;
                }
                break;
            case S26:
                switch (n) {
                    case 6:    
                    case 9:
                        output = 8;
                        currState = State1.S27;
                        break;
                    case 8:
                        output = 9;
                        currState = State1.S28;
                        break;
                }
                break;
            case S30:
                switch (n) {
                    case 2:    
                    case 8:
                        output = 9;
                        currState = State1.S31;
                        break;
                    case 9:
                        output = 8;
                        currState = State1.S32;
                        break;
                }
                break;
            case S34:
                switch (n) {
                    case 3:    
                    case 9:
                        output = 8;
                        currState = State1.S35;
                        break;
                    case 8:
                        output = 9;
                        currState = State1.S36;
                        break;
                }
                break;
            case S38:
                switch (n) {
                    case 2:    
                    case 9:
                        output = 7;
                        currState = State1.S39;
                        break;
                    case 7:
                        output = 9;
                        currState = State1.S40;
                        break;
                }
                break;
            case S42:
                switch (n) {
                    case 4:    
                    case 6:
                        output = 3;
                        currState = State1.S43;
                        break;
                    case 3:
                        output = 6;
                        currState = State1.S44;
                        break;
                }
                break;
            case S45:
                switch (n) {
                    case 4:
                    case 6:
                    case 7:    
                    case 8:
                        output = 9;
                        currState = State1.S46;
                        break;
                    case 9:
                        output = 6;
                        currState = State1.S47;
                        break;
                }
                break;
            case S47:
                switch (n) {
                    case 7:
                    case 8:
                        output = 4;
                        currState = State1.S48;
                        break;
                    case 4:
                        output = 8;
                        currState = State1.S49;
                        break;
                }
                break;
            case S50:
                switch (n) {
                    case 3:
                    case 6:
                    case 7:    
                    case 8:
                        output = 9;
                        currState = State1.S51;
                        break;
                    case 9:
                        output = 3;
                        currState = State1.S52;
                        break;
                }
                break;
            case S52:
                switch (n) {
                    case 6:    
                    case 8:
                        output = 7;
                        currState = State1.S53;
                        break;
                    case 7:
                        output = 8;
                        currState = State1.S54;
                        break;
                }
                break;
            case S55:
                switch (n) {
                    case 1:
                    case 4:
                    case 8:    
                    case 9:
                        output = 7;
                        currState = State1.S56;
                        break;
                    case 7:
                        output = 9;
                        currState = State1.S57;
                        break;
                }
                break;
            case S57:
                switch (n) {
                    case 4:    
                    case 6:
                        output = 1;
                        currState = State1.S58;
                        break;
                    case 1:
                        output = 4;
                        currState = State1.S59;
                        break;
                }
                break;
            case S60:
                switch (n) {
                    case 3:
                    case 4:
                    case 6:    
                    case 8:
                        output = 9;
                        currState = State1.S61;
                        break;
                    case 9:
                        output = 8;
                        currState = State1.S62;
                        break;
                }
                break;
            case S62:
                switch (n) {
                    case 4:
                    case 6:    
                        output = 3;
                        currState = State1.S63;
                        break;
                    case 3:
                        output = 6;
                        currState = State1.S64;
                        break;
                }
                break;
            case S65:
                switch (n) {
                    case 1:
                    case 3:
                    case 7:    
                    case 9:
                        output = 6;
                        currState = State1.S66;
                        break;
                    case 6:
                        output = 7;
                        currState = State1.S67;
                        break;
                }
                break;
            case S67:
                switch (n) {
                    case 3:    
                    case 9:
                        output = 1;
                        currState = State1.S68;
                        break;
                    case 1:
                        output = 3;
                        currState = State1.S69;
                        break;
                }
                break;
            case S70:
                switch (n) {
                    case 1:
                    case 4:
                    case 6:    
                    case 8:
                        output = 7;
                        currState = State1.S71;
                        break;
                    case 7:
                        output = 8;
                        currState = State1.S72;
                        break;
                }
                break;
            case S72:
                switch (n) {
                    case 4:
                    case 6:
                        output = 1;
                        currState = State1.S73;
                        break;
                    case 1:
                        output = 4;
                        currState = State1.S74;
                        break;
                }
                break;
            case S75:
                switch (n) {
                    case 2:
                    case 5:
                    case 7:    
                    case 8:
                        output = 9;
                        currState = State1.S76;
                        break;
                    case 9:
                        output = 6;
                        currState = State1.S77;
                        break;
                }
                break;
            case S77:
                switch (n) {
                    case 2:
                    case 8:
                        output = 7;
                        currState = State1.S78;
                        break;
                    case 7:
                        output = 8;
                        currState = State1.S79;
                        break;
                }
                break;
            case S80:
                switch (n) {
                    case 2:
                    case 4:
                    case 7:    
                    case 8:
                        output = 1;
                        currState = State1.S81;
                        break;
                    case 1:
                        output = 2;
                        currState = State1.S82;
                        break;
                }
                break;
            case S82:
                switch (n) {
                    case 4:
                    case 7:
                        output = 8;
                        currState = State1.S83;
                        break;
                    case 8:
                        output = 4;
                        currState = State1.S84;
                        break;
                }
                break;
            case S85:
                switch (n) {
                    case 1:
                    case 2:
                    case 8:    
                    case 9:
                        output = 6;
                        currState = State1.S86;
                        break;
                    case 6:
                        output = 9;
                        currState = State1.S87;
                        break;
                }
                break;
            case S87:
                switch (n) {
                    case 2:
                    case 8:
                        output = 1;
                        currState = State1.S88;
                        break;
                    case 1:
                        output = 2;
                        currState = State1.S89;
                        break;
                }
                break;
            case S90:
                switch (n) {
                    case 1:
                    case 2:
                    case 7:    
                    case 9:
                        output = 4;
                        currState = State1.S91;
                        break;
                    case 4:
                        output = 1;
                        currState = State1.S92;
                        break;
                }
                break;
            case S92:
                switch (n) {
                    case 2:  
                    case 7:
                        output = 9;
                        currState = State1.S93;
                        break;
                    case 9:
                        output = 7;
                        currState = State1.S94;
                        break;
                }
                break;
            case S95:
                switch (n) {
                    case 1:
                    case 2:
                    case 7:    
                    case 8:
                        output = 4;
                        currState = State1.S96;
                        break;
                    case 4:
                        output = 2;
                        currState = State1.S97;
                        break;
                }
                break;
            case S97:
                switch (n) {
                    case 1:
                    case 7:
                        output = 8;
                        currState = State1.S98;
                        break;
                    case 8:
                        output = 7;
                        currState = State1.S99;
                        break;
                }
                break;
            case S100:
                switch (n) {
                    case 2:
                    case 3:
                    case 7:    
                    case 8:
                        output = 9;
                        currState = State1.S101;
                        break;
                    case 9:
                        output = 3;
                        currState = State1.S102;
                        break;
                }
                break;
            case S102:
                switch (n) {
                    case 2:
                    case 8:
                        output = 7;
                        currState = State1.S103;
                        break;
                    case 7:
                        output = 2;
                        currState = State1.S104;
                        break;
                }
                break;
            case S105:
                switch (n) {
                    case 2:
                    case 3:
                    case 6:    
                    case 8:
                        output = 9;
                        currState = State1.S106;
                        break;
                    case 9:
                        output = 8;
                        currState = State1.S107;
                        break;
                }
                break;
            case S107:
                switch (n) {
                    case 3:
                    case 6:
                        output = 2;
                        currState = State1.S108;
                        break;
                    case 2:
                        output = 3;
                        currState = State1.S109;
                        break;
                }
                break;
            case S110:
                switch (n) {
                    case 2:
                    case 3:
                    case 6:    
                    case 7:
                        output = 9;
                        currState = State1.S111;
                        break;
                    case 9:
                        output = 7;
                        currState = State1.S112;
                        break;
                }
                break;
            case S112:
                switch (n) {
                    case 2:
                    case 6:
                        output = 3;
                        currState = State1.S113;
                        break;
                    case 3:
                        output = 6;
                        currState = State1.S114;
                        break;
                }
                break;
            case S115:
                switch (n) {
                    case 1:
                    case 3:
                    case 6:    
                    case 7:
                        output = 2;
                        currState = State1.S116;
                        break;
                    case 2:
                        output = 3;
                        currState = State1.S117;
                        break;
                }
                break;
            case S117:
                switch (n) {
                    case 1:
                    case 6:
                        output = 7;
                        currState = State1.S118;
                        break;
                    case 7:
                        output = 1;
                        currState = State1.S119;
                        break;
                }
                break;
            case S120:
                switch (n) {
                    case 3:
                        output = 7;
                        currState = State1.S121;
                        break;
                    case 4:
                        output = 6;
                        currState = State1.S124;
                        break;
                    case 6:
                        output = 4;
                        currState = State1.S128;
                        break;   
                    case 7:
                        output = 3;
                        currState = State1.S131;
                        break;
                    case 9:
                        output = 7;
                        currState = State1.S135;
                        break;
                }
                break;
            case S121:
                switch (n) {
                    case 4:
                    case 6:
                        output = 9;
                        currState = State1.S122;
                        break;
                    case 9:
                        output = 4;
                        currState = State1.S123;
                        break;
                }
                break;
            case S124:
                switch (n) {
                    case 3:
                        output = 7;
                        currState = State1.S125;
                        break;
                    case 7:
                        output = 3;
                        currState = State1.S126;
                        break;
                    case 9:
                        output = 7;
                        currState = State1.S127;
                        break;
                }
                break;
            case S128:
                switch (n) {
                    case 3:
                    case 9:
                        output = 7;
                        currState = State1.S129;
                        break;
                    case 7:
                        output = 3;
                        currState = State1.S130;
                        break;
                }
                break;
            case S131:
                switch (n) {
                    case 4:
                        output = 6;
                        currState = State1.S132;
                        break;
                    case 6:
                        output = 4;
                        currState = State1.S133;
                        break;
                    case 9:
                        output = 4;
                        currState = State1.S134;
                        break;
                }
                break;
            case S135:
                switch (n) {
                    case 3:
                    case 6:
                        output = 4;
                        currState = State1.S136;
                        break;
                    case 4:
                        output = 6;
                        currState = State1.S137;
                        break;
                }
                break;
            case S138:
                switch (n) {
                    case 2:
                    case 6:
                    case 8:    
                    case 9:
                        output = 4;
                        currState = State1.S139;
                        break;
                    case 4:
                        output = 6;
                        currState = State1.S140;
                        break;
                }
                break;
            case S140:
                switch (n) {
                    case 2:
                        output = 8;
                        currState = State1.S141;
                        break;
                    case 8:
                        output = 2;
                        currState = State1.S142;
                        break;
                    case 9:
                        output = 8;
                        currState = State1.S143;
                        break;
                }
                break;
            case S144:
                switch (n) {
                    case 2:
                        output = 8;
                        currState = State1.S145;
                        break;
                    case 3:
                        output = 7;
                        currState = State1.S149;
                        break;
                    case 7:
                        output = 3;
                        currState = State1.S153;
                        break;   
                    case 8:
                        output = 2;
                        currState = State1.S156;
                        break;
                    case 9:
                        output = 2;
                        currState = State1.S159;
                        break;
                }
                break;
            case S145:
                switch (n) {
                    case 3:
                        output = 7;
                        currState = State1.S146;
                        break;
                    case 7:
                        output = 3;
                        currState = State1.S147;
                        break;
                    case 9:
                        output = 7;
                        currState = State1.S148;
                        break;
                }
                break;
            case S149:
                switch (n) {
                    case 2:
                        output = 8;
                        currState = State1.S150;
                        break;
                    case 8:
                        output = 2;
                        currState = State1.S151;
                        break;
                    case 9:
                        output = 8;
                        currState = State1.S152;
                        break;
                }
                break;
            case S153:
                switch (n) {
                    case 8:    
                    case 9:
                        output = 2;
                        currState = State1.S154;
                        break;
                    case 2:
                        output = 9;
                        currState = State1.S155;
                        break;
                }
                break;
            case S156:
                switch (n) {
                    case 7:    
                    case 9:
                        output = 3;
                        currState = State1.S157;
                        break;
                    case 3:
                        output = 7;
                        currState = State1.S158;
                        break;
                }
                break;
            case S159:
                switch (n) {
                    case 7:
                    case 8:    
                        output = 3;
                        currState = State1.S160;
                        break;
                    case 3:
                        output = 1;
                        currState = State1.S161;
                        break;
                }
                break;
            case S162:
                switch (n) {
                    case 2:
                    case 3:
                    case 8:    
                    case 9:
                        output = 7;
                        currState = State1.S163;
                        break;
                    case 7:
                        output = 3;
                        currState = State1.S164;
                        break;
                }
                break;
            case S164:
                switch (n) {
                    case 8:    
                    case 9:
                        output = 2;
                        currState = State1.S165;
                        break;
                    case 2:
                        output = 8;
                        currState = State1.S166;
                        break;
                }
                break;
            case S167:
                switch (n) {
                    case 4:
                    case 6:
                    case 8:    
                    case 9:
                        output = 2;
                        currState = State1.S168;
                        break;
                    case 2:
                        output = 8;
                        currState = State1.S169;
                        break;
                }
                break;
            case S169:
                switch (n) {
                    case 4:
                        output = 6;
                        currState = State1.S170;
                        break;
                    case 6:
                        output = 4;
                        currState = State1.S171;
                        break;
                    case 9:
                        output = 6;
                        currState = State1.S172;
                        break;
                }
                break;
            case S173:
                switch (n) {
                    case 4:
                    case 6:
                    case 7:    
                    case 9:
                        output = 3;
                        currState = State1.S174;
                        break;
                    case 3:
                        output = 7;
                        currState = State1.S175;
                        break;
                }
                break;
            case S175:
                switch (n) {
                    case 6:
                    case 9:
                        output = 4;
                        currState = State1.S176;
                        break;
                    case 4:
                        output = 6;
                        currState = State1.S177;
                        break;
                }
                break;
            case S178:
                switch (n) {
                    case 4:
                    case 6:
                    case 7:    
                    case 8:
                        output = 2;
                        currState = State1.S179;
                        break;
                    case 2:
                        output = 8;
                        currState = State1.S180;
                        break;
                }
                break;
            case S180:
                switch (n) {
                    case 4:
                        output = 6;
                        currState = State1.S181;
                        break;
                    case 6:
                        output = 4;
                        currState = State1.S182;
                        break;
                    case 7:
                        output = 4;
                        currState = State1.S183;
                        break;
                }
                break;
            case S184:
                switch (n) {
                    case 2:
                    case 3:
                    case 4:    
                    case 8:
                        output = 1;
                        currState = State1.S185;
                        break;
                    case 1:
                        output = 4;
                        currState = State1.S186;
                        break;
                }
                break;
            case S186:
                switch (n) {
                    case 2:
                        output = 3;
                        currState = State1.S187;
                        break;
                    case 3:
                        output = 2;
                        currState = State1.S188;
                        break;
                    case 8:
                        output = 2;
                        currState = State1.S189;
                        break;
                }
                break;
            case S190:
                switch (n) {
                    case 2:
                    case 3:
                    case 4:    
                    case 7:
                        output = 1;
                        currState = State1.S191;
                        break;
                    case 1:
                        output = 7;
                        currState = State1.S192;
                        break;
                }
                break;
            case S192:
                switch (n) {
                    case 2:
                    case 4:    
                        output = 3;
                        currState = State1.S193;
                        break;
                    case 3:
                        output = 2;
                        currState = State1.S194;
                        break;
                }
                break;
            case S195:
                switch (n) {
                    case 1:
                    case 2:
                    case 4:    
                    case 8:
                        output = 7;
                        currState = State1.S196;
                        break;
                    case 7:
                        output = 8;
                        currState = State1.S197;
                        break;
                }
                break;
            case S197:
                switch (n) {
                    case 1:
                    case 4:
                        output = 2;
                        currState = State1.S198;
                        break;
                    case 2:
                        output = 1;
                        currState = State1.S199;
                        break;
                }
                break;
            case S200:
                switch (n) {
                    case 2:
                    case 3:
                    case 4:    
                    case 6:
                        output = 1;
                        currState = State1.S201;
                        break;
                    case 1:
                        output = 4;
                        currState = State1.S202;
                        break;
                }
                break;
            case S202:
                switch (n) {
                    case 2:
                    case 3:
                        output = 6;
                        currState = State1.S203;
                        break;
                    case 6:
                        output = 2;
                        currState = State1.S204;
                        break;
                }
                break;
            case S205:
                switch (n) {
                    case 1:
                    case 3:
                    case 4:    
                    case 6:
                        output = 2;
                        currState = State1.S206;
                        break;
                    case 2:
                        output = 4;
                        currState = State1.S207;
                        break;
                }
                break;
            case S207:
                switch (n) {
                    case 1:
                    case 3:
                        output = 6;
                        currState = State1.S208;
                        break;
                    case 6:
                        output = 3;
                        currState = State1.S209;
                        break;
                }
                break;
            case S210:
                switch (n) {
                    case 1:
                    case 2:
                    case 4:    
                    case 6:
                        output = 3;
                        currState = State1.S211;
                        break;
                    case 3:
                        output = 6;
                        currState = State1.S212;
                        break;
                }
                break;
            case S212:
                switch (n) {
                    case 1:
                    case 2:
                        output = 4;
                        currState = State1.S213;
                        break;
                    case 4:
                        output = 1;
                        currState = State1.S214;
                        break;
                }
                break;
        }
        return Coordinate.numberToCoordinate(output);
    }
}
