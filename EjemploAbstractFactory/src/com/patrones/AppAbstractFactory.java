package com.patrones;

public class AppAbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ActionMovieFactory actionMovie = new ActionMovieFactory();
		IWarnerMovie tAction = actionMovie.GetWarnerMovie();
		IDisneyMovie bAction = actionMovie.GetDisneyMovie();
		
		System.out.println("\nPeliculas de Accion son: ");
		System.out.println(tAction.MovieName());
		System.out.println(bAction.MovieName());
		
		System.out.println("****************************");
		
		ComedyMovieFactory comedyMovie = new ComedyMovieFactory();
		IWarnerMovie tComedy = comedyMovie.GetWarnerMovie();
		IDisneyMovie bComedy = comedyMovie.GetDisneyMovie();
		
		System.out.println("\nPeliculas de Accion son: ");
		System.out.println(tComedy.MovieName());
		System.out.println(bComedy.MovieName());
		
	}

}
