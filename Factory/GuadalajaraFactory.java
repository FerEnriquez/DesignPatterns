public class GuadalajaraFactory{
	public Baguette orderBaguette(int baguetteType){
		Baguette baguette = null;
		if(baguetteType == 0){
			baguette = new ItalianGuadalajara();
		} else if (baguetteType == 1){
			baguette = new MexicanGuadalajara();
		} else if (baguetteType == 2){
			baguette = new RomanGuadalajara();
		} else if (baguetteType == 3){
			baguette = new SpanishGuadalajara();
		}
		return baguette<
	}
}