package kr.ac.cnu.pattern.ovserver.weather;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rokim on 2017. 5. 28..
 */
public class WeatherDataCenterTest {
    @Test
    public void 브로드캐스트() {
        WeatherData weatherData = new WeatherData(30.0f, 25.3f, 1.2f);

        WeatherDataCenter weatherDataCenter = new WeatherDataCenter();
//        weatherDataCenter.setRadio(new Radio());
//        weatherDataCenter.setTelevision(new Television());
//        weatherDataCenter.setiPhone(new IPhone());

        // send weather data to data-center
        weatherDataCenter.notifyWeatherData(weatherData);
    }
}