package Problem_1;

import static org.junit.Assert.*;
import org.junit.Test;
import org.easymock.EasyMock;


public class getRealFeelTempTest {

	CelciusServerTemp celservertemp = EasyMock.createMock(CelciusServerTemp.class);
	getRealFeelTemp realfeeltemp = new getRealFeelTemp();
	
	@Test
    public void test1() {
        CelciusServerTemp celservertemp = EasyMock.createMock(CelciusServerTemp.class); Double mockval = 0.00; EasyMock.expect(celservertemp.serverTemp()).andReturn(mockval); EasyMock.replay(celservertemp); getRealFeelTemp realfeeltemp = new getRealFeelTemp(); Enum actual  = realfeeltemp.getRealFeel(celservertemp); assertEquals(tempEnum.VERY_COLD, actual); EasyMock.verify(celservertemp);
    }
    @Test
    public void test2() {
        CelciusServerTemp celservertemp = EasyMock.createMock(CelciusServerTemp.class); Double mockval = 0.06; EasyMock.expect(celservertemp.serverTemp()).andReturn(mockval); EasyMock.replay(celservertemp); getRealFeelTemp realfeeltemp = new getRealFeelTemp(); Enum actual  = realfeeltemp.getRealFeel(celservertemp); assertEquals(tempEnum.COLD, actual); EasyMock.verify(celservertemp);
    }
    @Test
    public void test3() {
        CelciusServerTemp celservertemp = EasyMock.createMock(CelciusServerTemp.class); Double mockval = 4.39; EasyMock.expect(celservertemp.serverTemp()).andReturn(mockval); EasyMock.replay(celservertemp); getRealFeelTemp realfeeltemp = new getRealFeelTemp(); Enum actual  = realfeeltemp.getRealFeel(celservertemp); assertEquals(tempEnum.COLD, actual); EasyMock.verify(celservertemp);
    }
    @Test
    public void test4() {
        CelciusServerTemp celservertemp = EasyMock.createMock(CelciusServerTemp.class); Double mockval = 4.45; EasyMock.expect(celservertemp.serverTemp()).andReturn(mockval); EasyMock.replay(celservertemp); getRealFeelTemp realfeeltemp = new getRealFeelTemp(); Enum actual  = realfeeltemp.getRealFeel(celservertemp); assertEquals(tempEnum.WARM, actual); EasyMock.verify(celservertemp);
    }
    @Test
    public void test5() {
        CelciusServerTemp celservertemp = EasyMock.createMock(CelciusServerTemp.class); Double mockval = 26.62; EasyMock.expect(celservertemp.serverTemp()).andReturn(mockval); EasyMock.replay(celservertemp); getRealFeelTemp realfeeltemp = new getRealFeelTemp(); Enum actual  = realfeeltemp.getRealFeel(celservertemp); assertEquals(tempEnum.WARM, actual); EasyMock.verify(celservertemp);
    }
    @Test
    public void test6() {
        CelciusServerTemp celservertemp = EasyMock.createMock(CelciusServerTemp.class); Double mockval = 26.67; EasyMock.expect(celservertemp.serverTemp()).andReturn(mockval); EasyMock.replay(celservertemp); getRealFeelTemp realfeeltemp = new getRealFeelTemp(); Enum actual  = realfeeltemp.getRealFeel(celservertemp); assertEquals(tempEnum.HOT, actual); EasyMock.verify(celservertemp);
    }
}
