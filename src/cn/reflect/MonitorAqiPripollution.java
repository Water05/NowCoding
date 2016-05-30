package cn.reflect;

public class MonitorAqiPripollution {
	public String getSo2() {
		return so2;
	}
	public String getNo2() {
		return no2;
	}
	private String aqi="" ;
	private String primary_pollutant="";
	private String format_time="";
	private String time_24="";
    private String monitoring_id;
    private String levelFlag;

    private String monitoring_name;

    private String so2;

    public void setSo2(String so2) {
		this.so2 = so2;
	}
	public void setNo2(String no2) {
		this.no2 = no2;
	}
	private String no2;

    public String getMonitoring_id() {
		return monitoring_id;
	}
	public String getLevelFlag() {
		return levelFlag;
	}
	public void setLevelFlag(String levelFlag) {
		this.levelFlag = levelFlag;
	}
	public void setMonitoring_id(String monitoring_id) {
		this.monitoring_id = monitoring_id;
	}
	public String getMonitoring_name() {
		return monitoring_name;
	}
	public void setMonitoring_name(String monitoring_name) {
		this.monitoring_name = monitoring_name;
	}
	public String getO3() {
		return o3;
	}
	public String getPm25() {
		return pm25;
	}
	public String getPm10() {
		return pm10;
	}
	public String getCo() {
		return co;
	}
	public String getGeom() {
		return geom;
	}
	public void setGeom(String geom) {
		this.geom = geom;
	}
	public String getViewname() {
		return viewname;
	}
	public void setViewname(String viewname) {
		this.viewname = viewname;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getPrimaryPollutant() {
		return primaryPollutant;
	}
	public void setPrimaryPollutant(String primaryPollutant) {
		this.primaryPollutant = primaryPollutant;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	private String o3;

    private String pm25;

    private String pm10;
    private String geom;

    public void setO3(String o3) {
		this.o3 = o3;
	}
	public void setPm25(String pm25) {
		this.pm25 = pm25;
	}
	public void setPm10(String pm10) {
		this.pm10 = pm10;
	}
	public void setCo(String co) {
		this.co = co;
	}
	private String viewname;

    private String gid;

    private String co;
    
    private String create_time;

    private String primaryPollutant;

    private String latitude;

	public String getFormat_time() {
		return format_time;
	}
	public void setFormat_time(String format_time) {
		this.format_time = format_time;
	}
	public String getTime_24() {
		return time_24;
	}
	public void setTime_24(String time_24) {
		this.time_24 = time_24;
	}
	public String getAqi() {
		return aqi;
	}
	public void setAqi(String aqi) {
		this.aqi = aqi;
	}
	public String getPrimary_pollutant() {
		return primary_pollutant;
	}
	public void setPrimary_pollutant(String primary_pollutant) {
		this.primary_pollutant = primary_pollutant;
	}

}
