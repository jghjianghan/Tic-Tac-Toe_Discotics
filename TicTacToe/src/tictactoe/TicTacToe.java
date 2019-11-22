/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Ellipse;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Platform;

public class TicTacToe extends Application {

    private char whoseTurn = 'X';

    private Cell[][] cell = new Cell[3][3];

    private Label lblStatus = new Label("X's turn to play");

    @Override
    public void start(Stage primaryStage) {

        Button xButton = new Button("X");
        Button oButton = new Button("O");
        Button exit = new Button("Exit");
        Button play = new Button("Play Again?");
        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                reset();
            }
        });
        xButton.setStyle("-fx-font-size: 15pt;");
        oButton.setStyle("-fx-font-size: 15pt;");
        exit.setStyle("-fx-font-size: 15pt;");
        play.setStyle("-fx-font-size: 15pt;");

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Platform.exit();
            }
        });

        GridPane pane = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pane.add(cell[i][j] = new Cell(), j, i);
            }
        }

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(lblStatus);

        HBox buttonBar = new HBox();
        buttonBar.setSpacing(87.0);
        buttonBar.getChildren().addAll(xButton, oButton, play, exit);

        borderPane.setTop(buttonBar);

        Scene scene = new Scene(borderPane, 550, 470);
        primaryStage.setTitle("Wild TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);

    }

    public void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cell[i][j].token = ' ';
                this.whoseTurn = 'X';
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cell[i][j].getToken() == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isWon(char token) {
        for (int i = 0; i < 3; i++) {
            if (cell[i][0].getToken() == token
                    && cell[i][1].getToken() == token
                    && cell[i][2].getToken() == token
                    && cell[0][i].getToken() == token
                    && cell[1][i].getToken() == token
                    && cell[2][i].getToken() == token) {
                return true;
            }
        }
        if (cell[0][0].getToken() == token
                && cell[1][1].getToken() == token
                && cell[2][2].getToken() == token) {
            return true;
        }

        if (cell[0][2].getToken() == token
                && cell[1][1].getToken() == token
                && cell[2][0].getToken() == token) {
            return true;
        }

        return false;
    }

    public class Cell extends Pane {

        private char token = ' ';

        public Cell() {
            setStyle("-fx-border-color: black");
            this.setPrefSize(2000, 2000);
            this.setOnMouseClicked(e -> handleMouseClick());
        }

        public char getToken() {
            return token;
        }

        public void setToken(char c) {
            token = c;

            if (token == 'X') {
                Line line1 = new Line(10, 10,
                        this.getWidth() - 10, this.getHeight() - 10);
                line1.endXProperty().bind(this.widthProperty().subtract(10));
                line1.endYProperty().bind(this.heightProperty().subtract(10));
                Line line2 = new Line(10, this.getHeight() - 10,
                        this.getWidth() - 10, 10);
                line2.startYProperty().bind(
                        this.heightProperty().subtract(10));
                line2.endXProperty().bind(this.widthProperty().subtract(10));

                // Add the lines to the pane
                this.getChildren().addAll(line1, line2);
            } else if (token == 'O') {
                Ellipse ellipse = new Ellipse(this.getWidth() / 2,
                        this.getHeight() / 2, this.getWidth() / 2 - 10,
                        this.getHeight() / 2 - 10);
                ellipse.centerXProperty().bind(
                        this.widthProperty().divide(2));
                ellipse.centerYProperty().bind(
                        this.heightProperty().divide(2));
                ellipse.radiusXProperty().bind(
                        this.widthProperty().divide(2).subtract(10));
                ellipse.radiusYProperty().bind(
                        this.heightProperty().divide(2).subtract(10));
                ellipse.setStroke(Color.BLACK);
                ellipse.setFill(Color.WHITE);

                getChildren().add(ellipse);
            }
        }
        private void handleMouseClick() {
            if (token == ' ' && whoseTurn != ' ') {
                setToken(whoseTurn);

                if (isWon(whoseTurn)) {
                    lblStatus.setText(whoseTurn + " won! The game is over. Would you like to play again?");
                    whoseTurn = ' ';
                } else if (isFull()) {
                    lblStatus.setText("Draw! The game is over. Would you like to play again?");
                    whoseTurn = ' ';
                } else {
                    whoseTurn = (whoseTurn == 'X') ? 'O' : 'X';
                    lblStatus.setText(whoseTurn + "'s turn.");
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
