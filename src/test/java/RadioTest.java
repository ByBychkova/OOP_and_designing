import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.radio.java.Radio;

public class RadioTest {
    @Test
    public void shouldSetRadioWave() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(6);
        int expected = 6;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioWave2() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-7);
        int expected2 = 0;
        int actual2 = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void shouldSetRadioWave3() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(17);
        int expected3 = 0;
        int actual3 = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    public void shouldSetRadioWave4() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        int expected3 = 0;
        int actual3 = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    public void shouldSetRadioWave5() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        int expected3 = 9;
        int actual3 = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected3, actual3);
    }

    @Test
    public void shouldSetRadioWave6() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        int expected2 = 0;
        int actual2 = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    public void shouldSetRadioWave7() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        int expected2 = 0;
        int actual2 = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected2, actual2);
    }


    @Test
    public void shouldSetSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(54);
        int expected1 = 54;
        int actual1 = radio.getSoundVolume();
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void shouldSetSoundVolume1() {
        Radio radio = new Radio();
        radio.setSoundVolume(-20);
        int expected1 = 0;
        int actual1 = radio.getSoundVolume();
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void shouldSetSoundVolume2() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        int expected1 = 0;
        int actual1 = radio.getSoundVolume();
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void shouldSetSoundVolume3() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        int expected1 = 100;
        int actual1 = radio.getSoundVolume();
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void shouldSetSoundVolume4() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);
        int expected1 = 0;
        int actual1 = radio.getSoundVolume();
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void shouldSetSoundVolume5() {
        Radio radio = new Radio();
        radio.setSoundVolume(101);
        int expected1 = 0;
        int actual1 = radio.getSoundVolume();
        Assertions.assertEquals(expected1, actual1);
    }

    @Test
    public void nextButton() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextButton1() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButton2() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextButton3() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevButton() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevButton1() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevButton2() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();
        radio.setSoundVolume(101);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume3() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume4() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolume() {

        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {

        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume2() {

        Radio radio = new Radio();
        radio.setSoundVolume(101);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume3() {

        Radio radio = new Radio();
        radio.setSoundVolume(79);
        radio.decreaseVolume();
        int expected = 78;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume4() {

        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
