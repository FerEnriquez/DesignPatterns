public class PueblaFactory{
	public Baguette orderBaguette(int baguetteType){
		Baguette baguette = null;
		if(baguetteType == 0){
			baguette = new ItalianPuebla();
		} else if (baguetteType == 1){
			baguette = new MexicanPuebla();
		} else if (baguetteType == 2){
			baguette = new RomanPuebla();
		} else if (baguetteType == 3){
			baguette = new SpanishPuebla();
		}

		return baguette<
	}
}