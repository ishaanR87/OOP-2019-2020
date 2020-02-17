package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB);
	}

	
	public void keyPressed()
	{

	}	


	public void draw()
	{	
		patternOne();
		patternTwo();
		patternThree();
		patternFour();
		patternFive();
	}

	public void patternOne(){
		background(255);
		int x = 0;
		int y = 0;
		for(x=0; x<500; x+= 10){
			stroke(0);
			line(x, y, 500-x, 500-y);
		}
		for(y=0; y<500; y+= 10){
			stroke(0);
			line(x, y, 500-x, 500-y);
		}

	}

	public void patternTwo(){
		background(150);
		int x = 0;
		final int y = 50;
		for (x = 25; x < 500; x += y) {
			stroke(0);
			circle(x, y, 50);
		}
	}

	public void patternThree() {
		int x = 0;
		int y = 0;
		background(255);
		while (x < 500) {
			fill(y, 10000, 1000);
			stroke(0);
			rect(x, 0, 50, 500);
			y += 20;
			x += 50;
		}
	}

	public void patternFour(){
		background(150);
		int x = 0;
		int y = 50;
		int z = 0; 
		 
		for(x=25; x<500; x += 50, z += 20){
			fill(z, 10000, 1000);
			ellipse(x, y, 50, 50);
	}
}
	public void patternFive(){
		int x = 25;
		int y = 25;
		background(0);
		while(y<500){
			stroke(255);
			line(x, 25, x, 475);
			line(25, y, 475, y);
			x+= 45;
			y+= 45;
		}
	}
}

