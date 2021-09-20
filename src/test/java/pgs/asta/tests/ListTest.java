package pgs.asta.tests;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class ListTest extends StartupBase {


    @Test
    public void testOne() {
//        driver.get();
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseOne();

    }

    @Test
    public void testTwo() {
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseTwo();
    }

    @Test
    public void testThree() {
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseThree();
    }

    @Test
    public void testFour() {
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseFour();
    }

    @Test
    public void testFive() {
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseFive();
    }

    @Test
    public void testSix() {
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseSix();
    }

    @Test
    public void testSeven() {
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseSeven();
    }

    @Test
    public void testEight() {
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseEight();
    }

    @Test
    public void testNine() {
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseNine();
    }

    @Test
    public void testTen() {
        mainPage.buggyAppClick();
        pageObjectBase.switchTabToSecond();
        exercisesListPage.exerciseTen();
    }
}


