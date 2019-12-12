interface Subject{
	Observer o = new Observer;
	public void notifyObserver();
	public void removeObject(Observe o);
	public void addObserve(Observer o);
	public void setSubject(newValue);
	public void getSubject();
	public void valuesChange();
}