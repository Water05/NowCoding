package cn.copyobject;

import java.util.Date;

public class AverageValue {
    private String monitoring_id;
    
    private int director_value;
    private double testVal;

    public double getTestVal() {
		return testVal;
	}

	public void setTestVal(double testVal) {
		this.testVal = testVal;
	}

	private Double so2;

    private Double no2;

    private Double co;

    private Double o3;

    private Double pm25;

    private Double pm10;

    public String getWeather_condition() {
		return weather_condition;
	}

	public void setWeather_condition(String weather_condition) {
		this.weather_condition = weather_condition;
	}

	private Date create_date;
    private String weather_condition;

    public String getMonitoring_id() {
        return monitoring_id;
    }

    public void setMonitoring_id(String monitoring_id) {
        this.monitoring_id = monitoring_id;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getNo2() {
        return no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getO3() {
        return o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

	public int getDirector_value() {
		return director_value;
	}

	public void setDirector_value(int director_value) {
		this.director_value = director_value;
	}

}
