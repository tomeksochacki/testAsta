package pgs.asta.pages.exerciseThree;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pgs.asta.pages.PageObjectBase;
import pgs.asta.pages.exerciseThree.fragments.FormFragment;

import java.util.ArrayList;

public class ExerciseThreePage extends PageObjectBase {

    public ExerciseThreePage(WebDriver driver) {
        super(driver);
    }

    FormFragment formFragment;

    public FormFragment getFormFragment() {
        return formFragment.preparingAccessToTheForm();
    }


    //Michał omawiał sposób przechodznia do metod innego page-a
  /*  public ExerciseFourPage clickNext(){
        clickElement(btnSave);
        return new ExerciseFourPage(driver).
   }*/
}
