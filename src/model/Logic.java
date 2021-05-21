package model;

import processing.core.PApplet;

public class Logic {

	private String circleColor;
	private String squareColor;
	private boolean SquareSelected;
	private boolean circleSelected;
	private int colorSq;
	private int colorCir;
	int posXS;
	
	public Logic() {
		posXS = 540;
		colorCir = 255;
		colorSq = 255;
	}
	
	//switch default blanco, casos con colores
	
	@SuppressWarnings("static-access")
	public void drawLogic(PApplet app){
		app.fill(colorCir);
		app.strokeWeight(5);
		if(circleSelected) {
			app.stroke(170, 255, 0);
		}else {
			app.stroke(0);
		}
		
		app.circle(800, 200, 200);
		app.fill(colorSq);

		if(SquareSelected) {
			app.stroke(170, 255, 0);
		}else {
			app.stroke(0);
		}
		app.square(300, 200, 200);
		
		app.strokeWeight(1);
		app.stroke(0);
		app.fill(100);
		//bar
		app.rect(540, 400, 900, 50);
		//selector
		app.rect(posXS, 400, 50, 100);

		//compare btn
		app.textSize(24);
		app.textAlign(app.CENTER);
		app.rect(300, 550, 200, 70);
		app.fill(200);
		app.text("Compare", 300, 555);
		app.fill(100);
		app.rect(800, 550, 200, 70);
		app.fill(200);
		app.text("Clear color", 800, 555);
		
		
		//
		int color = 0;
		for (int i = 1; i < 11; i++) {
			if(posXS > i*90 && posXS < i*90+90) {
				color = i;
			}
		}
				
		switch(color) {
		case 1:
			if(SquareSelected) {
				colorSq = app.color(234, 11, 11); 
				squareColor = "red";
			}else if(circleSelected) {
				colorCir = app.color(234, 11, 11); 
				circleColor = "red";
			}
			break;
		case 2:
			if(SquareSelected) {
				colorSq = app.color(255, 163, 12); 
				squareColor = "orange";
			}else if(circleSelected){
				colorCir = app.color(255, 163, 12); 
				circleColor = "orange";
			}
			break;
		case 3:
			if(SquareSelected) {
				colorSq = app.color(255, 240, 12); 
				squareColor = "yellow";
			}else if(circleSelected){
				colorCir = app.color(255, 240, 12); 
				circleColor = "yellow";
			}
			break;
		case 4:
			if(SquareSelected) {
				colorSq = app.color(185, 255, 12); 
				squareColor = "green";
			}else if(circleSelected){
				colorCir = app.color(185, 255, 12); 
				circleColor = "green";
			}
			break;
		case 5:
			if(SquareSelected) {
				colorSq = app.color(51, 243, 243); 
				squareColor = "light blue";
			}else if(circleSelected){
				colorCir = app.color(51, 243, 243); 
				circleColor = "light blue";
			}
			break;
		case 6:
			if(SquareSelected) {
				colorSq = app.color(17, 57, 203); 
				squareColor = "dark blue";
			}else if(circleSelected){
				colorCir = app.color(17, 57, 203); 
				circleColor = "dark blue";
			}
			break;
		case 7:
			if(SquareSelected) {
				colorSq = app.color(143, 55, 255); 
				squareColor = "purple";
			}else if(circleSelected){
				colorCir = app.color(143, 55, 255); 
				circleColor = "purple";
			}
			break;
		case 8:
			if(SquareSelected) {
				colorSq = app.color(51, 184, 53); 
				squareColor = "dark green";
			}else if(circleSelected){
				colorCir = app.color(51, 184, 53); 
				circleColor = "dark green";
			}
			break;
		case 9:
			if(SquareSelected) {
				colorSq = app.color(255, 156, 205); 
				squareColor = "pink";
			}else if(circleSelected){
				colorCir = app.color(255, 156, 205); 
				circleColor = "pink";
			}
			break;
		case 10:
			if(SquareSelected) {
				colorSq = app.color(82, 255, 218); 
				squareColor = "aquamarine";
			}else if(circleSelected){
				colorCir = app.color(82, 255, 218); 
				circleColor = "aquamarine";
			}
			break;
		}
	}
	
	//Getters & setters
	public int getPosXS() {
		return posXS;
	}

	public void setPosXS(int posXS) {
		this.posXS = posXS;
	}

	public boolean isSquareSelected() {
		return SquareSelected;
	}

	public void setSquareSelected(boolean squareSelected) {
		SquareSelected = squareSelected;
	}

	public boolean isCircleSelected() {
		return circleSelected;
	}

	public void setCircleSelected(boolean circleSelected) {
		this.circleSelected = circleSelected;
	}

	public String getCircleColor() {
		return circleColor;
	}

	public String getSquareColor() {
		return squareColor;
	}

	public void setColorSq(int colorSq) {
		this.colorSq = colorSq;
	}

	public void setColorCir(int colorCir) {
		this.colorCir = colorCir;
	}

	public void setCircleColor(String circleColor) {
		this.circleColor = circleColor;
	}

	public void setSquareColor(String squareColor) {
		this.squareColor = squareColor;
	}

	
	
}
