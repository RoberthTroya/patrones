package com.patrones;

public class ComedyMovieFactory implements IMovieFactory{

	@Override
	public IWarnerMovie GetWarnerMovie() {
		// TODO Auto-generated method stub
		return new WarnerComedyMovie();
	}

	@Override
	public IDisneyMovie GetDisneyMovie() {
		// TODO Auto-generated method stub
		return new DisneyComedyMovie();
	}

	
	

}
