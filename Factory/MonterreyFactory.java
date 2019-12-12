public class MonterreyFactory{
	public Baguette orderBaguette(int baguetteType){
		Baguette baguette = null;
		if(baguetteType == 0){
			baguette = new ItalianMonterrey();
		} else if (baguetteType == 1){
			baguette = new MexicanMonterrey();
		} else if (baguetteType == 2){
			baguette = new RomanMonterrey();
		} else if (baguetteType == 3){
			baguette = new SpanishMonterrey();
		}

		return baguette<
	}
}