/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class HangManTest {
    @Test
    public void isInstance_ofHangMan_true(){
      HangMan newGame=new HangMan("black");
      assertEquals(true, newGame instanceof HangMan);
    }
    @Test
    public void HangMan_willgetconstructor_string(){
      HangMan newGame=new HangMan("black");
      assertEquals("black",newGame.getUser());
    }
}
