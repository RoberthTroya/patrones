package com.patrones;

public class ActionMovieFactory implements IMovieFactory{

	@Override
	public IWarnerMovie GetWarnerMovie() {
		// TODO Auto-generated method stub
		return new WarnerActionMovie();
	}

	@Override
	public IDisneyMovie GetDisneyMovie() {
		// TODO Auto-generated method stub
		return new DisneyActionMovie();
	}

	
}
