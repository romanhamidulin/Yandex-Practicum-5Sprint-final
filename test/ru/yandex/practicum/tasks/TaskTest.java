package ru.yandex.practicum.tasks;

import org.junit.jupiter.api.Test;
import ru.yandex.practicum.enums.TaskStatus;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    //проверяем равенство Task по id
    @Test
    public void tasksIsShouldBeEqual() {
        Task task1 = new Task(1, "Первый таск","Описание первого таска", TaskStatus.NEW);
        Task task2 = new Task(1, "Второй таск","Описание второго таска", TaskStatus.IN_PROGRESS);
        assertEquals(task1, task2,"Ошибка! Экземпляры класса Task должны быть равны друг другу, если равен их id");
    }
}