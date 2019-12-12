abstract class WindowDecorator implements Window {
    private final Window windowToBeDecorated; 

    public WindowDecorator (Window windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    public void draw() {
        windowToBeDecorated.draw(); 
    }

    public String getDescription() {
        return windowToBeDecorated.getDescription(); 
    }
}