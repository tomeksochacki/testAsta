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
        exercisesListPage.exerciseTwo();
    }

    @Test
    public void testThree() {
        mainPage.buggyAppClick();
        exercisesListPage.exerciseThree();
    }

    @Test
    public void testFour() {
        mainPage.buggyAppClick();
        exercisesListPage.exerciseFour();
    }

    @Test
    public void testFive() {
        mainPage.buggyAppClick();
        exercisesListPage.exerciseFive();
    }

    @Test
    public void testSix() {
        mainPage.buggyAppClick();
        exercisesListPage.exerciseSix();
    }

    @Test
    public void testSeven() {
        mainPage.buggyAppClick();
        exercisesListPage.exerciseSeven();
    }

    @Test
    public void testEight() {
        mainPage.buggyAppClick();
        exercisesListPage.exerciseEight();
    }

    @Test
    public void testNine() {
        mainPage.buggyAppClick();
        exercisesListPage.exerciseNine();
    }

    @Test
    public void testTen() {
        mainPage.buggyAppClick();
        exercisesListPage.exerciseTen();
    }
}


