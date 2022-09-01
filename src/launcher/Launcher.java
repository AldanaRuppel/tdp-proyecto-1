package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		Student alumno= new Student (112040,"Ruppel","Aldana","aldanaruppel.96@hotmail.com","https://github.com/AldanaRuppel","/images/fotoaldi.jpg");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SimplePresentationScreen frame= new SimplePresentationScreen(alumno);
            	frame.setVisible(true);
            }
        });
    }
}