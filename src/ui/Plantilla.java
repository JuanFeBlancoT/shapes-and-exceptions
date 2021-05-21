package ui;


import model.DifferentColorException;
import model.Logic;
import processing.core.PApplet;

public class Plantilla extends PApplet{
	
	//Attributes
	private boolean nullMessage;
	private boolean noMatchMessage;
	private boolean doneMessage;
	
	private String noMatch;
	//Relations
	private Logic logic;
	
	public static void main (String[] args) {
		PApplet.main("ui.Plantilla");
	}
	
	public void settings() {
	size(1080,720);
	}
	
	public void setup() {
		logic = new Logic();
	}

	public void draw() {
		rectMode(CENTER);
		textAlign(CENTER);
		background(40);
		logic.drawLogic(this);
		
		if(noMatchMessage) {
			fill(200);
			text(noMatch+". Circle is: "+logic.getCircleColor()+ ", and the square is: "+ logic.getSquareColor(), 540, 700);
		}
		if(nullMessage) {
			fill(200);
			text("No figures selected", 540, 700);
		}
		if(doneMessage) {
			fill(200);
			text("Colors match, the color is: "+logic.getCircleColor(), 540, 700);
		}
	}
	
	public void mousePressed() {
		if(mouseX > 200 && mouseX < 400 && mouseY > 100 && mouseY < 300) {
			logic.setSquareSelected(true);
			logic.setCircleSelected(false);
		}
		
		if(dist(mouseX, mouseY, 800, 200)<100) {
			logic.setCircleSelected(true);
			logic.setSquareSelected(false);
		}
		
		if(mouseX > 200 && mouseX < 400 && mouseY > 480 && mouseY < 620) {
			compareColors();
		}else {
			doneMessage = false;
			nullMessage = false;
			noMatchMessage = false;
		}
		
		if(mouseX > 700 && mouseX < 900 && mouseY > 480 && mouseY < 620) {
			logic.setColorCir(255);
			logic.setColorSq(255);
			logic.setCircleColor(null);
			logic.setSquareColor(null);
			logic.setCircleSelected(false);
			logic.setSquareSelected(false);
		}
	}
	
	private void compareColors() {
		
		try {
			if(logic.getCircleColor().equals(null) && logic.getSquareColor().equals(null)) {
				throw new NullPointerException();
				}else {
					nullMessage = false;
				}
			
			//second verification
			try {
				if(!logic.getCircleColor().equals(logic.getSquareColor())){
					throw new DifferentColorException("Colors do not match");
				}else {
					noMatchMessage = false;
				}
			} catch (DifferentColorException e) {
				noMatchMessage = true;
				noMatch = e.getMessage();
			}
			
			if(logic.getCircleColor().equals(logic.getSquareColor())) {
				doneMessage = true;
			}else {
				doneMessage = false;
			}
			
		}catch(NullPointerException e) {
			nullMessage = true;
		}		
	}

	public void mouseDragged() {
		
		if(mouseX > 90 && mouseX < 990 && mouseX > logic.getPosXS()-25 && mouseX < logic.getPosXS()+25 && mouseY > 350 && mouseY < 450) {
			logic.setPosXS(mouseX);
		}
	}
} 
