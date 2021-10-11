package pgs.asta.tests.cucumberTests.ui;

import pgs.asta.pages.exerciseThree.ExerciseThreePage;
import pgs.asta.pages.ExercisesListPage;
import pgs.asta.pages.MainPage;
import pgs.asta.tests.cucumberTests.suites.RunCucumberTest;

public abstract class BaseStepDefs {

    public RunCucumberTest run = new RunCucumberTest();

    //protected ExerciseOnePage exerciseOnePage = new ExerciseOnePage(driver);
    //protected ExerciseTwoPage exerciseTwoPage = new ExerciseTwoPage(driver);
    protected ExerciseThreePage exerciseThreePage = new ExerciseThreePage(run.getDriver());
    //protected ExerciseFourPage exerciseFourPage = new ExerciseFourPage(driver);
    //protected ExerciseSixPage exerciseSixPage = new ExerciseSixPage(driver);
    protected ExercisesListPage exercisesListPage = new ExercisesListPage(run.getDriver());
    protected MainPage mainPage = new MainPage(run.getDriver());

}