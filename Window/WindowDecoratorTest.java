import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WindowDecoratorTest {
	@Test
	public void testWindowDecoratorTest() {
	    Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        assertEquals("Simple window, Including vertical scrollbars, Including horizontal scrollbars", decoratedWindow.getDescription())
	}
}