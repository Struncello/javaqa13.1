package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void matchesForSimpleTaskTrue() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean actual = simpleTask.matches("родителям");

        Assertions.assertTrue(actual);

    }

    @Test
    public void matchesForSimpleTaskFalse() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean actual = simpleTask.matches("тёще");

        Assertions.assertFalse(actual);

    }

    @Test
    public void matchesForEpicTrue() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);


        boolean actual = epic.matches("Яйца");

        Assertions.assertTrue(actual);

    }

    @Test
    public void matchesForEpicFalse() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);


        boolean actual = epic.matches("Картофанчик");

        Assertions.assertFalse(actual);

    }

    @Test
    public void matchesForMeetingTrue() {

        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean actual = meeting.matches("Приложение НетоБанка");

        Assertions.assertTrue(actual);

    }

    @Test
    public void matchesForMeetingTopicTrue() {

        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean actual = meeting.matches("Выкатка");

        Assertions.assertTrue(actual);

    }

    @Test
    public void matchesForMeetingStartFalse() {

        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean actual = meeting.matches("Во вторник после обеда");

        Assertions.assertFalse(actual);

    }

    @Test
    public void matchesForMeetingProjectFalse() {

        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения", "Приложение НетоБанка", "Во вторник после обеда");

        boolean actual = meeting.matches("Приложение Сбербанка");

        Assertions.assertFalse(actual);

    }


}
//    "Оставить этот тест как черновик - пригодится "
//
//    @Test
//    public void matchesForSimpleTask() {
//
//        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
//
//
//        boolean actual = simpleTask.matches("родителям");
//        boolean expected = true;
//        Assertions.assertEquals(expected, actual);
//
//    }