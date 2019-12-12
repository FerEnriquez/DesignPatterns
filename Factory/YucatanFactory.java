public class YucatanFactory{
	public Baguette orderBaguette(int baguetteType){
		Baguette baguette = null;
		if(baguetteType == 0){
			baguette = new ItalianYucatan();
		} else if (baguetteType == 1){
			baguette = new MexicanYucatan();
		} else if (baguetteType == 2){
			baguette = new RomanYucatan();
		} else if (baguetteType == 3){
			baguette = new SpanishYucatan();
		}

		return baguette<
	}
}