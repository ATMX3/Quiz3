import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Quiz {
    @Test
    public void books(){
        open("https://demoqa.com/books");
        ElementsCollection list = $(".rt-tbody").findAll(".rt-tr-group").filterBy(text("O'Reilly Media")).filterBy(text("JavaScript"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(list.size(),10);
        softAssert.assertAll();
    }
}
