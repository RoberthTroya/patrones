package com.patrones;

public interface IMovieFactory {
	
	IWarnerMovie GetWarnerMovie();
	IDisneyMovie GetDisneyMovie();
	
}
